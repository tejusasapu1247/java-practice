package com.day9.session2;


class DemoVolatile extends Thread {

   volatile boolean keepRunning = true;

    public void run() {
        while (keepRunning) {
        }

        System.out.println("Thread terminated.");
    }

    public static void main(String[] args) throws InterruptedException {
    	DemoVolatile t = new DemoVolatile();
        t.start();
        Thread.sleep(100);
        t.keepRunning = false;
        System.out.println("keepRunning set to false.");
    }
}