package es.upm.aled.ejercicios;

public class Ejercicio23 {
	public static int multiplicacion(int N) {
		int sum = 0;
		for (int i = 1; i < N; i *= 2)
			for(int j = 0; j < N; j++)
				sum++;
		return sum;
		//Va multiplicando la i por 2 hasta que i<17, con lo que lo hace logN veces
			//Sería: 1*2, 2*2, 4*2, 8*2, 16*2 y aquí para ya que luego sería 32*2
		//Para cada iteración, actualiza la variable sum i veces
			//Sería: 1 => 3 => 7 => 15 => 31
	
	
	}
	
	public static void main (String [] args) {
		
		System.out.println(multiplicacion(17));
	}
}
