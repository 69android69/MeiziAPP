package com.yunq.gankio.injection.component;

import com.yunq.gankio.injection.Activity;
import com.yunq.gankio.injection.module.ActivityModule;

import dagger.Component;

/**
 * Created by admin on 16/1/25.
 */
@Activity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
   // @ActivityContext
    android.app.Activity activity();
}
