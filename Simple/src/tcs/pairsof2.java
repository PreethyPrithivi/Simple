package tcs;

import java.util.Arrays;
import java.util.Scanner;

public class pairsof2 {
	
	public static void main(String args[]){
		String str ="abcdefg";
		 char[] a = str.toCharArray();
		int size = a.length;
		for(int i =0;i<size-1;i++){
			a[i]=a[i+1];
			System.out.println(a[i]); 
			
		}
		
		
	}
	
}

