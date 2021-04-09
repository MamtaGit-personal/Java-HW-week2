package week2;

public class Main {

	public static void main(String[] args) {
		// Create three boolean variables
				boolean isHotOutside = false;
				boolean isWeekday = false;
				boolean hasMoneyInPocket;
						 
				// Create the following variables (not boolean type, choose the best data type for the variable):
				double costOfMilk = 2.50;
				double moneyInWallet = 4.00;
				int thirstLevel = 2;
						
				boolean shouldByIcecream;
				boolean willGoSwimming;
				boolean isAGoodDay;
				boolean willBuyMilk;
						
				//If moneyInWallet > 0.0 then hasMoneyInPocket = true otherwise false.
				if(moneyInWallet > 0.0)
				{
					hasMoneyInPocket = true;
				}
				else {
						hasMoneyInPocket = false;
				}
				System.out.println("You have money in your pocket is: " + hasMoneyInPocket);
						
						
				//You should buy ice cream if it is hot outside and there is money in your pocket
				if(isHotOutside && hasMoneyInPocket)
				{
					shouldByIcecream = true;
				}
				else {
					shouldByIcecream = false;
				}
				System.out.println("You should buy ice cream is: " + shouldByIcecream);
						
						
				// Will go swimming if it is hot outside and it is not a weekday
				if(isHotOutside && !isWeekday)
				{
					willGoSwimming = true;
				}
				else {
					willGoSwimming = false;
				}
				System.out.println("You will go swimming is: " + willGoSwimming);
						
				// It's a good day if it is hot outside, there is money in your pocket, and it is not a weekday
				isAGoodDay = ((isHotOutside || hasMoneyInPocket) && !isWeekday) ? true : false;
				System.out.println("It is a good day is: " + isAGoodDay);
						
				/* Will buy milk if it is hot outside, and thirstLevel is greater than or equal to 3, and moneyInWallet 
				* is greater than or equal to 2 times the cost of milk.
				* */
				willBuyMilk = (isHotOutside && thirstLevel >=3 && (moneyInWallet >= 2*costOfMilk)) ? true : false;
				System.out.println("You will buy milk is: " + willBuyMilk);

	}

}
