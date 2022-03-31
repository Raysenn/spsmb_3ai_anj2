package _22y._03m._21d_49.vlakna;

// Nepotřebujeme-li označit celou metodu jako kritickou sekci,
// může nám postačit označit pouze menší úsek.

import java.io.IOException;
import java.io.RandomAccessFile;

public class JKritickeSekceBloky {
    RandomAccessFile file;
    JKritickeSekceBloky (RandomAccessFile f) {
        this.file = f;
    }
    public void presun(long kam) throws IOException {
        // blok kritické sekce:
        synchronized (this.file) {
            file.seek(kam);
        }
    }
    public int ctiInt() throws IOException {
        synchronized (this.file) {
            return file.readInt();
        }
    }
}
