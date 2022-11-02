package default_package;

public class Paragraph extends Element {
	private String name;

	public Paragraph(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Paragraph [name=" + name + "]";
	}
	
	
}
