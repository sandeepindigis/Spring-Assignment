package org.example.service;

import org.example.reports.IReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("reportService")
public class ReportService {

    @Autowired
    @Qualifier("excel")
    private IReport excelReport;

    @Autowired
    @Qualifier("pdf")
    private IReport pdfReport;

    public void genrate(){
        pdfReport.genrateReport();
    }
}
