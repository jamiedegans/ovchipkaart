package ovchipkaart;

public class driver
{
    public static void main(String[] args)
    {

	ovChipkaart ovChipkaart = new ovChipkaart(1909, 5.00, true, false);
	Paal paalTrein = new Paal(20.00);
	Paal paalBus = new Paal(2.00);
	

	paalTrein.leesKaart(ovChipkaart); // is je kaart wel of niet legaal
	paalTrein.checkSaldo(ovChipkaart); // kijkt dat je geld voor het instappen tarief
	paalTrein.inchecken(ovChipkaart); // zet je in de ov systeem
	System.out.println("---------------------------------------");
	paalBus.leesKaart(ovChipkaart);
	paalBus.checkSaldo(ovChipkaart);
	paalBus.inchecken(ovChipkaart);
    }
}
