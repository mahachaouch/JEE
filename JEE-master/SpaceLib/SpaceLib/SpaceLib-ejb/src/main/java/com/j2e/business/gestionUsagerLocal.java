@Local
public interface gestionUsagerLocal {
	
public usager addUsager(int idUser, string psw) throws userAlreadyExistsException;
public usager identify(int iduser, String psw) throws userNotFoundException;

}
