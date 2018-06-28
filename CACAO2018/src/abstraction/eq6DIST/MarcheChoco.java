package abstraction.eq6DIST; // Karel Kédémos , Victor Signes, Léopold Petitjean
import java.util.ArrayList;

import abstraction.eq4TRAN.IVendeurChoco;
import abstraction.eq4TRAN.IVendeurChocoBis;
import abstraction.eq4TRAN.VendeurChoco.GPrix;
import abstraction.eq4TRAN.VendeurChoco.GQte;
import abstraction.fourni.Acteur;
import abstraction.fourni.Monde;


public class MarcheChoco  implements Acteur{
	//private ArrayList<GQte> stock;
	//private ArrayList<GPrix> prix;
	private ArrayList <Acteur> distributeurs;
	private ArrayList <Acteur> transformateurs;

	
	public MarcheChoco() {
	this.transformateurs= new ArrayList<Acteur>();

	this.distributeurs= new ArrayList<Acteur>();
	for (Acteur a : Monde.LE_MONDE.getActeurs()) {
		if (a instanceof IVendeurChocoBis) {
			this.transformateurs.add(a);
		}
		if (a instanceof IAcheteurChoco) {
			this.distributeurs.add(a);
		}
	}/*
	this.distributeurs.add((Monde.LE_MONDE.getActeur("Eq6DIST")));
	this.distributeurs.add((Monde.LE_MONDE.getActeur("Eq1DIST")));
	this.transformateurs.add( Monde.LE_MONDE.getActeur("Eq4TRAN"));
	this.transformateurs.add( Monde.LE_MONDE.getActeur("Eq5TRAN"));
	this.transformateurs.add( Monde.LE_MONDE.getActeur("Eq7TRAN"));*/
	//this.stock= new ArrayList <GQte>();
	//this.prix= new ArrayList <GPrix>();	
	
	for (Acteur i : this.transformateurs) {
		IVendeurChocoBis ibis= (IVendeurChocoBis) i;
		//this.prix.add(ibis.getPrix());
		//this.stock.add(ibis.getStock());
	}	
	}
	public void next() {

		/*ArrayList<ArrayList<GQte>> commande=  new ArrayList<ArrayList<GQte>>();
		for (Acteur i : this.distributeurs) {
			IAcheteurChoco ibis = (IAcheteurChoco) i;
			commande.add(ibis.getCommande(this.prix, this.stock));
		}
		
		ArrayList<ArrayList<GQte>> livraison = new ArrayList<ArrayList<GQte>>();
		for(int j =0; j<3;j++) {
			ArrayList<GQte> Livraisoni =new ArrayList<GQte>(); 
			int qBonbonBQj=0;
			int qBonbonMQj=0;
			int qBonbonHQj=0;
			int qTabletteBQj=0;
			int qTabletteMQj=0;
			int qTabletteHQj=0;
			for (int i=0 ; i<commande.size() ; i++) {
				qBonbonBQj=qBonbonBQj+commande.get(i).get(j).getqBonbonBQ();
				qBonbonMQj=qBonbonMQj+commande.get(i).get(j).getqBonbonMQ();
				qBonbonHQj=qBonbonHQj+commande.get(i).get(j).getqBonbonHQ();
				qTabletteBQj=qTabletteBQj+commande.get(i).get(j).getqTabletteBQ();
				qTabletteMQj=qTabletteMQj+commande.get(i).get(j).getqTabletteMQ();
				qTabletteHQj=qTabletteHQj+commande.get(i).get(j).getqTabletteHQ();
				
				Livraisoni.add(new GQte(qBonbonBQj,qBonbonMQj,qBonbonHQj,qTabletteBQj,qTabletteMQj,qTabletteHQj) );
			}
			livraison.add(Livraisoni);		
		}
		
		int l=0;
		ArrayList<ArrayList<GQte>> Delivery = new ArrayList<ArrayList<GQte>>();
		for (Acteur i : this.transformateurs)	{
			IVendeurChocoBis ibis = (IVendeurChocoBis) i;
			Delivery.add(ibis.getLivraison(livraison.get(l)));
			l++;
		}
		l=0;
		ArrayList<Double> paiement=new ArrayList<Double>();
		ArrayList<GQte> PourDIST=new ArrayList<GQte>();
		for (int j=0;j<2;j++) {
			int qBonbonBQj=0;
			int qBonbonMQj=0;
			int qBonbonHQj=0;
			int qTabletteBQj=0;
			int qTabletteMQj=0;
			int qTabletteHQj=0;
			paiement.add(0.0);
			for (int i=0; i<Delivery.size(); i++) {
				paiement.set(j,paiement.get(j)+this.prix.get(i).getPrix(Delivery.get(i).get(j).getqBonbonBQ()));
				qBonbonBQj=qBonbonBQj+Delivery.get(i).get(j).getqBonbonBQ();
				qBonbonMQj=qBonbonMQj+Delivery.get(i).get(j).getqBonbonMQ();
				qBonbonHQj=qBonbonHQj+Delivery.get(i).get(j).getqBonbonHQ();
				qTabletteBQj=qTabletteBQj+Delivery.get(i).get(j).getqTabletteBQ();
				qTabletteMQj=qTabletteMQj+Delivery.get(i).get(j).getqTabletteMQ();
				qTabletteHQj=qTabletteHQj+Delivery.get(i).get(j).getqTabletteHQ();
				GQte Deliveryj= new GQte(qBonbonBQj,qBonbonMQj,qBonbonHQj,qTabletteBQj,qTabletteMQj,qTabletteHQj);
				PourDIST.add(Deliveryj);
			}
			
			}
		for (Acteur i : this.distributeurs) {
			IAcheteurChoco ibis = (IAcheteurChoco) i;
			//ibis.livraison(PourDIST.get(l));
			l++;
		}*/
	}
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return "MarcheChoco";
	}

}
