package org.example.springbootdiapp.services;

import org.example.springbootdiapp.dao.ReportDao;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    ReportDao reportDao;

    public ReportService(ReportDao reportDao){
        this.reportDao = reportDao;
    }

    public void printName(Integer userId) {
            String name=reportDao.getByName(userId);
            System.out.println(name);
    }
}

