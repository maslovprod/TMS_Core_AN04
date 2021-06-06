package Lesson4.carMaslovHomeWork;

public class Car {
    private String carModel;
    private int yearOfProd;
    private int distanceCovered;
    private boolean carIsOn;
    private int consumptionPer100km;
    private Engine engine;
    private FuelTank fuelTank;

    public Car(Engine engine, FuelTank fuelTank){
       this.distanceCovered = 0;
       this.consumptionPer100km = 10;
       this.engine = engine;
       this.fuelTank = fuelTank;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setYearOfProd(int yearOfProd) {
        this.yearOfProd = yearOfProd;
    }

    public void setFuelTank(FuelTank fuelTank) {
        this.fuelTank = fuelTank;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setDistanceCovered(int distanceCovered) {
        this.distanceCovered = distanceCovered;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getConsumptionPer100km() {
        return consumptionPer100km;
    }

    public int getYearOfProd() {
        return yearOfProd;
    }

    public int getDistanceCovered() {
        return distanceCovered;
    }

    public boolean getCarIsOn() {
        return carIsOn;
    }

    public void startTheCar(){
        this.engine.startEngine();
        this.carIsOn = true;
        System.out.println("----------------------------------------->>Автомобиль заведен!");
    }

    public void stopTheCar(){
        this.engine.stopEngine();
        this.carIsOn = false;
        System.out.println("----------------------------------------->>Автомобиль заглушен!");
    }

    public void drive100km(FuelTank newFuelTank){
        this.setDistanceCovered(distanceCovered+=100);
        newFuelTank.setCurrentFuelVolume(newFuelTank.getCurrentFuelVolume() - this.consumptionPer100km);
        System.out.println("----------------------------------------->>Пройдена дистанция: 100км");
    }

    @Override
    public String toString() {
        return "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + "\n" +
                "Текущий автомобиль:" + "\n" +
                "Модель = '" + carModel + '\'' + "\n" +
                "Год выпуска = " + yearOfProd + "\n" +
                "Тип двигателя = '" + engine.toString() + '\'' + "\n" +
                "Объем топливного бака = " + fuelTank.toString() + "\n" +
                "Текущий объем топлива в баке = " + fuelTank.getCurrentFuelVolume() + "\n" +
                "Расход на 100 км = " + consumptionPer100km + "л" + "\n" +
                "Пройденная дистанция = " + distanceCovered + "км" + "\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@";
    }




}
