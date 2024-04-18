package objetos1;

public class TestAlumnos {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		//Declarar una variable de tipo Alumno
		Alumno a1 = new Alumno();
		Alumno a2 = new Alumno("93127384K", "Manuel", "manu@gmail.com", 31, 7.1);
		Alumno a3 = new Alumno("76219831L", "Diego", "diego@hotmail.com", 41, 8.9);
		
		a1.dni = "87541234L";
		a1.edad = 17;
		a1.media = 5.6;
		
		//Mostrar por pantalla los datos de un alumno:
		System.out.println(a1.dni + " " + a1.edad + " " + a1.media);
		System.out.println(a2.dni + " " + a2.edad + " " + a2.media);
		
		//Metes notas a los alumnos
		a1.notas.add(8.0);
		a1.notas.add(7.2);
		a2.notas.add(4.3);
		a2.notas.add(9.4);
		a3.notas.add(9.9);
		a3.notas.add(10.0);
		
		
		
	}

}
