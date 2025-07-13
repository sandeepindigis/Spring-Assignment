package org.example.reports;

import org.springframework.stereotype.Component;

@Component("pdf")
public class PdfReport implements IReport{
    @Override
    public void genrateReport() {
        System.out.println("Generating PDF");
    }
}
