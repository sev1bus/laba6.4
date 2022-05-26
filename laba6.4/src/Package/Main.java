package Package;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
   System.out.println("Виберіть марку машини якої хочете дізнатися потужність двигуна");
        BMW bmw = new BMW();
        Mercedes mercedes = new Mercedes();
        Audi audi = new Audi();
   Scanner m = new Scanner(System.in);
   String bumer = m.nextLine();
    if (bumer.equals("BMW")) {
        bmw.setModel(m.nextLine());
            bmw.Power();
            bmw.Price();
        }
    else if(bumer.equals("Mercedes-Benz")){
        mercedes.setModel(m.nextLine());
        mercedes.Power();
        mercedes.Price();
        }
    else if(bumer.equals("Audi")){
        audi.setModel(m.nextLine());
        audi.Power();
        audi.Price();

    }
    }
}
