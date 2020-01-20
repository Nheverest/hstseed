package com.hst.hsweb.interfaces.rest;

import com.hst.hsweb.domain.model.client.Client;
import com.hst.hsweb.interfaces.data.client.ClientDTO;
import org.seedstack.business.assembler.Assembler;

public interface ClientAssembler {

    ClientDTO customAssemble(Client client);
}
