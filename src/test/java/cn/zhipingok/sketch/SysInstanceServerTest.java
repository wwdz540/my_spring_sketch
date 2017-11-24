package cn.zhipingok.sketch;

import cn.zhipingok.sketch.model.SvsInstance;
import cn.zhipingok.sketch.service.SvsInstnceService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


public class SysInstanceServerTest extends SketchApplicationTests {

    @Autowired
    SvsInstnceService instnceService;

    @Test
    public void testSave(){
        for (int i=0;i<10;i++){
            SvsInstance s = new SvsInstance();
            s.setName("name"+i);
            instnceService.create(s);
            System.out.println(s.getId());
            Assert.assertEquals(s.getState(), SvsInstance.InState.CREATE);
        }
    }
}
