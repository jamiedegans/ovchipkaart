package ovchipkaart;

public class driver
{
    public static void main(String[] args)
    {

	OVChipkaart ovChipkaart = new OVChipkaart(1909, 5.00, true, false);
	Paal paalTreinArnhem = new Paal(20.00, 5,10);
	Paal paalBus = new Paal(new Locatie(10,8));

	

	paalTreinArnhem.leesKaart(ovChipkaart); // is je kaart wel of niet legaal
	paalTreinArnhem.inchecken(ovChipkaart); // zet je in de ov systeem
	System.out.println("=====================<bus hier onder>========================");
	paalBus.leesKaart(ovChipkaart);
	paalBus.inchecken(ovChipkaart);

    }
}