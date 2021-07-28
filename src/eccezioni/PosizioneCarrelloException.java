package eccezioni;

public class PosizioneCarrelloException extends Exception
{
	public PosizioneCarrelloException()
	{
		super("Posizione carrello non disponibile!");
	}
}

