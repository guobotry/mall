package com.macro.mall.search.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.macro.mall.search.domain.EsProduct;
import com.macro.mall.search.domain.EsQuestion;

/**
 * 搜索系统中的商品管理自定义Dao
 * Created by macro on 2018/6/19.
 */
public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
    List<EsQuestion> getAllEsQuestionList();
}
