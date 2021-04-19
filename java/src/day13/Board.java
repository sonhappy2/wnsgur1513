package day13;

public class Board {
	//필드
	int bNumber; String bTitle; String bWriter; String bContents;
	// 기본생성자
	Board(){
		this.bNumber=bNumber;
		this.bTitle=bTitle;
		this.bWriter=bWriter;
		this.bContents=bContents;
	}
	
	Board(int bNumber, String bTitle, String bWriter, String bContents){
		this.bNumber=bNumber;
		this.bTitle=bTitle;
		this.bWriter=bWriter;
		this.bContents=bContents;
	}
	
	// 메소드
	void boardWrite(int bNumber, String bTitle, String bWriter, String bContents) {
		 this.bNumber=bNumber;
		 this.bTitle=bTitle;
		 this.bWriter=bWriter;
		 this.bContents=bContents;
	
	
	}
	
	 void  BoardView(){
		System.out.println(this.bNumber);
		System.out.println(this.bTitle);
		System.out.println(this.bWriter);
		System.out.println(this.bContents);
	}
	 void BoardUpdate(String bTitle, String bContents) {
		 this.bTitle =bTitle;
		 this.bContents=bContents;
	 }

}
