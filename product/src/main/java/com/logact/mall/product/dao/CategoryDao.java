package com.logact.mall.product.dao;

import com.logact.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author logact
 * @email logact@qq.com
 * @date 2020-04-01 21:15:40
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
