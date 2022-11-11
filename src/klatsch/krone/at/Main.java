package klatsch.krone.at;

import java.sql.ParameterMetaData;

public class Main {

    public static void main(String[] args) {

        Medienverlag klatsch = new Medienverlag();

        Artikel a1 = new Artikel("Titel 1: Baby Hund retet das Kind.", "Inhalt 1");
        Artikel a2 = new Artikel("Titel 1: Ultraspannende Rettung von einem Vogel.", "Klicken Sie (hier um zu erfahren wie es ihm gehet.)");

        Abonnent Peter = new PrintAbonnent("Peter", klatsch);
        Abonnent Hans = new PrintAbonnent("Hans", klatsch);
        Abonnent Wilhelm = new SMSAbonnent("Wilhelm", klatsch);
        Abonnent Maxi = new WebAbonnent("Maxi", klatsch);
        // System.out.println("" + a1 + a2); //(a1.toString + "\n\n" + a2)

        // klatsch.addSubscriber(Maxi);
        // klatsch.addSubscriber(Wilhelm);

        klatsch.veroeffentliche(a1);
        klatsch.veroeffentliche(a2);

        LogSingleton l = LogSingleton.getInstance();
        LogSingleton o = LogSingleton.getInstance();

        

    }
}
