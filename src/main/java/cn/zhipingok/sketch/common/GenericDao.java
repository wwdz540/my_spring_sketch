package cn.zhipingok.sketch.common;

import java.io.Serializable;
import java.util.List;

public interface GenericDao <T extends BaseEntity, ID extends Serializable>  extends BaseDao{

    <S extends T> S save(S entity);

    <S extends T> S update(S entity);

    <S extends T> S find(ID id);

    void remove(ID id);

    <S extends T> void remove(S entity);

    <S extends T> List<S> find();

    <S extends T> Query<S> getQuery();
}
