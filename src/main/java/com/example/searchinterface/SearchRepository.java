package com.example.searchinterface;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SearchRepository {
    SearchRepository() {

    }

    public List<Resource> getAll() {
        List<Resource> resourceList = new ArrayList<>();
        resourceList.add(new Resource("1"));
        resourceList.add(new Resource("2"));
        resourceList.add(new Resource("3"));
        resourceList.add(new Resource("4"));

        return resourceList;
    }
}
