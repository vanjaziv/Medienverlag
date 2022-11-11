package klatsch.krone.at;

public class PrintAbonnent implements Abonnent{
    private String name;
    private Medienverlag medienverlag;

    public PrintAbonnent(String name, Medienverlag medienverlag) {
        this.name = name;
        this.medienverlag = medienverlag;
        medienverlag.addSubscriber(this);
    }

    public String getName() {
        return name;
    }

    // wenn Mediaenverlag eine neue Artikel heraus bringt
    @Override
    public void erhalte(Artikel artikel) {
        System.out.println("PrintAbonnant" + name + " hat eine neue Zeitung erhalten, mit dem Artikel." +
        artikel.getTitel());
    }
}
