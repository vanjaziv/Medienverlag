package at.campus02.KrisentrotzAuto;

public class FabrikEngland extends Fabrikkette{

    public Auto geAuto(String type){

        Auto a = super.getAuto(type);
        if(a != null){
            return a;
        }else if
        (type.equals("PKW")){
            return new PKW();
        }else{
            return null;
        }
    }
}
