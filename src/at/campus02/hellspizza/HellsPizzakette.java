package at.campus02.hellspizza;

public abstract class HellsPizzakette {
    public Pizza getPizza(String type) {

        if (type.equals("cheese")) {
            return new CheesePizza();
        } else if (type.equals("salami")) {
            return new SalamiPizza();
        } else {
            System.out.println("Die Pizza \"" + type + "\"gibt es nicht");
            return null;
        }
    }
}
