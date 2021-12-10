package kata6;

import java.util.Scanner;
import kata6.branches.AmericanToyBusiness;

public class Main {

    public static void main(String[] args) {
        AmericanToyBusiness americanToyBusiness = new AmericanToyBusiness();
    
        while(true){
            System.out.println("Introduce command");
            Scanner keyboard = new Scanner(System.in);
            String command = keyboard.nextLine();
            if(command.equals("exit")){
                break;
            } else if (command.equals("car")){
                americanToyBusiness.createToy("car");
            }  else if (command.equals("helicopter")){
                americanToyBusiness.createToy("helicopter");
            } else{
                System.out.println("Unknown command");
            }
        }
        System.out.println("program finished");
    
    }
    
    

    
}
