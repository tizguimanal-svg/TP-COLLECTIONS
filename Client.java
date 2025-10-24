package tp5;
import java.util.*;
public class Client {
	private int CodeClient;
	private String NomClient;
	private String AdrClient;
    private String telClient;
    private List<Commande> listeCommandes;
    
public Client (int CodeClient,String NomClient,String AdrClient, String telClient){
	this.CodeClient=CodeClient;
	this.NomClient=NomClient;
	this.AdrClient = AdrClient;
	this.telClient=telClient;
	this.listeCommandes = new ArrayList<>();
}

public boolean EnregistrerCommande(Commande c) {
	return listeCommandes.add(c);
}

public boolean supprimerCommande(int numCommande) {
	Iterator<Commande> it = listeCommandes.iterator();
	while (it.hasNext()) {
		Commande c = it.next();
		if (c.getNumCommande()==numCommande) {
			it.remove();
			return true;
		}
	}
	return false;
}

public int getCodeClient() {
    return CodeClient;
}

public List<Commande> getListeCommandes() {
    return listeCommandes;
}

public String toString() {
	 String info = "Client : " + NomClient +
             "  Code : " + CodeClient +
             "  Adresse : " + AdrClient +
             "  Téléphone : " + telClient+"\n" ;	
	 if (listeCommandes.isEmpty()) {
	    info += "Aucune commande n'est enregistrée.";
	} else {
	    for (Commande c : listeCommandes) {
	        info += " " +c+ "\n";
	    }
	}
	return info;
}
}


