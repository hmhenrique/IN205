import java.util.Scanner;
import java.util.Random;


class PlusMoins
{
    public static int random;
    public static int tries;

    public static void NewGame()
    {
        random = (int) (Math.random() * 100);
        tries = 10;
    }

    public static void main(String[] args) 
    {  
        
        NewGame();
        System.out.println("Game started");

        while(tries > 0){

            System.out.println("Tries : "+ tries);
            System.out.println("Enter your number (0-100) : ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            if(number < random){
                System.out.println("Plus grand");
            }
            else if (number > random){
                System.out.println("Plus petit");
            }
            else if(number == random){
                // System.out.println("YOU WIN");
                 tries = -20;
             }
            tries--;

        }
        if (tries == -21)
            System.out.println("YOU WIN");
        else
            System.out.println("Oh no, start a new game. ANSWER : "+ random);

    }

}