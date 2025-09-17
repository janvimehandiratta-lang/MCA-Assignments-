class Course {
    // Class variable (common for all courses)
    static String instituteName = "ABC Institute";

    // Instance variables
    String courseName;
    String duration;
    double fee;

    // Constructor
    Course(String courseName, String duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    void displayCourseDetails() {
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println("------------------------------");
    }

    // Class method to update institute name
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

// Main class to test
public class CourseManagement {
    public static void main(String[] args) {
        Course c1 = new Course("Python Programming", "3 months", 15000);
        Course c2 = new Course("Data Science", "6 months", 40000);

        System.out.println("Before Updating Institute Name:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name
        Course.updateInstituteName("XYZ Academy");

        System.out.println("After Updating Institute Name:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
