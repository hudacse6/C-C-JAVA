package ByImplementsRunable;

public class Mythread implements Runnable{
	public void run(){
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		Thread t=new Thread(new Mythread());
		t.start();

	}

}
