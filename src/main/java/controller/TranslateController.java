package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/translate")
public class TranslateController {
    private static Map<String, String> data = new HashMap<>();

    static {
        data.put("dog", "con cho");
        data.put("book", "quyen sach");
        data.put("pen", "cai but");
        data.put("chair", "cai ghe");
        data.put("table", "cai ban");
    }

    @PostMapping("")
    public ModelAndView getTranslatePage(String word) {
        ModelAndView modelAndView = new ModelAndView("translate");
        String result = data.get(word);
        if (result == null) {
            result = "word not found";
        }
        modelAndView.addObject("word",word);
        modelAndView.addObject("result", result);
        return modelAndView;
    }

    @GetMapping("")
    public ModelAndView getTranslatePage() {
        return new ModelAndView("translate");
    }
}
