package models;

public class TableOfContents implements Element, Visitee{

	private String table;
	
	public TableOfContents(String table) {
		super();
		this.table = table;
	}
	
	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	@Override
	public void print() {
		System.out.println(table);
		
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
		x.visitTableOfContents(this);
		
	}

}
