package com._16_Thread;
class AA extends Thread {
    public void run() {
        for(int i = 1; i<=5; i++) {
            System.out.println("\t From Thread A:i="+i);
        }
    }
}

class BB extends Thread {
    public void run() {
        for(int j = 1; j<=5; j++) {
            System.out.println("\t From Thread B:j="+j);
        }
    }
}

class CC extends Thread {
    public void run() {
        for(int k = 1; k<=5; k++) {
            System.out.println("\t From Thread C:k="+k);
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        new AA().start();
        new BB().start();
        new CC().start();
    }
}
