package cn.zhipingok.sketch.common;

import java.io.Serializable;
import java.util.Date;

public class NormalGenericJpaDaoImple <T extends NormalEntity,ID extends Serializable>
        extends GenericJpaDaoImpl<T,ID>  implements GenericDao<T,ID>  {

    @Override
    public <S extends T> S save(S entity) {
        entity.setCreateAt(new Date());
        return super.save(entity);
    }

    @Override
    public <S extends T> S update(S entity) {
        entity.setUpdateAt(new Date());
        return super.update(entity);
    }
}
