package com.portfolio.invoice.repository;

import com.portfolio.invoice.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    // We get methods like save(), findById(), findAll() for free!
}