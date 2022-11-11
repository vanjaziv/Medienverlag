package klatsch.krone.at;

public class SMSAbonnent implements Abonnent {
    private String name;
    private Medienverlag medienverlag;

    public SMSAbonnent(String name, Medienverlag medienverlag) {
        this.name = name;
        this.medienverlag = medienverlag;
        medienverlag.addSubscriber(this);
    }

    public String getName() {
        return name;
    }

    @Override
    public void erhalte(Artikel artikel) {
        System.out.println("SMSAbonnant" + name + " hat eine neue SMS erhalten, mit dem Artikel." +
                artikel.getTitel());
    }
}
