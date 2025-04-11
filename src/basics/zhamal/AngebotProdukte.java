package basics.zhamal;

public class AngebotProdukte {

    private String model;
    private double zoll;
    private boolean bluetooth;

    public AngebotProdukte  ( String model , double zoll , boolean bluetooth ){
        this.model = model;
        this.zoll = zoll;
        this.bluetooth = bluetooth ;
    }
    public String getModel (){
       return(model ) ;
    }

    public double getZoll() {
        return zoll;
    }

    public boolean getBluetooth() {
        return bluetooth;
    }

    public void info()
    {   System.out.println( " <<< Die Besten Angebote und Aktionen nur für Java lernende >>> ");
        System.out.println( " Model :" + model + " \n Größe : " + zoll +
            " \n Bluetooth Verbindung : " + ( bluetooth ? " Ja ✅ " : "Nein"));

    }

}
