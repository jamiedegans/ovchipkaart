package ovchipkaart;

public class Driver
{
    public static void main(String[] args)
    {
	Locatie amsterdam = new Locatie(30.00, 60.00, "strvrjnieugberiewbh");

	Locatie arnhem = new Locatie(20, 50, "gregdfgfd");
	
	arnhem.afstandUitrekenen(amsterdam);
	
	
	OVChipkaart ovChipkaart = new OVChipkaart(1909, 500.00, true);

	Paal paalTreinAmsterdam = new Paal(amsterdam);
	Paal paalTreinArhem = new Paal(arnhem);
	
	Paal paalBus = new Paal(arnhem);

//	paalTrein.leesKaart(ovChipkaart); // is je kaart wel of niet legaal
//	paalTrein.inchecken(ovChipkaart); // zet je in de ov systeem
//	System.out.println("=====================<bus hier onder>========================");
	paalBus.leesKaart(ovChipkaart);
	paalBus.inchecken(ovChipkaart);

    }
}