import java.util.Scanner;
public class guessGame 
{
    public static void main(String args[])
    {
        int rand = (int) (Math.random()*101);
        int guess;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a number 0-100: ");
        guess = input.nextInt();
        count += 1;
        while(guess != rand)
        {
            if(guess > rand)
            {
                System.out.println("Too high!");
            }
            if(guess < rand)
            {
                System.out.println("Too low!");
            }
            System.out.println("Pick a number 0-100: ");
            guess = input.nextInt();
            count += 1;
        }
        if(count <= 7)
        {
            System.out.println("Congrats! You found the number in " + count + " guesses!");
        } else
        {
            System.out.println("You found the number in " + count + " guesses!");
        }
        
    }
}
