package cn.zhipingok.sketch.service.impl;

import cn.zhipingok.sketch.dao.SvsInstanceDao;
import cn.zhipingok.sketch.model.SvsInstance;
import cn.zhipingok.sketch.service.SvsInstnceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.ws.ServiceMode;
import java.util.List;

@Service
public class SvsInstanceServiceImpl implements SvsInstnceService {

    @Autowired
    private SvsInstanceDao svsInstanceDao;


    @Override
    @Transactional
    public SvsInstance get(long id) {
        return svsInstanceDao.find(id);
    }

    @Override
    @Transactional
    public List<SvsInstance> getList() {
        return svsInstanceDao.find();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void create(SvsInstance instance) {
        svsInstanceDao.save(instance);
    }

    @Override
    public void update(long id, String name) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void start(SvsInstance instance) {

    }

    @Override
    public void start(long instanceId) {

    }

    @Override
    public void stop(SvsInstance instance) {

    }

    @Override
    public void stop(long instanceId) {

    }
}
