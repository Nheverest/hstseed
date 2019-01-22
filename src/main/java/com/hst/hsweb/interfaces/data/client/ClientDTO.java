package com.hst.hsweb.interfaces.data.client;

import lombok.Getter;
import lombok.Setter;
import org.seedstack.business.data.DataSet;

@DataSet(group = "hsweb", name = "client")
@Getter
@Setter
public class ClientDTO {
    private String id;
    private String code;
}
