package kr.hs.dgsw.calc_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calcController {

    @Autowired
    private calcService csv;

    @GetMapping("/calc/{num1}/{num2}/{symbol}")
    public String calc(@PathVariable float num1,
                       @PathVariable float num2,
                       @PathVariable char symbol){
        return Float.toString(csv.CalcProccess(num1,num2,symbol));
    }
}
