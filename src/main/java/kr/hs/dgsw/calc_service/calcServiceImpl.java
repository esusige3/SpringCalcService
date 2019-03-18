package kr.hs.dgsw.calc_service;

import org.springframework.stereotype.Service;

@Service
public class calcServiceImpl implements calcService {
    @Override
    public float CalcProccess(float num1, float num2, char symbol) {
        float result;
        if(symbol=='+'){
            result = num1+num2;
        }
        else if(symbol=='-'){
            result = num1 - num2;
        }
        else if (symbol=='÷'){
            result = num1/num2;
        }
        else if(symbol=='x'){
            result = num1*num2;
        }else{
            result = 0;
        }
        return result;
    }
}
