public class InsertionSort{
	public int[] insertion(int[] arreglo){
		int posicion,auxiliar;
		for(int i = 0; i<arreglo.length ;i++){
			posicion = i;
			auxiliar = arreglo[i];
			while((posicion>0)&&(arreglo[posicion-1]>auxiliar)){
				arreglo[posicion] = arreglo[posicion-1];
				posicion = posicion - 1;
			}
			arreglo[posicion] = auxiliar;
		}
		return arreglo;
	}
}