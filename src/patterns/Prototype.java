package patterns;

/*
🔸 When to use:
When object creation is costly (e.g., heavy constructor or DB calls).
*/
public class Prototype implements Cloneable {

	int id;
	String name;

	public Prototype(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();
	}

	public void showDetails() {

		System.out.println("With the Id " + this.id + " with the name " + this.name);
	}
}
