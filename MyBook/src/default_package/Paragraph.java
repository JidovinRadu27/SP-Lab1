package default_package;

public class Paragraph implements Element {
	private String name;
	private AlignStrategy textAlignment;
	
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
	
		if(textAlignment==null)
			System.out.println("Paragraph: " + name);
		else
			textAlignment.render(name);
		
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
	
    public void setAlignStrategy (AlignRight alignRight) {
 
		textAlignment = new AlignRight();
    	
    }

	public void setAlignStrategy(AlignLeft alignLeft) {

		textAlignment = new AlignLeft();
	}

	public void setAlignStrategy(AlignCenter alignCenter) {
		textAlignment = new AlignCenter();
		
	}
}
