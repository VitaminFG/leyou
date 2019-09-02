package com.leyou.mapper;

import com.leyou.item.pojo.Category;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.additional.idlist.SelectByIdListMapper;


public interface CategoryMapper extends Mapper<Category>,SelectByIdListMapper<Category,Long> {



}
