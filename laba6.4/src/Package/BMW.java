package Package;

import java.util.Scanner;

public class BMW {
    public int bmwM5F90 = 625;
    public int bmwX7 = 400;
    public int bmwM4 = 470;
    public int priceBmwM5 = 80000;
    public int priceBmwX7 = 70000 ;
    public int priceBmwM4 = 50000;
    String model;

    public void Power() {
        this.model=model;


        if (model.equals("M5 F90")) {
            System.out.println("Потужність BMW M5 F90 = " + bmwM5F90 + "к.с.");
        } else if (model.equals("X7")) {
            System.out.println("Потужність BMW X7 = " + bmwX7 + "к.с.");
        } else if (model.equals("M4")) {
            System.out.println("Потужність BMW M4 = " + bmwM4 + "к.с.");
        } else {
            System.out.println("Ви ввели модель якої немає в наявності");
        }
    }
    public void Price() {
        this.model=model;
        if (model.equals("M5 F90")) {
            System.out.println("Ціна M5 F90 = " + priceBmwM5 + "$");
        } else if (model.equals("X7")) {
            System.out.println("Ціна BMW X7 = " + priceBmwX7 + "$");
        } else if (model.equals("M4")) {
            System.out.println("Ціна BMW M4 = " + priceBmwM4 + "$");
        } else {
            System.out.println("Ви ввели модель якої немає в наявності");
        }


    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

