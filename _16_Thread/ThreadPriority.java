package com._16_Thread;

class Aa extends Thread {
    public void run() {
        System.out.println("Thread A started");
        for(int i = 1; i<=4; i++) {
            System.out.println("\t From Thread A:i="+i);
        }
        System.out.println("Exit from Thread A");
    }
}

class Bb extends Thread {
    public void run() {
        System.out.println("Thread B started");
        for(int j = 1; j<=4; j++) {
            System.out.println("\t From Thread B:j="+j);
        }
        System.out.println("Exit from Thread B");
    }
}

class Cc extends Thread {
    public void run() {
        System.out.println("Thread C started");
        for(int k = 1; k<=4; k++) {
            System.out.println("\t From Thread C:k="+k);
        }
        System.out.println("Exit from Thread C");
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        Aa threadA = new Aa();
        Bb threadB = new Bb();
        Cc threadC = new Cc();
        threadC.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(threadA.getPriority() + 1);
        threadA.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Start Thread A");
        threadA.start();
        System.out.println("Start Thread B");
        threadB.start();
        System.out.println("Start Thread C");
        threadC.start();
        System.out.println("End of main thread");
    }
}
