public class Camino{
	static int n = 3;
	static int myArray[] = {1,1,9,2,3,3,5,3,5}; 
	/*1 2 9		0 1 2
	  2 5 3		3 4 5
	  5 1 5		6 7 8*/

	public static int movimiento(int inicio){
		int menor = 0, posicion = 0;
		int array_aux[] = new int[3];
		int array_pos[] = new int[3];
		switch(inicio){
			case 0: case 1:
				array_aux[0] = myArray[inicio] + myArray[inicio+1]; array_pos[0] = inicio+1;
				array_aux[1] = myArray[inicio] + myArray[inicio+4]; array_pos[1] = inicio+4;
				array_aux[2] = 100;									array_pos[2] = 100;
			break;
			case 3: case 4:
				array_aux[0] = myArray[inicio] + myArray[inicio-2]; array_pos[0] = inicio-2;
				array_aux[1] = myArray[inicio] + myArray[inicio+1]; array_pos[1] = inicio+1;
				array_aux[2] = myArray[inicio] + myArray[inicio+4]; array_pos[2] = inicio+4;
			break;
			case 6: case 7:
				array_aux[0] = 100;									array_pos[0] = 100;
				array_aux[1] = myArray[inicio] + myArray[inicio-2]; array_pos[1] = inicio-2;
				array_aux[2] = myArray[inicio] + myArray[inicio+1]; array_pos[2] = inicio+1;				
			break;
		}
		menor = array_aux[0];
		for(int i = 0; i<array_aux.length ;i++){
			if(array_aux[i]<menor){
				menor = array_aux[i];
				posicion = i;
			}
		}
		return array_pos[posicion];
	}

	public static void main(String[] args) {
		int inicio = 3;
		String ruta = ""+myArray[inicio];
		inicio = movimiento(inicio);
		ruta = ruta + myArray[inicio];
		inicio = movimiento(inicio);
		ruta = ruta + myArray[inicio];
		System.out.println(ruta);
	}	
}