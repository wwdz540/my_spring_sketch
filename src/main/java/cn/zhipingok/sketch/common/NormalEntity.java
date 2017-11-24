package cn.zhipingok.sketch.common;

import javax.persistence.*;
import java.util.Date;

//@Todo 注意这个注解，不可以使用entiy
@MappedSuperclass
public abstract class NormalEntity implements BaseEntity {

    @javax.persistence.Id
    @GeneratedValue
    protected long Id;

    @Column
    protected Date createAt;

    @Column
    protected Date updateAt;


    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }


    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }



    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}
