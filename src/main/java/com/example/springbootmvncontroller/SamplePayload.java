package com.example.springbootmvncontroller;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Service;

@Service
public class SamplePayload {
    @JsonProperty("payload_data")
    private String payloadData;

    public String getPayloadData() {
        return payloadData;
    }

    public void setPayloadData(String payloadData) {
        this.payloadData = payloadData;
    }

    @Override
    public String toString() {
        return "SamplePayload{" +
                "payloadData='" + payloadData + '\'' +
                '}';
    }
}
