import java.util.Scanner;


public class HomeTask {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Input what do you want to find");
        System.out.println("1 factorial\n2 fibonnaci sequence\n3 convert number to string");

        switch (s.nextInt()) {
            case 1:
                System.out.println("Input number greater than 0");
                factorial(s.nextInt());
                break;
            case 2:
                System.out.println("Input number greater than 0");
                int n = s.nextInt();
                System.out.print("Fibonnaci sequence: ");

                for (int i = 1; i <= n ; i++) {
                     System.out.print(fibonacci(i) + " ");
                }

                break;
            case 3:
                System.out.println("Input number from 0 to 9");
                numberToWord(s.nextInt());
                break;
            default:
                 System.out.println("Error choose from 1 to 3!!!");
                 break;
        }
    }

    public static void factorial(int f) {
        if(f < 0) {
            System.out.println("Error!!! number less then 0");
            return;
        }
        int factorial=1, i = 1;
        if (f == 0) {
            factorial = 1;
        } else {

             while (i <= f) {
                 factorial *= i;
                 i++;
             }
        }
        System.out.println("Factorial = " + factorial);
    }

    public static int fibonacci(int number) {
        if(number == 1 || number == 2){
            return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public  static void numberToWord(int n) {
    String[] words = {"zero", "one", "two", "three", "four",
                      "five", "six", "seven", "eight", "nine"};

    if(n <= 9) {
        System.out.println(n + " = " + words[n]);
    } else
        System.out.println("Error wrong input");
    }
}
