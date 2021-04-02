package com.main.controller;

import com.main.controller.model.illReq;
import com.main.controller.model.rateReq;
import com.main.service.PredictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/predict")
public class PredictController {

    @Autowired
    PredictService predictService;

    @RequestMapping("/ill")
    public String ill(@RequestBody illReq req) {

        return predictService.ill(req);
    }

    @RequestMapping("/rate")
    public String rate(@RequestBody rateReq req) {

        return predictService.rate(req);
    }


}
