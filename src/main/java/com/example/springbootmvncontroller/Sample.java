package com.example.springbootmvncontroller;

public class Sample {
    private Integer id;
    private String data;

    public Sample(Integer id, String data) {
        this.id = id;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "id=" + id +
                ", data='" + data + '\'' +
                '}';
    }
}
