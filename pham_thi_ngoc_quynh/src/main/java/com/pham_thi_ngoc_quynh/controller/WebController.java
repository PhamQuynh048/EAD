package com.pham_thi_ngoc_quynh.controller;


import com.pham_thi_ngoc_quynh.entity.BookEntity;
import com.pham_thi_ngoc_quynh.entity.PublisherEntity;
import com.pham_thi_ngoc_quynh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@Controller
public class WebController {

    @Autowired
    UserService userService;

    @GetMapping({"/", "/index"})
    public String index() {
        return "index";
    }


    @GetMapping({"/table"})
        public ModelAndView listUser(@RequestParam("s") Optional<String> s, Pageable pageable) {
            Page<BookEntity> users;
            if(s.isPresent()){
                users = userService.findAll(pageable);
            } else {
                users = userService.findAll(pageable);
            }
            ModelAndView modelAndView = new ModelAndView("tables");
            modelAndView.addObject("users", users);
            return modelAndView;
    }

    @GetMapping({"/add"})
    public String detail(Model model) {
        BookEntity bookEntity = new BookEntity();
        model.addAttribute("user", bookEntity);

        List<PublisherEntity> publisherEntity  = userService.getAllPublisher();
        model.addAttribute("publisher", publisherEntity);
        return "add";
    }

    @PostMapping("/save")
    public RedirectView addUser(@ModelAttribute BookEntity bookEntity, Model model) {
        userService.createUser(bookEntity);
        return new RedirectView("/table");
    }



}
