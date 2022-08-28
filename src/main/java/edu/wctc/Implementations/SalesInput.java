package edu.wctc.Implementations;

import edu.wctc.Interfaces.ISalesInput;
import edu.wctc.Models.Sale;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


@Component
public class SalesInput implements ISalesInput {

    @Override
    public List<Sale> getSales()   {
        // File path is passed as parameter
        File file = new File("src/main/java/edu/wctc/Files/sales.txt");




        List<Sale> sales = new ArrayList<>();
        String[] items = new String[0];

        try (BufferedReader br = new BufferedReader(new FileReader(file));) {
            String currentLine = "";

            while ((currentLine = br.readLine()) != null)
            {
                items = currentLine.split(",");
                Sale tempSale = new Sale(items[0], items[1], Double.parseDouble(items[2]), Double.parseDouble(items[3]));
                sales.add(tempSale);
            }

        } catch (IOException ioException) {
            System.out.println(ioException);
        }


        return sales;

    }
}
