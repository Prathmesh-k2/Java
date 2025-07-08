import java.util.Scanner;
public class FruitBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the basket size: ");
        int n = sc.nextInt();

        Fruit[] basket = new Fruit[n];
        int counter = 0;
        int choice, exit;

        do {
            System.out.println("\n0. Exit\n1. Add Mango\n2. Add Apple\n3. Add Orange");
            System.out.println("4. Show Fruit Names\n5. Show Fresh Fruits Info\n6. Show Taste of All Fruits");
            System.out.println("7. Mark a Fruit as Stale\n8. Show Tastes of Stale Fruits");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
        
            switch (choice) {
                case 0:
                    return;

                case 1:
                    if (counter < basket.length) {
                        Mango m = new Mango();
                        m.setMangoInfo();
                        basket[counter++] = m;
                    } else {
                        System.out.println("Basket is full");
                    }

                    
                    break;

                case 2:
                    if (counter < basket.length) {
                        Apple a = new Apple();
                        a.setInfo();
                        basket[counter++] = a;
                    } else {
                        System.out.println("Basket is full");
                    }
                    break;

                case 3:
                    if (counter < basket.length) {
                        Orange o = new Orange();
                        o.setOrangeInfo();
                        basket[counter++] = o;
                    } else {
                        System.out.println("Basket is full");
                    }
                    break;

                case 4:
                    for (Fruit f : basket) {
                        if (f != null)
                            System.out.println("Fruit: " + f.getName());
                    }
                    break;

                case 5:
                    for (Fruit f : basket) {
                        if (f != null && f.getFresh()) {
                            System.out.println(f);
                            System.out.println("Taste: " + f.taste());
                        }
                    }
                    break;

                case 6:
                    for (Fruit f : basket) {
                        if (f != null)
                            System.out.println(f.getName() + " Taste: " + f.taste());
                    }
                    break;

                case 7:
                    System.out.print("Enter index to mark stale: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < counter) {
                        basket[index].setFresh(false);
                        System.out.println("Marked " + basket[index].getName() + " as stale.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 8:
                    for (Fruit f : basket) {
                        if (f != null && !f.getFresh()) {
                            System.out.println(f.getName() + " (Stale) Taste: " + f.taste());
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("\nDo you want to exit? (1 = Yes / 0 = No): ");
            exit = sc.nextInt();

        } while (exit != 1);

        System.out.println("\nFinal Basket Contents:");
        for (Fruit f : basket) {
            if (f != null)
                System.out.println(f);
        }

        sc.close();
    }
}
