import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalManagement {
  private static List<Patient> patients = new ArrayList<>();
  private static List<Doctor> doctors = new ArrayList<>();
  private static List<Appointment> appointments = new ArrayList<>();
  private static int patientIdCounter = 1;
  private static int doctorIdCounter = 1;
  private static int appointmentIdCounter = 1;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("1. Add Patient");
      System.out.println("2. Add Doctor");
      System.out.println("3. Book Appointment");
      System.out.println("4. View Appointments");
      System.out.println("5. Exit");
      System.out.print("Choose an option: ");
      int choice = scanner.nextInt();
      scanner.nextLine(); // consume newline

      switch (choice) {
        case 1:
          addPatient(scanner);
          break;
        case 2:
          addDoctor(scanner);
          break;
        case 3:
          bookAppointment(scanner);
          break;
        case 4:
          viewAppointments();
          break;
        case 5:
          System.out.println("Exiting...");
          scanner.close();
          return;
        default:
          System.out.println("Invalid choice. Please try again.");
      }
    }
  }

  private static void addPatient(Scanner scanner) {
    System.out.print("Enter Patient Name: ");
    String name = scanner.nextLine();
    System.out.print("Enter Patient Age: ");
    int age = scanner.nextInt();
    scanner.nextLine(); // consume newline
    System.out.print("Enter Ailment: ");
    String ailment = scanner.nextLine();
    Patient patient = new Patient(patientIdCounter++, name, age, ailment);
    patients.add(patient);
    System.out.println("Patient added: " + patient);
  }

  private static void addDoctor(Scanner scanner) {
    System.out.print("Enter Doctor Name: ");
    String name = scanner.nextLine();
    System.out.print("Enter Specialization: ");
    String specialization = scanner.nextLine();
    Doctor doctor = new Doctor(doctorIdCounter++, name, specialization);
    doctors.add(doctor);
    System.out.println("Doctor added: " + doctor);
  }

  private static void bookAppointment(Scanner scanner) {
    System.out.print("Enter Patient ID: ");
    int patientId = scanner.nextInt();
    System.out.print("Enter Doctor ID: ");
    int doctorId = scanner.nextInt();
    scanner.nextLine(); // consume newline
    System.out.print("Enter Date (YYYY-MM-DD): ");
    String date = scanner.nextLine();

    Patient patient = patients.stream().filter(p -> p.getId() == patientId).findFirst().orElse(null);
    Doctor doctor = doctors.stream().filter(d -> d.getId() == doctorId).findFirst().orElse(null);

    if (patient != null && doctor != null) {
      Appointment appointment = new Appointment(appointmentIdCounter++, patient, doctor, date);
      appointments.add(appointment);
      doctor.addAppointment(appointment);
      System.out.println("Appointment booked: " + appointment);
    } else {
      System.out.println("Invalid Patient ID or Doctor ID.");
    }
  }

  private static void viewAppointments() {
    if (appointments.isEmpty()) {
      System.out.println("No appointments found.");
    } else {
      for (Appointment appointment : appointments) {
        System.out.println(appointment);
      }
    }
  }
}
