package eccezioni;

public class CarrelloVuotoException extends Exception
{
	public CarrelloVuotoException()
	{
		super("Il carrello � vuoto! Scontrino non generato!");
	}
}
