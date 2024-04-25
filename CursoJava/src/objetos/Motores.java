package objetos;

public class Motores {
	
	String marca;
	
	int cilindrada;
	TiposDeMotor TiposDeMotor;
	
	//Constructores
	public Motores()
	{
		TiposDeMotor = TiposDeMotor.Gasolina;
	}
	
	public Motores(String marca, int cilindrada, TiposDeMotor tpm)
	{
		this.marca = marca;
		this.cilindrada = cilindrada;
		this.TiposDeMotor = tpm;
		
	}

}
