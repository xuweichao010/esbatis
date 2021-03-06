package com.xwc.open.easybatis.assistant.method;

import com.xwc.open.easybatis.assistant.model.User;
import com.xwc.open.easybatis.core.anno.SelectSql;
import com.xwc.open.easybatis.core.anno.condition.filter.IsNull;
import com.xwc.open.easybatis.core.support.EasyMapper;

/**
 * 作者：徐卫超 cc
 * 时间：2020/12/18
 * 描述：
 */
public interface MethodTestUserMapper extends EasyMapper<User, String> {

    @SelectSql
    Object find(String name, @IsNull("age_column") String age, ParseMethodParamQuery paramQuery);
}
