package codingExercises;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CompoundInterestCalc {

    private static final NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance(Locale.US); // .getCurrencyInstance(Locale.US) allows us to use US money symbol
    private static final NumberFormat percentFormatter = NumberFormat.getPercentInstance(Locale.US); // .getPercentInstance for percentages

    /**
     * This program calculates Compound Interest.
     * I use this formula : Balance(Y) = P(1+r)^Y + c[ ((1+r)^Y - 1) / r]
     * Principal : starting balance, r : rate of return , c : contribution , Y : period
     * @return
     */
    public static BigDecimal calc(String principal, String rate, int period, String contribution) throws ParseException {
        String rateAsPercent = percentFormatter.parse(rate).toString();
        BigDecimal a = BigDecimal.ONE.add(new BigDecimal(rateAsPercent)).pow(period); //  a = (1 + r)^Y
        BigDecimal b = a.subtract(BigDecimal.ONE); // ((1+r)^Y -1)
        BigDecimal c = b.divide(new BigDecimal(rateAsPercent)); // ((1+r)^Y - 1) / r
        BigDecimal d = c.multiply(new BigDecimal(moneyFormatter.parse(contribution).toString())); // e = c[ ((1+r)^Y - 1) / r]

        BigDecimal e = a.multiply(new BigDecimal(moneyFormatter.parse(principal).toString())); // f = P[(1+r)^Y]
        BigDecimal result = e.add(d); // P(1+r)^Y + c[ ((1+r)^Y - 1) / r]
        return  result;
    }

    public static void main(String[] args) throws ParseException {
        BigDecimal balance = CompoundInterestCalc.calc("$10,000", "8%", 10, "$1,500");
        System.out.println(moneyFormatter.format(balance));

    }
}
