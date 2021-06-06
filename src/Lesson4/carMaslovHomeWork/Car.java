package Lesson4.carMaslovHomeWork;

public class Car {
    private String carModel;
    private int yearOfProd;
    private int distanceCovered;
    private boolean carIsOn;
    private int consumptionPer100km;

    public Car(){
       this.distanceCovered = 0;
       this.consumptionPer100km = 10;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setYearOfProd(int yearOfProd) {
        this.yearOfProd = yearOfProd;
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

    public void startTheCar(Engine newEngine){
        newEngine.startEngine();
        this.carIsOn = true;
        System.out.println("----------------------------------------->>Автомобиль заведен!");
    }

    public void stopTheCar(Engine newEngine){
        newEngine.stopEngine();
        this.carIsOn = false;
        System.out.println("----------------------------------------->>Автомобиль заглушен!");
    }

    public void drive100km(FuelTank newFuelTank){
        this.setDistanceCovered(distanceCovered+=100);
        newFuelTank.setCurrentFuelVolume(newFuelTank.getCurrentFuelVolume() - this.consumptionPer100km);
        System.out.println("----------------------------------------->>Пройдена дистанция: 100км");
    }

    //так оказывается не работает
//    @Override
//    public String toString(Engine newEngine, FuelTank newFuelTank) {
//        return "Текущий автомобиль:" + "\n" +
//                "Модель = '" + carModel + '\'' + "\n" +
//                "Год выпуска = " + yearOfProd + "\n" +
//                "Тип двигателя = '" + newEngine.getEngineType() + '\'' + "\n" +
//                "Объем топливного бака = " + newFuelTank.getTankSize() + "\n" +
//                "Текущий объем топлива в баке = " + newFuelTank.getCurrentFuelVolume() + "\n" +
//                "Расход на 100 км = " + consumptionPer100km + "л" + "\n" +
//                "Пройденная дистанция = " + distanceCovered + "км" + "\n";
//    }

        @Override
    public String toString() {
        return "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + "\n" +
                "Текущий автомобиль:" + "\n" +
                "Модель = '" + carModel + '\'' + "\n" +
                "Год выпуска = " + yearOfProd + "\n" +
                "Расход на 100 км = " + consumptionPer100km + "л" + "\n" +
                "Пройденная дистанция = " + distanceCovered + "км" + "\n";
    }


}
