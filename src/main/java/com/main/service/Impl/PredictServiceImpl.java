package com.main.service.Impl;

import com.main.controller.model.IllReq;
import com.main.controller.model.RateReq;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@Service
@Slf4j
public class PredictServiceImpl {

    public String ill(IllReq req) {

        log.info(req.toString());
        String ret = "0";
        try{
            String[] cmd = {
                    "python3",
                    "src/main/resources/predict-tools/ill.py",
                    req.getPregnancies(),
                    req.getGlucose(),
                    req.getBloodPressure(),
                    req.getSkinThickness(),
                    req.getInsulin(),
                    req.getBmi(),
                    req.getDiabetesPedigreeFunction(),
                    req.getAge()
            };
            ProcessBuilder pb = new ProcessBuilder(cmd);
            Process p = pb.start();
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String curLine;
            while((curLine = in.readLine()) != null) {
                log.info(curLine);
                if(curLine != null) {
                    ret = curLine;
                }
            }
            return ret;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ret;
    }

    public String rate(RateReq req) {

        log.info(req.toString());
        String rate = "0";
        try{
            String[] cmd = {
                    "python3",
                    "src/main/resources/predict-tools/rate.py",
                    req.getAge(),
                    req.getSex(),
                    req.getBmi(),
                    req.getMap(),
                    req.getTc(),
                    req.getLdl(),
                    req.getHdl(),
                    req.getTch(),
                    req.getLtg(),
                    req.getGlu()
            };
            ProcessBuilder pb = new ProcessBuilder(cmd);
            Process p = pb.start();
            BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String curLine;
            while((curLine = in.readLine()) != null) {
                log.info(curLine);
                if(curLine != null) {
                    rate = curLine;
                }
            }
            return rate;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rate;
    }

}
