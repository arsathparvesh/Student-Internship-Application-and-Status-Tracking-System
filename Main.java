
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ApplicationManager manager = new ApplicationManager();

        while (true) {
            System.out.println("\n=== STUDENT INTERNSHIP SYSTEM ===");
            System.out.println("1. Apply for Internship");
            System.out.println("2. View Applications");
            System.out.println("3. Update Application Status (Admin)");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter department: ");
                    String department = sc.nextLine();

                    System.out.print("Enter company name: ");
                    String company = sc.nextLine();

                    Student student = new Student(name, department);
                    manager.addApplication(student, company);
                    break;

                case 2:
                    manager.viewApplications();
                    break;

                case 3:
                    System.out.print("Enter application ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter status (Pending/Selected/Rejected): ");
                    String status = sc.nextLine();

                    if (status.equalsIgnoreCase("Pending")
                            || status.equalsIgnoreCase("Selected")
                            || status.equalsIgnoreCase("Rejected")) {
                        manager.updateStatus(id, status);
                    } else {
                        System.out.println("Invalid status!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
