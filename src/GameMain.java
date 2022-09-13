//Design and implement an application that plays the Rock Paper Scissors game against the computer
//The program should randomly choose one of the three options,then prompt the user's selection.
//At that point,the program reveals both choices and print a statement indicating if the user won
//the computer won or if it is a tie.Continue playing until user chooses to stop,
//then print the number of wins, losses, and ties.


import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Game game=new Game();
        char quit=' ';
        while (quit !='N'){
            game.play();
            System.out.println("Play again? Press any key to continue, or 'N' to quit ");
            quit=scan.nextLine().toUpperCase().charAt(0);


        }
        scan.close();
        game.displayStatus();

    }
}
