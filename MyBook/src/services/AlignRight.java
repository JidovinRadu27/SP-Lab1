package services;

public class AlignRight implements AlignStrategy {

	private String text;
	
	public AlignRight() {	}

	@Override
	public void render(String ph) {
		System.out.println(String.format("%40s","Paragraph: " + ph));
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
