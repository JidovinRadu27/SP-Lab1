package default_package;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private String name;
	private String text;
	private ArrayList<Author> authors;
	private ArrayList<Chapter> chapters;
	private ArrayList<TableOfContents> tableOfContents;

	public Book() {}
	
	public Book(String name) {
		super();
		this.name = name;
		this.text = text;
		this.authors =  new ArrayList<>();
		this.chapters = new ArrayList<>();
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
	
	public void addAuthor(Author a) {
		authors.add(a);
	}

	public int createChapter(String chapter){
		Chapter chp = new Chapter(chapter);
		chapters.add(chp);
		return chapters.indexOf(chp);
	}
	public Chapter getChapter(int i){
		return chapters.get(i); 
	}
//	public void createNewImage(String image) {
//		if(text != null) {
//			this.text = text + image + '\n';
//		}else {
//			this.text = image + '\n';
//		}
//	}
//	public void createNewTable(String table) {
//		if(text != null) {
//			this.text = text + table + '\n';
//		}else {
//			this.text = table + '\n';
//		}
//	}
	public void print() {
		System.out.print(text);
	}
}
