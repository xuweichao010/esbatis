package com.xwc.open.easy.example;import com.xwc.open.easy.example.dao.UserMapper;import com.xwc.open.easy.example.entity.User;import com.xwc.open.easy.example.entity.UserLogic;import org.junit.Test;import org.junit.runner.RunWith;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.test.context.SpringBootTest;import org.springframework.test.context.junit4.SpringRunner;import java.util.ArrayList;/** * 创建人：徐卫超 * 时间：2019/8/3 15:58 * 功能：测试主键功能 * 备注： */@RunWith(SpringRunner.class)@SpringBootTest(classes = Application.class)public class TestPrimayKey {    @Autowired    private UserMapper userMapper;    /**     * 测试根据主键查询     */    @Test    public void primaryKeySelect() {        User user = userMapper.selectKey("37bd0225cc94400db744aac8dee8a001");        System.out.println("EasyBatis查询结果: " + (user == null ? "未查询到结果" : user.toString()));    }    /**     * 测试单条插入自动生成UUID     */    @Test    public void insertUUID() {        User user = new User();        user.setName("xwc");        userMapper.insert(user);    }    /**     * 测试批量插入自动生成UUID     */    @Test    public void insertBatchUUID() {        User user = new User();        user.setName("xwc");        ArrayList<User> list = new ArrayList<>();        list.add(user);        user = new User();        user.setName("xwc1");        list.add(user);        userMapper.insertBatch(list);    }}