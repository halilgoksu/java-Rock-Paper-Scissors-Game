
public class Game extends GameItems{
    private Player player;
    private Computer computer;
    private CHOICES playerChoice;
    private  CHOICES computerChoice;
    private RESULT result;
    private static int wins;
    private static int lose;
    private static int ties;



    public Game(){
        super();
        player=new Player();
        computer=new Computer();

    }
    public void play(){
        playerChoice= player.getChoice();
        computerChoice=computer.getChoice();
        result=getResult();
        displayResults();
        stats();
    }

    public  void displayStatus(){
        System.out.println("You have played "+ (wins+lose+ties));
        System.out.println("You have won "+wins+ "times ");
        System.out.println("You have lost "+lose+" times ");
        System.out.println("The tie happened "+ties+" times.\nGood Bye ");
    }

    private void stats(){
        if(result==RESULT.WIN){
            wins++;
        } else if (result==RESULT.LOSE) {
            lose++;

        }else
            ties++;
    }



    private void displayResults(){
        switch (result){
            case WIN:
                System.out.println(playerChoice+ " beats "+ computerChoice+ " . Player WINS ");
                break;
            case LOSE:
                System.out.println(playerChoice+ " loses to "+ computerChoice+ " . Computer WINS ");
                break;
            case TIE:
                System.out.println(playerChoice+ " equals to "+ computerChoice+ " .  it's a TIE ");
                break;
        }
    }



    private RESULT getResult(){
        if(playerChoice==computerChoice)
            return RESULT.TIE;

        switch (playerChoice){
            case ROCK:
                return (computerChoice==CHOICES.SCISSORS ? RESULT.WIN:RESULT.LOSE);
            case PAPER:
                return (computerChoice==CHOICES.ROCK ? RESULT.WIN: RESULT.LOSE);
            case SCISSORS:
                return (computerChoice==CHOICES.PAPER ? RESULT.WIN: RESULT.LOSE);
        }
        //it will never come to this line
        return RESULT.LOSE;
    }

}
