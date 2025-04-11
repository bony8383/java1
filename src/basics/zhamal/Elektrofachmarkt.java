package basics.zhamal;

import java.util.Scanner;

public class Elektrofachmarkt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AngebotProdukte elektronik = new AngebotProdukte(" : Gaming Fernseher ", 85.5, true);
        elektronik.info();

        TVundAudio rabatt = new TVundAudio(" JBL", 24, true, 75.9, true);
        rabatt.Elektroabteilung();

        TVundAudio [] auswahl = new TVundAudio[3];
        auswahl[0] = new TVundAudio( " Music Box", 12.5, true,889, true) ;
        auswahl[1] = new TVundAudio(" Samsung Galaxy", 45, false, 776, false) ;
        auswahl[2] = new TVundAudio( " Huawei", 6, true, 987, true) ;

        System.out.println(" Alle Produkte: ");
        for ( int i= 0; i < auswahl.length; i++){
            auswahl[i].info();
        }
        System.out.println( " Wie alt sind Sie ? ");
                int alter = scanner.nextInt();

                if (alter >= 18 ) {
                    System.out.println(" Sie haben Möglichkeit für Rathenzahlung ");

                } else {
                    System.out.println(" ");
                }
        scanner.close();
            }
        }










