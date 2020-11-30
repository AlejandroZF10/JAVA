import java.util.*;

public class Histograma{
	static int[] myArray = {1,2,2,4,5,6,7,8,8,8};

	public static void main(String args[]){
		ArrayList<String> histograma = new ArrayList<>();
		ArrayList<Integer> array_aux = new ArrayList<>();
		ArrayList<Integer> times_aux = new ArrayList<>();

		for(int i = 1; i<=5 ;i++) //Identificación de números en el arreglo
			array_aux.add(i);
		
		for(int i = 0; i<array_aux.size() ;i++){ //Contando el número de veces
			int contador = 0;
			String aux_hist = array_aux.get(i)+": ";
			for(int j = 0; j<myArray.length ;j++){
				if(array_aux.get(i) == myArray[j]){
					contador++;
					aux_hist = aux_hist+"*";
				}
			}
			histograma.add(aux_hist);
			times_aux.add(contador);
		}
		for(int i = 0; i<array_aux.size() ;i++)
			System.out.println(histograma.get(i));
	}
}	