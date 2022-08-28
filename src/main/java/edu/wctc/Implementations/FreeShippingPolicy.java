package edu.wctc.Implementations;

import edu.wctc.Interfaces.IShippingPolicy;
import edu.wctc.Models.Sale;
import org.springframework.stereotype.Component;

@Component
public class FreeShippingPolicy implements IShippingPolicy
{
    @Override
    public void applyShipping(Sale sale) {
        sale.setShipping(0);
    }
}
