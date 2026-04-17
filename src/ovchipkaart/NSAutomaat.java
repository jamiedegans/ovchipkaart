package ovchipkaart;

public class NSAutomaat
{	 System.out.println("jou kaart is geldig");
    private OVChipkaart oVChipkaart;
    private boolean isDeMachineBezet = false;

    public void scan(OVChipkaart meeGegevenOVChipkaart)
    {

	this.oVChipkaart = meeGegevenOVChipkaart;
	isDeMachineBezet = true;

    }
    
