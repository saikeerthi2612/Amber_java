package demo;
class Sh{
	int id;
	String name;
	String location;
	int age;
	Sh(String name,int id,String location){
		this.name=name;//refer current class instance variables
		this.id=id;
		this.location=location;
	}
	Sh(String name,int id,String location,int age){
		this(name,id,location);//invoke current class constructor
		this.age=age;
	}
	void show() {
		System.out.println("hi");
	}
	void display() {
		this.show();//invoke method in another this.show()==show().
		System.out.println(name+" "+id+" "+location);
	}
	
}

public class This {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sh obj=new Sh("sk",2,"hyd");
		obj.display();
		Sh obj1=new Sh("sk",2,"hyd",23);
		obj1.display();

	}

}
