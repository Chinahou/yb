package test;

import com.yb.Application;
import com.yb.entity.User;
import com.yb.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @author kh
 * @date 2019/10/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class SampleTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

}