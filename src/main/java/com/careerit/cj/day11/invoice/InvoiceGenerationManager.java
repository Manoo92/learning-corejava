package com.careerit.cj.day11.invoice;

public class InvoiceGenerationManager {
    public static void main(String[] args) {

        UserUsageServiceDataService service = new UserUsageServiceDataService();
        service.generateAndSendInvoices();
    }
}
