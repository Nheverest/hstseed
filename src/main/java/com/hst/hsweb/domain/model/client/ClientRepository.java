package com.hst.hsweb.domain.model.client;

import org.seedstack.business.domain.Repository;

import java.util.List;

public interface ClientRepository extends Repository<Client, ClientId> {

	/**
	 * Returns the whole list of organizations
	 * 
	 * @return the whole organization list 
	 */
	List<Client> getClients();

}