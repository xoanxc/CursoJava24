package coleccionesDatos;

public class ColeccionesEstaticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array: Permite almacenar varios valores del mismo tipo
		int[] matriz = new int[10]; //Inicializo un array para 10 enteros
		
		int[] matriz2 = {3, 4};
		
		//Acceder a una posición se indica entre corchetes
		matriz[0] = 9;
		
		//Aceder a la ultima posición
		matriz[9] = 5;
		matriz[matriz.length -1] = 5; //Mas pro
		
		//Obtener la capacidad de una matriz
		int capacidad = matriz.length;
		
		//Recorrer un array con un bucle for:
		
		for(int i = 0; i< matriz.length; i++)
		{
			System.out.print(matriz[i] + " ");
		}
		System.out.println();
		
		//Llenar el array con números aleatorios entre 1 y 10
		
		
		

	}

}
