public class SelectionSort{
	public int[] selection(int[] arreglo){
		int minimo,auxiliar;
		for(int i = 0; i<arreglo.length ;i++){
			minimo = i;
			for(int j = i+1; j<arreglo.length ;j++)
				if(arreglo[j]<arreglo[minimo])
					minimo  = j;
			auxiliar = arreglo[i];
			arreglo[i] = arreglo[minimo];
			arreglo[minimo] = auxiliar;
		}
		return arreglo;
	}
}