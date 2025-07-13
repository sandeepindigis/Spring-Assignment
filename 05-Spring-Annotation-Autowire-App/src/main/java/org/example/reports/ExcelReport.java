package org.example.reports;

import org.springframework.stereotype.Component;

@Component("excel")
public class ExcelReport implements IReport{
    @Override
    public void genrateReport() {
        System.out.println("Generating Excel Report");

    }
}
