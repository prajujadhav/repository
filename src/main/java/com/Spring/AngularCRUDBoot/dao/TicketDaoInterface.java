package com.Spring.AngularCRUDBoot.dao;

import org.springframework.data.repository.CrudRepository;

import com.Spring.AngularCRUDBoot.model.Ticket;

public interface TicketDaoInterface extends CrudRepository<Ticket, Integer>{

}
