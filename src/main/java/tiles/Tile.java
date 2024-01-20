package tiles;

import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile {

	static String mapa0 = """
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

	
	
	static String mapa1= """
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
	
	
	static String mapa2= """
			##########
			#_....####
			#.......=#
			#....#####
			#....#####
			#p...#####
			#....#####
			#...b....#
			##..#....#
			##########
			""";
	
	

	public static Map tile(String mapa) {

		
		
		
		Map map = new Map(10, 10, 1);
		
		
		String[] lineas = mapa.trim().split("\n");

		for (int fila = 0; fila < lineas.length; fila++) {
			for (int columna = 0; columna < lineas[fila].length(); columna++) {
				char caracter = lineas[fila].charAt(columna);

				switch (caracter) {

				case '#':
					Rectangle obstaculo = new Rectangle(60, 40);
					obstaculo.setFill(Color.BLACK);
						map.add(obstaculo, columna, fila);
						System.out.println("obs es null");
					
					break;

				case 'p':

					Rectangle player = new Rectangle(60, 40);
					player.setFill(Color.BLUE);
						map.add(player, columna, fila);

					
					break;

				case 'b':

					Rectangle box = new Rectangle(60, 40);
					box.setFill(Color.YELLOW);
						map.add(box, columna, fila);
						System.out.println("3");

					

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

				case '_':
					Rectangle finBox = new Rectangle(60,40);
					finBox.setFill(Color.GREEN);
					
					if (gridpane != null) {
						gridpane.add(finBox, columna, fila);
						System.out.println("4");

					} else {
						System.out.println(". es null");
					}
					break;
					
				case  '=':
					Rectangle win = new Rectangle(60,40);
					win.setFill(Color.BROWN);
					
					if (gridpane != null) {
						gridpane.add(win, columna, fila);
						
						System.out.println("4");

					} else {
						System.out.println(". es null");
					}
					break;
			

				}

			}
		}			
		return map;

	}
}
