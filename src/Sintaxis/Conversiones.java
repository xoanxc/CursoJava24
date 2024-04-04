package Sintaxis;

public class Conversiones {
	
	public static void main(String[] args) {

    int i1 = 100;
    long long1 = i1;
    
    float f1 = 6.7f;
    double d1 = f1;
    
    //Conversiones explícitas
    int i2 = 25;
    short s2 = (short) i2;
    
    //Calcular la raíz de un número -->
    float raiz = (float) Math.sqrt(16);
            
    //Calcular la potencia 4ta de un n
    double potencia4 = Math.pow(5, 4);
            
    short s3 = 9, s4 = 50;
    short suma = (short) (s3 + s4);
    
    //Problemas de conversiones explicitas
    //Overflow --> El valor desborda la capacidad de la variable
    short s5 = 30000, s6 = 30000;
    short suma2 = (short) (s5 + s6);

    
        Conversiones conversiones = new Conversiones();
        System.out.println("Suma2 = " + suma2);
        
        //Pérdida de precisión
        
        
        //Conversiones entre variables númericas y String
        //Pasar de int a String
        int dni = 7623823;
        String dni2 = Integer.toString(dni);
        
        int n = 45678;
        
        	
       
        
    }
}
