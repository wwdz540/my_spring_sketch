package cn.zhipingok.sketch.model;

import cn.zhipingok.sketch.common.NormalEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class SvsInstance extends NormalEntity {

    public static enum InState {
        CREATE,STARTED,STOP,DELETE,ERROR;
    }




    @Column
    private String name;


    //@Todo 映射enum
    @Column
    @Enumerated(EnumType.STRING)
    private InState state = InState.CREATE;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public InState getState() {
        return state;
    }

    public void setState(InState state) {
        this.state = state;
    }






}
