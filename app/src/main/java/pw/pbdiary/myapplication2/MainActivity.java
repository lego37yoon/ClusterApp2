package pw.pbdiary.myapplication2;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE_MENU = 101;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked(View v){
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivityForResult(intent, REQUEST_CODE_MENU);
    }
    //결과를 받으면 오는 것!
    //Android Studio > MainActivity.java 열기 > 오른쪽클릭 > Generate > Override ... > onActivtyResult 선택.
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE_MENU) {
            //menuActivity가 보내준 것임을 알게 됨!
            Toast.makeText(getApplicationContext(), "OnActivityResult 호출됨"+requestCode+"결과코드", Toast.LENGTH_LONG).show();
        }
    }
}
