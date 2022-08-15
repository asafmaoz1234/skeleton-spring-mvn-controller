package com.example.springbootmvncontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/samplepath")
public class SampleController {

    private final SampleModel sampleModel;

    public SampleController(SampleModel sampleModel) {
        this.sampleModel = sampleModel;
    }

    @GetMapping
    public ResponseEntity<List<Sample>> getAllSamples(){
        List<Sample> response = this.sampleModel.getAll();
        return ResponseEntity.ok()
                .header("Content-Type","application/json")
                .body(response);
    }

    @GetMapping("/{itemId}")
    public ResponseEntity<Sample> getSample(@PathVariable Integer itemId){
        Sample response = this.sampleModel.getOne(itemId);
        return ResponseEntity.ok()
                .header("Content-Type","application/json")
                .body(response);
    }

    @PostMapping
    public ResponseEntity<Void> postSample(@RequestBody SamplePayload samplePayload){
        this.sampleModel.post(samplePayload);
        return ResponseEntity.status(HttpStatus.CREATED)
                .build();
    }

    @PutMapping("/{itemId}")
    public ResponseEntity<Void> putSample(@RequestBody SamplePayload samplePayload, @PathVariable Integer itemId){
        this.sampleModel.put(samplePayload, itemId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{itemId}")
    public ResponseEntity<Void> deleteSample(@PathVariable Integer itemId){
        this.sampleModel.delete(itemId);
        return ResponseEntity.ok().build();
    }
}
