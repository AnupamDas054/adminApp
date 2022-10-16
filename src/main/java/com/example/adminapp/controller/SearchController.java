package com.example.adminapp.controller;

import com.example.adminapp.repository.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SearchController {

    @Autowired
    private InventoryRepo inventoryRepo;


    @GetMapping("/search")
    public String newSearch(@RequestParam("name") String name, Model model){
        model.addAttribute("inventory",inventoryRepo.findInventoryByName(name));
        return "inventory/list-inventory";
    }

}
