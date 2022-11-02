package default_package;

public class Image extends Element{
	
	private String imageName;

	public Image(String imageName) {
		super();
		this.imageName = imageName;
	}

	@Override
	public String toString() {
		return "Image [imageName=" + imageName + "]";
	}

}
