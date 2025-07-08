

import java.util.Scanner;

public class Mango extends Fruit {
    Scanner sc = new Scanner(System.in);

    public void setMangoInfo() {
        System.out.print("Enter the color: ");
        setColor(sc.nextLine());

        System.out.print("Enter the name: ");
        setName(sc.nextLine());

        System.out.print("Enter the weight: ");
        setWeight(sc.nextDouble());

        System.out.print("Is the mango fresh? (true/false): ");
        setFresh(sc.nextBoolean());
    }

    @Override
    public String taste() {
        return "sweet";
    }
}
