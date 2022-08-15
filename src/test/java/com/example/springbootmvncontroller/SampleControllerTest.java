package com.example.springbootmvncontroller;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class SampleControllerTest {
    @Mock
    SampleModel sampleModel;

    @Spy
    @InjectMocks
    SampleController sampleController;

    @Test
    public void validGeAll_ListReturned() {
        ResponseEntity<List<Sample>> response = this.sampleController.getAllSamples();
        assertThat(response.getStatusCode(), is(equalTo(HttpStatus.OK)));
        verify(sampleModel, times(1)).getAll();
    }

    @Test
    public void validPut_okStatus() {
        ResponseEntity<Void> response = this.sampleController.putSample(buildSamplePayload(), 1);
        assertThat(response.getStatusCode(), is(equalTo(HttpStatus.OK)));
    }

    private SamplePayload buildSamplePayload() {
        SamplePayload samplePayload = new SamplePayload();
        samplePayload.setPayloadData("dummy payload");
        return samplePayload;
    }

}
