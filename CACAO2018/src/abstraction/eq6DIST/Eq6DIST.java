package abstraction.eq6DIST;

import java.util.ArrayList;

import abstraction.eq1DIST.IVenteConso;
import abstraction.eq4TRAN.ITransformateur;
import abstraction.eq4TRAN.VendeurChoco.GPrix;
import abstraction.eq4TRAN.VendeurChoco.GQte;
import abstraction.fourni.Acteur;
import abstraction.fourni.Monde;

public class Eq6DIST implements Acteur, IVenteConso { //IAcheteurChoco {
	
	//private double quantité_demandée_transfo1_CMG;
	//private double quantité_demandée_transfo1_TBG;
	//private double quantité_demandée_transfo1_TMG;
	//private double quantité_demandée_transfo2_CMG;
	//private double quantité_demandée_transfo2_TBG;
	//private double quantité_demandée_transfo2_TMG;
	//private double quantité_demandée_transfo3_CMG;
	//private double quantité_demandée_transfo3_TBG;
	//private double quantité_demandée_transfo3_TMG;
	//private double[] commande;
	private GQte stock;
	public Eq6DIST() {
		
	}
	@Override
	public String getNom() {
		// TODO Auto-generated method stub;
		return "Eq6DIST";
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub;
		
	}
	@Override
	public void sell(int q) {
		//this.stock = this.stock - q;
		//System.out.println("eq6 : vente de "+q+" --stock = -->"+this.stock);
	}
	
	public ArrayList<GQte> getCommande(ArrayList<GPrix> gPrix, ArrayList<GQte> stock) {
		/**
		 * Karel Kédémos
		 */
		ArrayList<GQte> commande = new ArrayList<GQte>();
		
		final int quantité_demandée_transfo1_CMG=0;
		final int quantité_demandée_transfo1_TBG=0;
		final int quantité_demandée_transfo1_TMG=3000;
		final int quantité_demandée_transfo2_CMG=24650;
	 	final int quantité_demandée_transfo2_TBG=4000;
		final int quantité_demandée_transfo2_TMG=48000;
		final int quantité_demandée_transfo3_CMG=5800;
		final int quantité_demandée_transfo3_TBG=200;
		final int quantité_demandée_transfo3_TMG=6750;
		
		commande.add(new GQte(0, quantité_demandée_transfo1_CMG,0,quantité_demandée_transfo1_TBG,quantité_demandée_transfo1_TMG,0));
		commande.add(new GQte(0, quantité_demandée_transfo2_CMG,0,quantité_demandée_transfo2_TBG,quantité_demandée_transfo2_TMG,0));
		commande.add(new GQte(0, quantité_demandée_transfo3_CMG,0,quantité_demandée_transfo3_TBG,quantité_demandée_transfo3_TMG,0));
		return(commande);
	}
	public void livraison(GQte d) {
		this.stock.setqBonbonBQ(this.stock.getqBonbonBQ()+d.getqBonbonBQ());
		this.stock.setqBonbonMQ(this.stock.getqBonbonMQ()+d.getqBonbonMQ());
		this.stock.setqBonbonHQ(this.stock.getqBonbonHQ()+d.getqBonbonHQ());
		this.stock.setqTabletteBQ(this.stock.getqTabletteBQ()+d.getqTabletteBQ());
		this.stock.setqTabletteMQ(this.stock.getqTabletteMQ()+d.getqTabletteMQ());
		this.stock.setqTabletteHQ(this.stock.getqTabletteHQ()+d.getqTabletteHQ());
	}
	
}
