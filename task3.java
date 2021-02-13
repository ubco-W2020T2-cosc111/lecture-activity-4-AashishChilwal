import java.util.Scanner; 

public class task3 {
  public static void main(String[] args) {
    Scanner checker = new Scanner(System.in);
    int age;
    char abc;
    System.out.printf("Enter your age: ");
    age = checker.nextInt();  
    System.out.printf("Enter whether you currently live in BC (Y/N): ");
    abc = checker.next().charAt(0);   
    if (age>=17 && abc == 'Y')
    {
        System.out.println("You are eligible for the driving license");
    }
    else
    {
        System.out.println("Sorry you are not eligible for the driver's license");
    }
      
  }
}
