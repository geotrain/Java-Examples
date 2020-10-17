package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Inventory {

    private static ObservableList<Part> allParts = FXCollections.observableArrayList();
    private ObservableList<Product> allProducts = FXCollections.observableArrayList();

    public Inventory() {
    }

    /**
     * This method adds a new part to inventory.
     *
     * @param newPart
     */
    public static void addPart(Part newPart) {
        if (newPart != null) {
            allParts.add(newPart);
        }
    }

    /**
     * This method adds a new product to inventory.
     *
     * @param newProduct
     */
    public void addProduct(Product newProduct) {
        if (newProduct != null) {
            this.allProducts.add(newProduct);
        }
    }

    /**
     * This method looks up part id in inventory.
     *
     * @param partId
     * @return
     */
    public Part lookUpPart(int partId) {
        if (!allParts.isEmpty()) {
            for (int i = 0; i < allParts.size(); i++) {
                if (allParts.get(i).getPartId() == partId) {
                    return allParts.get(i);
                }
            }
        }

        return null;
    }

    /**
     * This method looks up product through search from inventory array.
     *
     * @param productId
     * @return
     */
    public Product lookUpProduct(int productId) {
        if (!allProducts.isEmpty()) {
            for (int i = 0; i < allProducts.size(); i++) {
                if (allProducts.get(i).getProductId() == productId) {
                    return allProducts.get(i);
                }
            }
        }

        return null;
    }

    /**
     * This Observable List parses the partName ysing the lookupPart() method.
     *
     * @param partName
     * @return
     */
    public ObservableList<Part> lookUpPart(String partName) {
        if (!allParts.isEmpty()) {
            ObservableList searchPartsList = FXCollections.observableArrayList();
            for (Part p : getAllParts()) {
                if (p.getName().contains(partName)) {
                    searchPartsList.add(p);
                }
            }

            return searchPartsList;
        }

        return null;
    }

    /**
     * This observable list parses the productName using the lookUpProduct() method.
     *
     * @param productName
     * @return
     */
    public ObservableList<Product> lookUpProduct(String productName) {
        return null;
    }

    /**
     * This method updates an existing part in the inventory array.
     *
     * @param index
     * @param selectedPart
     */
    public void updatePart(int index, Part selectedPart) {
        for (int i = 0; i < allParts.size(); i++) {
            if (allParts.get(i).getPartId() == selectedPart.partId) {
                allParts.set(i, selectedPart);
                break;
            }
        }

        return;
    }

    /**
     * This method updates an existing product in the inventory array.
     *
     * @param index
     * @param newProduct
     */
    public void updateProduct(int index, Product newProduct) {
        for (int i = 0; i < allProducts.size(); i++) {
            if (allProducts.get(i).getProductId() == newProduct.getProductId()) {
                allProducts.set(i, newProduct);
                break;
            }
        }

        return;
    }

    /**
     * This method deletes a part from the inventory array.
     *
     * @param selectedPart
     * @return
     */
    public boolean deletePart(Part selectedPart) {
        for (int i = 0; i < allParts.size(); i++) {
            if (allParts.get(i).getPartId() == selectedPart.getPartId()) {
                allParts.remove(i);
                return true;
            }
        }

        return false;
    }

    /**
     * This method deletes a product from the inventory array.
     *
     * @param selectedProduct
     * @return
     */
    public boolean deleteProduct(int selectedProduct) {
        for (int i = 0; i < allProducts.size(); i++) {
            if (allProducts.get(i).getProductId() == selectedProduct) {
                allProducts.remove(i);
                return true;
            }
        }

        return false;
    }

    /**
     * This observable list gets all parts and returns the result.
     *
     * @return
     */
    public ObservableList<Part> getAllParts() {
        return allParts;
    }

    /**
     * This observable list gets all products and returns the result.
     *
     * @return
     */
    public ObservableList<Product> getAllProducts() {
        return allProducts;
    }

    public int partListSize() {
        return allParts.size();
    }

    public int productListSize() {
        return allProducts.size();
    }

    public void updateProduct(Object product) {
    }
}
