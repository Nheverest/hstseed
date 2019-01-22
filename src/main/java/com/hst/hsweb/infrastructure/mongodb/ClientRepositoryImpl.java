package com.hst.hsweb.infrastructure.mongodb;

import com.hst.hsweb.domain.model.client.Client;
import com.hst.hsweb.domain.model.client.ClientId;
import com.hst.hsweb.domain.model.client.ClientRepository;
import org.seedstack.mongodb.morphia.BaseMorphiaRepository;

import java.util.List;

public class ClientRepositoryImpl extends BaseMorphiaRepository<Client, ClientId> implements ClientRepository {

    @Override
    public List<Client> getClients() {
        boolean bool = true;
        if ( bool ) {
            return getDatastore().find(getAggregateRootClass()).asList();
        } else
            return getDatastore().find(getAggregateRootClass()).asList();
    }

}
