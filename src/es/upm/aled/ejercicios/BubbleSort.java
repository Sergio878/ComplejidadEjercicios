package es.upm.aled.ejercicios;

import java.util.Arrays;

public class BubbleSort {
	//Vamos a implementar un método que ordene los elementos de un array
	//Se hará de forma que un elemento comprueba si el siguiente es menor
	//en cuyo caso intercambian su posición, y así hasta el final del array
	
	public static int [] bubbleSortArray(int[] list) {
		//int[] ordenado= new int[list.length];
			for(int i=0; i<list.length; i++) {
				for(int j=i+1; j<list.length; j++) {
					if(list[i]>list[j]) {
						int exchange=list[i];
						list[i]=list[j];
						list[j]=exchange;
						//ordenado[list.length-1-i]=list[i];
					}
				}
			}
		 return list;
	}
	public static void bubbleSort(int[] list) {
		for(int i=0; i<list.length; i++) {//todo el array, de principio a fin
			for(int j=0; j<list.length-1-i; j++) {//por CADA VEZ que se ejecuta el otro for, se ejecuta este for ENTERO
				//Me paro una posición antes de lo que haría menos la posición i, 
				//para delimitar la longitud del for interior, ya que va mandando al final los elementos mayores
				//Si es mayor que el segundo, los cambiamos
				if(list[i]>list[j+1]) {
					//Permutación de dos números del array
					int temp=list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
				}
				//RECUERDA: dentro de i=0 hago j=0,1,2,3,4... y compara list[0] con list[1], list[1] con list[2] y así sucesivamente
			}
		}
	}
		
	public static void main (String[] args) {
		int[] aOrdenar= {7, 8, 25, 4, 3, 24, 31, 5, 18};
				
		System.out.println("Los elementos ordenados del array son " +
				Arrays.toString(BubbleSort.bubbleSortArray(aOrdenar)));
		
		for(int v: aOrdenar) {
			System.out.println("Los elementos ordenados del array son " + v);
		}
		
	}
}
