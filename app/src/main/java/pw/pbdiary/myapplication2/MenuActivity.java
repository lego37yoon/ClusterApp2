package pw.pbdiary.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button button = (Button) findViewById(R.id.button);

        Intent intent = getIntent();
        if(intent != null){
            Bundle bundle = intent.getExtras();

            SimpleData data = bundle.getParcelable("data");
            button.setText("Number:"+data.getNumber()+"Msg: "+data.getMessage());
        }
    }
}
