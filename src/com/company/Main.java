package com.company;

public class Main {


    public static void main(String[] args) {

        System.out.println(createObject("CarNumber"));
        System.out.println(createObject("CarBody"));
        System.out.println(createObject("Chair"));
    }

    public static String createObject(String className) {
        switch (className) {
            case "CarNumber":
                CarNumber carNumber = new CarNumber("Toyota", 2021, 2.0, "USA",
                        9, 'a', 1);
                carNumber.print();
                break;
            case "CarBody":
                CarBody carBody = new CarBody("BMW", 2020, 3.5, BodyMaterial.ULTRA_HIGH_STRENGTH_HOT_FORMING_STEEL);
                carBody.print();
                break;
            case "Chair":
                Chair chair = new Chair("Lexus", 2019, 2.5, "Skin", 80);
                chair.print();
                break;
            default:
                return "Пожалуйста убедитесь что вы правильно написали";
        }
        return "Название класса: " + className;
    }
}
