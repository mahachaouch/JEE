@Local
public interface gestionMecanicienLocal {

	public void identifyMeca(int idMeca, string psw, int idStation) throws stationNotFoundException, usagerNotFoundException, wrongStationForMecaException
	public int[] navettesAreviser(int idStation);
	
	//au choix de la navette (alé de la liste int[] navettesAreviser, ça return le numéro de quai ou se trouve cette navette
	public int chooseNavette(int[] navettes);
}
