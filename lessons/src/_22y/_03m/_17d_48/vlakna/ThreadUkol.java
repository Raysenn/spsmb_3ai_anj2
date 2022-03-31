package _22y._03m._17d_48.vlakna;

import java.util.ArrayList;

public class ThreadUkol extends Thread {

    public long No = 0;
    public long N;

    public ThreadUkol(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < N; i++) {
            double x = Math.random() * 2 - 1;
            double y = Math.random() * 2 - 1;
            if (x * x + y * y <= 1) {
                No++;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int Nthreads = 1;
        long No = 0;
        long N = 100_000_000;
        ArrayList<ThreadUkol> threads = new ArrayList<>();
        for (int i = 0; i < Nthreads; i++)    {
            ThreadUkol threadUkol = new ThreadUkol(i + "");
            threads.add(threadUkol);
            threadUkol.N = N / Nthreads;
            threadUkol.start();
        }
        for (ThreadUkol thread : threads) {
            thread.join();
            No += thread.No;
        }
        double pi = 4 * (double) No / N;
        System.out.println(pi);
    }
}
