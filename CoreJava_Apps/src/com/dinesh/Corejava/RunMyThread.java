package com.dinesh.Corejava;

public class RunMyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting Main Thread...");
		ThreadDemo mrt = new ThreadDemo();
		Thread t = new Thread(mrt);
		t.start();
		while (ThreadDemo.mycount <= 10) {
			try {
				System.out.println("Main Thread: " + (++ThreadDemo.mycount));
				Thread.sleep(100);
			} catch (InterruptedException iex) {
				System.out.println("Exception in main thread: " + iex.getMessage());
			}
		}
		System.out.println("End of Main Thread...");

	}

}
