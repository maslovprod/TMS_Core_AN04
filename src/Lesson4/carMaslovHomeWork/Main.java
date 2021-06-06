package Lesson4.carMaslovHomeWork;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner in;
        int inputInt = 0;
        String inputStr = "";
        boolean play = true;
        boolean carWasCreated = false;
        boolean engineWasCreated = false;
        String engineWasCreatedOK = "";
        boolean fuelTankWasCreated = false;
        String fuelTankWasCreatedOK = "";

        FuelTank newFuelTank = null;
        Engine newEngine = null;
        Car newCar = null;

        while (play) {
            while (!carWasCreated) {
                in = new Scanner(System.in);
                System.out.println("************************************");
                System.out.println("Для создания автомобиля укажите обязательные поля:");
                System.out.println("1. Установить двигатель " + engineWasCreatedOK);
                System.out.println("2. Установить объем топливного бака " + fuelTankWasCreatedOK);
                System.out.println("Введите команду:");
                inputInt = in.nextInt();
                if (inputInt == 1) {
                    in = new Scanner(System.in);
                    System.out.println("Укажите тип двигателя:");
                    inputStr = in.nextLine();
                    newEngine = new Engine();
                    newEngine.setEngineType(inputStr);
                    engineWasCreated = true;
                    engineWasCreatedOK = "[OK]";
                } else if (inputInt == 2) {
                    in = new Scanner(System.in);
                    System.out.println("Укажите объем топливного бака:");
                    inputInt = in.nextInt();
                    newFuelTank = new FuelTank();
                    newFuelTank.setTankSize(inputInt);
                    fuelTankWasCreated = true;
                    fuelTankWasCreatedOK = "[OK]";
                }
                if (engineWasCreated && fuelTankWasCreated) {
                    newCar = new Car(newEngine, newFuelTank);
                    carWasCreated = true;
                    System.out.println("----------------------------------------->>Создана новая машина");
                }
            }
            while (carWasCreated) {
                in = new Scanner(System.in);
                System.out.println("************************************");
                System.out.println("1. Создать новый автомобиль");
                System.out.println("2. Установить модель автомобиля");
                System.out.println("3. Установить объем топливного бака");
                System.out.println("4. Установить год выпуска автомобиля");
                System.out.println("5. Заправить автомобиль");
                System.out.println("6. Завести автомобиль");
                System.out.println("7. Заглушить автомобиль");
                System.out.println("8. Проехать 100км");
                System.out.println("9. Информация по текущему автомобилю");
                System.out.println("0. ВЫХОД");
                System.out.println("Введите команду:");
                inputInt = in.nextInt();
                if (inputInt == 1) {
                    carWasCreated = false;
                    engineWasCreated = false;
                    fuelTankWasCreated = false;
                } else if (inputInt == 2) {
                    in = new Scanner(System.in);
                    System.out.println("Укажите модель автомобиля:");
                    inputStr = in.nextLine();
                    newCar.setCarModel(inputStr);
                } else if (inputInt == 3) {
                    in = new Scanner(System.in);
                    System.out.println("Укажите объем топливного бака:");
                    inputInt = in.nextInt();
                    newFuelTank.setTankSize(inputInt);
                } else if (inputInt == 4) {
                    in = new Scanner(System.in);
                    System.out.println("Укажите год выпуска автомобиля:");
                    inputInt = in.nextInt();
                    newCar.setYearOfProd(inputInt);
                } else if (inputInt == 5) {
                    int currentFuelVolume = 0;
                    System.out.println("Идет заправка...");
                    while (currentFuelVolume != newFuelTank.getTankSize()) {
                        System.out.print("+");
                        currentFuelVolume++;
                        TimeUnit.MILLISECONDS.sleep(35);
                    }
                    newFuelTank.setCurrentFuelVolume(currentFuelVolume);
                    System.out.println("");
                    System.out.println("----------------------------------------->>Бак полностью заправлен!");
                    System.out.println("");
                } else if (inputInt == 6) {
                    if (newCar.getCarIsOn()) {
                        System.out.println("----------------------------------------->>Автомобиль уже заведен!");
                    } else if (newFuelTank.getCurrentFuelVolume() == 0) {
                        System.out.println("----------------------------------------->>Недостаточно топлива для поездки!");
                    } else newCar.startTheCar();
                } else if (inputInt == 7) {
                    if (newCar.getCarIsOn()) {
                        newCar.stopTheCar();
                    } else System.out.println("----------------------------------------->>Автомобиль уже заглушен!");

                } else if (inputInt == 8) {
                    if (!newCar.getCarIsOn()) {
                        System.out.println("----------------------------------------->>Автомобиль не заведен!");
                    } else if (newFuelTank.getCurrentFuelVolume() < newCar.getConsumptionPer100km()) {
                        System.out.println("----------------------------------------->>Недостаточно топлива для поездки!");
                    } else {
                        System.out.println("----------------------------------------->>Поехали!");
                        int distance = 0;
                        while (distance <= 100) {
                            System.out.print(".");
                            distance++;
                            TimeUnit.MILLISECONDS.sleep(35);
                        }
                        System.out.println("");
                        newCar.drive100km(newFuelTank);
                    }
                } else if (inputInt == 9) {
                    System.out.println(newCar.toString());
                } else if (inputInt == 0) {
                    System.exit(0);
                    in.close();
                }
            }
        }
    }
}

