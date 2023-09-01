package demo;
class Sk{
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public Double display(double a) {
		return a;
	}
	
}

public class MethodOverl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sk obj=new Sk();
		System.out.println(obj.add(1, 2,3));
		System.out.println(obj.add(1, 2));
		System.out.println(obj.display(1.2));
		
		

	}

}
