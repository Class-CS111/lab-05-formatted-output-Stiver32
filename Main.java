// COLLABORATORS: <tutors, instructor, or anyone else who helped you>

// DESCRIPTION: converts a dollar amount to quarters, dimes, nickels, and pennies. 

public class Main
{
	public static void main(String[] args)
	{
    //DECLARATION + INITIALIZATION SECTION
    double dollarAmount;
    int pennyAmount;
    int nickelAmount;
    int dimeAmount;
    int quarterAmount;
    int centsRemaining;

    //CALCULATION SECTION
    dollarAmount = 1.68;
    centsRemaining = (int) (dollarAmount * 100);

    quarterAmount = (int) (centsRemaining/25);
    centsRemaining %= 25;

    dimeAmount = (int) (centsRemaining/10);
    centsRemaining %= 10;

    nickelAmount = (int) (centsRemaining/5);
    centsRemaining %= 5;

    pennyAmount = centsRemaining;
  

    //OUTPUT SECTION

    System.out.printf("$%.2f can be converted to %d quarters, %d dimes, %d nickels, and %d pennies.", dollarAmount,quarterAmount,dimeAmount,nickelAmount,pennyAmount);

  }

}
