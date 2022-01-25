import java.util.*;

public class Game {
    public static void main(String args[]) {
        int moves = 0;
        final int MAX_MOVES = 5;
        int choice = -1;
        int humanScore = 0;
        int computerScore = 0;
        String humanSelected, computerSelected;

        String[] figureArray = {"rock", "paper", "scissors"};
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        while(moves < MAX_MOVES) {
            System.out.println("Turn: " + (moves+1));
	    System.out.println("Your turn. Select 1(rock), 2(paper) or 3(scissors)");
            choice = scanner.nextInt();

            if(choice == -1 || choice > figureArray.length) {
                if (moves > 0) moves--;
                else moves = 0;
                continue;
            }

            humanSelected = figureArray[choice];
            computerSelected = figureArray[rand.nextInt(3)];
	    System.out.println("You selected: " + humanSelected);
	    System.out.println("Computer Selected: " + computerSelected);
            if(humanSelected.equals(computerSelected)) {
                System.out.println("DRAW");
            } else if(humanSelected.equals("rock") && computerSelected.equals("scissors")) {
	       System.out.println("Human win");
               humanScore++;
            } else if(humanSelected.equals("paper") && computerSelected.equals("rock")) {
		System.out.println("Human win");
                humanScore++;
            } else if(humanSelected.equals("scissors") && computerSelected.equals("paper")) {
		System.out.println("Human win");
                humanScore++;
            }else if(computerSelected.equals("rock") && humanSelected.equals("scissors")) {
	       System.out.println("Computer win");
               computerScore++;
            } else if(computerSelected.equals("paper") && humanSelected.equals("rock")) {
		System.out.println("Computer win");
                computerScore++;
            } else if(computerSelected.equals("scissors") && humanSelected.equals("paper")) {
		System.out.println("Computer win");
                computerScore++;
            } else {
		System.out.println("No one win, check ifs XD");
	    }

            moves++;
        }
    }
}

