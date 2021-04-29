package com.xwc.open.easybatis.core.model.table;import com.xwc.open.easybatis.core.enums.AuditorType;import org.apache.ibatis.mapping.SqlCommandType;/** * 创建人：徐卫超 * 时间：2019/8/3 17:23 * 功能：审计列信息 * 备注： */public class AuditorMapping extends Mapping {    private AuditorType type;    public AuditorMapping(Mapping columnMeta, AuditorType type) {        super(columnMeta);        this.type = type;        this.setInsertIgnore(false);        if (type.command() != SqlCommandType.UPDATE) {            this.setUpdateIgnore(true);        }    }    public AuditorType getType() {        return type;    }}