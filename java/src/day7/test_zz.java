package day7;

public class test_zz {

	public static void main(String[] args) {
		// ������ ��±���
		for (int i = 2; i <= 9; i++) {
			System.out.print (i+"��");
			System.out.print("\t");
			for (int j = 1; j <= 9; j++) {
				
				System.out.print(i + "x" + j);
				System.out.print("=" + i * j);
				System.out.print("\t");
				
			}
			System.out.println("\t");
			//System.out.print("\n"); new line
		}

	}

}
