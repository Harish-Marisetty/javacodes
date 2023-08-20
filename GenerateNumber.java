import java.util.Random;
import java.util.Scanner;

class GenerateNumber{
 /**
 * @param args
 */
public static void main(String[] args) {

    Random rn = new Random();
    int num = rn.nextInt(101);
    //System.out.println(num);
    Scanner sc = new Scanner(System.in);
    System.out.println("Guess you number from the range of 1 to 100");
    // int guess = sc.nextInt();
    // System.out.println("Your Guess is "+guess);

    int attempts = 5;
    while(attempts >0){
        int guess = sc.nextInt();
        System.out.println("Your Guess is "+guess);
        if(num == guess){
            System.out.println("YOU WON! \nYour guess is correct and your score is:"+ attempts*20);
            break;
        }
        
        else if(guess > num){
            System.out.println("Try Again! your guess is Too High..! and you have left " + (attempts - 1) + " attempts");
        }
        else{
             System.out.println("Try Again! your guess is Too Low..! you have left " + (attempts - 1) + "  attempts");
        }
        attempts--;
    }
    if(attempts == 0){
        System.out.println("\n \n YOU LOSE..! Score : 0 \n You run out of attempts \n Try a new Game again.\n \n ");
        System.out.println("The number to be guessed is "+ num);
    }
    
 }
}
