public class Appointment {
  private int id;
  private Patient patient;
  private Doctor doctor;
  private String date;

  public Appointment(int id, Patient patient, Doctor doctor, String date) {
    this.id = id;
    this.patient = patient;
    this.doctor = doctor;
    this.date = date;
  }

  // Getters and Setters
  public int getId() {
    return id;
  }

  public Patient getPatient() {
    return patient;
  }

  public Doctor getDoctor() {
    return doctor;
  }

  public String getDate() {
    return date;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setPatient(Patient patient) {
    this.patient = patient;
  }

  public void setDoctor(Doctor doctor) {
    this.doctor = doctor;
  }

  public void setDate(String date) {
    this.date = date;
  }

  @Override
  public String toString() {
    return "Appointment [id=" + id + ", patient=" + patient + ", doctor=" + doctor + ", date=" + date + "]";
  }
}
