package demo;

public class AccessorMutator {
		// TODO Auto-generated method stub
		private String name;
		private int id;
		private String location;
		public int getid() {
			return this.id;
		}
		public void setid(int id) {
			this.id=id;
		}
		public String getname() {
			return this.name;
		}
		public void setname(String name) {
			this.name=name;
		}
		public String getlocation() {
			return this.location;
		}
		public void setlocation(String location) {
			this.location=location;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			AccessorMutator a=new AccessorMutator();
			a.setid(2);
			System.out.println(a.getid());
			a.setname("keerthi");
			System.out.println(a.getname());
			a.setlocation("mbnr");
			System.out.println(a.getlocation());

	}

}
