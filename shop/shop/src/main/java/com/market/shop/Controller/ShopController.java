package com.market.shop.Controller;
import com.market.shop.Entity.ShopEntity;
import com.market.shop.Service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ShopController {
    @Autowired
    private ShopService shopService;

    @PostMapping("/save")
    private String save(@RequestBody ShopEntity shopEntity) {
      shopService.save(shopEntity);
        return "saved";

    }

    @PutMapping("/update")
    private String update(@RequestBody ShopEntity shopEntity) {
        shopService.save(shopEntity);
        return "updated";
    }


    @GetMapping("/get/{shopId}")
    private Optional<ShopEntity> getById(@PathVariable("shopId")Integer shopId) {
        return shopService.getById(shopId);


    } @GetMapping("/getAll")
    private List<ShopEntity> getAll(){
        return  shopService.getAll();
    }

    @DeleteMapping("/delete/{shopId}")
    private  String deleteById(@PathVariable("shopId")Integer shopId){
        return  shopService.deletedById(shopId);

    }
}

