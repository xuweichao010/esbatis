package com.xwc.open.easybatis.core.support.impl;import com.xwc.open.easybatis.core.anno.table.Ignore;/** * 创建人：徐卫超 * 时间：2019/10/16 14:57 * 功能： * 备注： */public class DefaultPage {    @Ignore    private Integer pageNum = 1;    @Ignore    private Integer pageSize = 10;    public void setPage(Integer pageNum, Integer pageSize) {        this.pageNum = pageNum;        this.pageSize = pageSize;    }    public Integer getPageNum() {        if (pageNum == null || pageNum < 1) {            return 0;        }        return (pageNum - 1) * pageSize;    }    public void setPageNum(Integer pageNum) {        this.pageNum = pageNum;    }    public Integer getPageSize() {        if (pageSize == null || pageSize < 0 || pageSize > 1000) {            return 10;        }        return pageSize;    }}