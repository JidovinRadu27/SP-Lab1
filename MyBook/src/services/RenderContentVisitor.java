package services;

import models.Book;
import models.Image;
import models.ImageProxy;
import models.Paragraph;
import models.Section;
import models.Table;
import models.TableOfContents;
import models.Visitor;

public class RenderContentVisitor implements Visitor{

	
	
	@Override
	public void visitBook(Book x) {
		return;
	}

	@Override
	public void visitSection(Section x) {
		return;
	}

	@Override
	public void visitTableOfContents(TableOfContents x) {
		return;
	}

	@Override
	public void visitParagraph(Paragraph x) {
		return;		
	}

	@Override
	public void visitImageProxy(ImageProxy x) {
		return;		
	}

	@Override
	public void visitImage(Image x) {
		return;
	}

	@Override
	public void visitTable(Table x) {
		return;		
	}

}
