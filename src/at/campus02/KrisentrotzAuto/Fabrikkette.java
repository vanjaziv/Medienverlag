package at.campus02.KrisentrotzAuto;

public abstract class Fabrikkette {
    public Auto getAuto(String type) {

        if (type.equals("PKW")) {
            return new PKW();
        } else if (type.equals("LKW")) {
            return new LKW();
        } else {
            return null;
        }
    }
}
