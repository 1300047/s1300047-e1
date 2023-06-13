import java.util.Random;

public class DiceGame{
    public static void main(String[] args) {
        Dice dice = new Dice();

        dice.RoleDice();

        System.out.println("You "+dice.WonOrLost(dice
        .sum));
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

    String WonOrLost(int total){
        String result;
        if(total > 7){
            result = "won!";
            return result;
        }
        else{
            result = "lost!";
            return result;
        }
    }
}