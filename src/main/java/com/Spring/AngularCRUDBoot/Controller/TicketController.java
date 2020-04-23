package com.Spring.AngularCRUDBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.AngularCRUDBoot.dao.TicketDaoInterface;
import com.Spring.AngularCRUDBoot.model.Ticket;

@RestController
@RequestMapping("/ticket")
public class TicketController {

	@Autowired
	private TicketDaoInterface ticketdao;
	
	@PostMapping("booktickets")
	public String BookTicket(Ticket ticket)
	{
		ticketdao.save(ticket);
		return "ticket book: ";
	}
	@GetMapping("gettickets")
	public List<Ticket> getTicket()
	{
		return (List<Ticket>)ticketdao.findAll();
	}
}
