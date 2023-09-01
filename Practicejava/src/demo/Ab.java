package demo;
abstract class S{
	abstract void display();
	void animal() {
		System.out.println("lion is an animal");
	}
}
class T extends S{
	void display() {
		System.out.println("hello");
	}
}

public class Ab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S obj=new T();
		obj.display();
		obj.animal();

	}

}
