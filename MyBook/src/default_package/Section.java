package default_package;

import java.util.ArrayList;

public class Section implements Element{

	private String name;
	private ArrayList sections;
	
	
	
	public Section(String name, ArrayList sections) {
		super();
		this.name = name;
		this.sections = new ArrayList();
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(Element element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Element element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get(Element element) {
		// TODO Auto-generated method stub
		
	}
	
	
}
