import java.util.Random;
import java.util.Scanner;
public class GuessingGame {

	public static void main(String[] args) {
		Random rand= new Random();
		int a= rand.nextInt(10);
		int score=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your a number from 0 to 9 :");
		int num= scan.nextInt();
		scan.nextLine();

		while(true) {

		if(num>a) {
			System.out.println("You Enter a bigger number again choose from 0 to 9 :");
			num=scan.nextInt();
			scan.nextLine();
			score++;
		}
		else if (num<a) {
			System.out.println("You Enter a smaller number again choose from 0 to 9 :");
			num=scan.nextInt();
			scan.nextLine();
			score++;
		}
		
		else {
			break;
		}
		}
		System.out.println("Your Score :"+score);
		

	}

}
