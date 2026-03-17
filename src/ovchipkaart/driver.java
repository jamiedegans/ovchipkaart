package ovchipkaart;

public class driver
{
    public static void main(String[] args)
    {

	OVChipkaart ovChipkaart = new OVChipkaart(1909, 5.00, true, false);
	Paal paalTrein = new Paal(20.00);
	Paal paalBus = new Paal(2.00);
	

	paalTrein.leesKaart(ovChipkaart); // is je kaart wel of niet legaal
	paalTrein.inchecken(ovChipkaart); // zet je in de ov systeem
	System.out.println("=====================<bus hier onder>========================");
	paalBus.leesKaart(ovChipkaart);
	paalBus.inchecken(ovChipkaart);
    }
}
