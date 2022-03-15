import java.util.Scanner;

public class Main extends Loan {

    public static void main(String[] args) {
        System.out.println("Enter your Bank");
        System.out.println("Enter 1 for HDFC");
        System.out.println("Enter 2 for SBI");
        System.out.println("Enter 3 for PNB");
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice1 = s1.nextInt();
        Main obj = new Main();

        switch (choice1) {
            case 1:
                obj.loantype(5.50, 1);
                break;
            case 2:
                obj.loantype(4.50, 1);
                break;
            case 3:
                obj.loantype(4.75, 1);
                break;
            default:
                System.out.println("Wrong choice");
                s1.close();

        }
    }
}
