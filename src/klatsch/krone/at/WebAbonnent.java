package klatsch.krone.at;

public class WebAbonnent implements Abonnent{
    private String name;
    private Medienverlag medienverlag;
    public WebAbonnent(String name, Medienverlag medienverlag) {
        this.name = name;
        this.medienverlag = medienverlag;
        medienverlag.addSubscriber(this);
    }

    public String getName() {
        return name;
    }

    @Override
       public void erhalte (Artikel artikel){
            System.out.println("WebAbonnant" + name + " hat eine neue Notifikation erhalten, mit dem Artikel." +
                    artikel.getTitel());
        }
    }
