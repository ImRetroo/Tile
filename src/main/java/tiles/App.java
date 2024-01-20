package tiles;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
	    	MainViewController mainViewController = new MainViewController();

	        // Configurar el escenario principal
	        primaryStage.setTitle("Prueba Tile");
	        
		      Scene  scene = new Scene(mainViewController.getMainView());

	        primaryStage.setScene(scene);
	        primaryStage.show();
	        scene.setOnMouseClicked(event -> {
	        
	        Tile.tile(mainViewController.getPruebaTile(), Tile.mapa2);
	        System.out.println("Funciona el click");
	        
	        	
	        });
	        
	}

}
