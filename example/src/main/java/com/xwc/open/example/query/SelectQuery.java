package com.xwc.open.example.query;import com.xwc.open.easybatis.anno.condition.filter.*;import com.xwc.open.easybatis.anno.table.Ignore;import com.xwc.open.easybatis.interfaces.Page;import lombok.Data;import java.util.List;/** * 创建人：徐卫超 * 时间：2019/10/15 10:29 * 功能： * 备注： */@Datapublic class SelectQuery implements Page {    private String code;    @NotEqual("code")    private String notEqualCode;    @IsNull("parent_code")    private Boolean parentCodeIsNull;    @NotNull("parent_code")    private Boolean parentCodeNotNull;    @In("code")    private List<String> inCode;    @NotIn("code")    private List<String> notInCode;    @Like("code")    private String likeCode;    @RightLike("code")    private String rightLikeCode;    @LeftLike("code")    private String leftLikeCode;    @GreaterThan("employeesNum")    private Integer gtEmployeesNum;    @GreaterThanEqual("employeesNum")    private Integer gtqEmployeesNum;    @LessThan("employeesNum")    private Integer ltEmployeesNum;    @LessThanEqual("employeesNum")    private Integer ltqEmployeesNum;    @OrderBy(byValue = true)    private String orderEmployeesNum;    @Ignore    private Integer pageNum = 1;    @Ignore    private Integer pageSize = 100;    @Override    public Integer getPageStart() {        if (pageNum == null || pageNum < 1) {            return 0;        }        return (pageNum - 1) * pageSize;    }    @Override    public Integer getPageOffset() {        if (pageSize == null || pageSize < 0) {            return 10;        }        return pageSize;    }}