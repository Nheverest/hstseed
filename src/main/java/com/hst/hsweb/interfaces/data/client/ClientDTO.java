package com.hst.hsweb.interfaces.data.client;

import org.seedstack.business.data.DataSet;

@DataSet(group = "hsweb", name = "client")
public class ClientDTO {
    private String id;
    private String code;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
