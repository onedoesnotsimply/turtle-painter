package TurtlePaint.src.main.java.com.pluralsight.form;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    static Scanner scanner = new Scanner(System.in);
    static World world;

    public UserInterface(){};

    public void openingMenu() {
        System.out.println("How big would you like your canvas?");
        // Enforce data type
        try {
            System.out.print("Enter height : ");
            int height = scanner.nextInt();
            System.out.print("Enter width : ");
            int width = scanner.nextInt();
            // Instantiate the world canvas
            world = new World(width, height);

            mainMenu();

        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("invalid input\ninput must be a number");
            openingMenu();
        }
    }

    public void mainMenu() {
        // Enforce data type
        try {

            // Starting menu
            System.out.println("""
                    1) Add Shape
                    2) Save Image
                    0) Exit""");

            int choice = scanner.nextInt();

            if (choice == 1){
                shapeMenu();
            } else if (choice == 2) {
                System.out.println("Enter the filename you would like this image saved under");
                scanner.nextLine();
                String filename = scanner.nextLine();
                world.saveAs(filename);
                mainMenu();
            } else if (choice == 0) {
                System.exit(0);
            } else{
                System.out.println("input out of range");
                scanner.nextLine();
                mainMenu();
            }
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("incorrect input\ninput must be a number");
            mainMenu();
        }
    }

    public void shapeMenu() {
        System.out.println();
        System.out.println("""
                1) Square
                2) Hexagon
                3) Circle""");


        int choice = scanner.nextInt();
        if (choice > 3 || choice < 0) {
            System.out.println("input out of range");
            mainMenu();
        }

        System.out.print("Line width : ");
        int borderWidth = scanner.nextInt();
        System.out.print("Line color (1. Gray (2. Orange (3. Purple : "); // Made the options fit the color outputs
        int colorChoice = scanner.nextInt();

        // Not sure why it doesn't show the correct colors
        Color color = null;
        if (colorChoice==1) {
            color = Color.magenta;
        } else if (colorChoice==2) {
            color = Color.orange;
        } else if (colorChoice==3) {
            color = Color.darkGray;
        }

        System.out.println("Where would you like to place the shape?");
        System.out.print("x : ");
        int x = scanner.nextInt();
        System.out.print("y : ");
        int y = scanner.nextInt();
        Point location = new Point(x,y);

        if (choice==1){
            System.out.print("Enter the length in pixels : ");
            int size = scanner.nextInt();

            Square square = new Square(world, color,borderWidth,location,size);
            square.paint();
            mainMenu();
        } else if (choice==2) {
            System.out.print("Enter the length : ");
            int length = scanner.nextInt();

            Hexagon hex = new Hexagon(world, color, borderWidth,location,length);
            hex.paint();
            mainMenu();
        } else if (choice==3) {
            System.out.print("Enter the radius : ");
            int radius = scanner.nextInt();

            Circle circle = new Circle(world,color,borderWidth,location,radius);
            circle.paint();
            mainMenu();
        }
    }
}
