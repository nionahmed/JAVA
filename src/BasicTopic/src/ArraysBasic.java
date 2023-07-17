import java.util.Scanner;
public class ArraysBasic {

	public static void main(String[] args) {
		String[] str = new String[4];
		int[] a = new int[4]; // Array declaration in java
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			a[i]=scan.nextInt();
			scan.nextLine();
			str[i]=scan.nextLine();
		}
		
		for(int i=0; i<4; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print("\n");
		

	}

}
