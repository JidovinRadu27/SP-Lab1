package models;

public class BookStatistics implements Visitor{

	int books, sections, tablesOfContent, paragraphs, imageProxy, images, tables;
	
	public BookStatistics() {
		books = 0;
		sections = 0;
		tablesOfContent = 0;
		paragraphs = 0;
		imageProxy = 0;
		images = 0;
		tables = 0;
	}
	

	@Override
	public void visitBook(Book x) {
		return;
		
	}

	@Override
	public void visitSection(Section x) {
		this.sections = sections + 1;
		
	}

	@Override
	public void visitTableOfContents(TableOfContents x) {
		this.tablesOfContent = tablesOfContent + 1;
		
	}

	@Override
	public void visitParagraph(Paragraph x) {
		this.paragraphs = paragraphs + 1;
		
	}

	@Override
	public void visitImageProxy(ImageProxy x) {
		this.imageProxy = imageProxy + 1;
		
	}

	@Override
	public void visitImage(Image x) {
		this.images = images + 1;
		
	}

	@Override
	public void visitTable(Table x) {
		this.tables = tables + 1;
		
	}

	public void printStatistics() {
		System.out.println("BookStatistics:");
		if(sections!=0)
			System.out.println("*** Number of Sections: " + sections);
		if(tablesOfContent!=0)
			System.out.println("*** Number of Tables Of content: " + tablesOfContent);
		if(paragraphs!=0)
			System.out.println("*** Number of Paragraphs: " + paragraphs);
		if((imageProxy + images)!=0)
			System.out.println("*** Number of Images: " + (imageProxy + images));
		if(tables!=0)
			System.out.println("*** Number of Tables: " + tables);


		
	}




}
