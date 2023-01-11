package default_package;

import java.util.ArrayList;

public class Section implements Element{

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
	public void get(Element element) {
		// TODO Auto-generated method stub
		
	}
	
	
}
