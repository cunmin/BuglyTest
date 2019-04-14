package com.littleyellow.buglytest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView test = findViewById(R.id.test);
        test.setText("1.0.9");
//        test.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if ("1.0.7_是开发设备".equals(test.getText().toString())){
//                    test.setText("1.0.7_不是开发设备");
//                    Bugly.setIsDevelopmentDevice(getApplication(), false);
//                }else{
//                    test.setText("1.0.7_是开发设备");
//                    Bugly.setIsDevelopmentDevice(getApplication(), true);
//                }
//            }
//        });
}
}
