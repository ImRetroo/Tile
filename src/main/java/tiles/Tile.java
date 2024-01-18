package tiles;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile {
	public static MainViewController mainView = new MainViewController();



	public static void tile() throws Exception {
		

System.out.println("Se inicia la funcion");
		String mapa = """
				##########
				#........#
				#p.......#
				#b.......#
				#........#
				#........#
				#........#
				#........#
				#........#
				##########
				""";
		
	
	String[] lineas = mapa.trim().split("\n");

	
	for(int fila = 0; fila < lineas.length;fila++) {
		for(int columna = 0; columna < lineas[fila].length(); columna++) {
			char caracter = lineas[fila].charAt(columna);
	
		
			switch (caracter) {

			case '#':
				Rectangle obstaculo = new Rectangle(20,20);
				obstaculo.setFill(Color.BLACK);
				if (MainViewController.pruebaTile != null) {
				    MainViewController.pruebaTile.add(obstaculo, columna, fila);
				} else {
				    System.out.println("obs es null");
				}
				break;

			case 'p':

				Rectangle player = new Rectangle(20,20);
				player.setFill(Color.BLUE);
			if(	MainViewController.pruebaTile != null) {
				MainViewController.pruebaTile.add(player, columna, fila);
			}else {
				System.out.println("player es null");
			}
				break;

			case 'b':

				Rectangle box = new Rectangle(20, 20);
				box.setFill(Color.YELLOW);
				if(MainViewController.pruebaTile != null) {
					MainViewController.pruebaTile.add(box, columna, fila);
				}else {
					System.out.println("box es null");
				}

				break;
				
			case '.':
				Rectangle Void = new Rectangle(20,20);
				Void.setFill(Color.TRANSPARENT);
				if(MainViewController.pruebaTile != null) {
					MainViewController.pruebaTile.add(Void, columna, fila);
				}else {
					System.out.println(". es null");
				}

				

			}
			
		}
	}	
	}
}


