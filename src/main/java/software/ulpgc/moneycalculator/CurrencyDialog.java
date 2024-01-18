package software.ulpgc.moneycalculator;
import java.util.List;

public interface CurrencyDialog {
    CurrencyDialog define(List<Currency> currencies);
    software.ulpgc.moneycalculator.Currency get();
}
