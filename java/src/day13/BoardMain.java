package day13;

public class BoardMain {

	public static void main(String[] args) {
		Board b1 = new Board();
//		b1.bNumber = 1;
//		b1.bTitle = "����1";
//		b1.bWriter = "�ۼ���1";
//		b1.bContents = "����1";
		b1.boardWrite(1,"����1", "�ۼ���1", "����1");
		b1.BoardView();
		b1.BoardUpdate("����1����", "����1����");
		b1.BoardView();

	}

}
