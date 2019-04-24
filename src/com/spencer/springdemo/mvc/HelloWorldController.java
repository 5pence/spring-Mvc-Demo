package com.spencer.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    // need a controller method to show the initial HTML form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // need a controller to process the HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        // read the request param
        String name = request.getParameter("studentName");

        // convert to caps
        name = name.toUpperCase().trim();

        // create the message
        String result = "Hi there " + name;

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }
    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String name, Model model) {

        // convert to caps
        name = name.toUpperCase().trim();

        // create the message
        String result = "v3: So whata you know " + name;

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }


}
