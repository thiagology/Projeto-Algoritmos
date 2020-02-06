package algoreats.gui;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class TelaInicialController {

    @FXML private ImageView imgHead;
    @FXML private ImageView imgFast;
    @FXML private ImageView imgMassas;
    @FXML private ImageView imgMar;
    @FXML private ImageView imgSalada;
    @FXML private ImageView imgSobremesa;
    @FXML private Button btFast;
    @FXML private Button btMassa;
    @FXML private Button btMar;
    @FXML private Button btSalada;
    @FXML private Button btSobremesa;
    
    
    
    @FXML
    void onClickFast(ActionEvent event) {
		try {
	    	Stage s1 = new Stage();
	        Parent root;
			root = FXMLLoader.load(getClass().getResource("TelaFastFood.fxml"));
	        Scene scene = new Scene(root);

	        s1.setScene(scene);
	        s1.show();
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

    @FXML
    void onClickMar(ActionEvent event) {
		try {
	    	Stage s1 = new Stage();
	        Parent root;
			root = FXMLLoader.load(getClass().getResource("TelaMar.fxml"));
	        Scene scene = new Scene(root);

	        s1.setScene(scene);
	        s1.show();
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void onClickMassa(ActionEvent event) {
		try {
	    	Stage s1 = new Stage();
	        Parent root;
			root = FXMLLoader.load(getClass().getResource("TelaMassas.fxml"));
	        Scene scene = new Scene(root);

	        s1.setScene(scene);
	        s1.show();
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void onClickSalada(ActionEvent event) {
		try {
	    	Stage s1 = new Stage();
	        Parent root;
			root = FXMLLoader.load(getClass().getResource("TelaSalada.fxml"));
	        Scene scene = new Scene(root);

	        s1.setScene(scene);
	        s1.show();
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void onClickSobremesa(ActionEvent event) {
		try {
	    	Stage s1 = new Stage();
	        Parent root;
			root = FXMLLoader.load(getClass().getResource("TelaSobremesa.fxml"));
	        Scene scene = new Scene(root);

	        s1.setScene(scene);
	        s1.show();
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
