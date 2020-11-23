public class BinarySearch{
	public int binary(int dato, int arreglo[]){
		boolean flag = false;
		int inferior = 0, superior = arreglo.length;
		int mitad = (inferior+superior)/2, i = 0;

		while((inferior<=superior)&&(i<arreglo.length)){
			if(arreglo[mitad] == dato){
				flag = true;
				break;
			}
			if(arreglo[mitad] > dato) {
				superior = mitad;
				mitad = (inferior+superior)/2;
			}
			if(arreglo[mitad] < dato){
				inferior = mitad;
				mitad = (inferior+superior)/2;
			}
			i = i + 1;
		}
		if(flag)
			return mitad;
		return -1;
	}
}