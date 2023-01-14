package default_package;

public class JPGImageLoader implements ImageLoader{

	private String url;
	
	public JPGImageLoader(String url) {
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
