package demo;
class Dog{
	void sound() {
		System.out.println("bark...");
	}
	
}
class Babydog extends Dog{
	void eat() {
		System.out.println("drink milk");
	}
}

public class Sinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Babydog obj=new Babydog();
		obj.eat();
		obj.sound();

	}

}
