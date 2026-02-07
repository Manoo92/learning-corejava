package com.careerit.cj.day11;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class AppConfig {

    private static ObjectMapper obj = null;

    private AppConfig() {

    }

    public static ObjectMapper getObjectMapper() {
        if (obj == null) {
            obj = new ObjectMapper();
            obj.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        }
        return obj;
    }
}
