package com.example.springbootmvncontroller;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

public class SampleControllerTest {
    @Mock
    SampleModel sampleModel = mock(SampleModel.class);

    @Spy
    SampleController sampleController = spy(new SampleController(sampleModel));

    @Test
    public void validPut_createdStatus() {
        ResponseEntity<Void> response = this.sampleController.putSample(buildSamplePayload(), 1);
        assertThat(response.getStatusCode(), is(equalTo(HttpStatus.CREATED)));
    }

    private SamplePayload buildSamplePayload() {
        SamplePayload samplePayload = new SamplePayload();
        samplePayload.setPayloadData("dummy payload");
        return samplePayload;
    }

}
