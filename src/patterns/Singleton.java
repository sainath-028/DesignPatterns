package patterns;

/*
When to use:
When exactly one object is needed (e.g., config, logger, DB connection pool).	
	*/

public class Singleton {

	private static Singleton instance;

	private Singleton() {

	}

	// To create singleton instance here I'm using a private constructor and static
	// method;

	public static Singleton getInstance() {

		if (instance == null) {
			System.out.println("Inside New instance");
			instance = new Singleton();
		}
		System.out.println("Inside old instance");

		return instance;

	}

	// In multi threaded cases I need to use synchronised blocks so that only one
	// thread used at a time

}
