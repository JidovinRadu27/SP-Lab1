package default_package;

public class MainClass {
	
		
	public static void main(String args[]) {
		
		Book noapteBuna = new Book("Noapte buna, copii!");
		Author rpGheo = new Author("Radu Pavel Gheo");
		noapteBuna.addAuthor(rpGheo);
		
		Section cap1 = new Section("Capitolul 1");
		Section cap11 = new Section("Capitolul 1.1");
		Section cap111 = new Section("Capitolul 1.1.1");
		Section cap1111 = new Section("Capitolul 1.1.1.1");	
		
//		Book discoTitanic = new Book("Disco Titanic");
//		Author rpGheo = new Author("Radu Pavel Gheo");
//		
//		discoTitanic.addAuthor(rpGheo);
//		int indexChapterOne = discoTitanic.createChapter("capitol 1");
//		Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
//		int indexOfSubChapterOne = chp1.createSubChapter("Subcapitol 1.1");
//		SubChapter csOneOne = chp1.getSubChapter(indexOfSubChapterOne);
//		
//		
//		csOneOne.createNewParagraph("Paragraph 1");
//		csOneOne.createNewParagraph("Paragraph 2");
//		csOneOne.createNewParagraph("Paragraph 3");
//		csOneOne.createNewImage("Image 1");
//		csOneOne.createNewParagraph("Paragraph 4");
//		csOneOne.createNewTable("Table 1");
//		csOneOne.createNewParagraph("Paragraph 5");
//		csOneOne.print();
	}
	
}
	