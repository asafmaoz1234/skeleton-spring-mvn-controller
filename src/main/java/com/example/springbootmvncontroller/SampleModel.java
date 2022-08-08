package com.example.springbootmvncontroller;

import org.springframework.stereotype.Service;

@Service
public class SampleModel {

    public Integer get() {
        System.out.println("in get");
        return 10;
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
