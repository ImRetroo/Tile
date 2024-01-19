package tiles;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class MainViewController implements Initializable {

	
	


    @FXML
    private BorderPane mainView;


	@FXML
	 static GridPane pruebaTile;


    
    
    
	@Override
	public void initialize(URL location, ResourceBundle resources){
	    pruebaTile = new GridPane();

		try {
			Tile.tile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





	public static GridPane getPruebaTile() {
		return pruebaTile;
	}





	public static void setPruebaTile(GridPane pruebaTile) {
		MainViewController.pruebaTile = pruebaTile;
	}





	public BorderPane getMainView() {
		return mainView;
	}





	public void setMainView(BorderPane mainView) {
		this.mainView = mainView;
	}





	





	
	

}








