package Logic;

public class verificarEspacios {

	
	public void verificar(String mensaje)throws EspaciosException
	{
		if(mensaje.equals(" "))
		{
			throw new EspaciosException("No puede existir espacios");
		}else {
			System.out.println("Correct");
		}	
	}
	
	
	
}
