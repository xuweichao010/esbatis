package com.xwc.open.easy.example.dao;import com.xwc.open.easy.batis.anno.SelectSql;import com.xwc.open.easy.batis.anno.condition.Count;import com.xwc.open.easy.batis.interfaces.BaseMapper;import com.xwc.open.easy.example.entity.Org;import com.xwc.open.easy.example.query.SelectQuery;import org.apache.ibatis.annotations.Mapper;import java.util.List;/** * 创建人：徐卫超 * 时间：2019/8/3 15:52 * 功能： * 备注： */@Mapperpublic interface OrgMapper extends BaseMapper<Org, String> {    @SelectSql    List<Org> query(SelectQuery selectQuery);    @Count("code")    @SelectSql    Long count(SelectQuery selectQuery);}