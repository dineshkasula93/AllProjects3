package com.dinesh.Corejava;

public class ThreadDemo implements Runnable {

	public static int mycount = 0;

	public ThreadDemo() {
	}

	public void run() {
		while (ThreadDemo.mycount <= 10) {
			try {
				System.out.println("Expl Thread:" + (++ThreadDemo.mycount));
				Thread.sleep(100);
			} catch (InterruptedException iex) {
				System.out.println("Exception in Thread" + iex.getMessage());
			}
		}
	}

}
