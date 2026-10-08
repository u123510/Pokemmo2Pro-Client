package ch.qos.logback.core.net.server;

import ch.qos.logback.core.spi.ContextAwareBase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public abstract class ConcurrentServerRunner
extends ContextAwareBase
implements Runnable, ServerRunner {
    private final Lock clientsLock = new ReentrantLock();
    private final Collection<Client> clients = new ArrayList<Client>();
    private final ServerListener listener;
    private final Executor executor;
    private boolean running;

    public ConcurrentServerRunner(ServerListener listener, Executor executor) {
        this.listener = listener;
        this.executor = executor;
    }

    private Collection<Client> copyClients() {
        this.clientsLock.lock();
        try {
            return new ArrayList<Client>(this.clients);
        } finally {
            this.clientsLock.unlock();
        }
    }

    private void addClient(Client client) {
        this.clientsLock.lock();
        try {
            this.clients.add(client);
        } finally {
            this.clientsLock.unlock();
        }
    }

    private void removeClient(Client client) {
        this.clientsLock.lock();
        try {
            this.clients.remove(client);
        } finally {
            this.clientsLock.unlock();
        }
    }

    @Override
    public boolean isRunning() {
        return this.running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public void stop() throws IOException {
        this.listener.close();
        this.accept(new ClientVisitor() {
            @Override
            public void visit(Client client) {
                client.close();
            }
        });
    }

    @Override
    public void accept(ClientVisitor clientVisitor) {
        for (Client client : this.copyClients()) {
            try {
                clientVisitor.visit(client);
            } catch (RuntimeException e) {
                this.addError(String.valueOf(client) + ": " + String.valueOf(e));
            }
        }
    }

    @Override
    public void run() {
        this.setRunning(true);
        try {
            this.addInfo("listening on " + this.listener);
            while (!Thread.currentThread().isInterrupted()) {
                Client client = this.listener.acceptClient();
                if (!this.configureClient(client)) {
                    this.addError(client + ": connection dropped");
                    client.close();
                    continue;
                }
                try {
                    this.executor.execute(new ClientWrapper(client));
                } catch (RejectedExecutionException e) {
                    this.addError(client + ": connection dropped");
                    client.close();
                }
            }
        } catch (InterruptedException e) {
            // interrupted: shut down
        } catch (Exception e) {
            this.addError("listener: " + e);
        }
        this.setRunning(false);
        this.addInfo("shutting down");
        this.listener.close();
    }

    public abstract boolean configureClient(Client client);

    public class ClientWrapper
    implements Client {
        private final Client delegate;

        public ClientWrapper(Client delegate) {
            this.delegate = delegate;
        }

        @Override
        public void run() {
            ConcurrentServerRunner.this.addClient(this.delegate);
            try {
                this.delegate.run();
                ConcurrentServerRunner.this.removeClient(this.delegate);
            } catch (Throwable t) {
                ConcurrentServerRunner.this.removeClient(this.delegate);
                throw t;
            }
        }

        @Override
        public void close() {
            this.delegate.close();
        }
    }
}
