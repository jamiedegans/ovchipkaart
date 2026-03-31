package ovchipkaart;

public class driver
{
    public static void main(String[] args)
    {

	OVChipkaart ovChipkaart = new OVChipkaart(1909, 500.00, true);

	Paal paalTrein = new Paal(20.00, 51.0);
	Paal paalBus = new Paal(new Locatie(10, 8, "arnehm"));

	paalTrein.leesKaart(ovChipkaart); // is je kaart wel of niet legaal
	paalTrein.inchecken(ovChipkaart); // zet je in de ov systeem
//	System.out.println("=====================<bus hier onder>========================");
	paalBus.leesKaart(ovChipkaart);
//	paalBus.inchecken(ovChipkaart);

    }
}