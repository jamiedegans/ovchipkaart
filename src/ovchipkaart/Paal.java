package ovchipkaart;

public class Paal
{
   private  double instapTarief = 00.00;
   private  boolean hebIkGenoegGeld;
    
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
	if (ovChipkaart.getGeldig() == true)
	{
	    System.out.println("jou kaart is geldig");
	   
	} else
	{
	    System.out.println("jou kaart is niet geldig");
	    
	}
    }

    public void checkSaldo(ovChipkaart ovChipkaart)
    {
	if (ovChipkaart.getSaldo() <= instapTarief)
	{
	    System.out.println("test je mag niet teweining geld");
	     hebIkGenoegGeld = true;
	} else
	{
	    System.out.println("test je mag wel genoeng geld");
	    hebIkGenoegGeld = false;
	}

    }
    
    public void inchecken(ovChipkaart ovChipkaart)
    {
	if (ovChipkaart.getGeldig() == true && hebIkGenoegGeld == false)
	{
	    ovChipkaart.setSaldo(ovChipkaart.getSaldo() - instapTarief);
	    System.out.println("test ja");
	} else
	{
	    System.out.println("test geen geld");
	}
    }
}
