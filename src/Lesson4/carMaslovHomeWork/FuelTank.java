package Lesson4.carMaslovHomeWork;

public class FuelTank {
    private int tankSize;
    private int currentFuelVolume;

    public FuelTank (){
        this.tankSize = 50;
        this.currentFuelVolume = 0;
    }

    public FuelTank (int tankSize){
        this.tankSize = tankSize;
        this.currentFuelVolume = 0;
    }

    public void setTankSize(int tankSize) {
        this.tankSize = tankSize;
    }

    public void setCurrentFuelVolume(int currentFuelVolume) {
        this.currentFuelVolume = currentFuelVolume;
    }

    public int getTankSize() {
        return tankSize;
    }

    public int getCurrentFuelVolume() {
        return currentFuelVolume;
    }

    @Override
    public String toString() {
        return "" + tankSize;
    }
}
