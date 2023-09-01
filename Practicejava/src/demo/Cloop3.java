package demo;

import java.util.Scanner;

public class Cloop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a letter:");
		ch=sc.next().charAt(0);
		if(ch=='a') {
			System.out.println("vowel");
		}
		else if(ch=='e') {
			System.out.println("vowel");
		}
		else if(ch=='i') {
			System.out.println("vowel");
		}
		else if(ch=='o') {
			System.out.println("vowel");
		}
		else if(ch=='u') {
			System.out.println("vowel");
		}
		else {
			System.out.println("not an vowel");
		}
	}
}



