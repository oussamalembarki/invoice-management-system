package com.portfolio.invoice.service;

import com.portfolio.invoice.entity.Invoice;
import com.portfolio.invoice.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service // Tells Spring: "This class holds business logic"
@Transactional // Ensures database operations are safe (atomic)
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    // 1. Create or Update an Invoice
    public Invoice saveInvoice(Invoice invoice) {
        // We might add calculation logic here later
        return invoiceRepository.save(invoice);
    }

    // 2. Get All Invoices
    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }

    // 3. Get One Invoice by ID
    public Invoice getInvoiceById(Long id) {
        return invoiceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Invoice not found with ID: " + id));
    }
    
    // 4. Delete Invoice
    public void deleteInvoice(Long id) {
        invoiceRepository.deleteById(id);
    }
}