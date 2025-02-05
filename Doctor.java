import java.util.ArrayList;
import java.util.List;

public class Doctor {
  private int id;
  private String name;
  private String specialization;
  private List<Appointment> appointments;

  public Doctor(int id, String name, String specialization) {
    this.id = id;
    this.name = name;
    this.specialization = specialization;
    this.appointments = new ArrayList<>();
  }

  // Getters and Setters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getSpecialization() {
    return specialization;
  }

  public List<Appointment> getAppointments() {
    return appointments;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSpecialization(String specialization) {
    this.specialization = specialization;
  }

  public void addAppointment(Appointment appointment) {
    this.appointments.add(appointment);
  }

  @Override
  public String toString() {
    return "Doctor [id=" + id + ", name=" + name + ", specialization=" + specialization + "]";
  }
}
