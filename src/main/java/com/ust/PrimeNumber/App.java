package com.ust.PrimeNumber;

import java.util.Scanner;

public class App extends Thread{
	public void run() {
		int i = 0;
        int num = 0;
        String primeNumbers = "";
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the range of array : ");
        int range = scan.nextInt();
        
        for (i = 1; i <= range; i++) {
            int count = 0;
            for (num = i; num >= 1; num--) {                
                if (i % num == 0) {
                    count++ ;
                }
            }            
            if (count == 2) {
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Prime numbers are : \n" + primeNumbers);
		
	}
    public static void main( String[] args ){
    	App thread = new App();
		thread.start();
		
		try {
			   Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			  }
			     
	}
    
}
