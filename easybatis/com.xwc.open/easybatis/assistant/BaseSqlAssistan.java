package com.xwc.open.easybatis.assistant;import com.xwc.open.easybatis.anno.condition.Count;import com.xwc.open.easybatis.anno.condition.Distinct;import com.xwc.open.easybatis.interfaces.SyntaxTemplate;import com.xwc.open.easybatis.meta.Attribute;import java.util.List;/** * 创建人：徐卫超 * 时间：2019/9/6 13:44 * 功能： * 备注： */public class BaseSqlAssistan {    public String selectCloums(List<Attribute> list, Count count, Distinct distinct) {        StringBuilder sb = new StringBuilder();        list.forEach(attr -> sb.append(", ").append(attr.getColunm()));        String cloums = sb.substring(1);        if (distinct != null) {            if (distinct.value().equals("*")) {                cloums =  SyntaxTemplate.DISTINCT + cloums;            }else {                cloums =  SyntaxTemplate.DISTINCT + distinct.value();            }        }        if (count != null) {            if (distinct != null) {                cloums = SyntaxTemplate.COUNT + "( " + cloums + ") ";            } else if (count.value().equals("*")) {                return "COUNT(*) ";            } else {                return "COUNT( " + count.value() + ") ";            }        }        return cloums+" ";    }    public String insertCloums(List<Attribute> list) {        StringBuilder sb = new StringBuilder();        list.forEach(attr -> sb.append(", ").append(attr.getColunm()));        return sb.substring(1);    }    public String insertField(List<Attribute> list, String item) {        StringBuilder sb = new StringBuilder();        list.forEach(attr -> sb.append(", ").append(attr.getBatisField(item)));        return sb.substring(1);    }}