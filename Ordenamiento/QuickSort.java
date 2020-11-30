public class QuickSort{
	public int[] quick(int[] arreglo,int izquierda,int derecha){
		int pivote = arreglo[izquierda];
		int i = izquierda;
		int j = derecha;
		int auxiliar;

		while(i < j){
			while(arreglo[i]<=pivote && i<j) i++;
			while(arreglo[j]>pivote) j--;
			if(i < j){
				auxiliar = arreglo[i];
				arreglo[i] = arreglo[j];
				arreglo[j] = auxiliar;
			}
		}
		arreglo[izquierda] = arreglo[j];
		arreglo[j] = pivote;
		if(izquierda < j-1)
			quick(arreglo,izquierda,j-1);
		if(j+1 < derecha)
			quick(arreglo,j+1,derecha);
		return arreglo;
	}
}