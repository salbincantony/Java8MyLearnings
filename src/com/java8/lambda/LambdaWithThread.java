package com.java8.lambda;

public class LambdaWithThread {

	public static void main(String[] args) {
//		THREAD EXAMPLE WITH OUT LAMBDA
		Runnable r1=new Runnable(){  
            public void run(){  
                System.out.println("Thread1 is running...");  
            }  
        };  
        Thread t1=new Thread(r1);  
        t1.start();  

//      THREAD WITH LAMBDA
        Runnable r2 = ()  -> {
        	System.out.println("R2 thread is running. . . ");
        };
        Thread t2=new Thread(r2);  
        t2.start();  

	}

}
