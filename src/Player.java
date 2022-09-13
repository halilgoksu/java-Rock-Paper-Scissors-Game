
import java.util.Scanner;

public class Player extends GameItems {
    Scanner scan=new Scanner(System.in);

    public Player(){
        super();
    }
    public CHOICES getChoice(){
        System.out.println("Please enter your choice:\n R=ROCK \nP=PAPER \nS=SCISSORS");
        char playerChoice=scan.nextLine().toUpperCase().charAt(0);

        switch (playerChoice){
            case 'R':
                return CHOICES.ROCK;
            case 'P':
                return CHOICES.PAPER;
            case 'S':
                return CHOICES.SCISSORS;


        }
        //if neither of the above,then it is an invalid input
        System.out.println("Invalid input");
        return getChoice();

    }
}
