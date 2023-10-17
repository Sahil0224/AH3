import java.util.Scanner;

public class RecursiveFizzBuzz 
{

    public static void fizzBuzz(int i, int n)
    {
        if (i > n)
        {
            return;
        }
        if (i % 3 == 0 && i % 5 == 0)
        {
            
            System.out.print("FizzBuzz ");
            fizzBuzz(i + 1, n);
            return;
        }
        else if (i % 3 == 0)
        {
            System.out.print("Fizz ");
            fizzBuzz(i + 1, n);
            return; 
        }
        else if(i % 5 == 0)
        {
            System.out.print("Buzz ");
            fizzBuzz(i + 1, n);
            return;
        }
        else 
        {
            System.out.print(i + " ");
            fizzBuzz(i + 1, n);
            return;
        }
        
    }

    
    
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        System.out.println("Please enter any number: ");
        int n = console.nextInt();

        fizzBuzz(1, n);
    }
    
}
