package com.bookworm.controllers;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookworm.dtos.InvoiceDto;
import com.bookworm.entities.Invoice;
import com.bookworm.entities.InvoiceDetail;
import com.bookworm.services.InvoiceDetailService;
import com.bookworm.services.InvoiceService;

@RestController
@CrossOrigin("*")
public class InvoiceController {
	
	@Autowired
	private InvoiceService inService;
	
	@Autowired
	private InvoiceDetailService indtlService;
	
	@GetMapping(value="/api/getAllInvoice")
	public List<Invoice> getAllInvoice()
	{
		return inService.getAllInvoice();
	}
	
	@GetMapping(value="/api/getById/{id}")
	public Optional<Invoice> getById(@PathVariable long id) 
	{
		return inService.getById(id);
	}

	@PostMapping(value="/api/addInvoice")
	public void addInvoice(@RequestBody InvoiceDto invoicedto) {
		Invoice invoice = new Invoice();
		InvoiceDetail invoicedtl = new InvoiceDetail();
		indtlService.setInvoiceDetails(invoicedtl);
		inService.addInvoice(invoice);
	}
	
	@DeleteMapping("/api/delete/{id}")
	public void deleteByInvoiceId(@PathVariable long id) {
		inService.deleteByInvoiceId(id);
	}
}
