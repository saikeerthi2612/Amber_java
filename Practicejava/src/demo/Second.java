package demo;

import java.util.Scanner;

class First{
	private String name;
	public void get(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a name: ");
	name=sc.nextLine();
	}
	public void display(){
	System.out.println("name is: "+name);
	}
}

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First a=new First();
		a.get();
		a.display();
		}

	}


