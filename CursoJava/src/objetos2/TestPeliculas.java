package objetos2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestPeliculas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Lista de peliculas
		ArrayList<Pelicula> misPelis = new ArrayList<Pelicula>();

		//Menú de usuario
		int opcion;
		do {
		System.out.println("1.Ver lista de peliculas");
		System.out.println("2.Añadir peliculas");
		System.out.println("3.Salir");
		Scanner lector = new Scanner(System.in);
		opcion = lector.nextInt();
		switch(opcion)
		{
		case 1:
			
			for(Pelicula p : misPelis)
				System.out.println(p);
			
			break;
		case 2:
			String titulo, plataforma;
			int anho;
			System.out.println("Introduzca el título:");
			titulo = new Scanner (System.in).nextLine();
			plataforma = new Scanner(System.in).nextLine();
			anho = lector2.nextInt;
			
			break;
		case 3:
			break;
			default:
				break;
		}
		
		}while(opcion != 3);
		
		
		
	}


}
