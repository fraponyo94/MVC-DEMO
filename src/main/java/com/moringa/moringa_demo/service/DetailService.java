package com.moringa.moringa_demo.service;

import com.moringa.moringa_demo.model.Detail;
import org.springframework.stereotype.Service;

@Service
public class DetailService {

    public String getName(Detail detail){
        return String.format("%s %s",detail.getFirstName(),detail.getLastName());
    }
}
