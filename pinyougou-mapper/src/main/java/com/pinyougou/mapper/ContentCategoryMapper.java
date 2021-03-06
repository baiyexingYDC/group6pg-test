package com.pinyougou.mapper;

import tk.mybatis.mapper.common.Mapper;

import com.pinyougou.pojo.ContentCategory;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * ContentCategoryMapper 数据访问接口
 * @date 2019-03-28 15:41:54
 * @version 1.0
 */
public interface ContentCategoryMapper extends Mapper<ContentCategory>{

    void deleteAll(Serializable[] ids);

}