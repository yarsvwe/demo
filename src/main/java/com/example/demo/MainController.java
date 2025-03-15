package com.example.demo;
import org.apache.logging.log4j.message.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/main")
public class MainController {
    @GetMapping("/main")
    public ResponseEntity<HashMap<String, String>> main(){
        HashMap<String, String> hashmap = new HashMap<>();

        hashmap.put("message", "goodbye world");
        return ResponseEntity.ok(hashmap);
    }
}
