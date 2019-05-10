

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.*;



public class uygulama2fx extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

	public void start(Stage evre) {
		VBox birlesen = new VBox();
		Scene tasiyici = new Scene(birlesen, 400, 200);
		
		Button dugme = new Button("giris yap");

		
		evre.setScene(tasiyici);
		evre.setTitle("BAsliiiikk....");
		evre.show();
		
	}
	
	
}
