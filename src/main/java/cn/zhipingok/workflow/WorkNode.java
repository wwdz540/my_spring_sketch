package cn.zhipingok.workflow;

import java.util.ArrayList;
import java.util.List;

public class WorkNode <T>{
   private String name;
   private List<WorkNodeRelative> nexts=new ArrayList<>();
   private List<WorkNodeRelative> prevous=new ArrayList<>();

   private  Handler<T> handler;

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




    public WorkNode getNextNode(String name){
      return nexts.stream().filter(n->n.getName().equals(name)).findFirst().get().getEnd();
    }

//    public List<WorkNodeRelative> getNexts() {
//        return nexts;
//    }
//
//    public void setNexts(List<WorkNodeRelative> nexts) {
//        this.nexts = nexts;
//    }
//
//    public List<WorkNodeRelative> getPrevous() {
//        return prevous;
//    }
//
//    public void setPrevous(List<WorkNodeRelative> prevous) {
//        this.prevous = prevous;
//    }


     public  void setHandler(Handler<T> handler){
       this.handler = handler;
    }

    public  Handler<T> getHandler() {
        return handler;
    }

    @Override
    public String toString() {
        return "WorkNode{" +
                "name='" + name + '\'' +
                ", nexts=" + nexts +
                '}';
    }
}
