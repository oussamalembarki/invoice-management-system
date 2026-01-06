import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { InvoiceService, Invoice } from '../../services/invoice.service';

@Component({
  selector: 'app-invoice-list',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './invoice-list.component.html',
  styleUrls: ['./invoice-list.component.css']
})
export class InvoiceListComponent implements OnInit {
  invoices: Invoice[] = [];

  constructor(private invoiceService: InvoiceService) { }

  ngOnInit(): void {
    this.refreshList();
  }

  refreshList() {
    this.invoiceService.getInvoices().subscribe(data => this.invoices = data);
  }

  createTestInvoice() {
    const testData: Invoice = {
      customerName: "Client " + Math.floor(Math.random() * 100),
      customerEmail: "test@client.com",
      issueDate: "2026-01-05",
      dueDate: "2026-02-05",
      items: []
    };

    this.invoiceService.createInvoice(testData).subscribe(() => this.refreshList());
  }

  deleteInvoice(id: number | undefined) {
    if (id) {
      this.invoiceService.deleteInvoice(id).subscribe(() => this.refreshList());
    }
  }
}