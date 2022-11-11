package at.campus02.hellspizza;

public class PizzeriaTakernII extends HellsPizzakette {
   public Pizza getPizza(String type){

       Pizza p = super.getPizza(type);
       if(p != null){
           return p;
       }else if
           (type.equals("kleinklein")){
           return new KleinKleinPizza();
       }else{
           return null;
       }
   }
}
