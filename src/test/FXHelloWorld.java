package test;


import java.awt.event.ActionEvent;
import java.util.function.Consumer;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class FXHelloWorld extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	protected void buttonAction(ActionEvent e){
		
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/View/menuFace.fxml"));

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("������ ������ � �����!");
		stage.show();

	}

}
