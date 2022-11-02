package default_package;

public class Table extends Element{
	private String name;

	public Table(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Table [name=" + name + "]";
	}
	
}
