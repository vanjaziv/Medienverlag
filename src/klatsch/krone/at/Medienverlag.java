package klatsch.krone.at;

import java.util.ArrayList;
import java.util.List;

//Soltte eine Interface implementieren
public class Medienverlag {
    private List<Abonnent> abonenten = new ArrayList<>();

    public void veroeffentliche(Artikel a1) {
        for (Abonnent a : abonenten) {
            a.erhalte(a1);
        }
    }

    public void addSubscriber(Abonnent a) {
        abonenten.add(a);
        System.out.println("Medianverlag: Subscriber " + a.getName() + "hinzugefugt");
    }

    public void removeSubscriber(Abonnent a) {
        abonenten.add(a);
    }
}
