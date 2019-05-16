package main;

public class FactorialCalculator {
	public String findFactorial(int a) {
		int currentfactorial = 1;
		long currentfactorialcalculation = 1;
		if (a == 1) {
			return "0! or 1!";
		}

		if (a < 0) {
			return "Factorial not defined for negatives";
		}
		while (currentfactorialcalculation <= Integer.MAX_VALUE) {
			currentfactorialcalculation *= ++currentfactorial;
			if (currentfactorialcalculation == a) {
				return "" + currentfactorial + "!";
			} else if (currentfactorialcalculation > a) {
				return "NONE";
			}
		}
		return "NONE";
	}

}
