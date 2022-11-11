package at.campus02.hellspizza;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcom to Hells Pizza!");

        CheesePizza cheesePizza = new CheesePizza();
        SalamiPizza salamiPizza = new SalamiPizza();

        PizzeriaGraz DonAlfredoHellsPizza = new PizzeriaGraz();

        Pizza p1 = DonAlfredoHellsPizza.getPizza("cheese");
        Pizza p2 = DonAlfredoHellsPizza.getPizza("salami");

    }
}
