package com.leet;

public class NestedClass {
	
	public void makeMe()
	{
		InnerOne io= new InnerOne();
		
		class IneerMost{
		public IneerMost() {
			// TODO Auto-generated constructor stub
		System.out.println("this is innermost");
		}	
		}
	}
private class InnerOne{
	public InnerOne() {
System.out.println("Inner constructor being caled");	}
}
	
	public static void main(String[] args) {
       NestedClass nc= new NestedClass();
      nc.makeMe();
		
	}

}
