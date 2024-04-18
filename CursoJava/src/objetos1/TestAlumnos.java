package objetos1;

public class TestAlumnos {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		//Declarar una variable de tipo Alumno
		Alumno a1 = new Alumno();
		Alumno a2 = new Alumno("71239137L", "a", "qiwd", 12, 9.3);
		Alumno a3 = new Alumno("98237L", "sdiad", "asmoan", 21, 7.4);
		
		a1.dni = "87541234L";
		a1.edad = 17;
		a1.media = 5.6;
		
		//Mostrar por pantalla los datos de un alumno:
		System.out.println(a1.dni + " " + a1.edad + " " + a1.media);
		System.out.println(a2.dni + " " + a2.edad + " " + a2.media);
		
		//Metes notas a los alumnos
		a1.guardarNota(8.6);
		a1.guardarNota(5.6);
		a2.guardarNota(7.4);
		a2.guardarNota(8.9);
		a3.guardarNota(9.6);
		a3.guardarNota(46.7); //No entra, porque la valida
		
		
		System.out.println("La media de a1 es: " + a1.media);
		System.out.println("La media de a2 es: " + a2.media);
		System.out.println("La media de a3 es: " + a3.media);
		
	
		
		
	}

}
;
