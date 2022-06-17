package br.com.mcv.calculadora.controller;

import br.com.mcv.calculadora.dto.RequestCalcDTO;
import br.com.mcv.calculadora.model.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {
    @RequestMapping(value = "/calculator", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/calculator", method = RequestMethod.POST)
    public String calc(RequestCalcDTO request, Model model) {
        double result = Calculator.calculate(request);
        model.addAttribute("result", result);
        return "index";
    }
}
