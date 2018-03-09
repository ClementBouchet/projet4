package org.ocproject.service;

import java.util.List;
import org.ocproject.service.Livre;

//import org.ocproject.bibli.model.Livre;



public interface LivreManager {
	
	public void emprunter(int id, String date_emprunt, String date_retour);
	
	public List<Livre> afficherResultat(String search);
	
	
	public Livre detailLivre(int id);
	
	public List<Livre> allBooks();
	
	

}
