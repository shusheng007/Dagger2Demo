package top.ss007.dagger2demo.dagger2;

import dagger.Component;
import top.ss007.dagger2demo.MainActivity;

/**
 * Copyright (C) 2018 shusheng007
 * 完全享有此软件的著作权，违者必究
 *
 * @author shusheng007
 * @version 1.0
 * @modifier
 * @createDate 2018/7/15 10:52
 * @description
 */
@Component(modules = {DaggerModule.class})
public interface MatchComponent
{
    void mainActivityInject(MainActivity activity);
}
