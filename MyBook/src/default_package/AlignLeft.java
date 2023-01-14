package default_package;

public class AlignLeft implements AlignStrategy {

private String text;
	
	public AlignLeft() {}

	@Override
	public void render(String ph) {
		System.out.println("Paragraph: " + ph);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}


}
