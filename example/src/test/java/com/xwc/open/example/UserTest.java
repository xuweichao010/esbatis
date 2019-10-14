package com.xwc.open.example;import com.xwc.open.example.dao.OrgMapper;import com.xwc.open.example.dao.UserMapper;import com.xwc.open.example.entity.Org;import com.xwc.open.example.entity.User;import org.apache.catalina.core.ApplicationContext;import org.junit.Test;import org.junit.runner.RunWith;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.boot.test.context.SpringBootTest;import org.springframework.test.context.junit4.SpringRunner;import java.util.ArrayList;/** * 创建人：徐卫超 * 时间：2019/8/3 15:58 * 功能： * 备注： */@RunWith(SpringRunner.class)@SpringBootTest(classes = Application.class)public class UserTest {    @Autowired    private UserMapper userMapper;    @Test    public void testPrimaryKeySelect() {        User user = userMapper.selectKey("37bd0225cc94400db744aac8dee8a001");        System.out.println("EasyBatis查询结果: " + (user == null ? "未查询到结果" : user.toString()));        /**         JDBC Connection [com.mysql.jdbc.JDBC4Connection@364fd4ae] will not be managed by Spring         ==>  Preparing: SELECT id, org_code, org_name, name, age, job FROM t_user WHERE id = ? AND valid = 0         2019-09-10 10:49:45.837  INFO 14708 --- [           main] c.x.o.esbatis.plugin.ParameterizePlugin  : ParameterizePlugin -> 拦截         ==> Parameters: 37bd0225cc94400db744aac8dee8a001(String)         <==    Columns: id, org_code, org_name, name, age, job         <==        Row: 37bd0225cc94400db744aac8dee8a001, 200, 总公司, 曹操, 50, 1         <==      Total: 1         Closing non transactional SqlSession [org.apache.ibatis.session.defaults.DefaultSqlSession@1c8f6c66]         */    }    @Test    public void testInsertUUID() {        User user = new User();        user.setName("xwc");        userMapper.insert(user);        /**         JDBC Connection [com.mysql.jdbc.JDBC4Connection@41b64020] will not be managed by Spring         ==>  Preparing: INSERT INTO t_user ( id, org_code, org_name, name, age, job, create_time, create_id, create_name, update_time, update_id, update_name) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)         2019-09-10 16:08:18.335  INFO 1584 --- [           main] c.x.o.esbatis.plugin.ParameterizePlugin  : ParameterizePlugin -> 拦截         ==> Parameters: b488aae1ec114b4cb82caf8ceec9262e(String), null, null, xwc(String), null, null, 2019-09-10 16:08:22.141(Timestamp), xwcID(String), xwc(String), 2019-09-10 16:08:22.141(Timestamp), xwcID(String), xwc(String)         <==    Updates: 1         Closing non transactional SqlSession [org.apache.ibatis.session.defaults.DefaultSqlSession@7e1ffe70]         */    }    @Test    public void testInsertBatchUUID() {        User user = new User();        user.setName("xwc");        ArrayList<User> list = new ArrayList<>();        list.add(user);        user = new User();        user.setName("xwc1");        list.add(user);        userMapper.insertBatch(list);        /**         JDBC Connection [com.mysql.jdbc.JDBC4Connection@31834a2b] will not be managed by Spring         ==>  Preparing: INSERT INTO t_user ( id, org_code, org_name, name, age, job, create_time, create_id, create_name, update_time, update_id, update_name) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) , ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)         2019-09-10 16:10:07.074  INFO 15900 --- [           main] c.x.o.esbatis.plugin.ParameterizePlugin  : ParameterizePlugin -> 拦截         ==> Parameters: 121324cd2596426fb2ca9f31d61b4c66(String), null, null, xwc(String), null, null, 2019-09-10 16:10:07.076(Timestamp), xwcID(String), xwc(String), 2019-09-10 16:10:07.076(Timestamp), xwcID(String), xwc(String), 4bc1f616b56547cfa8098562afd140a6(String), null, null, xwc1(String), null, null, 2019-09-10 16:10:07.076(Timestamp), xwcID(String), xwc(String), 2019-09-10 16:10:07.076(Timestamp), xwcID(String), xwc(String)         <==    Updates: 2         Closing non transactional SqlSession [org.apache.ibatis.session.defaults.DefaultSqlSession@385d819]         */    }    @Test    public void testUpdate() {        User user = new User();        user.setName("xwc");        userMapper.insert(user);        user.setName("小红");        userMapper.update(user);        /**         JDBC Connection [com.mysql.jdbc.JDBC4Connection@6b37df8e] will not be managed by Spring         ==>  Preparing: INSERT INTO t_user ( id, org_code, org_name, name, age, job, create_time, create_id, create_name, update_time, update_id, update_name) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)         ==> Parameters: e0f9e6b8992c41db926f33c09c59ddf0(String), null, null, xwc(String), null, null, 2019-09-10 16:13:32.515(Timestamp), xwcID(String), xwc(String), 2019-09-10 16:13:32.515(Timestamp), xwcID(String), xwc(String)         <==    Updates: 1         Closing non transactional SqlSession [org.apache.ibatis.session.defaults.DefaultSqlSession@498c535d]         Creating a new SqlSession         SqlSession [org.apache.ibatis.session.defaults.DefaultSqlSession@15e1f8fe] was not registered for synchronization because synchronization is not active         JDBC Connection [com.mysql.jdbc.JDBC4Connection@6b37df8e] will not be managed by Spring         ==>  Preparing: UPDATE t_user SET org_code=?, org_name=?, name=?, age=?, job=?, update_time=?, update_id=?, update_name=? WHERE id = ? AND valid = 0         ==> Parameters: null, null, 小红(String), null, null, 2019-09-10 16:13:32.515(Timestamp), xwcID(String), xwc(String), e0f9e6b8992c41db926f33c09c59ddf0(String)         <==    Updates: 0         Closing non transactional SqlSession [org.apache.ibatis.session.defaults.DefaultSqlSession@15e1f8fe]         */    }    @Test    public void testDelete() {        User user = new User();        user.setName("xwc");        userMapper.insert(user);        userMapper.delete(user.getId());    }}