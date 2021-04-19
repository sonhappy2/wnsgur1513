package day13;

public class BoardMain {

	public static void main(String[] args) {
		Board b1 = new Board();
//		b1.bNumber = 1;
//		b1.bTitle = "제목1";
//		b1.bWriter = "작성자1";
//		b1.bContents = "내용1";
		b1.boardWrite(1,"제목1", "작성자1", "내용1");
		b1.BoardView();
		b1.BoardUpdate("제목1수정", "내용1수정");
		b1.BoardView();

	}

}
