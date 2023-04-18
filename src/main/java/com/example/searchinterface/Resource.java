package com.example.searchinterface;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Resource {
    private String name;
    private String type;
    private String url;

    public Resource(String name, String type, String url) {
        this.name = name;
        this.type = type;
        this.url = url;
    }
}
