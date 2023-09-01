package demo;
import java.util.Scanner;

public class SingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[20];
		System.out.println("enter size of an array");
		int b=sc.nextInt();
		for(int i=0;i<b;i++) {
			System.out.println("enter a element");
			a[i]=sc.nextInt();
		}
		for(int i=0;i<b;i++) {
			System.out.print(a[i]+" ");
		}
		

	}

}
