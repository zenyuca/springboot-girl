package club.zenyuca.service;

import club.zenyuca.entity.Girl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)        // 底层基于 JUnit
@SpringBootTest     // 启动整个工程
public class GirlServiceTest {

    @Autowired
    private GirlService girlService;

    @Test
    public void findOne() throws Exception {
        Girl girl = this.girlService.findOne(1);
        Assert.assertEquals(new Integer(19), girl.getAge());
    }

}