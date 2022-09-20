package Logic;
public class Principal {

	
	
	public static void main(String[] args) {
		
	/*	System.out.println("División");
		
		int numA = 6;
		int numB=0;
		*/
		String mensaje = " ";
		try{
			//calculardivision(numA, numB);
			verificarEspacios(mensaje);
		}catch(EspaciosException e)
		{
			e.printStackTrace();
			System.out.println("Error");
		}
	
	}
	
	public static void verificarEspacios(String mensaje) throws EspaciosException
	{
		verificarEspacios espacios = new verificarEspacios();
		espacios.verificar(mensaje);
		
	}
	
	public static int calculardivision(int numA, int numB) throws DividirExecption
	{
		Dividir div = new Dividir();
		return div.Dividir(numA, numB);
	}

}
