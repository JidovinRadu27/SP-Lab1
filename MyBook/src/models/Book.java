package models;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section{
	private String name;
	private ArrayList<Author> authors;
	private ArrayList<Element> content;
	
	public Book(String name) {
		super(name);
		this.name = name;
		this.authors =  new ArrayList<>();	
		this.content =  new ArrayList<>();	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addAuthor(Author a) {
		authors.add(a);
	}
	
	public void addContent(Element elem) {
		content.add(elem);
		
	}
	public void print() {
		System.out.println(name);
		for(Author auth:authors) {
			auth.print();
		}
		for(Element elm:content) {
			elm.print();
		}
	}
	



}
