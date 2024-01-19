package tiles;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
	    	MainViewController mainViewController = new MainViewController();

	        // Configurar el escenario principal
	        primaryStage.setTitle("Prueba Tile");
	        primaryStage.setScene(new Scene(mainViewController.getMainView()));

	        primaryStage.show();
	}

}
