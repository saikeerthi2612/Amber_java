package demo;

import java.util.Scanner;

public class Cloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		int a=sc.nextInt();
		if(a<=10) {
			if(a%2==0) {
				System.out.println(a+" is an even number");
			}
			else {
				System.out.println(a+" is an odd number");//nested if
			}
		}
		else{
			System.out.println(a+" is greater than 10");
			}

	}

}
