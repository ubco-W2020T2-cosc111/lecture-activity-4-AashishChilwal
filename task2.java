import java.util.Scanner; 

public class task2 {
    public static void main(String[] args) {
        Scanner checker = new Scanner(System.in);
        int integer;
        Double pay = 0.0;
        String type,status;
        System.out.printf("Enter an integer: ");
        integer = checker.nextInt();  
        if (integer > 0)
        {
            type = "positive";
            
          if (integer > 0 && integer < 50)
        {
            status = "Try again" ;
            System.out.println(status);
        }
         if (integer >= 50 && integer < 91)
        {
             status = "Passed" ;
            System.out.println(status);
        }
         if (integer>90 )
         {
             pay = pay + (pay*(3/100));
         }
        }
         else
         {
             System.out.println("The entered number is invalid");
         }
      }
    }
    
