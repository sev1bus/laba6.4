package Package;

import java.util.Scanner;

        public class Audi {
            public int audirs6 = 600;
            public int audiq7 = 435;
            public int audirs5 = 450;
            public int priceRS6 = 120000;
            public int priceQ7 = 90000;
            public int priceRS5 = 45000;
            String model;

            public void Power() {

                this.model = model;


                if (model.equals("RS6")) {
                    System.out.println("Потужність Audi RS6 = " + audirs6 + "к.с.");
                } else if (model.equals("SQ7")) {
                    System.out.println("Потужність Audi SQ7 = " + audiq7 + "к.с.");
                } else if (model.equals("RS5")) {
                    System.out.println("Потужність RS5 = " + audirs5 + "к.с.");
                } else {
                    System.out.println("Ви ввели модель якої немає в наявності");
                }
            }

            public void Price() {
                this.model = model;
                if (model.equals("RS6")) {
                    System.out.println("Ціна Audi RS6 = " + priceRS6 + "$");
                } else if (model.equals("SQ7")) {
                    System.out.println("Ціна Audi SQ7 = " + priceQ7 + "$");
                } else if (model.equals("RS5")) {
                    System.out.println("Ціна Audi RS5 = " + priceRS5 + "$");
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

