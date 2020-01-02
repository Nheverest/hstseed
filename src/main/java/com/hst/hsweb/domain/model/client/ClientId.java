package com.hst.hsweb.domain.model.client;

import org.mongodb.morphia.annotations.Embedded;
import org.seedstack.business.domain.BaseValueObject;
import org.seedstack.seed.validation.NotBlank;

@Embedded
public class ClientId extends BaseValueObject {

    /**
	 *
	 */
	private static final long serialVersionUID = 1032965348820590696L;

	@NotBlank
    private String id;

    @SuppressWarnings("unused")
    private ClientId() {
        // required by morphia
    }

	public ClientId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}