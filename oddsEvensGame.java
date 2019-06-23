package oddsEvens;
import java.util.Scanner;
import java.util.*;

public class oddsEvensGame {
	public static void main(String[] Args) {
		System.out.println("Let's play the Odds Evens game!");
		System.out.println("Choose either odd or even:");
		
		playerChoice();
	}
	
	public static void playerChoice() {
		Scanner input = new Scanner(System.in);
		String player1 = input.next();
		player1.toLowerCase();
		
		String dashLine = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";		
		while(!player1.equals("odd") && !player1.equals("even")){
			System.out.println("Please enter either 'odd' or 'even' to continue.");
			player1 = input.next().toLowerCase();
		}
		
		System.out.println(dashLine);

		String player2 = "odd";
		if (player1.equals("odd")){
			player2 = "even";
		}
		
		System.out.println("Player will be " + player1 + "\nCPU will be " + player2);
		System.out.println(dashLine);
		
		int even = 0;
		int odd = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Choose a number between 1 and 10.");
			int playerFirstDraw = input.nextInt();
			
			while (playerFirstDraw > 11 || playerFirstDraw < 1) {
				System.out.println("Choose a number between 1 and 10.");
				playerFirstDraw = input.nextInt();
			}
			
			Random rand = new Random();
			int computer = rand.nextInt(11);
			System.out.println("CPU has played " + computer);
			
			int total = playerFirstDraw + computer;
			
			if (total % 2 == 0){
				even++;
			} else {
				odd++;
			}
			
			System.out.println(dashLine);
			System.out.println("Even: " + even + "\nOdd: " + odd);
			System.out.println(dashLine);

		}
		
		
	}

	
}
