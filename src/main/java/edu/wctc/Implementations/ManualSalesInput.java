package edu.wctc.Implementations;

import edu.wctc.Interfaces.ISalesInput;
import edu.wctc.Models.Sale;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component
public class ManualSalesInput implements ISalesInput {

    @Override
    public List<Sale> getSales() {
        boolean goAgain = true;
        Scanner scanner = new Scanner(System.in);

        List<Sale> salesList = new ArrayList<>();
        System.out.println("Entering Sales:");
        while (goAgain){

            System.out.println("What is the Full Name of Customer?");
            String fullName = scanner.nextLine();
            System.out.println("What Is the country?");
            String country = scanner.nextLine();
            System.out.println("What was the total amount? (No Tax or Shipping Added)");
            double total = Double.parseDouble(scanner.nextLine());
            System.out.println("What was the tax of the total amount?");
            double tax = Double.parseDouble(scanner.nextLine());
            salesList.add(new Sale(fullName,country,total,tax));
            System.out.println("Would you like to add another record?(Y/N)");
            String answer = scanner.nextLine();

            goAgain = answer.toLowerCase().charAt(0) == 'y';

        }


        return salesList;
    }
}
