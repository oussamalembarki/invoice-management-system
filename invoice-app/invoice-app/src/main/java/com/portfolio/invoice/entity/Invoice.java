package com.portfolio.invoice.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Unique ID for each invoice (Primary Key)

    private String customerName;
    private String customerEmail;
    private LocalDate issueDate;
    private LocalDate dueDate;

    // This links the invoice to its items (like products or services)
    @OneToMany(mappedBy = "invoice", cascade = CascadeType.ALL)
    private List<InvoiceItem> items = new ArrayList<>();
}