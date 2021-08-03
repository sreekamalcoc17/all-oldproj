package com.revature.weekend1.threadingassign;

public class ThreadClass02 extends Thread {
	private String name1;
	Nums n = new Nums(name1);


	public ThreadClass02(String name) {
		super();
		this.name1 = name;
	}
	
	@Override
	public void run() {
		System.out.println(name1 + " is starting");
		n.numsmethod(0, 5);
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			System.out.println("exception found");

		} finally {
			System.out.println("Thread 02 execution completed");
		}
	}

}
