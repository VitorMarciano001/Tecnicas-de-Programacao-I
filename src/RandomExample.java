class RandomExample{
    public static void main(String[] args){
        int valor = (int)(Math.random()*5);
        /*
         * Randoms numbers in programmings sort 0 or 1 and 
         * multiply by the range you want 
         */
        
        if(valor > 5){
            System.out.println("The value is bigger than zero= " + valor);
            
        }
        else
        {
            System.out.println("The value is less or equal to zero = " + valor);
        }
    }
}