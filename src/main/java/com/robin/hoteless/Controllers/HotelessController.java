package com.robin.hoteless.Controllers;

import com.robin.hoteless.App.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HotelessController {

    @Autowired
    Authentication authentication;

    @RequestMapping(value = "/doCoolStuff",
            method = RequestMethod.GET,
            consumes = MediaType.APPLICATION_JSON_VALUE)

    public @ResponseBody String getAuthStuff() {
        return authentication.showAuth();
    }
}
