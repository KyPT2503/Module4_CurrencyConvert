package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/convert")
public class CurrencyController {
    @PostMapping("")
    public ModelAndView postConvert(String number, String rate) {
        int number_ = Integer.parseInt(number);
        int rate_ = Integer.parseInt(rate);
        int result = number_ * rate_;
        ModelAndView modelAndView = new ModelAndView("convert");
        modelAndView.addObject("number", number);
        modelAndView.addObject("rate", rate);
        modelAndView.addObject("result", result);
        return modelAndView;
    }

    @GetMapping("")
    public ModelAndView convertPage() {
        return new ModelAndView("convert");
    }
}
