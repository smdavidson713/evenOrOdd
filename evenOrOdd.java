import java.util.Scanner;

public class evenOrOdd{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		int x = 0;

		do{
			System.out.println("Please enter a positive integer: ");
			x =keyboard.nextInt();

			if(x < 0){
				System.out.print("Good bye!");
				break;
			}		
			else if(x%2==0){
				System.out.println("Your number is even!");
			}
			else if(!(x%2==0)){
				System.out.println("Your number is odd!");
			}
		}
		while(true);
	}
}