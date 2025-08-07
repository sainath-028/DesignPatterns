package patterns;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

	
		Singleton sa = Singleton.getInstance();

		Singleton saNew = Singleton.getInstance();
		System.out.println(sa.hashCode());
		System.out.println(saNew.hashCode());
		
		
		Prototype type = new Prototype(101, "sainath");
		type.showDetails();
		System.out.println(type.hashCode());
		Prototype typeNew = (Prototype) type.clone();
		typeNew.id = 104;
		
		typeNew.showDetails();
		System.out.println(typeNew.hashCode());


	}

}
