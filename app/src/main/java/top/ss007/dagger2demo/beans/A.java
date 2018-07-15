package top.ss007.dagger2demo.beans;

import javax.inject.Inject;

/**
 * Copyright (C) 2018 shusheng007
 * 完全享有此软件的著作权，违者必究
 *
 * @author shusheng007
 * @version 1.0
 * @modifier
 * @createDate 2018/7/15 10:53
 * @description
 */
public class A
{
    @Inject
    B b;
    @Inject
    C c;

    @Inject
    public A(){ }

    //此处应该将结果回调，为了简单不写了
    public void xxoo(){
        System.out.println("翠花，关灯。。。");
        b.birthSon();
    }

    public void appointment(){
        System.out.println("上官无雪，晚上一起去看看月亮聊聊理想啊？");
        c.turnDown();
    }
}
