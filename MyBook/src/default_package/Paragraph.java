package default_package;

public class Paragraph implements Element {
	private String name;
	
	public Paragraph(String name) {
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
		System.out.println("Paragraph: " + name);
		
	}

	@Override
	public void add(Element element) {
		
	}

	@Override
	public void remove(Element element) {
		// TODO Auto-generated method stub
		
	}

    @Override
    public Element get(int element) {
        return null;
    }	
	
}
