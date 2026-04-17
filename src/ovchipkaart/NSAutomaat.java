package ovchipkaart;

public class NSAutomaat
{
    private OVChipkaart oVChipkaart;
    private boolean isDeMachineBezet = false;
    private double stortBedrag;

    public void scan(OVChipkaart meeGegevenOVChipkaart)
    {

	this.oVChipkaart = meeGegevenOVChipkaart;
	isDeMachineBezet = true;

    }

    public void aanvullenTot(double HetBedragTeBehalen)
    {
	if (isDeMachineBezet == true)
	{
	    System.out.println("huidige saldo € " + oVChipkaart.getSaldo());
	    stortBedrag = HetBedragTeBehalen - oVChipkaart.getSaldo();
	    oVChipkaart.setSaldo(HetBedragTeBehalen);

	    System.out.println("bijgestort bedrag € " + HetBedragTeBehalen);

	    System.out.println("nieuw saldo € " + oVChipkaart.getSaldo());

	} else
	{
	    System.out.println("Geen OV-chipkaart gedetecteerd. Scan eerst uw kaart.");
	}
    }

    public void aanvullenMet(double HetBedragErBij)
    {
	if (isDeMachineBezet == true)
	{
	    System.out.println(oVChipkaart.setSaldo(oVChipkaart.getSaldo() + HetBedragErBij));

	} else{
	    System.out.println("Geen OV-chipkaart gedetecteerd. Scan eerst uw kaart.");
	}
    }
	

	    public void stop()
	    {
		if (isDeMachineBezet == true)
		{
		    
		    oVChipkaart = null;
		    isDeMachineBezet = false;
		    System.out.println("Sessie beëindigd.");
		} else
		{
		    System.out.println("Er is geen actieve sessie om te beëindigen.");
		}

    }
}
