
/**
 * Demo Class for creating coin on user input.
 * @author Bryan Hill and Max Smoot
 * 
 */
import java.util.Scanner;
import MainCoin.*;

public class Demo {

    /**
     * Runs Coins demo.
     * 
     * @param args
     */
    public static void main(String[] args) {

	String factoryString = "USD";

        if (args.length != 1) {
            printError();
        } else {
            factoryString = args[0];
        }

        CountryCodes factory = stringToCountryCode(factoryString);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter coin denomination (0.25 = a quarter, 0 to quit)");
        double denomination = keyboard.nextDouble();
        Coin coin = createCoin(factory, denomination);

        System.out.println(coin);

    }

    public static void printError() {
        System.out.println("Problem with command line coin factory argument.");
        System.out.println("Possible coin factories include: USD, GBP, CAD, EUR");
        System.out.println("Using USD: U.S. Coin Factory\n");
    }

    public static CountryCodes stringToCountryCode(String s) {
        CountryCodes code;
        try {
            code = CountryCodes.valueOf(s);
        } catch (IllegalArgumentException e) {
            printError();
            return CountryCodes.USD;
        }
        return code;
    }

    public static Coin createCoin(CountryCodes cCode, double denomination) {
        switch (cCode) {
        case USD:
            return USDMint.getInstance().makeCoin(denomination);
        case CAD:
            return CADMint.getInstance().makeCoin(denomination);
        case GBP:
            return GBPMint.getInstance().makeCoin(denomination);
        case EUR:
            return EURMint.getInstance().makeCoin(denomination);
        default:
            return USDMint.getInstance().makeCoin(denomination);
        }
    }

}
