package com.xwc.open.easybatis.mysql.parser.select;

import com.xwc.open.easybatis.core.anno.table.Id;
import com.xwc.open.easybatis.core.anno.table.Table;
import com.xwc.open.easybatis.core.enums.IdType;
import lombok.Data;

/**
 * 作者：徐卫超 cc
 * 时间：2020/12/18
 * 描述：
 */
@Data
@Table("t_mysql_sql_source")
public class BaseSelectEntity {
    /**
     * 用户id
     */
    @Id(type = IdType.UUID)
    private String id;

    /**
     * 机构编码
     */
    private String orgCode;

    /**
     * 机构名称
     */
    private String orgName;

    /**
     * 用户名
     */
    private String name;

}
