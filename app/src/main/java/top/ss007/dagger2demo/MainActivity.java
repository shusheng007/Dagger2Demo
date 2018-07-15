package top.ss007.dagger2demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import top.ss007.dagger2demo.beans.A;
import top.ss007.dagger2demo.dagger2.DaggerMatchComponent;
import top.ss007.dagger2demo.dagger2.MatchComponent;

public class MainActivity extends AppCompatActivity
{
    @Inject
    A a;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MatchComponent component= DaggerMatchComponent
                .builder()
                .build();
        component.mainActivityInject(this);

        findViewById(R.id.btn_niu).setOnClickListener(v->{a.xxoo();});
        findViewById(R.id.btn_xue).setOnClickListener(v->{a.appointment();});
    }
}
