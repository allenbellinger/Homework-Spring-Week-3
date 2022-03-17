package com.promineotech.jeep.controller;

import java.util.List;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;
import com.promineotech.jeep.service.JeepSalesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DefaultJeepSalesController implements JeepSalesController{
    @Autowired
    private JeepSalesService jeepSalesService;

    @GetMapping
    @Override
    public List<Jeep> fetchJeeps(JeepModel model, String trim) {
        log.info("model={}, trim={}", model, trim);
        return jeepSalesService.fetchJeeps(model, trim);
    }
}
