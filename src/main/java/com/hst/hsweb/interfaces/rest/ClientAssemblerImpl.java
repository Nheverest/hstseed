package com.hst.hsweb.interfaces.rest;

import com.hst.hsweb.domain.model.client.Client;
import com.hst.hsweb.interfaces.data.client.ClientDTO;
import org.seedstack.business.assembler.BaseAssembler;
import org.seedstack.seed.Bind;

@Bind(from = ClientAssembler.class)
public class ClientAssemblerImpl implements ClientAssembler {
    @Override
    public ClientDTO customAssemble(Client client) {
        ClientDTO dto = new ClientDTO();
        dto.setId(client.getId().getId());
        dto.setCode(client.getCode());
        return dto;
    }

    public ClientAssemblerImpl() {
   }
}
