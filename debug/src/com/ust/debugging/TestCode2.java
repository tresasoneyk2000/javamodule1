package com.ust.debugging;

public class TestCode2 {
	int a;
	int b;
	int x;
	int result;
	int a1[]= {2,5,7,8,5};
	int b1[]= {23,43,27,32,12};
	int x1[]= {18,19,20,21,22};
	void sum() {
	for(int i=0;i<5;i++) {
		result= (a1[i]*x1[i]*x1[i])+(b1[i]*x1[i]*x1[i])+(a1[i]*b1[i]*2);
		System.out.println(result);
	}
	}
	
	public static void main(String[] args) {
		
		new TestCode2().sum();
	}

}
