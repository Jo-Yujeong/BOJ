import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int price = 0;
		    
		    if(a == 1){
		        price += 5000000;
		    } else if(a >= 2 && a <= 3){
		        price += 3000000;
		    } else if(a >= 4 && a <= 6){
		        price += 2000000;
		    } else if(a >= 7 && a <= 10){
		        price += 500000;
		    } else if(a >= 11 && a <= 15){
		        price += 300000;
		    } else if(a >= 16 && a <= 21){
		        price += 100000;
		    }
		    
		    if(b == 1){
		        price += 5120000;
		    } else if(b >= 2 && b <= 3){
		        price += 2560000;
		    } else if(b >= 4 && b <= 7){
		        price += 1280000;
		    } else if(b >= 8 && b <= 15){
		        price += 640000;
		    } else if(b >= 16 && b <= 31){
		        price += 320000;
		    }
		    
		    System.out.println(price);
		}
	}
}