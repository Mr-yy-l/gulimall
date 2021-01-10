package com.guli.mall.product.web;


import com.guli.mall.product.service.SkuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @description:
 * @author: Mr_L
 * @create: 2021/1/8 15:22
 **/
@Controller
public class ItemController {

    @Autowired
    SkuInfoService skuInfoService;

    /**
     * 展示当前sku的详情
     * @param skuId
     * @return
     */
//    @GetMapping("/{skuId}.html")
//    public String skuItem(@PathVariable("skuId") Long skuId, Model model) throws ExecutionException, InterruptedException {
//
//        System.out.println("准备查询"+skuId+"详情");
//        SkuItemVo vo = skuInfoService.item(skuId);
//        model.addAttribute("item",vo);
//
//        return "item";
//    }
}