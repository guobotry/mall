package com.macro.mall.search.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.macro.mall.search.domain.EsQuestion;

/**
 * 商品ES操作类 Created by macro on 2018/6/19.
 */
public interface EsQuestionRepository extends ElasticsearchRepository<EsQuestion, Long> {
	/**
	 * 搜索查询
	 *
	 * @param title 题目
	 * @return
	 */
	Page<EsQuestion> findByTitle(String title, Pageable page);

}
