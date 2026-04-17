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
    
    public void aanvullenTot(double HetBedragTeBehalen) {
	if(isDeMachineBezet == true) {
	 System.out.println("je huidige saldo is" + oVChipkaart.getSaldo());
	 stortBedrag = HetBedragTeBehalen - oVChipkaart.getSaldo();
	 oVChipkaart.setSaldo(HetBedragTeBehalen);
	 
	 System.out.println("jij wilt het hebben tot " + HetBedragTeBehalen);
	 
	 System.out.println("nieuw saldo is " + oVChipkaart.getSaldo());
	 
	 } else {
	     System.out.println("de machine is nog bezet");
	 } 
    }
    
    public void aanvullenMet(double HetBedragErBij) {
	if(isDeMachineBezet == true) { 
	    System.out.println( oVChipkaart.setSaldo( oVChipkaart.getSaldo() + HetBedragErBij));								
	
    } else {
	     System.out.println("de machine is nog bezet");
	 } 
    }
}
