package edu.wctc.Interfaces;
import edu.wctc.Models.Sale;

public interface IShippingPolicy {

    void applyShipping(Sale sale);
}