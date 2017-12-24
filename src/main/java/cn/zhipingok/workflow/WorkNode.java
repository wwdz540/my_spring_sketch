package cn.zhipingok.workflow;

import java.util.ArrayList;
import java.util.List;

public class WorkNode{
   private String name;
   private List<WorkNodeRelative> nexts=new ArrayList<>();
   private List<WorkNodeRelative> prevous=new ArrayList<>();

    public WorkNode(String name) {
        this.name = name;
    }

    void addNext(WorkNodeRelative node){
       nexts.add(node);
   }

   void addPre(WorkNodeRelative node){
       prevous.add(node);
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WorkNodeRelative> getNexts() {
        return nexts;
    }

    public void setNexts(List<WorkNodeRelative> nexts) {
        this.nexts = nexts;
    }

    public List<WorkNodeRelative> getPrevous() {
        return prevous;
    }

    public void setPrevous(List<WorkNodeRelative> prevous) {
        this.prevous = prevous;
    }

    @Override
    public String toString() {
        return "WorkNode{" +
                "name='" + name + '\'' +
                ", nexts=" + nexts +
                '}';
    }
}
