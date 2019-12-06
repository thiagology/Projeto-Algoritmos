package algoreats;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AlgorEatsApp extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Algor Eats - Delivery Recife");
		Pane rootScene = FXMLLoader.load(getClass().getResource("gui/TelaInicial.fxml"));
		
		Scene scene = new Scene(rootScene, 512, 602);
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show(); 
		
	}
	
	public static void main(String[] args) {
		AlgorEatsApp.launch(args);
	}

}
