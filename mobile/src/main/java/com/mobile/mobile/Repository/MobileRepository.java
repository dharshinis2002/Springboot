package com.mobile.mobile.Repository;

import com.mobile.mobile.Entity.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface MobileRepository extends JpaRepository<Mobile,Integer> {
//    @Query(value = "select * from mobile_details where product_names =:productName",nativeQuery = true)
//    Optional<Mobile> findByProductName(String productName);
//
//    @Query(value = "select * from mobile_details where product_price =:productPrice",nativeQuery = true)
//    Optional<Mobile>findByProductPrice(String productPrice);
//
//
//    @Query(value = "select * from mobile_details where product_names =:productName",nativeQuery = true)
//    Optional<Mobile>getAllProductName(String productName);
//
//
//    @Query(value = "select * from mobile_details where product_id =:id",nativeQuery = true)
//    String deletedById(Integer id);
//
//
//    @Query(value = "select * from mobile_details where product_names like %:productName%",nativeQuery = true)
//    List<Mobile>findAll(String productName);
//
//    @Query(value = "select * from mobile_details where product_colour like:productColour%",nativeQuery = true)
//    List<Mobile>findAll1(String productColour);

//    hibernate query

    @Query(value = "select M from Mobile M where  M.productName =:productName")
    List<Mobile> findByProductName(String productName);

}
