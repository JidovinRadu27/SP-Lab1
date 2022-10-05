package default_package;

public class Book {
	private String name;
	private String text;

	public Book(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void createNewParagraph(String paragraph){
		this.text = text + paragraph + '\n';
	}
	public void createNewImage(String image) {
		this.text = text + image + '\n';
	}
	public void createNewTable(String table) {
		this.text = text + table + '\n';
	}
	public String print() {
		return text;
	}
}
