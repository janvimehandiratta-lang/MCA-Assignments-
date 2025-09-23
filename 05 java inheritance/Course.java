public class Course {
    String courseName;
    String duration;

    Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

}

class OnlineCourse extends Course {
    String platform;
    String isRecorded;

    OnlineCourse(String platform, String isRecorded, String courseName, String duration) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

}

class PaidOnlineCourse extends OnlineCourse {
    int fee;
    int discount;

    PaidOnlineCourse(int fee, int discount, String platform, String isRecorded, String courseName, String duration) {
        super(platform, isRecorded, courseName, duration);
        this.fee = fee;
        this.discount = discount;
    }

    void displayInfo() {
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration : " + duration);
        System.out.println("Platform : " + platform);
        System.out.println("Is Recorded : " + isRecorded);
        System.out.println("fee : " + fee);
        System.out.println("Discount : " + discount);
    }
}

class main1 {
    public static void main(String[] args) {
        PaidOnlineCourse p1 = new PaidOnlineCourse(95000, 20000, "offline", "yes", "MCA", "2 years");
        p1.displayInfo();
    }
}