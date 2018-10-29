public class class_craps {
    /**
     * These enums can be used to govern the status of the game
     */
    private enum Status {CONTINUE, WON, LOST};

    /**
     * We need to sound like we know what we are doing, so
     * define some cool sounding casino lingo
     */
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int YO_LEVEN= 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args)
    {
        Die die1 = new Die();
        Die die2 = new Die();

        int sumOfDice = die1.rollDie()+ die2.rollDie();

        int myPoint=0;

        Status gameStatus;
        switch(sumOfDice)
        {
            case 7: //win with a 7 on the first roll
            case YO_LEVEN // win with an 1 on the first roll
                gameStatus = Status.WON;
                break;

        //These status are the scenarios where the player loses
            case TREY:
            case SNAKE_EYES:
            case BOX_CARS:
                gameStatus=Status.LOST;
                break;

            default:
                gameStatus = Status.CONTINUE;
                myPoint=sumOfDice;
        }

        System.out.printf("Die1: %d Die2: %d %n",die1.rollDie(), die2.rollDie());
    }



}
