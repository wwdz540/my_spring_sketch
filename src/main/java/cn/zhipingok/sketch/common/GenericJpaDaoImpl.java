package cn.zhipingok.sketch.common;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class GenericJpaDaoImpl<T extends BaseEntity,ID extends Serializable>  implements GenericDao<T,ID> {

    private Class<? extends T> persistentClass;

    @PersistenceContext
    protected EntityManager em;

    public GenericJpaDaoImpl() {
        persistentClass =(Class) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        System.out.println(persistentClass+"==");
    }

    @Override
    public <S extends T> S save(S entity) {
        em.persist(entity);
        return entity;
    }

    @Override
    public <S extends T> S update(S entity) {
        return em.merge(entity);
    }

    @Override
    public <S extends T> S find(ID id) {
        return (S)em.find(persistentClass,id);
    }


    @Override
    public void remove(ID id) {
        //@Todo 不推荐这样使用
        remove(find(id));
    }

    @Override
    public <S extends T> void remove(S entity) {
        em.remove(entity);
    }


    @Override
    public <S extends T> List<S> find() {
       String queryHql="from "+persistentClass.getName();
        System.out.println(queryHql);
       return (List<S>) em.createQuery(queryHql,persistentClass).getResultList();
    }

    protected  <S extends T> List<S> find(String cnd,String order){
        String queryHql="from "+persistentClass.getName();
        if(cnd.length()>5){
            queryHql += " where "+cnd ;
        }
        if(order.length()>5){
            queryHql += " order by "+order;
        }
        return (List<S>) em.createQuery(queryHql,persistentClass).getResultList();
    }

    //Todo 令我纠结的事情是我到底要不要实现
    @Override
    public <S extends T> Query<S> getQuery() {
       throw new  RuntimeException("还有添加到实现");
    }

//    protected  class JpaQuery implements Query{
//
//        @Override
//        public long getCout() {
//            return 0;
//        }
//
//        @Override
//        public Object getOne() {
//            return null;
//        }
//
//        @Override
//        public List getList() {
//            return null;
//        }
//
//
//    }

}
