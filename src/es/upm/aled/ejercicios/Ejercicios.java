package es.upm.aled.ejercicios;


public class Ejercicios {
	public static int sumaArray(int [] array) {
		int suma=0;
		for(int i=0; i<array.length; i++) {
			suma += array[i];
		} return suma;
	}
	
	//private static int sumaRecursivaAuxiliar(int[] array, int posicion) {
		//return Ejercicios.sumaRecursivaAuxiliar(array, posicion);
	//}
	
	public static int sumaRecursivaArray(int [] array, int indice) {
		//int contenido=0;
		//int longitud=array.length;
		int sumaArray=0;
		//int a=array[longitud-1];
		
		//OJO:sumaRecursivaArray(array)= a+ recursionSuma; 
		//No se puede hacer: el lado izquierdo debe ser una variable
		
		//Implementamos el caso base
		if(indice==0) {
			return array[0];
		}

		//Implementamos el caso recursivo
		sumaArray= array[indice] + Ejercicios.sumaRecursivaArray(array, indice-1);
		return sumaArray;
	}
	public static String enteroABinario(int entero) {
		if(entero==1) return "1";
		
		return enteroABinario(entero / 2) + (entero % 2);
	}
	
	public static int encontrarElemento(int[] list, int indice, int elemento) {
		
		if(indice>list.length-1) {
			return -1;
		}
		if(0<=indice && indice<list.length && list[indice]==elemento) {
			return indice;
		}
		
		return encontrarElemento(list, indice+1, elemento);
		
	}
	
	public static void main (String[] args) {
		int[] prueba= new int[6];
		prueba[0]=2;
		prueba[1]=3;
		prueba[2]=5;
		prueba[3]=7;
		prueba[4]=16;
		prueba[5]=3;
		 
		System.out.println("La suma del array es: "
				+ Ejercicios.sumaRecursivaArray(prueba, 5));
		
		System.out.println(encontrarElemento(prueba,5, 3));
		
		System.out.println("El número " + 15 + " en binario es: " +  enteroABinario(15));
		
	}
}
