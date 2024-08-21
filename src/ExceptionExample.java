class ExceptionExample{
    public static void main(String[] args){
        // Passing parameter to the program
        if ("-l".equals(args[0])){
            System.out.println("Works");
            /*
             * To use this parameter you have to pass a -l flag 
             * when you run the program on the terminal
             */
        }
        
        try{
            int num1 = 10;
            int num2 = 0;
            System.out.println("Addition = " + (num1 + num2));
            System.out.println("Addition = " + (num1 - num2));
            System.out.println("Addition = " + (num1 * num2));
            System.out.println("Addition = " + (num1 / num2));
        }
        catch (ArithmeticException e){
            System.out.println("Division by zero error");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Arguments numbers error");
        }
        catch(NumberFormatException e){
            System.out.println("Only type integer numbers");
        }
    }
}