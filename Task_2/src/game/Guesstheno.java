package game;
import java.util.*;
class Guessthenum {
	int systemInput;
	int userInput;
	int noOfGusses = 0;
	
	Guessthenum(){
		Random random = new Random();
		this.systemInput = random.nextInt(100) + 1;
	}
	
	public boolean takeUserInput() {
		if(noOfGusses < 10) {
			System.out.println("Guess the Number: ");
			this.userInput = Guesstheno.takeIntegerInput(100);
			noOfGusses++;
			return false;
		}
		else {
			System.out.println("Number of attempts finished...Better luck next Time\n");
			return true;
		}
	}
	
	public boolean isCorrectGuess() {
		if(systemInput == userInput) {
			System.out.println("Congratulations, you guess the number "+systemInput+" in "+noOfGusses+" guesses");
			switch(noOfGusses) {
			case 1:
				System.out.println("Your score is 100");
				break;
			case 2:
				System.out.println("Your score is 90");
				break;
			case 3:
				System.out.println("Your score is 80");
				break;
			case 4:
				System.out.println("Your score is 70");
				break;
			case 5:
				System.out.println("Your score is 60");
				break;
			case 6:
				System.out.println("Your score is 50");
				break;
			case 7:
				System.out.println("Your score is 40");
				break;
			case 8:
				System.out.println("Your score is 30");
				break;
			case 9:
				System.out.println("Your score is 20");
				break;
			case 10:
				System.out.println("Your score is 10");
				break;
			}
			System.out.println();
			return true;
		}
		else if (noOfGusses<10 && userInput > systemInput) {
			if (userInput - systemInput > 10) {
				System.out.println("Too High");
			}
			else {
				System.out.println("Little High");
			}
		}
		else if (noOfGusses<10 && userInput < systemInput) {
			if(systemInput - userInput >10) {
				System.out.println("Too low");
			}
			else {
				System.out.println("Little Low");
			}
		}
		return false;
	}
}
	
	public class Guesstheno{
		public static int takeIntegerInput(int limit) {
			int input = 0;
			boolean flag = false;
			
			while (!flag) {
				try {
					@SuppressWarnings("resource")
					Scanner sc = new Scanner(System.in);
					input = sc.nextInt();
					flag = true;
					
					if (flag && input>limit || input<1) {
						System.out.println("Choose the number between 1 to "+ limit);
						flag = false;
					}
				}
				catch (Exception e) {
					System.out.println("Enter only integer value");
					flag = false;
				}
			}	
			return input;
		}
	public static void main(String[] args) {
		System.out.println("1. Start the game \n2. Exit");
		System.out.println("Enter your choice: ");
		int choice = takeIntegerInput(2);
		int nextRound = 1;
		int noOfRound = 0;
		
		if (choice == 1) {
			while (nextRound == 1) {
				Guessthenum g = new Guessthenum();
				boolean isMatched = false;
				boolean isLimitCross = false;
				System.out.println("\nRound "+ ++noOfRound +" starts...");
				
				while (!isMatched && !isLimitCross) {
					isLimitCross = g.takeUserInput();
					isMatched = g.isCorrectGuess();
				}
				System.out.println("1. Next Round \n2.Exit");
				System.out.println("Enter your Choice: ");
				nextRound = takeIntegerInput(2);
				if (nextRound != 1) {
					System.exit(0);
				}
			}
		}
		else {
			System.exit(0);
		}
	}
}
