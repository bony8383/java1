package basics.zhamal;

public class TVundAudio extends AngebotProdukte {

    private double preis;
    private boolean verfügbarkeit;

    public TVundAudio ( String model, double zoll, boolean bluetooth , double preis, boolean verfügbarkeit) {
        super(model, zoll, bluetooth);
        this.preis = preis;
        this.verfügbarkeit = verfügbarkeit;
    }

    public boolean getVerfügbarkeit() {
        return verfügbarkeit;
    }

    public double getPreis() {
        return preis;
    }
   public void Elektroabteilung(){
        super.info();
        System.out.println( " Liebe Java Kunde , 50 % Angebot gilt nur für heute ! " + " \n  Aktuell kostet " +
                preis + " $ " + " \n Verfügbar ? " + ( verfügbarkeit ? " Nein ❌ " : " Ja "));
   }
}
