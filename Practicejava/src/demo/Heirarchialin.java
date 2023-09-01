package demo;
class p{
	String Fname="sh";
	void display() {
		System.out.println("hello");
	}
}
class q extends p{
	void eat() {
		System.out.println("mango");
	}
}
class r extends p{
	void run() {
		System.out.println("running");
	}
}

public class Heirarchialin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		r o=new r();
		o.run();
		o.display();
		q ob=new q();
		ob.eat();
		ob.display();
		

	}

}
