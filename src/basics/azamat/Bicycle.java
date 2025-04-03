package basics.azamat;

public class Bicycle extends Transport {
  private String type;

  // Геттер
  public Bicycle(String model, String type) {
    super(model); // Bicycle үчүн
    this.type = type;
  }

  // Геттер
  public String getType() {
    return type;
  }

  // Метод
  public void printInfo() {
    super.printInfo(); // Transport'тон чакырат
    System.out.println("Велосипедтин түрү: " + type);
  }
}
