package Lesson4.carMaslovHomeWork;

public class Engine {
    private String engineType;
    private boolean engineIsOn;

    public Engine(){
        this.engineIsOn = false;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    public String getEngineType() {
        return engineType;
    }

    public void startEngine(){
        this.engineIsOn = true;
        System.out.println("----------------------------------------->>Двигатель включен!");
    }

    public void stopEngine(){
        this.engineIsOn = false;
        System.out.println("----------------------------------------->>Двигатель выключен!");
    }

    @Override
    public String toString() {
        return "" + engineType;
    }
}
