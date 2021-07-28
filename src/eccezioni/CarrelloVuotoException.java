package eccezioni;

public class CarrelloVuotoException extends Exception
{
	public CarrelloVuotoException()
	{
		super("Il carrello è vuoto! Scontrino non generato!");
	}
}
