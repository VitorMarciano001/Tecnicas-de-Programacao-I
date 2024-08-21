import java.util.Scanner;

class EvenOrOdd{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Type a number: ");
        num  = scan.nextInt();

        while(num != 999){
            
            if (num % 2 == 0){
                System.out.println("The number " + num + " is even");
            }
            else{
                System.out.println("The number " + num + " is odd");
            }
            System.out.print("Type another number: ");
            num  = scan.nextInt();
        }

    }
}