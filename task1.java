import java.util.Scanner; 
public class task1 {
    public static void main(String[] args) {
        Scanner checker = new Scanner(System.in);
        int integer;
        System.out.printf("Enter an integer: ");
        integer = checker.nextInt();  
        if (integer % 5 == 0 && integer % 2 == 0)
        {
            System.out.println("HiFive HiEven");
        }
        else if (integer % 5 == 0 )
        {
            System.out.println("HiFive");
        }
         else if (integer % 2 == 0 )
         {
             System.out.println("HiEven");
         }
         else
         {
             
         }
      }
}
