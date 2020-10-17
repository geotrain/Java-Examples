package controller;

import controller.MainScreenController;
import controller.AlertMessage;

import model.InHouse;
import model.Outsourced;
import model.Part;
import model.Inventory;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class ModifyPartController<Inventory, Part> implements Initializable {

    Inventory inv;
    Part part;

    @FXML
    private RadioButton inHouseRadio;
    @FXML
    private RadioButton outSourcedRadio;
    @FXML
    private Label companyLabel;
    @FXML
    private TextField id;
    @FXML
    private TextField name;
    @FXML
    private TextField price;
    @FXML
    private TextField count;
    @FXML
    private TextField min;
    @FXML
    private TextField max;
    @FXML
    private TextField company;
    @FXML
    private Button modifyPartSaveButton;

    public ModifyPartController(Inventory inv, Part part) {
        this.inv = inv;
        this.part = part;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setData();
    }

    private void setData() {

        if (part instanceof InHouse) {

            InHouse part1 = (InHouse) part;
            inHouseRadio.setSelected(true);
            companyLabel.setText("Machine ID");
            this.name.setText(part1.getName());
            this.id.setText((Integer.toString(part1.getPartId())));
            this.count.setText((Integer.toString(part1.getPartInStock())));
            this.price.setText((Double.toString(part1.getPartPrice())));
            this.min.setText((Integer.toString(part1.getMin())));
            this.max.setText((Integer.toString(part1.getMax())));
            this.company.setText((Integer.toString(part1.getMachineId())));

        }

        if (part instanceof Outsourced) {

            Outsourced part2 = (Outsourced) part;
            outSourcedRadio.setSelected(true);
            companyLabel.setText("Company Name");
            this.name.setText(part2.getName());
            this.id.setText((Integer.toString(part2.getPartId())));
            this.count.setText((Integer.toString(part2.getPartInStock())));
            this.price.setText((Double.toString(part2.getPartPrice())));
            this.min.setText((Integer.toString(part2.getMin())));
            this.max.setText((Integer.toString(part2.getMax())));
            this.company.setText(part2.getCompanyName());
        }
    }

    @FXML
    private void clearTextField(MouseEvent event
    ) {
        Object source = event.getSource();
        TextField field = (TextField) source;
        field.setText("");
    }

    @FXML
    private void selectInHouse(MouseEvent event
    ) {
        companyLabel.setText("Machine ID");

    }

    @FXML
    private void selectOutSourced(MouseEvent event
    ) {
        companyLabel.setText("Company Name");

    }

    @FXML
    private void idDisabled(MouseEvent event
    ) {
    }

    @FXML
    private void cancelModifyPart(MouseEvent event
    ) {
        boolean cancel = cancel();
        if (cancel) {
            mainScreen(event);
        } else {
            return;
        }
    }

    @FXML
    private void saveModifyPart(MouseEvent event
    ) {
        resetFieldsStyle();
        boolean end = false;
        TextField[] fieldCount = {count, price, min, max};
        if (inHouseRadio.isSelected() || outSourcedRadio.isSelected()) {
            for (int i = 0; i < fieldCount.length; i++) {
                boolean valueError = checkValue(fieldCount[i]);
                if (valueError) {
                    end = true;
                    break;
                }
                boolean typeError = checkType(fieldCount[i]);
                if (typeError) {
                    end = true;
                    break;
                }
            }
            if (name.getText().trim().isEmpty() || name.getText().trim().toLowerCase().equals("part name")) {
                AlertMessage.errorPart(4, name);
                return;
            }
            if (Integer.parseInt(min.getText().trim()) > Integer.parseInt(max.getText().trim())) {
                AlertMessage.errorPart(8, min);
                return;
            }
            if (Integer.parseInt(count.getText().trim()) < Integer.parseInt(min.getText().trim())) {
                AlertMessage.errorPart(6, count);
                return;
            }
            if (Integer.parseInt(count.getText().trim()) > Integer.parseInt(max.getText().trim())) {
                AlertMessage.errorPart(7, count);
                return;
            }

            if (end) {
                return;
            } else if (outSourcedRadio.isSelected() && company.getText().trim().isEmpty()) {
                AlertMessage.errorPart(1, company);
                return;
            } else if (inHouseRadio.isSelected() && !company.getText().matches("[0-9]*")) {
                AlertMessage.errorPart(9, company);
                return;

            } else if (inHouseRadio.isSelected() & part instanceof InHouse) {
                updateItemInHouse();

            } else if (inHouseRadio.isSelected() & part instanceof Outsourced) {
                updateItemInHouse();
            } else if (outSourcedRadio.isSelected() & part instanceof Outsourced) {
                updateItemOutSourced();
            } else if (outSourcedRadio.isSelected() & part instanceof InHouse) {
                updateItemOutSourced();
            }

        } else {
            AlertMessage.errorPart(2, null);
            return;

        }
        mainScreen(event);
    }

    private void updateItemInHouse() {
        inv.updatePart(new model.InHouse(Integer.parseInt(id.getText().trim()), name.getText().trim(),
                Double.parseDouble(price.getText().trim()), Integer.parseInt(count.getText().trim()),
                Integer.parseInt(min.getText().trim()), Integer.parseInt(max.getText().trim()), Integer.parseInt(company.getText().trim())) {
            @Override
            public String getName() {
                return null;
            }
        });
    }

    private void updateItemOutSourced() {
        inv.updatePart(new Outsourced(Integer.parseInt(id.getText().trim()), name.getText().trim(),
                Double.parseDouble(price.getText().trim()), Integer.parseInt(count.getText().trim()),
                Integer.parseInt(min.getText().trim()), Integer.parseInt(max.getText().trim()), company.getText().trim()) {
            @Override
            public String getName() {
                return null;
            }
        });
    }

    private void resetFieldsStyle() {
        name.setStyle("-fx-border-color: lightgray");
        count.setStyle("-fx-border-color: lightgray");
        price.setStyle("-fx-border-color: lightgray");
        min.setStyle("-fx-border-color: lightgray");
        max.setStyle("-fx-border-color: lightgray");
        company.setStyle("-fx-border-color: lightgray");

    }

    private void mainScreen(MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Views/MainScreen.fxml"));
            MainScreenController controller = new MainScreenController((model.Inventory) inv);

            loader.setController(controller);
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {

        }
    }

    private boolean checkValue(TextField field) {
        boolean error = false;
        try {
            if (field.getText().trim().isEmpty() || field.getText().trim() == null) {
                AlertMessage.errorPart(1, field);
                return true;
            }
            if (field == price && Double.parseDouble(field.getText().trim()) <= 0.0) {
                AlertMessage.errorPart(5, field);
                error = true;
            }
        } catch (Exception e) {
            error = true;
            AlertMessage.errorPart(3, field);
            System.out.println(e);

        }
        return error;
    }

    private boolean checkType(TextField field) {

        if (field == price & !field.getText().trim().matches("\\d+(\\.\\d+)?")) {
            AlertMessage.errorPart(3, field);
            return true;
        }
        if (field != price & !field.getText().trim().matches("[0-9]*")) {
            AlertMessage.errorPart(3, field);
            return true;
        }
        return false;

    }

    private boolean cancel() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Cancel");
        alert.setHeaderText("Are you sure you want to cancel?");
        alert.setContentText("Click ok to confirm");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            return true;
        } else {
            return false;
        }
    }

}