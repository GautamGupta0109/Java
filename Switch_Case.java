import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        System.out.print("Enter the value : ");
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        switch (s){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thrusday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;
            default: System.out.println("wrong input");
            break;   
            
        }
        scan.close();
    }
}
