package es.upm.aled.ejercicios;

public class Ejercicio2_4 {
	public static int binSearch(double[] list, double item) {
		int middle;
		int bottom=0;
		int top=list.length-1;
		boolean found=false;
		
		while(bottom<=top && !found) {
			middle= (top+bottom)/2;
			
			if(list[middle]==item) {
				found=true;
				return middle;
			}else if(list[middle]<item) {
				top=middle-1;
			} else {
				bottom=middle+1;
			}
		} return -1; 
	}
	
	public static int ordenaOptimo(int[] list ) {
		return -1;
	}
	
	public static int busquedaBinaria(int[] list, int n) {
		return -1;
	}
	public static int buscar1(int[] buscados, int inicio, int fin) {
		int encontrados=0;
		ordenaOptimo(buscados);//Complejidad n*logn
		for (int unNumero=inicio; unNumero <= fin; unNumero++)//Complejidad m
			if (busquedaBinaria(buscados, unNumero) != -1)//Complejidad logn
			encontrados++;
			return encontrados;
		}
	
	public static int buscar2(int[] buscados, int inicio, int fin) {
		int encontrados=0;
		for (int unNumero=inicio; unNumero <= fin; unNumero++)//Complejidad m
			for (int i=0; i < buscados.length; i++) //se ejecuta N/2 veces
				if (buscados[i] == unNumero) {
				encontrados++;
				break;
				}
		return encontrados;
		}
	
	
	
	
	public static void main(String[] args) {
		double[] list= {25.0,21.0,16.0,11.0,8.0,7.0,3.0,1.0};
		System.out.println(binSearch(list, 3.0));
		
		//PARA VER CUANTO TARDA EN EJECUTARSE:
		
		//middle=(0+7)/2=3, luego en la primera iteración se para en la posición 3, que es 11.0 en este caso
		//Como 11.0!=3.0 y 11.0>3.0 se asigna bottom=4
		
		//middle=(4+7)/2=5, luego en la segunda iteración se para en la posición 5, que es 7.0 en este caso
		//Como 7.0>3.0 se asigna bottom=7
		
		//middle=(7+7)/2=7, luego en la tercera iteración se para en la posición 7, que vale 1.0 en este cado
		//Como 1.0<3.0, se asinga top=6
		
		//middle=6+7/2=6, luego en la cuarta iteración se para en la posición 6, que es 3.0 en este caso
		//Como 3.0==3.0 se devuelve la posición, y TARDA 4 VECES EN EJECUTARSE
	}
}
