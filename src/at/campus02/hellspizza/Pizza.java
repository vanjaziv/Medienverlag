package at.campus02.hellspizza;

public abstract class Pizza {

    private String name;

    public Pizza(String name) {
       this.name = name;
        System.out.println("Neue Pizza erstellt.");
    }
}
