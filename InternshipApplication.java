
public class InternshipApplication {
    int id;
    Student student;
    String company;
    String status;

    public InternshipApplication(int id, Student student,
                                 String company) {
        this.id = id;
        this.student = student;
        this.company = company;
        this.status = "Pending";
    }

    public void display() {
        System.out.println("\nApplication ID: " + id);
        System.out.println("Student: " + student.name);
        System.out.println("Department: " + student.department);
        System.out.println("Company: " + company);
        System.out.println("Status: " + status);
    }
}
