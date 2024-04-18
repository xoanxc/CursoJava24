package objetos1;

public class Alumno 
{
	//Atributos o propiedades
	String dni;
	String nombre;
	String email;
	
	int edad;
	double media;
	
	//Constructores: Método que inicializa los atributos de la clase Alumno
	//1. Se llama obligatoriamente igual que la clase
	//2. No se indica ningun tipo de retorno
	
	
	public Alumno()
	{
		//Constructor por defecto
		media = 1;
		
	}
	
	public Alumno(String dni, String nombre, String email, int edad)
	{
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
		this.media = 1;
	}
	
}
