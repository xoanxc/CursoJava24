package objetos;

public class TestMotor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Motores m1 = new Motores();
		Motores m2 = new Motores("Mercedes", 2000, TiposDeMotor.Hibrido);
		
		System.out.println(m1.TiposDeMotor);
		System.out.println(m2);

	}

}
