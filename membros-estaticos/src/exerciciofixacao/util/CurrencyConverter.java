package exerciciofixacao.util;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double converter(double dollarPrice, double dollarBought) {
		return (dollarBought * dollarPrice) + (dollarBought * dollarPrice * IOF);
	}
}
