package serv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/contact")
public class ContactsController {
    
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getContact(ModelMap model){
        System.out.println("get");
        return "hello";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addContact(String s){
        System.out.println("set");
    }
}
