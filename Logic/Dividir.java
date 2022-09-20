package Logic;

public class Dividir {
	
	public Dividir()
	{
		
	}
	
	public int Dividir(int numA, int numB)throws DividirExecption
	{
		int division =0;
		if(numB==0)
		{
			throw new  DividirExecption("Error");
		}else {
			division = numA/ numB;
		}
		return division;
	}
	

}
