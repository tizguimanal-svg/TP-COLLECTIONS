package tp5;
import java.util.*;
public class Commande implements Comparable<Commande> {
	private int NumCommande ;
    private Date dateCommande;
    private String nomFournisseur;
    
    public Commande(int NumCommande, Date dateCommande, String nomFournisseur) {
        this.NumCommande = NumCommande;
        this.dateCommande = dateCommande;
        this.nomFournisseur = nomFournisseur;
}
    public int getNumCommande() {
    	return NumCommande;
    }
    public void setNumCommande(int NumCommande) {
    	this.NumCommande=NumCommande;
    }
    
    public void setdateCommande(Date dateCommande) {
    	this.dateCommande=dateCommande;
    }
    public String getnomFournisseur() {
    	return nomFournisseur;
    }
    public void setnomFournisseur(String nomFournisseur) {
    	this.nomFournisseur=nomFournisseur;
    }
    public String toString() {
        return "Commande N" + NumCommande + "  Fournisseur : " + nomFournisseur + "  Date : " + dateCommande;
    }
    @Override
    public boolean equals(Object o) { 
        if (this == o) return true; 
        if (o == null || getClass() != o.getClass()) return false; 
        Commande c = (Commande) o; 
        return NumCommande == c.NumCommande; 
    }
    public int compareTo(Commande c) {
        return this.dateCommande.compareTo(c.dateCommande);
    }
}
