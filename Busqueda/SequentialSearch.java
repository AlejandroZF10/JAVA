public class SequentialSearch{
	public int  sequential(int numero, int[] arreglo){
		int i = 0;
		boolean flag = false;

		while((i<arreglo.length)&&(flag == false)){
			if(arreglo[i] == numero)
				flag = true;
			i = i + 1;
		}
		if(flag)
			return i-1;
		return -1;
	}
}