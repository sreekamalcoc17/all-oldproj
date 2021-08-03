package com.revature.weekend1.threadingassign;

public class ThreadClass extends Thread {
	private String name;
	Nums n=new Nums(name);

	public ThreadClass(String name) {
		super();
		this.name = name;
	}
	

	@Override
	public void run() {
		System.out.println(name + " is starting");
		n.numsmethod(5, 10);

		try {
			Thread.sleep(500);
		} catch (Exception e) {
			System.out.println("exception found");

		} finally {
			System.out.println("Thread 01 execution completed");
		}
	}
}
