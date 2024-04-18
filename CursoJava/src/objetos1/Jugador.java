package objetos1;

public class Jugador {
	
	
	
	//Un jugador tiene los siguientes datos: Nombres, Equipo, Dorsal y Valor
	//Añadir constructor por defecto y construcctor que permite inicializar todos los valores
	//En la clase Test (main) crear dos jugadores y mostrar info por consola.
	
	
	String manuel;
	String gonzalo;
	
	String equipo;
	String dorsal;
	Byte valor;
	
	
	public Jugador()
	{
		gonzalo = "cr";
	}
	
	public Jugador(String equipo, String dorsal, Byte valor)
	{
		this.equipo = equipo;
		this.dorsal = dorsal;
		this.valor = valor;
		
	}
	
	

}
