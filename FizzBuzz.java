import java.util.Scanner;
public class FizzBuzz {

    public static void fizzBuzz(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.print("FizzBuzz");
            }
            else if (i % 3 == 0)
            {
               System.out.print("Fizz"); 
            }
            else if(i % 5 == 0)
            {
                System.out.print("Buzz");
            }
            else 
            {
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        System.out.println("Please enter any number: ");
        int n = console.nextInt();

        fizzBuzz(n);
    }
}
