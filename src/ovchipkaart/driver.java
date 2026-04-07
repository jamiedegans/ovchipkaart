package ovchipkaart;

public class Driver
{
    public static void main(String[] args)
    {	
	// de locaties
	Locatie amsterdam = new Locatie(3.00, 4.50, "Amsterdam");
	Locatie arnhem = new Locatie(4.50,  3.50, "Arnhem");
	Locatie maastricht = new Locatie(4.00, 1.00, "Maastricht");
	Locatie sHertogenbosch = new Locatie (3.50, 3.00, "'s-Hertgenbosch");
	Locatie middelbrug = new Locatie (1.00, 2.50, "middelbrug");
	Locatie deHague = new Locatie (2.00, 4.00, "De Hague");
	
	
	
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


    }
}