package com.hst.hsweb.infrastructure.mongodb;

import com.hst.hsweb.domain.model.client.Client;
import com.hst.hsweb.domain.model.client.ClientId;
import com.hst.hsweb.domain.model.client.ClientRepository;
import org.seedstack.seed.LifecycleListener;

import javax.inject.Inject;

public class DataGenerator implements LifecycleListener {
    @Inject
    private ClientRepository repo;

    @Override
    public void started() {
        repo.addOrUpdate(create(1, "code 1"));
        repo.addOrUpdate(create(2, "code 2"));
        repo.addOrUpdate(create(4, "code 4"));
    }

    private Client create(int id, String code) {
        Client client = new Client(new ClientId(String.valueOf(id)), code);
        return client;
    }
}
