package com.xwc.open.easybatis.meta;import com.xwc.open.easybatis.enums.ConditionType;import com.xwc.open.easybatis.interfaces.SyntaxTemplate;import java.util.ArrayList;import java.util.Collections;import java.util.Comparator;import java.util.List;/** * 创建人：徐卫超 * 时间：2019/8/3 17:51 * 功能： * 备注： */public class ConditionMate {    private SyntaxTemplate syntaxTemplate;    private List<ConditionAttribute> conditionAttributeList = new ArrayList<>(5);    private OrderConditionAttribute order;    private Attribute start;    private Attribute offset;    private List<Attribute> updateAttributeList = new ArrayList<>(5);    private LoglicAttribute loglic;    public void addOrder(OrderConditionAttribute order) {        this.order = order;    }    public OrderConditionAttribute getOrder() {        return this.order;    }    public ConditionMate(SyntaxTemplate syntaxTemplate) {        this.syntaxTemplate = syntaxTemplate;    }    public LoglicAttribute loglic() {        return loglic;    }    public void setLoglic(LoglicAttribute loglic) {        this.loglic = loglic;    }    public List<ConditionAttribute> queryList() {        Collections.sort(conditionAttributeList, Comparator.comparingInt(ConditionAttribute::index));        //处理In查询条件        if (conditionAttributeList.size() == 1) {            ConditionAttribute conditionAttribute = conditionAttributeList.get(0);            ConditionType type = conditionAttribute.getType();            if (type == ConditionType.IN || type == ConditionType.NOT_IN) {                conditionAttribute.setField("list");            }        }        return conditionAttributeList;    }    public void queryClear() {        conditionAttributeList.clear();    }    public List<Attribute> updateAttributeList() {        return this.updateAttributeList;    }    public void addQuery(ConditionAttribute condition) {        this.conditionAttributeList.add(condition);    }    public void addUpdte(Attribute condition) {        this.updateAttributeList.add(condition);    }    public void addPage(Attribute start, Attribute offset) {        if (start != null) this.start = start;        if (offset != null) this.offset = offset;    }    public boolean isPage() {        return start != null && offset != null;    }    public Attribute getStart() {        return start;    }    public Attribute getOffset() {        return offset;    }}