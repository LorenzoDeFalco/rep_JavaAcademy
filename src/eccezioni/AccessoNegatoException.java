package eccezioni;

public class AccessoNegatoException extends Exception 
{
	public AccessoNegatoException()
	{
		super("Accesso Negato, nome utente o password sbagliati!");
	}
}
