package com.hst.hsweb.interfaces.data.client;

import com.hst.hsweb.domain.model.client.Client;
import com.hst.hsweb.domain.model.client.ClientId;
import com.hst.hsweb.domain.model.client.ClientRepository;
import org.seedstack.business.data.BaseDataImporter;
import org.seedstack.business.data.DataSet;
import org.seedstack.business.domain.Repository;

import javax.inject.Inject;
import java.util.stream.Stream;

public class ClientDTOImporter extends BaseDataImporter<ClientDTO> {
    @Inject
    private ClientRepository repository;

    @Override
    public boolean isInitialized() {
        return !repository.isEmpty();
    }

    @Override
    public void clear() {
        repository.clear();
    }

    @Override
    public void importData(Stream<ClientDTO> dtos) {
        dtos.forEach(dto -> repository.add(new Client(new ClientId(dto.getId()), dto.getCode())));
    }
}
