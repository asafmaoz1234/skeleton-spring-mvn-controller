package com.example.springbootmvncontroller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SampleModel {

    public List<Sample> getAll() {
        System.out.println("in getAll");
        List<Sample> response = new ArrayList<>();
        response.add(new Sample(10, "data"));
        return response;
    }

    public Sample getOne(Integer id) {
        System.out.println("in getOne " + id);
        return new Sample(10, "data");
    }

    public void post(SamplePayload samplePayload) {
        System.out.println("in post, payload: " + samplePayload);
    }

    public void put(SamplePayload samplePayload, Integer itemId) {
        System.out.println("in put, payload: " + samplePayload + " id: "+ itemId);
    }

    public void delete(Integer itemId) {
        System.out.println("in delete, id: "+ itemId);
    }
}
