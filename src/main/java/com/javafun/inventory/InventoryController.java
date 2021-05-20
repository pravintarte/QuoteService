package com.javafun.inventory;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @PostMapping("/check")
    public Boolean isAvailable(@RequestBody Inventory inventory) throws Exception {
        Thread.sleep(15000);
        if(inventory.productName.equalsIgnoreCase("Soap")&& inventory.unit<10){
            return Boolean.TRUE;
        }else if(inventory.productName.equalsIgnoreCase("Rice")&& inventory.unit<10){
            return Boolean.TRUE;
        }else {
            throw new Exception("Internal server Error");
        }
    }






}
