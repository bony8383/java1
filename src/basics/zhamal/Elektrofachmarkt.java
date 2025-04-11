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

        int eingabe = -1;
        while (true) {
            System.out.println("Welches Produkt möchtest du kaufen? (Nummer 0 bis 2)");
            eingabe = scanner.nextInt();
            if (eingabe >= 0 && eingabe < auswahl.length) {
                TVundAudio produkt = auswahl[eingabe];

                if (produkt.getVerfügbarkeit()) {
                    System.out.println("✅ Das Produkt ist verfügbar:");
                    produkt.info();
                    break; // Beende die Schleife, weil alles passt
                } else {
                    System.out.println("❌ Dieses Produkt ist nicht verfügbar. Wähle ein anderes.");
                }
            } else {
                System.out.println("⚠️ Ungültige Zahl. Bitte gib 0, 1 oder 2 ein.");
            }
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










