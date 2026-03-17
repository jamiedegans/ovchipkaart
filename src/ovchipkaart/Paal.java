package ovchipkaart;

public class Paal
{
    private double instapTarief = 00.00;
    private boolean hebIkGenoegGeld;

    // =================================================//
    // construcor
    public Paal(double instapTarief)
    {
	this.instapTarief = instapTarief;
    }

    // functions
    // =================================================//
    public void leesKaart(OVChipkaart oVChipkaart)
    {
	if (oVChipkaart.getGeldig() == true)
	{
	    System.out.println("jou kaart is geldig");

	} else
	{
	    System.out.println("jou kaart is niet geldig");

	}
    }

    private boolean checkSaldo(OVChipkaart oVChipkaart)
    {
	if (oVChipkaart.getSaldo() <= instapTarief)
	{
	    System.out.println("test je mag niet teweining geld");
	    return false;
	} else
	{
	    System.out.println("test je mag wel genoeng geld");
	    return true;
	}

    }

    public void inchecken(OVChipkaart oVChipkaart)
    {
	if (oVChipkaart.getGeldig() == true && checkSaldo(oVChipkaart))
	{
	    oVChipkaart.setSaldo(oVChipkaart.getSaldo() - instapTarief);
	    System.out.println("test ja");
	} else
	{
	    System.out.println("test geen geld");
	}
    }
}
