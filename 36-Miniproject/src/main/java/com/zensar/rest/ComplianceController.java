package com.zensar.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.zensar.bean.Compliance;
import com.zensar.service.ComplianceService;



@RestController
public class ComplianceController {

@Autowired
ComplianceService service;

@PostMapping(value="/createRL")
public Compliance f1(@RequestBody Compliance co ) {
return this.service.createRL(co);

}
}