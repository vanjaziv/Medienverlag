package klatsch.krone.at;

public class LogSingleton {

    private static LogSingleton instance = null;

    private LogSingleton() {
    }

    public static LogSingleton getInstance(){
        if(instance == null){
            System.out.println("LogSingleton: ersttele mich neu, das ist mein erster Aufruf.");
            instance = new LogSingleton();
        }else{
            System.out.println("LogSingleton: Das ist NICHT der 1. Zugriff.");
        }
        return instance;
    }
}
