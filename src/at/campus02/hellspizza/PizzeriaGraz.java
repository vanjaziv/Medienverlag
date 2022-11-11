package at.campus02.hellspizza;

public class PizzeriaGraz extends HellsPizzakette {
   public Pizza getPizza(String type){

       Pizza p = super.getPizza(type);
       if(p != null){
           return p;
       }else if
           (type.equals("uhrturm")){
           return new UhrturmPizza();
       }else{
           return null;
       }
   }
}
