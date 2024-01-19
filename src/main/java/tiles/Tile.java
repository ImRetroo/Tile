package tiles;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile {
	public static MainViewController mainView = new MainViewController();

	
	public static void mapa() {
		
	}
	public static void tile(GridPane gridpane) {

		System.out.println("Se inicia la funcion");
		String mapa = """
				##########
				#........#
				#........#
				#b.......#
				#........#
				#........#
				#........#
				#........#
				#........#
				##########
				""";

		
		
		String mapa1= """
				##########
				#.....N..#
				#....EMO.#
				#b....S..#
				#........#
				#p.......#
				#........#
				#........#
				#........#
				##########
				""";
		
		
		
		
		
		
		
		
		String[] lineas = mapa1.trim().split("\n");

		for (int fila = 0; fila < lineas.length; fila++) {
			for (int columna = 0; columna < lineas[fila].length(); columna++) {
				char caracter = lineas[fila].charAt(columna);

				switch (caracter) {

				case '#':
					Rectangle obstaculo = new Rectangle(60, 40);
					obstaculo.setFill(Color.BLACK);
					if (gridpane != null) {
						gridpane.add(obstaculo, columna, fila);
						System.out.println("0");
					} else {
						System.out.println("obs es null");
					}
					break;

				case 'p':

					Rectangle player = new Rectangle(60, 40);
					player.setFill(Color.BLUE);
					if (gridpane != null) {
						gridpane.add(player, columna, fila);
						System.out.println("1");

					} else {
						System.out.println("player es null");
					}
					break;

				case 'b':

					Rectangle box = new Rectangle(60, 40);
					box.setFill(Color.YELLOW);
					if (gridpane != null) {
						gridpane.add(box, columna, fila);
						System.out.println("3");

					} else {
						System.out.println("box es null");
					}

					break;

				case '.':
					Rectangle Void = new Rectangle(60, 40);
					Void.setFill(Color.TRANSPARENT);
					if (gridpane != null) {
						gridpane.add(Void, columna, fila);
						System.out.println("4");

					} else {
						System.out.println(". es null");
					}
					break;
				
				
				case 'N':
					Rectangle N = new Rectangle(60, 40);
					N.setFill(Color.PINK);
					if (gridpane != null) {
						gridpane.add(N, columna, fila);
						System.out.println("4");

					} else {
						System.out.println(". es null");
					}
				
				
					break;
				case 'S':
					Rectangle S = new Rectangle(60, 40);
					S.setFill(Color.PINK);
					if (gridpane != null) {
						gridpane.add(S, columna, fila);
						System.out.println("4");

					} else {
						System.out.println(". es null");
					}
					break;

				case 'E':
					Rectangle E = new Rectangle(60, 40);
					E.setFill(Color.PINK);
					if (gridpane != null) {
						gridpane.add(E, columna, fila);
						System.out.println("4");

					} else {
						System.out.println(". es null");
					}
					break;

				case 'O':
					Rectangle O = new Rectangle(60, 40);
					O.setFill(Color.PINK);
					if (gridpane != null) {
						gridpane.add(O, columna, fila);
						System.out.println("4");

					} else {
						System.out.println(". es null");
					}
					break;

				case 'M':
					Rectangle M = new Rectangle(60, 40);
					M.setFill(Color.VIOLET);
					if (gridpane != null) {
						gridpane.add(M, columna, fila);
						System.out.println("4");

					} else {
						System.out.println(". es null");
					}
					break;

					
			

				}

			}
		}
	}
}
