package software.ulpgc.moneycalculator.fixer;

import software.ulpgc.moneycalculator.Currency;
import software.ulpgc.moneycalculator.CurrencyLoader;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CurrencyLoader currencyLoader = new FixerCurrencyLoad();
        List<Currency> currencies = currencyLoader.load();
        for (Currency currency : currencies) {
            System.out.println(currency);
        }
    }
}