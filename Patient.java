public class Patient {
  private int id;
  private String name;
  private int age;
  private String ailment;

  public Patient(int id, String name, int age, String ailment) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.ailment = ailment;
  }

  // Getters and Setters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getAilment() {
    return ailment;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setAilment(String ailment) {
    this.ailment = ailment;
  }

  @Override
  public String toString() {
    return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", ailment=" + ailment + "]";
  }
}
