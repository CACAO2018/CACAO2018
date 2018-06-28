package abstraction.eq3PROD.echangesProdTransfo;

import abstraction.eq2PROD.acheteurFictifTRAN.acheteurFictifTRAN;
import abstraction.fourni.Acteur;

/**
 * @deprecated
 * @author Grégoire
 */

public class ContratFeveV2 {
	
	private IAcheteurFeveV2 transformateur;
	private IVendeurFeveV2 producteur;
	private int qualite;
	
	private int quantiteOffrePublique;
	private double prixOffrePublique;
	
	private int quantiteDemande;
	private double prixDemande;
	
	private int quantiteProposition;
	private double prixProposition;
	
	private boolean reponse;
	
	/**
	 * EXPLICATION DES ECHANGES
	 *  OffrePublique_ : Offre initiale du producteur sur le marche
	 *  Demande_ : Demande du transformateur au producteur
	 *  Proposition_ : Proposition du producteur au transformateur
	 *  
	 *  @Unites :
	 *  Quantites : tonne
	 *  Prix : €/tonne
	 */
	
		// Constructeurs //
	
	public ContratFeveV2(IAcheteurFeveV2 transformateur, IVendeurFeveV2 producteur, int qualite,
			int quantiteOffrePublique, int quantiteDemande, int quantiteProposition,
			double prixOffrePublique, double prixDemande, double prixProposition, boolean reponse) {
		
		this.transformateur = transformateur;
		this.producteur = producteur;
		this.qualite = qualite;
		
		this.quantiteOffrePublique = quantiteOffrePublique;
		this.quantiteDemande = quantiteDemande;
		this.quantiteProposition = quantiteProposition;
		
		this.prixOffrePublique = prixOffrePublique;
		this.prixDemande = prixDemande;
		this.prixProposition = prixProposition;
		
		this.reponse = reponse;
		
	}
	public ContratFeveV2(IAcheteurFeveV2 transformateur, IVendeurFeveV2 producteur, int qualite) {
		
		this.transformateur = transformateur;
		this.producteur = producteur;
		this.qualite = qualite;
		
		this.quantiteOffrePublique = 0;
		this.quantiteDemande = 0;
		this.quantiteProposition = 0;
		
		this.prixOffrePublique = 0;
		this.prixDemande = 0;
		this.prixProposition = 0;
		
		this.reponse = false;
	}
	public ContratFeveV2() {
		
		this.transformateur = null;
		this.producteur = null;
		this.qualite = 0;
		
		this.quantiteOffrePublique = 0;
		this.quantiteDemande = 0;
		this.quantiteProposition = 0;
		
		this.prixOffrePublique = 0;
		this.prixDemande = 0;
		this.prixProposition = 0;
		
		this.reponse = false;
	}
	
		// Getters //

	@Deprecated
	public ContratFeveV2(int qualite2, int quantite, double prixMinqb, IAcheteurFeveV2 transformateur2,
			IVendeurFeveV2 producteur2, boolean reponse2) {
		// TODO Auto-generated constructor stub
	}
	public IAcheteurFeveV2 getTransformateur() {
		return this.transformateur;
	}
	public IVendeurFeveV2 getProducteur() {
		return this.producteur;
	}
	public int getQualite() {
		return this.qualite;
	}

	public int getOffrePublique_Quantite() {
		return this.quantiteOffrePublique;
	}
	public int getDemande_Quantite() {
		return this.quantiteDemande;
	}
	public int getProposition_Quantite() {
		return this.quantiteProposition;
	}
	public double getOffrePublique_Prix() {
		return this.prixOffrePublique;
	}
	public double getDemande_Prix() {
		return this.prixDemande;
	}
	public double getProposition_Prix() {
		return this.prixProposition;
	}
	
	public boolean getReponse() {
		return this.reponse;
	}

		// Setters //
	
	public void setTransformateur(IAcheteurFeveV2 transformateur) {
		this.transformateur = transformateur;
	}
	public void setProducteur(IVendeurFeveV2 producteur) {
		this.producteur = producteur;
	}
	public void setQualite(int qualite) {
		this.qualite = qualite;
	}
	
	public void setOffrePublique_Quantite(int quantiteOffrePublique) {
		this.quantiteOffrePublique = quantiteOffrePublique;
	}
	public void setDemande_Quantite(int quantiteDemande) {
		this.quantiteDemande = quantiteDemande;
	}
	public void setProposition_Quantite(int quantiteProposition) {
		this.quantiteProposition = quantiteProposition;
	}
	public void setOffrePublique_Prix(double prixOffrePublique) {
		this.prixOffrePublique = prixOffrePublique;
	}
	public void setDemande_Prix(double prixDemande) {
		this.prixDemande = prixDemande;
	}
	public void setProposition_Prix(double prixProposition) {
		this.prixProposition = prixProposition;
	}
	
	public void setReponse(boolean reponse) {
		this.reponse = reponse;
	}
	
	public String toString() {
		String [] strqualite = {"basse", "moyenne", "haute"};
		String rep = "";
		if (this.reponse) {
			rep += "\nOffre acceptée";
		}
		String acheteur = "";
		if(this.transformateur != null) {
			acheteur += ((Acteur)(this.transformateur)).getNom();
		}
		String vendeur = "";
		if(this.producteur != null) {
			vendeur += ((Acteur)(this.producteur)).getNom();
		}
		
		return "Contrat : "+this.getProposition_Quantite()+" tonnes de feve de "+strqualite[this.getQualite()]+" qualité, à "+this.getProposition_Prix()
				+"€ la tonne, soit un total de "+this.getProposition_Quantite()*this.getProposition_Prix()+"€.\nAcheteur : "+acheteur+" | Vendeur : "+vendeur+rep;
	}
}
