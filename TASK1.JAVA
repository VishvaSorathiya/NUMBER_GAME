import java.util.*;
public class Task1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int MyNumber = (int)(Math.random() * 100 );
        int i;
        System.out.println("_________________");
        System.out.println(" WELCOME TO GAME");
        System.out.println("_________________");
        System.out.println("--> You can try 10 attempts.");
        System.out.println("_________________");
        System.out.println(" START THE GAME ");
        System.out.println("-----------------");
        for( i=1;i<=10;i++)
        {
            System.out.print("Enter your Guess Number:");
            int GuessNumber = sc.nextInt();

            if(GuessNumber==MyNumber )
            {
                System.out.println("wohooo!!  Your number is matched;  you win the Game ");
                System.out.println("your score is :"+i);
                System.out.println("Next round is waiting for you.  ");
                break;
            }
            else if (GuessNumber>MyNumber )
            {
                System.out.println("ohhh nooo! Your number is larger than My number. ");
            }
            else if(GuessNumber<MyNumber )
            {
                System.out.println("oops! Your number is smaller than My number. ");
            }

        }
        if((i++)>10)
        {
            System.out.println("YOU LOST THE GAME ---->>");
        }

    }
}