import java.util.Scanner;

public class ExerciseCraps {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = (int)(Math.random() * 7);
		int number2 = (int)(Math.random() * 7);
		int answer = (number1 + number2);
		int point1 = (int)(Math.random() * 7);
		int point2 = (int)(Math.random() * 7);
		int answer2 = (point1 + point2);

			
		System.out.println("You rolled " + number1 + " + " + number2 + " = " + answer);
	
		if (answer == 7 || answer == 11) {
			System.out.println("\nYou Win!" + " Natural! (7 or 11)");
		}
		
		else if (answer == 2 || answer == 3 || answer == 12) {
			System.out.println("\nYou Lose!" + " Craps! (2, 3, or 12)");
		}
		
		else {
			System.out.println("Point is " + answer);
			System.out.println("You rolled " + point1 + " + " + point2 + " = " + answer2);
			
			if (answer2 == 7) {
				System.out.println("\nYou Lose!" + " After 'Point' 7 is a loss.");
				input.nextInt();
			}	
			
			if (answer2 == answer) {
				System.out.println("\nYou Win!" + " Point is " + answer);
				input.nextInt();
			}
			
			while (answer2 != answer) {
				int newnum = (int)(Math.random() * 7);
				int newnum2 = (int)(Math.random() * 7);
				int answer3 = (newnum + newnum2);
				System.out.println("You rolled " + newnum + " + " + newnum2 + " = " + answer3);
				
				if (answer3 == answer) {
					System.out.println("\nYou Win!" + " Point is " + answer);
					input.nextInt();
				}
				if (answer3 == 7) {
					System.out.println("\nYou Lose!" + " After 'Point' 7 is a loss.");
					input.nextInt();
				}		
			}
		}
		input.close();
	}
}
