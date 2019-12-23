package com.xwc.open.easybatis.anno.auditor;import com.xwc.open.easybatis.enums.AuditorType;import org.springframework.core.annotation.AliasFor;import java.lang.annotation.*;/** * 创建人：徐卫超 * 时间：2019/8/3 15:13 * 功能： * 备注： */@Documented@Target({ElementType.FIELD})@Retention(RetentionPolicy.RUNTIME)@Inherited@Auditor(type = AuditorType.CREATE_TIME)public @interface CreateTime {    /**     * 关联的数据库的列  默认使用属性名     *     * @return     */    @AliasFor("value")    String colum() default "";    /**     * 关联的数据库的列  默认使用属性名     *     * @return     */    @AliasFor("colum")    String value() default "";    /**     * 查询时 隐藏该字段的查询     *     * @return     */    boolean hidden() default true;}