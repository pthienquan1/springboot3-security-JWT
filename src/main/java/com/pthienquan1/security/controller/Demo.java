package com.pthienquan1.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by quan0
 * Date 5/31/2023 - 2:24 PM
 * Description: ...
 */
@RestController
@RequestMapping(value="/api/v1/demo-controller")
public class Demo {
    @GetMapping()
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello im demo test");
    }
}
