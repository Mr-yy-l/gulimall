package com.guli.mall.search.service;

import com.guli.mall.common.to.es.SkuEsModel;

import java.io.IOException;
import java.util.List;

/**
 * @description:
 * @author: Mr_L
 * @create: 2021/1/8 1:26
 **/

public interface ProductSaveService {

    boolean productStatusUp(List<SkuEsModel> skuEsModels) throws IOException;

}
