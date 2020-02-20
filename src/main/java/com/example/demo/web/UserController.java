package com.example.demo.web;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register  (HttpServletRequest request) {
        try {
            String userName = request.getParameter("username");
            String password = request.getParameter("password");

            User user = new User();
            user.setUsername(userName);
            user.setPassword(password);
            return userService.insertUser(user)+"";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @RequestMapping("/findAllUser")
    public List<User> findAllUser() {
        return userService.selectUser();
    }
}
