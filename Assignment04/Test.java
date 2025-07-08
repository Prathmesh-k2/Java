import java.util.Scanner;

class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String getDetails() {
        return "Point(" + x + ", " + y + ")";
    }

    public boolean isEqual(Point2D otherPoint) {
        return this.x == otherPoint.x && this.y == otherPoint.y;
    }

    public double calculateDistance(Point2D otherPoint) {
        return Math.sqrt(Math.pow(this.x - otherPoint.x, 2) + Math.pow(this.y - otherPoint.y, 2));
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of points to plot: ");
        int n = sc.nextInt();

        Point2D[] points = new Point2D[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter x and y coordinates for Point " + i + ": ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            points[i] = new Point2D(x, y);
        }

        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Display specific point");
            System.out.println("2. Display all points");
            System.out.println("3. Display distance between 2 points");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < points.length) {
                        System.out.println("Point details: " + points[index].getDetails());
                    } else {
                        System.out.println("Invalid index, please retry!");
                    }
                    break;

                case 2:
                    System.out.println("All points:");
                    for (Point2D p : points) {
                        System.out.println(p.getDetails());
                    }
                    break;

                case 3:
                    System.out.print("Enter index 1: ");
                    int i1 = sc.nextInt();
                    System.out.print("Enter index 2: ");
                    int i2 = sc.nextInt();
                    if (i1 >= 0 && i1 < points.length && i2 >= 0 && i2 < points.length) {
                        if (points[i1].isEqual(points[i2])) {
                            System.out.println("Both points are at the same location.");
                        } else {
                            double dist = points[i1].calculateDistance(points[i2]);
                            System.out.println("Distance: " + dist);
                        }
                    } else {
                        System.out.println("Invalid indices, try again.");
                    }
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
