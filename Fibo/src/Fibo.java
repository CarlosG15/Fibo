
public class Fibo {

	public static void main(String[] args) {
		
		int f, n1 = 0;
		int n2 = 1;
		
		for (int i =0; i< 10; i++) {
			
			f= n1+n2;
			n1=n2;
			n2=f;
			System.out.println(f);
		}
		
		String nombre = "fibo";
		System.out.println(Fibon(nombre));

	}
	
	public static String Fibon(String nombre) {
		//nombre = "hola";
		return nombre;
		
		
	}

}
