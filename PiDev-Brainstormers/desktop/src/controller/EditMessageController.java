/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import tn.esprit.entities.Communication;
import tn.esprit.gui.DisplayEventsFrontController;
import tn.esprit.gui.DisplayReservationFrontController;
import tn.esprit.gui.SignUpController;
import tn.esprit.services.CommunicationService;

/**
 * FXML Controller class
 *
 * @author oasis
 */
public class EditMessageController implements Initializable {

    @FXML
    private HBox UsersBack;
    @FXML
    private Label btnProducts;
    @FXML
    private HBox order;
    @FXML
    private HBox eventsback;
    @FXML
    private HBox reservationBack;
    @FXML
    private HBox clicReclamation;
    @FXML
    private HBox clicCommunication;
    @FXML
    private HBox SignOutBack2;
    @FXML
    private Pane pane1;
    @FXML
    private Text ftTitle;
    @FXML
    private Text ftDescription;
    @FXML
    private Button modifierC;
    @FXML
    private Button list1;
    @FXML
    private TextField titre_message;
    @FXML
    private TextArea message;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       titre_message.setText(listMessageFrontController.tftitre);
        message.setText(listMessageFrontController.tfmessage);
    }    

    @FXML
    private void onUsersBack(MouseEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Profile.fxml"));

        try {
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(SignUpController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void goTOList(MouseEvent event) {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("AllProductFront.fxml"));
        
        try {
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(SignUpController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void goToList2(MouseEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("AllProductFront.fxml"));
        
        try {
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(SignUpController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void onorder(MouseEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("orderAfficheFront.fxml"));
        
        try {
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(SignUpController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void onevents(MouseEvent event) {
        FXMLLoader Loader = new FXMLLoader(getClass().getResource("/tn/esprit/gui/DisplayEventsFront.fxml"));

        try {
            Parent root = Loader.load();
            DisplayEventsFrontController C = Loader.getController();
            C.getData();
            Scene productDetailScene = new Scene(root);
            Stage cineStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            cineStage.setScene(productDetailScene);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
  @FXML
    private void onreservation(MouseEvent event) {
       FXMLLoader Loader = new FXMLLoader(getClass().getResource("/tn/esprit/gui/DisplayReservationFront.fxml"));

        try {
            Parent root = Loader.load();
            DisplayReservationFrontController C = Loader.getController();
            C.getRes();
            Scene productDetailScene = new Scene(root);
            Stage cineStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            cineStage.setScene(productDetailScene);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @FXML
    private void onReclamtionFront(MouseEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/tn/esprit/gui/ajouter_reclamation.fxml"));
        
        try {
            javafx.scene.Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(SignUpController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void onCommunication(MouseEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/tn/esprit/gui/ajouter_message.fxml"));
        
        try {
            javafx.scene.Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(SignUpController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void onSignOut(MouseEvent event) {
         FXMLLoader loader = new FXMLLoader(getClass().getResource("SignIn.fxml"));
        
        try {
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(SignUpController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    @FXML
    private void Modify_M(ActionEvent event) {
         Communication C = new Communication();
        C.setTitle(titre_message.getText());
        C.setMessage(message.getText());

        System.out.println("Updated");
       CommunicationService pr=CommunicationService.getInstance();
            pr.modifierC(C); 
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Information Dialog");
                    alert.setHeaderText(null);
                    alert.setContentText("Message modified !");
                    alert.show();
    }

    @FXML
    private void ListOfMessage(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/tn/esprit/gui/listMessageFront.fxml"));
        
        try {
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(EditMessageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
