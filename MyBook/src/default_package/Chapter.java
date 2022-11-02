package default_package;

import java.util.ArrayList;

public class Chapter  {
	private String name;
	private ArrayList<SubChapter> subChapters;
	
	public Chapter(String name) {
		super();
		this.name = name;
		this.subChapters = new ArrayList<>();
	}
	
	public int createSubChapter(String txt) {
		SubChapter subChp = new SubChapter(txt);
		subChapters.add(subChp);
		return subChapters.indexOf(subChp);
	}

	public SubChapter getSubChapter(int indexOfChapterOne) {
		return subChapters.get(indexOfChapterOne);
	}
}
