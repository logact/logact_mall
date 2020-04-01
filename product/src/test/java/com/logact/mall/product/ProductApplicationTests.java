package com.logact.mall.product;

import com.logact.mall.product.entity.BrandEntity;
import com.logact.mall.product.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: logact
 * @date: Created in 2020/4/1 18:45
 * @description:
 */
@SpringBootTest
@Slf4j
public class ProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Test
     void test(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("");
        brandEntity.setName("huawei");
        brandService.save(brandEntity);
        log.info("保存成功："+brandEntity);
    }
}
