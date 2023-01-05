package com.Relationship.relationship.Controller;

import com.Relationship.relationship.Entity.Consumer;
import com.Relationship.relationship.Service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerService consumerService;

    @PostMapping("/saveList")
    private String saveList(@RequestBody Consumer consumer) {
        consumerService.save(consumer);
        return "success";

    }
}






//  @GetMapping("/getAll")
 //   private List<Consumer> findAll(){
    //    return consumerRepository.findAll();
  //      }

//        @GetMapping("/getJoinInfo")
//    private List<OrderResponse> getJoinInformation(){
//    return consumerRepository.getJoinInformation();
//}



