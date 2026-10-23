
import java.util.ArrayList;

public class ApplicationManager {
    ArrayList<InternshipApplication> applications =
            new ArrayList<>();

    int nextId = 1;

    public void addApplication(Student student, String company) {
        InternshipApplication app =
                new InternshipApplication(nextId++, student, company);

        applications.add(app);
        System.out.println("Application submitted successfully!");
    }

    public void viewApplications() {
        if (applications.isEmpty()) {
            System.out.println("No applications found.");
            return;
        }

        for (InternshipApplication app : applications) {
            app.display();
        }
    }

    public void updateStatus(int id, String status) {
        for (InternshipApplication app : applications) {
            if (app.id == id) {
                app.status = status;
                System.out.println("Status updated successfully!");
                return;
            }
        }

        System.out.println("Application ID not found.");
    }
}

