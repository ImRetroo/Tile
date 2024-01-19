package tiles;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class MainViewController implements Initializable {

	@FXML
	private BorderPane mainView;

	@FXML
	private GridPane pruebaTile;

	public MainViewController() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainView.fxml"));
		loader.setController(this);
		try {
			loader.load();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Tile.tile(pruebaTile);
	}

	public GridPane getPruebaTile() {
		return pruebaTile;
	}

	public BorderPane getMainView() {
		return mainView;
	}

	public void setMainView(BorderPane mainView) {
		this.mainView = mainView;
	}

}
