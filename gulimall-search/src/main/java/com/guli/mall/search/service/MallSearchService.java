package com.guli.mall.search.service;


import com.guli.mall.search.vo.SearchParam;
import com.guli.mall.search.vo.SearchResult;

/**
 * @description:
 * @author: Mr_L
 * @create: 2021/1/8 1:26
 **/
public interface MallSearchService {

    /**
     * @description:
     * @param param  检索的所有参数
     * @return 返回检索的结果,里面包含页面需要的所有信息
     */
    SearchResult search(SearchParam param);
}
