package edu.wctc;

import edu.wctc.Implementations.ReportingApp;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        //actual code starts here

        ((ReportingApp)context.getBean("reportingApp")).generateReport();
    }

}

