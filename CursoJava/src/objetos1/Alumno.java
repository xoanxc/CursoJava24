package objetos1;

import java.util.ArrayList;

public class Alumno 
{
	//Atributos o propiedades
	String dni;
	String nombre;
	String email;
	
	int edad;
	double media;
	double[] notas2;
	
	private ArrayList<Double> notas;
	
	//Constructores: Método que inicializa los atributos de la clase Alumno
	//1. Se llama obligatoriamente igual que la clase
	//2. No se indica ningun tipo de retorno
	
	
	public Alumno()
	{
		//Constructor por defecto
		media = 1;
		notas = new ArrayList<Double>();
		notas2 = new double[10];
		
	}
	

	public Alumno(String dni, String nombre, String email, int edad, double media) 
	{
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
		this.media = media;
		notas = new ArrayList<Double>();
		notas2 = new double[10];

	}
	
	//Métodos que añaden funcionalidad a los objetos de la clase
	private void calcularMedia()
	{
		double suma = 0;
		
		//Recorro la lista de notas
		for(double valor : notas)
		{
			suma += suma + valor;
		}
		
		this.media = suma/notas.size();
	}
	
	//Metodo para añadir una nota
	public boolean guardarNota(double nota) 
	{
		//La nota no puede ser 1 para no desmoralizar al alumnado, minimo un 1
		if(nota > 0 && nota <= 10)
		{
			this.notas.add(nota);
			this.calcularMedia();
			return true;
		}
		return false;
	}
	
}
