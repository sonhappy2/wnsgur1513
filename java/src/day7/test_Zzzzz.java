package day7;

public class test_Zzzzz {

	public static void main(String[] args) {
		int i=1, sum=0;
		while(i<=10) {
			sum += i;
			if(i<10) {
				System.out.print(i+"+");
			} else {System.out.print(i);}
			
			
			
			i++;
		}
		System.out.print("=" +sum);
	}

}
