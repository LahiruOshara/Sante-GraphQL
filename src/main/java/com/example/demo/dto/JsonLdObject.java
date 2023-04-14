package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class JsonLdObject {
    private Map<String, Object> properties;

    public JsonLdObject() {
        this.properties = new HashMap<>();
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }
}
