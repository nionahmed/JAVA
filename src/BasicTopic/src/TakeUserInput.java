import java.util.Scanner;
public class TakeUserInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = scan.nextLine();
		
		System.out.println("What is your age? ");
		int age= scan.nextInt();
		
		scan.nextLine();// without using this i can not take further user input nextint does not contain next line
		
		System.out.println("What is your fav food? ");
		String food= scan.nextLine();
		
		System.out.println("Your name is : "+name);
		System.out.println("Your age is : "+age);

		System.out.println("Your fav food is : "+food);

	}

}
