package com.revature.weekend1.threadingassign;

public class ThreadClassMain {
	public static void main(String[] args) {
		ThreadClass t1 = new ThreadClass("1st thread");
		ThreadClass02 t2 = new ThreadClass02("2nd thread");
		t1.start();
		t2.start();
	}

}
