package anyu.springbootsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class KungfuController {
    final String PREFIX = "pages/";

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return PREFIX + "login";
    }

    @GetMapping("/level1/{path}")
    public String getLowKunfu(@PathVariable("path") String path) {
        return PREFIX + "level1/kongfu" + path;
    }

    @GetMapping("/level2/{path}")
    public String getMedKunfu(@PathVariable("path") String path) {
        return PREFIX + "level2/kongfu" + path;
    }

    @GetMapping("/level3/{path}")
    public String getHigKunfu(@PathVariable("path") String path) {
        return PREFIX + "level3/kongfu" + path;
    }
}
