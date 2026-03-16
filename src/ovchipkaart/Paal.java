package ovchipkaart;

public class Paal
{
    double instapTarief = 00.00;
    boolean hebIkGenoegGeld;

    // =================================================//
    // construcor
    public Paal(double instapTarief)
    {
	this.instapTarief = instapTarief;
    }

    // functions
    // =================================================//
    public void leesKaart(ovChipkaart ovChipkaart)
    {
	if (ovChipkaart.getgeldig() == true)
	{
	    System.out.println("jou kaart is geldig");

	} else
	{
	    System.out.println("jou kaart is niet geldig");
	}

    }

    public void inchecken(ovChipkaart ovChipkaart)
    {
	if (ovChipkaart.getgeldig() == true)
	{
	 
	    
	} else
	{
	    System.out.println("test niet in niet geldig");
	}

    public void checkSaldo(ovChipkaart ovChipkaart)
    {
	if (ovChipkaart.getsaldo() <= instapTarief)
	{
	    System.out.println("test je zit in het in ov gegoeng geld");
	} else
	{
	    System.out.println("test je zit niet in het ov broke ye ye ahh");
	}

    }

}
