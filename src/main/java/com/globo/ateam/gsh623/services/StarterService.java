package com.globo.ateam.gsh623.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class StarterService {

    @Autowired
    public StarterService(JmeterService jmeterService) throws IOException {
        jmeterService.start();
    }
}
