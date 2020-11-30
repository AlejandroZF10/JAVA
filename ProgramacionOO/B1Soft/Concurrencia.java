import java.util.*;

public class Concurrencia{
	static int[] myArray = {1,2,2,4,5,5,5,5,6,7,8,8,8,8,8,9};

	public static void main(String args[]){
		ArrayList<Integer> numeros = new ArrayList<>();		
		ArrayList<Integer> concurrencias = new ArrayList<>();

		for(int i = 0; i<myArray.length ;i++){ //Buscando concurrencias
			int contador = 0;
			int actual = myArray[i];
			int index = i;
			if(index<myArray.length-1){
				if(actual == myArray[index+1]){
					contador++;
					numeros.add(actual);
					while((index<myArray.length-1)&&actual == myArray[index+1]){
						contador++;
						index++;
					}
					concurrencias.add(contador);
					i = index;
				}
			}
		}
		int mayor = concurrencias.get(0), posicion = 0;
		
		for(int i = 0; i<concurrencias.size() ;i++){	
			if(concurrencias.get(i)>mayor){
				mayor = concurrencias.get(i);
				posicion = i;
			}
		}
		System.out.println("Longets: "+concurrencias.get(posicion));
		System.out.println("Number: "+numeros.get(posicion));
	}
}	