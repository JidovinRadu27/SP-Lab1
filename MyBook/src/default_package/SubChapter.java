package default_package;

import java.util.ArrayList;

public class SubChapter {
	private String name;
	private ArrayList<Element> elements;
	
	public SubChapter(String name) {
		super();
		this.name = name;
		this.elements = new ArrayList<>(); 
	}
	public void printSubChapter() {
		System.out.println(name);
	}
	
	public void createNewParagraph(String pr) {
		Paragraph paragraph = new Paragraph(pr);
		elements.add(paragraph);
	}
	public void createNewImage(String url) {
		Image image = new Image(url);
		elements.add(image);
	}
	public void createNewTable(String txt) {
		Table table = new Table(txt);
		elements.add(table);
	}
	public void print() {
		for(int i=0; i<elements.size(); i++) {
			System.out.println(elements.get(i).toString());
		}
		
	}
	
}
