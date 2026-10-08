package pro.pokemmo2.shop.state;

import pro.pokemmo2.shop.model.OpenMmoShopQuote;
import pro.pokemmo2.shop.protocol.OpenMmoShopCodec;
import pro.pokemmo2.shop.protocol.OpenMmoShopRequest;

/** Connection-scoped quote, request sequence and replay state. */
public final class OpenMmoShopState {
    private boolean helloSent;
    private boolean negotiated;
    private boolean disconnected;
    private boolean closing;
    private long nextRequestId = 1;
    private OpenMmoShopQuote quote;
    private OpenMmoShopRequest pending;
    private OpenMmoShopCodec.Control lastResult;

    public synchronized OpenMmoShopRequest createHello() {
        if (helloSent || disconnected) {
            return null;
        }
        helloSent = true;
        return OpenMmoShopRequest.hello();
    }

    public synchronized boolean acknowledge() {
        if (disconnected || !helloSent) {
            return false;
        }
        negotiated = true;
        return true;
    }

    public synchronized boolean isNegotiated() {
        return negotiated && !disconnected;
    }

    public synchronized boolean installQuote(OpenMmoShopQuote incoming) {
        if (disconnected || incoming == null || closing) {
            return false;
        }
        // A valid extended quote proves that the server accepted the HELLO.
        // This also repairs state lost during the client's protocol-mode switch.
        negotiated = true;
        quote = incoming;
        pending = null;
        lastResult = null;
        nextRequestId = 1;
        return true;
    }

    public synchronized OpenMmoShopQuote getQuote() {
        return quote;
    }

    public synchronized boolean matches(OpenMmoShopQuote candidate) {
        return candidate != null && candidate == quote && isNegotiated() && !closing;
    }

    public synchronized OpenMmoShopRequest begin(int action, long targetId, int amount) {
        if (!matches(quote) || pending != null || nextRequestId > Integer.MAX_VALUE) {
            throw new IllegalStateException("商店报价已失效或正在等待回执");
        }
        pending = OpenMmoShopRequest.trade(action, quote.getQuoteId(),
                (int) nextRequestId, targetId, amount);
        return pending;
    }

    public synchronized OpenMmoShopRequest retry() {
        return disconnected || closing ? null : pending;
    }

    public synchronized boolean complete(OpenMmoShopCodec.Control result) {
        if (result == null || result.kind() != 1 || pending == null || quote == null
                || pending.quoteId != result.quoteId()
                || pending.requestId != result.requestId()
                || pending.action != result.action()) {
            return false;
        }
        pending = null;
        lastResult = result;
        nextRequestId++;
        if (result.status() == 2) {
            closing = true;
        }
        return true;
    }

    public synchronized OpenMmoShopCodec.Control getLastResult() {
        return lastResult;
    }

    public synchronized OpenMmoShopRequest beginClose() {
        if (quote == null || closing || disconnected) {
            return null;
        }
        closing = true;
        pending = null;
        return OpenMmoShopRequest.close(quote.getQuoteId());
    }

    public synchronized boolean isClosing() {
        return closing;
    }

    public synchronized boolean closeFromServer(long quoteId) {
        if (quote == null || quote.getQuoteId() != quoteId) {
            return false;
        }
        clearQuote();
        return true;
    }

    public synchronized boolean closeFromNativePacket() {
        if (quote == null) {
            return false;
        }
        clearQuote();
        return true;
    }

    public synchronized void clearQuote() {
        quote = null;
        pending = null;
        lastResult = null;
        nextRequestId = 1;
        closing = false;
    }

    public synchronized void disconnect() {
        disconnected = true;
        negotiated = false;
        helloSent = false;
        clearQuote();
    }
}
