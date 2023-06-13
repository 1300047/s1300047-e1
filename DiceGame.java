import java.util.Random;
import java.util.Scanner;

public class DiceGame{
    public static void main(String[] args) {
        Dice dice = new Dice();
        Greeting greet = new Greeting();

        dice.RoleDice();

        System.out.println(greet.name+" "+dice.WonOrLost(dice
        .sum));
   }
}

class Greeting{
    String name;

    Greeting(){
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);

        name = sc.nextLine();

        System.out.println("Hello, " + name + "!");
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