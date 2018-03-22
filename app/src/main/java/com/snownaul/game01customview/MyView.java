package com.snownaul.game01customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

/**
 * Created by alfo6-11 on 2018-03-22.
 */

public class MyView extends View {

    int width;//화면의 가로 사이즈
    int height;//화면의 세로 사이즈

    public MyView(Context context) {
        super(context);

        WindowManager wm=(WindowManager) context.getSystemService(Context.WINDOW_SERVICE);

        //해상도 관리자 객체
        Display display=wm.getDefaultDisplay();
        width=display.getWidth();
        height=display.getHeight();


    }

    //생성자 메소드가 종료된 후 한번 자동으로 실행되는 콜백 메소드 :
    //이 MyView가 화면에 보여질 내용물을 그려내는 작업
    @Override
    protected void onDraw(Canvas canvas) {

        //도화지 이면서 화가 객체인 canvas에게
        //글씨를 그려달라고 요청

        Paint p=new Paint(); //그림그리는 도구 객체
        p.setTextSize(100); //100px
        canvas.drawText(width+" * "+height,100,200,p);
        canvas.drawText("PyaPay",0,height,p);
        canvas.drawText("bbb",width/2,height/2,p);



    }
}
