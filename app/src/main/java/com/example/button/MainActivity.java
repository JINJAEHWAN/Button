package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //뷰의 주소 값을 담을 참조 변수
    TextView text1;
    Button button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //뷰의 주소값을 얻어온다.
        text1 =(TextView)findViewById(R.id.textView);
        button1 = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        //리스너 객체를 생성
        BtnListener1 listener1 = new BtnListener1();
        BtnListener2 listener2 = new BtnListener2();
        //리스너를 버튼 객체에 설정한다.
        button1.setOnClickListener(listener1);
        button2.setOnClickListener(listener2);
    }
    //첫 번째 버튼과 연결된 리스너
    class BtnListener1 implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            text1.setText("첫 번째 버튼을 눌렀습니다.");
        }
    }
    //두 번째 버튼과 연결된 리스너
    class BtnListener2 implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            text1.setText("두 번째 버튼을 눌렀습니다.");
        }
    }
}