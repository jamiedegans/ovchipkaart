package ovchipkaart;

public class Driver
{
    public static void main(String[] args)
    {	
	// de locaties
	Locatie amsterdam = new Locatie(30.00, 60.00, "amsterdam");
	Locatie arnhem = new Locatie(20, 50, "arnhem");
	
//	arnhem.afstandUitrekenen(amsterdam);
	// de paal en kaaarten
	OVChipkaart ovChipkaart = new OVChipkaart(1909, 500.00, true);
	
	Paal paalTreinAmsterdam = new Paal(20.00, amsterdam);
	Paal paalTreinArhem = new Paal(arnhem);
	
	Paal paalBus = new Paal(arnhem);

	 paalTreinAmsterdam.leesKaart(ovChipkaart); // is je kaart wel of niet legaal
	 paalTreinAmsterdam.inchecken(ovChipkaart); // zet je in de ov systeem
	 paalTreinArhem.uitchecken(ovChipkaart);
	System.out.println("=====================<bus hier onder>========================");
//	paalBus.leesKaart(ovChipkaart);
//	paalBus.inchecken(ovChipkaart);

    }
}