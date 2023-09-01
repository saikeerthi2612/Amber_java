package demo;
import java.util.Scanner;
public class Multid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[100][100];
		System.out.println("enter a row size");
		int row=sc.nextInt();
		System.out.println("enter a column size");
		int col=sc.nextInt();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("display array elements:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
