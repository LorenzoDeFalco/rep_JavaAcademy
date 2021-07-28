package eccezioni;

public class CassaSpentaException extends Exception 
{
	public CassaSpentaException()
	{
		super("La cassa è spenta!");
	}
}
