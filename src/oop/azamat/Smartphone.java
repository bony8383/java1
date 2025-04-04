package oop.azamat;

public class Smartphone extends Phone {
    private boolean hasCamera;
    private boolean hasInternet;

    // Смартфон үчүн конструктор
    public Smartphone(String brand, String model, double price, boolean hasCamera, boolean hasInternet) {
        super(brand, model, price); // ата класстын конструктору
        this.hasCamera = hasCamera;
        this.hasInternet = hasInternet;
    }

    public boolean hasCamera() {
        return hasCamera;
    }

    public boolean hasInternet() {
        return hasInternet;
    }


    public void printSmartphoneInfo() {
        super.printInfo();
        System.out.println("Камера барбы: " + (hasCamera ? "Ооба" : "Жок"));
        System.out.println("Инетернет барбы: " + (hasInternet ? "Ооба" : "Жок"));
    }

}
