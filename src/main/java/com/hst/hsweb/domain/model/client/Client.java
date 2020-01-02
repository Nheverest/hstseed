package com.hst.hsweb.domain.model.client;

import lombok.Getter;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.IndexOptions;
import org.mongodb.morphia.annotations.Indexed;
import org.seedstack.business.domain.AggregateRoot;
import org.seedstack.business.domain.BaseAggregateRoot;

import javax.validation.constraints.NotNull;

@Entity
public class Client extends BaseAggregateRoot<ClientId> implements AggregateRoot<ClientId> {
    @Id
    @NotNull
    private ClientId id;

    public String getCode() {
        return code;
    }

    @Indexed(options = @IndexOptions(unique = true))
    private String code;

    // required by Morphia
    public Client() {}

    public Client(ClientId id, String code) {
        this.id = id;
        this.code = code;
    }
}
