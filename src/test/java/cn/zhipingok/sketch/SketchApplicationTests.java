package cn.zhipingok.sketch;

import cn.zhipingok.sketch.dao.SvsInstanceDao;
import cn.zhipingok.sketch.model.SvsInstance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SketchApplicationTests {

	@Autowired
	SvsInstanceDao svsInstanceDao;

	@Test
	public void contextLoads() {

	}


	@Test
	@Transactional
	public void test1(){
//		svsInstanceRep.save(new SvsInstance());
//		svsInstanceRep.save(new SvsInstance());
//		svsInstanceRep.save(new SvsInstance());
//		svsInstanceRep.save(new SvsInstance());
//
//		List<SvsInstance> list = svsInstanceRep.find();
//
//		list.stream().forEach(s-> System.out.println(s.getId()));
		svsInstanceDao.save(new SvsInstance());
		svsInstanceDao.save(new SvsInstance());
		svsInstanceDao.save(new SvsInstance());
		svsInstanceDao.save(new SvsInstance());

		//svsInstanceDao.find().stream().forEach(s-> System.out.println(s.));
		svsInstanceDao.find().stream().forEach(s-> System.out.println(s.getCreateAt()));
	}
}
