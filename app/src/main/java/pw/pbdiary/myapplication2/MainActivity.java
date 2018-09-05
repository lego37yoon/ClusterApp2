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

        setContentView(R.layout.activity_main);
    }
    public void onButoonClicked(View v) {
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        SimpleData data = new SimpleData(101, "Hello---!");

        intent.putExtra("data", data);
        startActivityForResult(intent, REQUEST_CODE_MENU);
    }
}
