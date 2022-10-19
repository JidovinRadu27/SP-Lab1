package default_package;

public class Book {
	private String name;
	private String text;

	public Book() {}
	
	public Book(String name) {
		super();
		this.name = name;
		this.text = text;
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
		if(text != null){
			this.text = text + paragraph + '\n';
		}else {
			this.text = paragraph + '\n';
		}
	}
	public void createNewImage(String image) {
		if(text != null) {
			this.text = text + image + '\n';
		}else {
			this.text = image + '\n';
		}
	}
	public void createNewTable(String table) {
		if(text != null) {
			this.text = text + table + '\n';
		}else {
			this.text = table + '\n';
		}
	}
	public void print() {
		System.out.print(text);
	}
}
