import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hi! I'll check your Math skills!");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int count = 0;
        int x, y;
        int result = 1;
        while(result != 0)
        {
            x = random.nextInt(10)+1;
            y = random.nextInt(10)+1;
            System.out.println(x + " * " + y + " = ");
            result = scanner.nextInt();
            if (result==x*y) {
                System.out.println("Good! :)");
                count++;
            }
            else
            {
                if (result != 0)
                    System.out.println("Bad...");
            }
            if (count==10)
            {
                System.out.println("Very good job! You're good in math! Keep it up!");
                count = 0;
            }
        }
    }

}
