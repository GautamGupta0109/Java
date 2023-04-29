import java.util.Random;
import java.util.Scanner;

class Game{

    int numberOfGuesses = 0;
    int randomNum;
    int number;

    Game(){
        Random rand = new Random();
        randomNum = rand.nextInt(100);
    }

    void inputNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the number: ");
        number = sc.nextInt();
        sc.close();;
    }
    boolean isCorrectNum(){
        numberOfGuesses++;
        if(number == randomNum){
            System.out.println("Guessed the number "+ numberOfGuesses);
            return true;
        }
        else if(number > randomNum){
            System.out.println("Number too high ");

        }
        else if(number < randomNum){
            System.out.println("Number too low ");
        }
        return false;
    }
}

public class Guess_The_Number {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b){
            g.inputNumber();
            b = g.isCorrectNum();
        }
        
    }
}
