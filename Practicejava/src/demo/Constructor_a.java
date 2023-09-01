package demo;

public class Constructor_a{
		// TODO Auto-generated method stub
		int id;
		String name;
		String location;
		Constructor_a(int id,String name,String location){
			this();
			this.id=id;
			this.name=name;
			this.location=location;
		}
		Constructor_a(){
			System.out.println("hello");
		}
		void display() {
			System.out.println(id+" "+name+" "+location);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Constructor_a obj=new Constructor_a(2,"keerthi","Mahabubnagar");
			obj.display();
					

		}

	}


	


