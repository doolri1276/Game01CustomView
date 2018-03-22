package com.snownaul.game01customview;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyView myView=new MyView(this);

        setContentView(myView);

        //제목줄 제거(숨기기)
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        //상태표시줄(status Bar) 제거 - 전체화면모드가 더 정확한 표현임
        Window window=getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);





    }


}
