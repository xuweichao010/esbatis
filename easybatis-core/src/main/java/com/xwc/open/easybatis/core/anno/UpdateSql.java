package com.xwc.open.easybatis.core.anno;

import java.lang.annotation.*;

/**
 * 创建人：徐卫超
 * 创建时间：2019/4/24  10:56
 * 业务：根据方法参数构建一个更新的XML SQL内容
 * 功能：
 */
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface UpdateSql {

    /**
     * query对象查询查询时dynamic 自动为true
     * @return
     */
    boolean dynamic() default false;

    /**
     * @return A database id that correspond this statement
     * @since 3.5.5
     */
    String databaseId() default "";
}
