package es.upm.aled.ejercicios;

import java.util.Arrays;

public class MergeSort {
	public static int[] mergeSort(int[] list) {
		
		//Caso base
		if(list.length==1) {
			return list;//devuelve el array si, división tras división, su longitud es 1
		}
		
		//Paso recursivo
		int[] left= Arrays.copyOfRange(list, 0, list.length/2);//O(n/2)
		int[] right= Arrays.copyOfRange(list, list.length/2, list.length);//O(n/2)
			//En total complejidad O(n)
		
		//Ordeno las mitades izquierda y derecha
		int[] sortedLeft= mergeSort(left);//O(log SOMETHING_N)
		int[] sortedRight= mergeSort(right);//O(log SOMETHING_N)
			//En total complejidad O(n*logn)
			//Ordenar + Buscar: O(n*logn + logn), pero el último es despreciable =>O(n*logn)
			//Buscar: O(n)
		
		//Creo el array en el que pondré las cosas ordenadas
		int[] sortedMerged= new int[list.length];
		int iMerged=0, iLeft=0, iRight=0;
		
		while(iLeft<sortedLeft.length || iRight<sortedRight.length) {
			//Si el izquierdo se me acabó
			if(iLeft==sortedLeft.length) {
				//Cojo del array derecho
				sortedMerged[iMerged]=sortedRight[iRight];
				iRight++;
				iMerged++;
			}//Si el derecho se me acabó
			else if(iRight==sortedRight.length) {
				//Cojo del array izquierdo
				sortedMerged[iMerged] = sortedLeft[iLeft];
				iLeft++;
				iMerged++;
			}
			else if(sortedLeft[iLeft]<=sortedRight[iRight]) {
				//Cojo del array izquierdo
				sortedMerged[iMerged]=sortedLeft[iLeft];
				iLeft++;
				iMerged++;
			} else if(sortedLeft[iLeft]>sortedRight[iRight]) {
				//Cojo del array derecho
				sortedMerged[iMerged]=sortedRight[iRight];
				iRight++;
				iMerged++;
			}
		} return sortedMerged;
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
				//RECUERDA: dentro de i=0 hago j=0,1,2,3,4... y comparo list[0] con list[1],
				//list[1] con list[2] y así sucesivamente
			}
		}
	}
	
	public static void main (String[] args) {
		int[] list= { 31, 29, 27, 25, 23, 21, 19, 17, 15, 13, 11, 9, 7, 5, 3, 1 };
		int[] listBazillion= new int[10000000];
		
		for(int i=0; i<listBazillion.length; i++) {
			listBazillion[i]=10000000-i;
		}
		long t1= System.nanoTime();
		int[] listOrdenada = mergeSort(listBazillion);
		long t2= System.nanoTime();
		System.out.println("Esto tarda: " + (t2-t1));
//		System.out.println("Ordenado:");
		for(int v: list) {
			System.out.println("Los elementos ordenados del array son " + v);
		}
		
	}
}
