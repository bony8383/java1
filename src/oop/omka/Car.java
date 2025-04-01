package oop.omka;

public class Car {
    private String marka;
    private int preis;

    // Бош конструктор
    public Car() {
        this.marka = "Белгисиз";
        this.preis = 0;
    }

    //Параметрлүү конструктор
    public Car(String marka, int preis) {
        this.marka = marka;
        this.preis = preis;
    }

//    Getter жана Setter
//    public String getMarka() {
//        return marka;
//    }
  //----
    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        if (preis > 0) {
            this.preis = preis;
        } else {
            System.out.println();
        }
    }

    public void all() {
        System.out.println("Машинанын маркасы: " + marka + ", Баасы: " + preis + " доллар турат.");
    }
}
