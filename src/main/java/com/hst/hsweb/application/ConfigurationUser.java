package com.hst.hsweb.application;

import org.seedstack.coffig.Config;

@Config("someConfig")
public class ConfigurationUser {

    String[] myArray;

    public void showConfig() {
        if ( myArray != null && myArray.length > 0) {
            System.out.print("hst: " + myArray[0]);
        } else {
            System.out.print("hst: object not initialized yet");
        }
    }
}
