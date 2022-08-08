package com.example.springbootmvncontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/samplepath")
public class SampleController {

    private final SampleModel sampleModel;

    public SampleController(SampleModel sampleModel) {
        this.sampleModel = sampleModel;
    }

    @GetMapping
    public ResponseEntity<Integer> getSample(){
        Integer response = this.sampleModel.get();
        return ResponseEntity.ok().body(response);
    }

    @PostMapping
    public ResponseEntity<Void> postSample(@RequestBody SamplePayload samplePayload){
        this.sampleModel.post(samplePayload);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{itemId}")
    public ResponseEntity<Void> putSample(@RequestBody SamplePayload samplePayload, @PathVariable Integer itemId){
        this.sampleModel.put(samplePayload, itemId);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{itemId}")
    public ResponseEntity<Void> deleteSample(@PathVariable Integer itemId){
        this.sampleModel.delete(itemId);
        return ResponseEntity.ok().build();
    }
}
