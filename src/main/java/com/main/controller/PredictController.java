package com.main.controller;

import com.main.controller.model.IllReq;
import com.main.controller.model.RateReq;
import com.main.service.Impl.PredictServiceImpl;
import com.main.utils.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/predict")
public class PredictController {

    @Autowired
    PredictServiceImpl predictServiceImpl;

    @RequestMapping("/ill")
    public ResponseMessage ill(@RequestBody IllReq req) {

        //1: 有风险，0: 无风险
        return ResponseMessage.newOkInstance(predictServiceImpl.ill(req),"预测成功");
    }

    @RequestMapping("/rate")
    public ResponseMessage rate(@RequestBody RateReq req) {

        return ResponseMessage.newOkInstance(predictServiceImpl.rate(req),"预测成功");
    }


}
