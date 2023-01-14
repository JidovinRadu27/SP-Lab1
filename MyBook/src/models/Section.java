package models;

import java.util.ArrayList;

public class Section implements Element, Visitee{

	private String name;
	private ArrayList<Element> elements;
	
	public Section(String name) {
		super();
		this.name = name;
		elements = new ArrayList<>();
	}

	@Override
	public void print() {
		System.out.println(name);
		for(Element elm:elements) {
			elm.print();
		}
	}

	@Override
	public void add(Element element) {
		elements.add(element);
	}

	@Override
	public void remove(Element element) {
		elements.remove(element);
		
	}

	@Override
	public Element get(int element) {
		return null;		
	}

	@Override
	public void accept(Visitor x) {
		for(Element elm:elements) {
			elm.accept(x);
		}
	}
	
	
}
