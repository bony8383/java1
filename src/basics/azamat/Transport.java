package basics.azamat;

public class Transport {
  private String model;

  // Конструктор
  public Transport(String model) {
    this.model = model;
  }

  // Геттер
  public String getModel() {
    return model;
  }

  // Метод
  public void printInfo() {
    System.out.println("Велосипедтин модели: " + model);
  }
}
