
public class Craps {

	public static void main(String[] args) {
		int number1 = (int)(Math.random() * 7);
		int number2 = (int)(Math.random() * 7);
		int answer = (number1 + number2);
		int point1 = (int)(Math.random() * 7);
		int point2 = (int)(Math.random() * 7);
		int answer2 = (point1 + point2);
		
		System.out.print(number1 + " + " + number2 + " = " + answer);
	
		if (answer == 7 || answer == 11) {
			System.out.println("\nYou Win!");
		}
		
		else if (answer == 2 || answer == 3 || answer == 12) {
			System.out.println("\nYou Lose!");
		}
		
		else {
			System.out.println("\nPoint is " + answer);
			System.out.print(point1 + " + " + point2 + " = " + answer2);
			
			if (answer2 == 7){
				System.out.println("\nYou Lose!");
			}
			
			else if (answer2 == answer) {
				System.out.println("\nYou Win!");
			}
			
			else {
				System.out.println("\nYou Lose!");	
			}
		}
	
	}
}
