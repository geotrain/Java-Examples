package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import model.Inventory;

public class MainScreenController {

    @FXML
    private AnchorPane MainScreen;

    @FXML
    private MenuBar mainMenuBar;

    @FXML
    private MenuItem menuExitItem;

    @FXML
    private Label mainTitleLabel;

    @FXML
    private Button exitButton;

    @FXML
    private TextField partSearchBox;

    @FXML
    private Button addPartButton;

    @FXML
    private TableView<?> partsTable;

    @FXML
    private TableColumn<?, ?> partDColumn;

    @FXML
    private TableColumn<?, ?> partNameColumn;

    @FXML
    private TableColumn<?, ?> partCountColumn;

    @FXML
    private TextField productSearchBox;

    @FXML
    private Button addProductButton;

    @FXML
    private TableView<?> productsTable;

    @FXML
    private TableColumn<?, ?> productDColumn;

    @FXML
    private TableColumn<?, ?> productNameColumn;

    @FXML
    private TableColumn<?, ?> productCountColumn;

    public MainScreenController(Inventory inv) {

    }

    @FXML
    void addPart(MouseEvent event) {

    }

    @FXML
    void addProduct(MouseEvent event) {

    }

    @FXML
    void clearText(MouseEvent event) {

    }

    @FXML
    void deletePart(MouseEvent event) {

    }

    @FXML
    void deleteProduct(MouseEvent event) {

    }

    @FXML
    void exitProgram(ActionEvent event) {

    }

    @FXML
    void exitProgramButton(MouseEvent event) {

    }

    @FXML
    void modifyPart(MouseEvent event) {

    }

    @FXML
    void modifyProduct(MouseEvent event) {

    }

    @FXML
    void searchForPart(MouseEvent event) {

    }

    @FXML
    void searchForProduct(MouseEvent event) {

    }

}
