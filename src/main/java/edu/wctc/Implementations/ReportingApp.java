package edu.wctc.Implementations;

import edu.wctc.Interfaces.ISalesInput;
import edu.wctc.Interfaces.ISalesReport;
import edu.wctc.Interfaces.IShippingPolicy;
import edu.wctc.Models.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReportingApp {
    ISalesInput salesInput;

    IShippingPolicy shippingPolicy;
    ISalesReport salesReport;

    @Autowired
    public ReportingApp(ISalesInput salesInput, IShippingPolicy shippingPolicy,ISalesReport salesReport) {
        this.salesInput = salesInput;
        this.shippingPolicy = shippingPolicy;
        this.salesReport = salesReport;
    }


    public void generateReport(){
        List<Sale> allSales = salesInput.getSales();
        for(Sale aSale : allSales)
            shippingPolicy.applyShipping(aSale);
        salesReport.generateReport(allSales);
    }
}
