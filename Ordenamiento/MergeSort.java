public class MergeSort{
	private void merge(int arreglo[], int l, int m, int r) { 
		int numero1 = m - l + 1; 
		int numero2 = r - m; 
		int arrayL[] = new int[numero1]; 
		int arrayR[] = new int[numero2]; 
		
		for (int i = 0; i < numero1; ++i) 
			arrayL[i] = arreglo[l + i]; 
		for (int j = 0; j < numero2; ++j) 
			arrayR[j] = arreglo[m + 1 + j];

		int i = 0 , j = 0 , k = l; 
		while (i < numero1 && j < numero2) { 
			if (arrayL[i] <= arrayR[j]) { 
				arreglo[k] = arrayL[i]; 
				i = i + 1; 
			} else { 
				arreglo[k] = arrayR[j]; 
				j = j + 1; 
			} 
			k = k + 1;  
		} 
		while (i < numero1) { 
			arreglo[k] = arrayL[i]; 
			i = i + 1; 
			k = k + 1; 
		} 
		while (j < numero2) { 
			arreglo[k] = arrayR[j]; 
			j = j + 1;  
			k = k + 1;  
		} 
	} 

	public void sort(int arreglo[], int l, int r){
		if(l<r){
			int m = (l+r)/2;
			sort(arreglo,l,m);
			sort(arreglo,m+1,r);
			merge(arreglo,l,m,r);
		}
	}
}