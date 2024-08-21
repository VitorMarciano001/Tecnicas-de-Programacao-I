import java.util.Scanner;

class PossibleOperations{
    public static void main(String[] args){

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int num1, num2;

        System.out.print("Type the first number: ");
        num1 = scan.nextInt();
    
        System.out.print("Type the second number: ");
        num2 = scan.nextInt();

        System.out.println("Addition " + (num1 + num2));
        System.out.println("Subtraction " + (num1 - num2));
        System.out.println("Multiplication " + (num1 * num2));
        System.out.println("Division " + (num1 / num2));
        System.out.println("Increment " + (num1 += num2));
        System.out.println("Decrement " + (num1 -= num2));
        System.out.println("Comparison " + (num1 == num2));
        System.out.println("Comparison " + (num1 != num2));
        System.out.println("Displacement " + (num1 >> num2));
        System.out.println("Displacement " + (num1 << num2));

        
    }
}