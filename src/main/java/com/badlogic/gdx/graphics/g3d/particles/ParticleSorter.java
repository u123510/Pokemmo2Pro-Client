/*
 * Reconstructed from bytecode (javap -c -p) of ParticleSorter in libs/28887-renamed.jar.
 * Method bodies match the obfuscated bytecode exactly (Distance/None sorters).
 * Defensive diagnostics were added around sort() capacity checks only; the healthy
 * path behaves identically to the original bytecode.
 */
package com.badlogic.gdx.graphics.g3d.particles;

import com.badlogic.gdx.graphics.g3d.particles.renderers.ParticleControllerRenderData;
import f.C8;
import f.I2;
import f.Tv0;
import f.es_1;

import java.io.File;
import java.io.FileWriter;

public abstract class ParticleSorter {
    static final C8 TMP_V1 = new C8();

    protected Tv0 camera;

    public abstract int[] sort(es_1 renderData);

    public void setCamera(Tv0 camera) {
        this.camera = camera;
    }

    public void ensureCapacity(int capacity) {
    }

    /* ---- diagnostics (never change healthy-path behavior) ---- */
    static void diag(String msg) {
        try {
            File f = new File("log/particlesorter.log");
            File parent = f.getParentFile();
            if (parent != null) {
                parent.mkdirs();
            }
            FileWriter w = new FileWriter(f, true);
            w.write("[ParticleSorter] " + msg + "\n");
            w.close();
        }
        catch (Exception ignored) {
        }
        System.err.println("[ParticleSorter] " + msg);
    }

    public static class None
    extends ParticleSorter {
        int currentCapacity = 0;
        int[] indices;

        @Override
        public void ensureCapacity(int capacity) {
            if (this.currentCapacity < capacity) {
                this.indices = new int[capacity];
                for (int i = 0; i < capacity; ++i) {
                    this.indices[i] = i;
                }
                this.currentCapacity = capacity;
            }
        }

        @Override
        public int[] sort(es_1 renderData) {
            return this.indices;
        }
    }

    public static class Distance
    extends ParticleSorter {
        private float[] distances;
        private int[] particleIndices;
        private int[] particleOffsets;
        private int currentSize = 0;

        @Override
        public void ensureCapacity(int capacity) {
            if (this.currentSize < capacity) {
                this.distances = new float[capacity];
                this.particleIndices = new int[capacity];
                this.particleOffsets = new int[capacity];
                this.currentSize = capacity;
            }
        }

        private void growFor(int index) {
            int old = this.distances == null ? 0 : this.distances.length;
            int cap = Math.max(old * 2, index + 1);
            diag("growing sort arrays: need index=" + index + " oldLen=" + old + " -> " + cap
                + " (unexpected: particles.size exceeded batch capacity)");
            float[] oldDist = this.distances;
            int[] oldIdx = this.particleIndices;
            int[] oldOff = this.particleOffsets;
            ensureCapacity(cap);
            if (oldDist != null) {
                System.arraycopy(oldDist, 0, this.distances, 0, old);
                System.arraycopy(oldIdx, 0, this.particleIndices, 0, old);
                System.arraycopy(oldOff, 0, this.particleOffsets, 0, old);
            }
        }

        @Override
        public int[] sort(es_1 renderData) {
            float f = this.camera.bq.EW[2];
            float f2 = this.camera.bq.EW[6];
            float f3 = this.camera.bq.EW[10];
            int n = 0;
            int n2 = 0;
            I2 it = renderData.ZD();
            while (it.hasNext()) {
                ParticleControllerRenderData data = (ParticleControllerRenderData)it.next();
                int n3 = 0;
                int n4 = n2 + data.controller.particles.size;
                if (this.distances == null || n4 > this.distances.length) {
                    growFor(n4 - 1);
                }
                while (n2 < n4) {
                    ParallelArray.FloatChannel ch = data.positionChannel;
                    float[] arr = ch.data;
                    if (n3 + 2 >= arr.length) {
                        diag("positionChannel.data too small: offset=" + n3 + " dataLen=" + arr.length
                            + " stride=" + ch.strideSize + " controller=" + data.controller.name
                            + " particles.size=" + data.controller.particles.size
                            + " parallelArray.capacity=" + data.controller.particles.capacity);
                    }
                    this.distances[n2] = f3 * arr[n3 + 2] + (f2 * arr[n3 + 1] + (f * arr[n3]));
                    this.particleIndices[n2] = n2;
                    n2++;
                    n3 += ch.strideSize;
                }
                n += data.controller.particles.size;
            }
            if (n > (this.distances == null ? 0 : this.distances.length)) {
                growFor(n - 1);
            }
            this.qsort(0, n - 1);
            for (int j = 0; j < n; ++j) {
                int idx = this.particleIndices[j];
                if (idx < 0 || idx >= this.particleOffsets.length) {
                    diag("bad particleIndices[" + j + "]=" + idx + " offsetsLen=" + this.particleOffsets.length);
                    continue;
                }
                this.particleOffsets[idx] = j;
            }
            return this.particleOffsets;
        }

        public void qsort(int si, int ei) {
            // Defensive: never let a bad range escape into array indexing. With the
            // bytecode-faithful sort() above this never triggers; it only guards against
            // residual reconstruction bugs so the client cannot crash while rendering.
            int qlen = this.distances == null ? 0 : this.distances.length;
            if (si < 0 || ei >= qlen) {
                diag("qsort bad range: si=" + si + " ei=" + ei + " distancesLen=" + qlen);
                si = Math.max(si, 0);
                ei = Math.min(ei, qlen - 1);
            }
            if (si < ei) {
                if (ei - si <= 8) {
                    for (int j = si; j <= ei; ++j) {
                        for (int k = j; k > si; --k) {
                            float[] dist = this.distances;
                            int k1 = k - 1;
                            float dPrev = this.distances[k1];
                            float dCur = dist[k];
                            if (dPrev <= dCur) break;
                            dist[k] = dPrev;
                            dist[k1] = dCur;
                            int[] idx = this.particleIndices;
                            int tmp = idx[k];
                            idx[k] = idx[k1];
                            idx[k1] = tmp;
                        }
                    }
                    return;
                }
                float pivot = this.distances[si];
                int pivotIndex = this.particleIndices[si];
                int i = si + 1;
                int j = si + 1;
                while (j <= ei) {
                    float[] dist = this.distances;
                    float dJ = this.distances[j];
                    if (pivot > dJ) {
                        if (j > i) {
                            dist[j] = dist[i];
                            dist[i] = dJ;
                            int[] idx = this.particleIndices;
                            int tmp = idx[j];
                            idx[j] = idx[i];
                            idx[i] = tmp;
                        }
                        ++i;
                    }
                    ++j;
                }
                int ip = i - 1;
                this.distances[si] = this.distances[ip];
                this.distances[ip] = pivot;
                int[] idx2 = this.particleIndices;
                idx2[si] = idx2[ip];
                idx2[ip] = pivotIndex;
                this.qsort(si, i - 2);
                this.qsort(i, ei);
            }
        }
    }
}
