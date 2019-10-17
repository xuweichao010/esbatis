package com.xwc.open.easy.batis.anno;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * 创建人：徐卫超
 * 创建时间：2019/4/29  14:30
 * 业务：
 * 功能：
 */
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SelectSql {
    @AliasFor("colums")
    String value() default "";

    @AliasFor("value")
    String colums() default "";

    /**
     * query对象查询查询时dynamic 自动为true
     * @return
     */
    boolean dynamic() default false;
}
