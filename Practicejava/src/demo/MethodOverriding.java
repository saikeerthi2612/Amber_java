package demo;
class Student{
	void write() {
		System.out.println("writing");
	}
}
class H extends Student{
	void write() {
		System.out.println("neat hand writing");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student h=new H();
		h.write();

	}

}
