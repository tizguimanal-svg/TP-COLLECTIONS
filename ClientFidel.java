package tp5;

public class ClientFidel extends Client {
	private String CodeFidelite;
	private float TauxReduction;
	public  ClientFidel (int CodeClient,String NomClient,String AdrClient,String CodeFidelite,float TauxReduction,String telClient){
		super(CodeClient,NomClient,AdrClient,telClient);
		this.CodeFidelite=CodeFidelite;
		this.TauxReduction=TauxReduction;
	}
	 @Override
	    public String toString() {
	        return super.toString() +
	                "Code fidélité : " + CodeFidelite +
	                "  Réduction : " + TauxReduction + "\n";
	    }

}
