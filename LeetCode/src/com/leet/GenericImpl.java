package com.leet;

public class GenericImpl<A> {

	A t;
	public A getT() {
		return t;
	}

	public static <T> void printAll(T[] abc)
	{
		for (T t : abc) {
			System.out.println(t);
		}
	}
	
	public static void main(String[] args) {

		Integer []abc={2,33,4,21,78};
		printAll(abc);
		GenericImpl<> tis= new GenericImpl<>();
	}

}
