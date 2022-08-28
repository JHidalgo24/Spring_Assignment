package edu.wctc.Interfaces;

import edu.wctc.Models.Sale;

import java.util.List;

public interface ISalesReport {
    void generateReport(List<Sale> salesList);
}