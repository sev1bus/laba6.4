package Package;

import java.util.Scanner;

public class Mercedes {
    public int mercedesBenzE63W213 = 612;
    public int mercedesBenzGLS600 = 520;
    public int mercedesBenzC63Amg = 510;
    public int priceE63AMG = 85000;
    public int priceGLS600 = 120000;
    public int priceC63AMG = 60000;
    String model;

    public void Power() {

            this.model = model;


            if (model.equals("E63AMG")) {
                System.out.println("Потужність Mercedes-Benz E63AMG W213 = " + mercedesBenzE63W213 + "к.с.");
            } else if (model.equals("GLS600")) {
                System.out.println("Потужність Mercedes-Benz GLS600 = " + mercedesBenzGLS600 + "к.с.");
            } else if (model.equals("C63AMG")) {
                System.out.println("Потужність Mercedes-Benz C63AMG W205 = " + mercedesBenzC63Amg + "к.с.");
            } else {
                System.out.println("Ви ввели модель якої немає в наявності");
            }
        }
        public void Price () {
            this.model = model;
            if (model.equals("E63AMG")) {
                System.out.println("Ціна Mercedes-Benz E63AMG W213 = " + priceE63AMG + "$");
            } else if (model.equals("GLS600")) {
                System.out.println("Ціна Mercedes-Benz GLS600 = " + priceGLS600 + "$");
            } else if (model.equals("C63AMG")) {
                System.out.println("Ціна Mercedes-Benz C63AMG W205 = " + priceC63AMG + "$");
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

