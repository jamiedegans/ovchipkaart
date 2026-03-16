package ovchipkaart;


public class driver
{
    public static void main(String[] args)
    {
	
	
	ovChipkaart ovChipkaart = new ovChipkaart(2348, 78.00, true, false);
	Paal paalTrein = new Paal(20.00);
	Paal paalBus = new Paal(2.00);
	
	paalTrein.leesKaart(ovChipkaart);
	paalTrein.checkSaldo(ovChipkaart);
	
	paalBus.leesKaart(ovChipkaart);
	paalBus.checkSaldo(ovChipkaart);
	
    }
}
