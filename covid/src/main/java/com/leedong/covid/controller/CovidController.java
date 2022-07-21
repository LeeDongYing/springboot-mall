package com.leedong.covid.controller;

import com.leedong.covid.model.CovidPeoples;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CovidController {
    @Autowired(required = false)
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;



    @GetMapping("/covidpeoples")
    public ResponseEntity<?> getCovidPeoples (){


        RestTemplate restTemplate =new RestTemplate();

        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity requestEntity = new HttpEntity<>(requestHeaders);

        ResponseEntity<CovidPeoples> getPeoples =restTemplate.exchange(
                "https://covid-19.nchc.org.tw/api/covid19?CK=covid-19@nchc.org.tw&querydata=5001&limited=連江縣",
                HttpMethod.GET,
                requestEntity,
                CovidPeoples.class
        );
        return ResponseEntity.status(HttpStatus.OK).body(getPeoples.getBody());
    }

}
