package com.example.springbootmvncontroller;

import org.springframework.stereotype.Service;

@Service
public class SampleModel {

    public Integer get() {
        return 10;
    }

    public void post(SamplePayload samplePayload) {
    }

    public void put(SamplePayload samplePayload, Integer itemId) {
    }

    public void delete(Integer itemId) {
    }
}
