package cn.zhipingok.sketch.service;

import cn.zhipingok.sketch.common.BaseService;
import cn.zhipingok.sketch.model.SvsInstance;

import java.util.List;

public interface SvsInstnceService extends BaseService {
     SvsInstance get(long id);
     List<SvsInstance> getList();
     void create(SvsInstance instance);
     void update(long id,String name);
     void delete(long id);
     void start(SvsInstance instance);
     void start(long instanceId);
     void stop(SvsInstance instance);
     void stop(long instanceId);
}
