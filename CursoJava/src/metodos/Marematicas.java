package metodos;

import java.util.Random;

public class Marematicas 
{
	
	//Metodo que indica si un numero es primo
	public static boolean isPrimo(int numero)
	{
		for(int i = 2; i<= numero/2; i++) 
		{
			if(numero % i == 0)
			{
				return false;
			}
		}
		return true;
		
		
	}
	public static void rellenarArray(int[]matriz, int inferior, int superior) 
	{
		Random gen2 = new Random();
		
		for(int i = 0; i<matriz.length; i++)
		{
			matriz[i] = gen2.nextInt (inferior, superior);
		}
	
	}
	
	

//Metodo que calcule la media de un array
public static double calcularMedia(int[] matriz)
{
	int suma = 0;
	double media = 0;
	for(int valor : matriz)
	{
		//suma = suma + valor;
		suma += valor;
		
		
	}
	media = suma/matriz.length;
	return media;
}

}
