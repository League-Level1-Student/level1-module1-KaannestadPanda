
public class practiceProgram {
	private String practiceWord="ye";
	private String practiceWordOther="ey";

	public static void main(String[] args) {

		practiceProgram pro = new practiceProgram();
		System.out.println(pro.getWord());
		System.out.println(pro.getWordOther());
		pro.setWord("hiiiiiiiii");
		pro.setWordOther("doy");
		System.out.println(pro.getWord());
		System.out.println(pro.getWordOther());

	}

	String getWord() {
		return practiceWord;
	}

	String getWordOther() {
		return practiceWordOther;
	}

	void setWord(String weird) {
		practiceWord =weird;
	}

	void setWordOther(String ward) {
		practiceWordOther=ward;
	}

}
