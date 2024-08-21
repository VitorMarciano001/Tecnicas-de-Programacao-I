class SwitchCaseExample {
    public static void main(String[] args){
        
        
        
      int x = (int)(Math.random()*9);
    switch(x){
        case 0 -> System.out.println("zero");
        case 1 -> System.out.println("um");
        case 2 -> System.out.println("dois");
        case 3 -> System.out.println("tres");
        case 4 -> System.out.println("quatro");
        case 5 -> System.out.println("cinco");
        default -> System.out.println("Numero desconhecido");
    }  
    }
    
}