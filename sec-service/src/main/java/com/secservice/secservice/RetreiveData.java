
/*
############################################

@RestController Annotation does not working from Security Annotation 


############################################
*/



package com.secservice.secservice;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class RetreiveData {

    @RequestMapping("/myAPI")
    public String ReleaseData(){
        return "Username = Me !!!";
    }

    @GetMapping("/callAPI")
    public String getData(){
        String uri = "http://127.0.0.1:8080/myAPI";
        RestTemplate rtp = new RestTemplate();
        String data = rtp.getForObject(uri, String.class);
        return data;
    }
    
}
