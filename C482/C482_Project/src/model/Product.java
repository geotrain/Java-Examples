package model;

import com.sun.javafx.UnmodifiableArrayList;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import java.util.ArrayList;
import java.util.List;

public class Product {

    List<Part> list = new ArrayList<Part>();
    ObservableList<Part> observableList = FXCollections.observableList(list);

public Product() {
   // Product Constructor
}

    private int productId;
    private String name;
    private double price = 0.0;
    private int inStock = 0;
    private int min;
    private int max;

    public Product(int productId, String name, double price, int inStock, int min, int max) {
        setProductId(productId);
        setName(name);
        setPrice(price);
        setInStock(inStock);
        setMin(min);
        setMax(max);
    }

    UnmodifiableArrayList<Object> associatedParts;

    public int getId() {

        return this.productId;
    }

    public void setId() {

        this.productId = productId;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getPrice() {

        return this.price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public int getInStock() {

        return this.inStock;
    }

    public void setInStock(int quantity) {

        this.inStock = quantity;
    }

    public int getMin() {

        return this.min;
    }

    public void setMin(int min) {

        this.min = min;
    }

    public int getMax() {
        return
                this.max;
    }

    public void setMax(int max) {

        this.max = max;
    }

    /**
     * This method gathers all available parts in inventory search
     *
     * @param partToSearch
     * @return
     */
    public Part getAllAssociatedParts(int partToSearch) {
        for (int i = 0; i < associatedParts.size(); i++) {
            if (associatedParts.get(i).getPartId() == partToSearch) {
                return (Part) associatedParts.get(i);
            }
        }

        return null;
    }

    /**
     * This method will add a new part to inventory array
     *
     * @param part
     */
    public void addAssociatedPart(Part part) {

        associatedParts.add(part);
    }

    /**
     * This method deletes a part from the associated part list
     *
     * @param partToRemove
     * @return
     */
    public boolean deleteAssociatedPart(int partToRemove) {
        int i;

        for (i = 0; i < associatedParts.size(); i++) {
            if (associatedParts.get(i).getPartId() == partToRemove) {
                associatedParts.remove(i);
                return true;
            }
        }

        return false;
    }

    public int getProductId() {
        return this.productId;
    }

    public void setProductId(int id) {
        this.productId = id;
    }

    public int getPartId() {
        return associatedParts.size();
    }
}

