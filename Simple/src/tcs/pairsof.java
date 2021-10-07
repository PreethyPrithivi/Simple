package tcs;

import java.util.Arrays;
import java.util.Scanner;

public class pairsof {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int size = sc.nextInt();
		int[] myArray = new int[size];
		System.out.println("enter the elements of the array:");
		for(int i=0;i<size;i++){
			myArray[i]=sc.nextInt();
		}
		
		System.out.println("enter the number:");
		int num = sc.nextInt();
		System.out.println("the array is created:"+Arrays.toString(myArray));
		System.out.println("indicates the elements whose sum is "+num);
		for(int i=0;i<myArray.length;i++){
			for(int j=i;j<myArray.length;j++){
				if(myArray[i]+myArray[j]==num&&i!=j){
					System.out.println(i+","+j);
					System.out.println(myArray[i]+","+myArray[j]);
				}
			}
		}
	}

}
