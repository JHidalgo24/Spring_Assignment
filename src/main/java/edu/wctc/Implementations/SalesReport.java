package edu.wctc.Implementations;

import edu.wctc.Interfaces.ISalesInput;
import edu.wctc.Interfaces.ISalesReport;
import edu.wctc.Interfaces.IShippingPolicy;
import edu.wctc.Models.Sale;
import org.springframework.stereotype.Component;

import java.text.NumberFormat;
import java.util.Formatter;
import java.util.List;

@Component
public class SalesReport implements ISalesReport {

    @Override
    public void generateReport(List<Sale> salesList) {

        var list = salesList;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.printf("%-20s", "Name");
        System.out.printf("%-20s", "Country");
        System.out.printf("%-20s", "Amount");
        System.out.printf("%-20s", "Tax");
        System.out.printf("%-20s", "Shipping");
        System.out.printf("%-20s%n", "Total");
        for (Sale sale: list) {
            System.out.printf("%-20s", sale.getFullName());
            System.out.printf("%-20s", sale.getCountry());
            System.out.printf("%-20s", formatter.format(sale.getTotal()));
            System.out.printf("%-20s", formatter.format(sale.getTax()));
            System.out.printf("%-20s", formatter.format(sale.getShipping()));
            System.out.printf("%-20s%n", formatter.format(sale.getTotal() + sale.getShipping() + sale.getTotal()));
        }

        /*
        get the list of things passed in from the SalesInput

        */

    }
}
