package extra;

public class Platypus {
	public Platypus(String name) {
		this.name = name;
	}

	private String name;

	void sayHi() {
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
}
