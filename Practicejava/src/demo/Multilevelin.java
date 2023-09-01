package demo;
class human{
	void eat() {
		System.out.println("eating is an habit ");
	}
}
class M extends human{
	void run() {
		System.out.println("runing");
	}
}
class F extends M{
	void show() {
		System.out.println("hello");
	}
}

public class Multilevelin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F obj=new F();
		obj.eat();
		obj.run();
		obj.show();

	}

}
