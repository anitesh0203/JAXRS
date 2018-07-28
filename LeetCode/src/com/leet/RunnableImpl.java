package com.leet;

public class RunnableImpl implements Runnable {

	public RunnableImpl(String threadName) {
		
		this.threadName = threadName;
	}
	Thread t;
	String threadName;
	public void run() {
		// TODO Auto-generated method stub
	System.out.println("This thread is starting...");
	for(int j=4;j<=0;j--)
	{
		System.out.println("This is iteration"+j);
	}
		try {
			this.t.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void start(){
		if(this.t==null)
		{
			System.out.println("making the thread");
			this.t= new Thread(this,this.threadName);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableImpl r1= new RunnableImpl("anitesh");
		RunnableImpl r2= new RunnableImpl("ravvi");
		RunnableImpl r3= new RunnableImpl("garu");
		r1.start();
		r2.start();
		r3.start();
		
	}
	

}
