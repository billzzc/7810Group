package com.main.service;

import com.main.controller.model.illReq;
import com.main.controller.model.rateReq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PredictService {

    public String ill(illReq req) {

        log.info(req.toString());
        String ret = "";
        /*

         */
        return ret;
    }

    public String rate(rateReq req) {

        log.info(req.toString());
        String rate = "";
        /*

         */
        return rate;
    }

}
