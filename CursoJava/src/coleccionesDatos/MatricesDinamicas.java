package coleccionesDatos;
import java.util.*;

public class MatricesDinamicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Listas
		ArrayList<String> matriculas = new ArrayList<String>();
		
		//Añadir elementos:
		matriculas.add("0987-TYG");
		matriculas.add("4098-VGT");
		matriculas.add("8723-OKA");
		matriculas.add("7612-HGA");
		
		//Obtener el numero de elementos que hay en la lista: size
		int elementos = matriculas.size();
		
		
		//Insertar elementos en medio o al inicio de la colección
		matriculas.add(0, "0921-UTA"); //Se desplazan las mastriculas para dejar la posición 0
		
		//Recorrer una lista
		System.out.println("Coches actualmente en el almacén");
		for(String m : matriculas)
		{
			System.out.println(m); //Podemos ver como ahora la matricula fue añadida con exito en la posición 0
		}
		
		//Eliminar elementos de una lista:
		matriculas.remove(1);
		
		//Eliminar TODOS los elementos de la lista
		matriculas.clear();
		
		
		
		
		//

	}

}
