package ovchipkaart;

import java.util.Scanner;

public class driver
{
    public static void main(String[] args)
    {
	Scanner sc = new scanner();
	
	ovChipkaart ovChipkaart = new ovChipkaart ();
	deScanner paal = new deScanner();
	paal.instapTariefTrein(20.00);
	sc.close();
    }
}
