package com.careerit.cj.day8;

public class ReportManager {

    public static void main(String[] args) {
        generateReport(ReportType.PDF);
    }

    public static void generateReport(ReportType reportType) {
        String message = switch (reportType) {
            case PDF -> "Generating PDF report";
            case EXCEL -> "Generating Excel report";
            case HTML -> "Generating HTML report";
        };
        System.out.println(message);
    }
}
