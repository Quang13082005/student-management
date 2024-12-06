import java.util.Scanner;

public class Teacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalCost = 0;
        System.out.println("Teacher");
        System.out.println("Nam - 50 USD");
        System.out.println("Thuy - 25 USD");
        System.out.println("Thao - 20 USD");
        System.out.println("QUang - 15 USD");

        int choice;
        do {
            System.out.println("Please select teacher:");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Inprogress...");
                    break;
                case 1:
                    System.out.println("You can select teacher Nam");
                    totalCost += 30;
                    break;
                case 2:
                    System.out.println("You can select teacher Thuy");
                    totalCost += 25;
                    break;
                case 3:
                    System.out.println("You can select teacher Thao");
                    totalCost += 20;
                    break;
                case 4:
                    System.out.println("You can select teacher Quang");
                    totalCost += 15;
                    break;
                default:
                    System.out.println("Invalid");
            }
        } while (choice != 0);
    }
}