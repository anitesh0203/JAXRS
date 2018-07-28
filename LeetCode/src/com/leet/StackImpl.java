package com.leet;

import java.util.ArrayList;

public class StackImpl {
	public StackImpl() {
		this.top = -1;
		this.a=new int[10];
	}

	int a[];
	int top;
	int min;
	int push(int data){
		if(top==-1){
			min=data;
		}
		else
		{
			if(min>data)
			{
				min=data;
			}
		}
		a[++top]=data;
		return top;
	}
	
	int pop(){
		return a[--top];
	}
	
	public static void main(String[] args) {
				StackImpl stx= new StackImpl();
				stx.push(0);
				stx.push(4);
				stx.push(20);
				stx.push(90);
				stx.push(32);
				System.out.println(stx.min);
				

	}

}
