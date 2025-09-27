// Interface MedicalRecord
interface MedicalRecord {
    void addRecord(String record);

    String viewRecords();
}

// Abstract class Patient
abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    // Constructor
    Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters for encapsulation
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public String getPatientDetails() {
        return "ID: " + patientId + ", Name: " + name + ", Age: " + age + ", Bill: $" + calculateBill();
    }
}

// Subclass InPatient
class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;
    private StringBuilder records;

    InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
        this.records = new StringBuilder();
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate + 100; // Base fee
    }

    @Override
    public void addRecord(String record) {
        records.append(record).append("\n");
    }

    @Override
    public String viewRecords() {
        return records.toString();
    }
}

// Subclass OutPatient
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private StringBuilder records;

    OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.records = new StringBuilder();
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.append(record).append("\n");
    }

    @Override
    public String viewRecords() {
        return records.toString();
    }
}

// Main class for demonstration
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create a list of patients
        Patient[] patients = new Patient[2];
        patients[0] = new InPatient("P001", "janvi", 30, 5, 200.0);
        patients[1] = new OutPatient("P002", "priyanshu", 25, 50.0);

        // Demonstrate polymorphism
        for (Patient p : patients) {
            System.out.println(p.getPatientDetails());

            if (p instanceof MedicalRecord) {
                MedicalRecord mr = (MedicalRecord) p;
                mr.addRecord("Diagnosis: Common Cold");
                mr.addRecord("Treatment: Rest");
                System.out.println("Medical Records:\n" + mr.viewRecords());
            }
            System.out.println("------------------------------------------");
        }
    }
}
