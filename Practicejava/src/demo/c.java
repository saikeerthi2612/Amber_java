package demo;
interface a{
	void display();
}
interface b{
	void print(); 
}
public class c implements a,b {
	public void display() {
		System.out.println("hi");
	}
	public void print() {
		System.out.println("welcome");
	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		c obj=new c();
		obj.display();

	}

}
