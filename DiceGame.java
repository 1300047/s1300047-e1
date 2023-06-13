import java.util.Random;

public class DiceGame{
    public static void main(String[] args) {
        Dice dice = new Dice();

        dice.RoleDice();
   }

}


class Dice{
    int sum;

    Dice(){};
   
    void RoleDice (){
        Random rand = new Random();
        int Die1,Die2;

        System.out.println("Rolling the dice...");
        Die1 = rand.nextInt(7)+1;
        Die2 = rand.nextInt(7)+1;
        System.out.println("Die 1: "+Die1);
        System.out.println("Die 2: "+Die2);
        sum = Die1 + Die2;
        System.out.println("Total value: "+ sum);
    }
}