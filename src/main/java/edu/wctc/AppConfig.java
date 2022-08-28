package edu.wctc;


import edu.wctc.Implementations.*;
import edu.wctc.Interfaces.ISalesInput;
import edu.wctc.Interfaces.ISalesReport;
import edu.wctc.Interfaces.IShippingPolicy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc")
public class AppConfig {

    @Bean
    ISalesReport salesReport(){
        return new BasicSalesReport();
    }

    @Bean
    IShippingPolicy shippingPolicy(){
        return new FlatRateShippingPolicy();
    }

    @Bean
    ISalesInput salesInput(){
        return new SalesInput();
    }


}
