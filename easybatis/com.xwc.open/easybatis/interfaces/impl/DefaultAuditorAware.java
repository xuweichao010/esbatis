package com.xwc.open.easybatis.interfaces.impl;import com.xwc.open.easybatis.interfaces.AuditorAware;import java.util.Date;/** * 创建人：徐卫超 * 时间：2019/9/10 11:05 * 功能： * 备注： */public class DefaultAuditorAware implements AuditorAware {    @Override    public Object id() {        return "xwcID";    }    @Override    public Object name() {        return "xwc";    }    @Override    public Object time() {        return new Date();    }}