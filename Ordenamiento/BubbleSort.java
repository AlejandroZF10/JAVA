public class BubbleSort{
	public int[] bubble(int[] arreglo){
		int auxiliar;
		for(int i = 0; i<arreglo.length ;i++)
			for(int j = 0; j<(arreglo.length-1) ;j++)
				if(arreglo[j]>arreglo[j+1]){
					auxiliar = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = auxiliar;
				}
		return arreglo;
	}
}