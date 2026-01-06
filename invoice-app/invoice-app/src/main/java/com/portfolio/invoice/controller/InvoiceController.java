package com.portfolio.invoice.controller;

import com.portfolio.invoice.entity.Invoice;
import com.portfolio.invoice.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController 
@RequestMapping("/api/invoices") 
@CrossOrigin(origins = "http://localhost:4200") // This allows my Angular app to connect
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    // GET all invoices from the database
    @GetMapping
    public List<Invoice> getAllInvoices() {
        return invoiceService.getAllInvoices();
    }

    // POST (save) a new invoice sent from the frontend
    @PostMapping
    public Invoice createInvoice(@RequestBody Invoice invoice) {
        return invoiceService.saveInvoice(invoice);
    }

    // DELETE an invoice using its ID
    @DeleteMapping("/{id}")
    public void deleteInvoice(@PathVariable Long id) {
        invoiceService.deleteInvoice(id);
    }
}