package default_package;

public class BMPImageLoader implements ImageLoader{

	private String url;
	
	public BMPImageLoader(String url) {
		super();
		this.setUrl(url);
	}

	@Override
	public void load(String text) {
		return;
		
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
