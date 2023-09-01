package demo;
class Sa{
	static void display() {
		System.out.println("hello");
	}
	static int a=20;
	int b=10;
}

public class Stati {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sa.display();
		System.out.println(Sa.a);
		Sa obj=new Sa();
		System.out.println(obj.b);
		obj.a=30;
		Sa obj1=new Sa();
		obj1.a=70;
		obj1.b=40;
		System.out.println(Sa.a);
		System.out.println(obj.a);
		System.out.println(obj1.a);
		System.out.println(obj.b);
		System.out.println(obj1.b);

		

	}
}


