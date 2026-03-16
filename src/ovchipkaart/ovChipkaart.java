package ovchipkaart;

public class ovChipkaart
{
    private int kaartNummer;
    private double saldo;
    private boolean geldig;
    private boolean benIkInAangemeld;

    // Constructor
    public ovChipkaart(int kaart, double geld, boolean geldig, boolean benIkInAangemeld)
    {

	this.kaartNummer = kaart; // 2345.6543.9876.9889
	this.saldo = geld; // 0.96
	this.geldig = geldig; // nu nog boolean
	this.benIkInAangemeld = false;
    }

    public boolean getgeldig()
    {
	return geldig;
    }

    public double getsaldo()
    {
	return saldo;
    }
    
    public double setsaldo()
    {
	return saldo;
    }


    public boolean setbenIkInAangemeld()
    {
	return benIkInAangemeld;
    }



}
