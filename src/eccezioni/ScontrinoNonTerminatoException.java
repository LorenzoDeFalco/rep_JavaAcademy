package eccezioni;

public class ScontrinoNonTerminatoException extends Exception 
{
	public ScontrinoNonTerminatoException()
	{
		super("Scontrino non terminato, impossibile stampare!");
	}
}
