package cn.zhipingok.sketch.common;

import java.util.List;

public interface Query<T> {
    long getCout();
    T getOne();
    List<T> getList();
}
