package tiles;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		   FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
	    	MainViewController mainViewController = new MainViewController();
	    	loader.setController(mainViewController);
	        Parent root = loader.load();

	        // Configurar el escenario principal
	        primaryStage.setTitle("Prueba Tile");
	        primaryStage.setScene(new Scene(root));

	        primaryStage.show();
	}

}
