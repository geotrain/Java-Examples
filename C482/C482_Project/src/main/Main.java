package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;
import model.InHouse;
import model.Outsourced;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = FXMLLoader.load(getClass().getResource("/view/main_screen.fxml"));
        controller.MainScreenController controller = new controller.MainScreenController();
        loader.setController(controller);
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * This is the main method that launches the inventory program.
     *
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * This method adds all of the inhouse and outsourced parts with prices.
     *
     * @param inv
     */
    void addTestData(Inventory inv) {
        // 'InHouse' is abstract; cannot be instantiated NEEDS ATTENTION
        Part IH1001 = new InHouse(1001, "Brakes", 39.95, 7, 1, 25, 1001);
        Part IN1002 = new InHouse(1002, "Wheel", 89.95, 14, 1, 25, 1002);
        Part IH1003 = new InHouse(1003, "Seat", 249.95, 12, 1, 25, 1003);

        Inventory.addPart(IH1001);
        Inventory.addPart(IN1002);
        Inventory.addPart(IH1003);

        // 'InHouse' is abstract; cannot be instantiated NEEDS ATTENTION
        Inventory.addPart(new InHouse(1004, "Alternator", 179.95, 6, 1, 25, 1004));
        Inventory.addPart(new InHouse(1005, "Water Pump", 129.95, 18, 1, 25, 1005));

        // 'Outsourced' is abstract; cannot be instantiated NEEDS ATTENTION
        Part OS2001 = new Outsourced(6, "Floor Board Mats", 19.95, 29, 1, 50, "Rubber Stamp Inc.");
        Part OS2002 = new Outsourced(7, "Car Stereo", 399.95, 4, 1, 50, "Bose Inc.");
        Part OS2003 = new Outsourced(8, "Car Speakers", 179.95, 16, 1, 50, "Jensen Co.");

        Inventory.addPart(OS2001);
        Inventory.addPart(OS2002);
        Inventory.addPart(OS2003);

        // 'Outsourced' is abstract; cannot be instantiated NEEDS ATTENTION
        Inventory.addPart(new Outsourced(2004, "LED Dash Lights", 24.95, 7, 1, 50, "Dashboard Lights Co."));
        Inventory.addPart(new Outsourced(2005, "Seat Covers", 29.95, 20, 1, 50, "We Got You Covered Inc."));

        //Add allProducts
        Product prod1 = new Product(101, "Product Listing One", 19.95, 10, 1, 75);
        prod1.addAssociatedPart(IH1001);
        prod1.addAssociatedPart(OS2001);
        inv.addProduct(prod1);

        Product prod2 = new Product(201, "Product List Two", 29.95, 12, 1, 75);
        prod2.addAssociatedPart(IN1002);
        prod2.addAssociatedPart(OS2002);
        inv.addProduct(prod2);

        Product prod3 = new Product(301, "Product Listing Three", 39.95, 14, 1, 75);
        prod3.addAssociatedPart(IH1003);
        prod3.addAssociatedPart(OS2003);
        inv.addProduct(prod3);

        Product prod4 = new Product(401, "Product Listing Four", 49.95, 16, 1, 75);
        inv.addProduct(prod4);

        inv.addProduct(new Product(501, "Product Listing Five", 59.95, 18, 1, 75));
    }
}


