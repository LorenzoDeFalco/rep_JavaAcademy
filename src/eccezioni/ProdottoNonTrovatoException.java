package eccezioni;

public class ProdottoNonTrovatoException extends Exception
{
	public ProdottoNonTrovatoException()
	{
		super("Prodotto non presente nel carrello!");
	}

}
