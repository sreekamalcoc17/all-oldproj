package com.revature.weekend1.threadingassign;

public class Nums {
	private String name;
	
	
	public Nums(String name) {
		super();
		this.name = name;
	}


	synchronized void numsmethod(int i,int j) {
		for (int i1 = i; i1 < j; i1++) {
			System.out.println("Thread " + name + " : " + i1);

	}

}
}