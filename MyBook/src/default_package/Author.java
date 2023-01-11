package default_package;

public class Author extends Book {
	private String name;

	public Author(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + "]";
	}

	
	
}
