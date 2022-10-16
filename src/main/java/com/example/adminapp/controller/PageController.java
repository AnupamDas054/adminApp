package com.example.adminapp.controller;

import com.example.adminapp.entity.Inventory;
import com.example.adminapp.repository.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class PageController {
    @Autowired
    private InventoryRepo inventoryRepo;

    @GetMapping("/")
    public ModelAndView main() {
        ModelAndView mav = new ModelAndView("index");
        List<Inventory> list =inventoryRepo.findAll();
        int monitor = 0, keyboard = 0, mouse = 0;
        int totalProducts = 0;
        for(Inventory inv: list)
        {
            if(inv.getName().equals("monitor")){
                monitor+=inv.getQuantity();
            } else if (inv.getName().equals("mouse")) {
                mouse+=inv.getQuantity();
            }
            else keyboard+=inv.getQuantity();
            totalProducts+= inv.getQuantity();
        }
        mav.addObject("mouse",mouse);
        mav.addObject("monitor", monitor);
        mav.addObject("keyboard",keyboard);
        mav.addObject("totalProducts", totalProducts);
        System.out.println(mav);
        return mav;

    }
}