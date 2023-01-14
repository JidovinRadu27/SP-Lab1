package models;

public class Table implements Element, Visitee{

	private String name;
	
	public Table(String name) {
		super();
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		System.out.println(name);
		
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
    public Element get(int element) {
        return null;
    }

	@Override
	public void accept(Visitor x) {
		x.visitTable(this);
		
	}
	
}
