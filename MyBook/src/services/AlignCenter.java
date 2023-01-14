package services;

public class AlignCenter implements AlignStrategy{

private String text;
	
	public AlignCenter() {}

	@Override
	public void render(String ph) {
		System.out.println(String.format("%30s", "Paragraph: " + ph));
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}


}
