package models;

public class Author extends Book {
	private String name;

	public Author(String name) {
		super(name);
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
