package com.example.searchinterface;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Resource {
    private String name;

    public Resource(String name) {
        this.name = name;
    }
}