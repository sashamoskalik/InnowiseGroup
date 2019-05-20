package com.example.moskalik_alexander_innowisegroup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView first_Text, two_Text, third_Text;
    Button first_Button, two_Button, third_Button;
    EditText first_Edit, two_Edit, third_Edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first_Text = (TextView) findViewById(R.id.first_Text);
        two_Text = (TextView) findViewById(R.id.two_Text);
        third_Text = (TextView) findViewById(R.id.third_Text);
        first_Edit = (EditText) findViewById(R.id.first_Edit);
        two_Edit = (EditText) findViewById(R.id.two_Edit);
        third_Edit = (EditText) findViewById(R.id.third_Edit);
        first_Button = (Button) findViewById(R.id.first_Button);
        two_Button = (Button) findViewById(R.id.two_Button);
        third_Button = (Button) findViewById(R.id.third_Button);

        first_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = "";
                int edit = Integer.parseInt(first_Edit.getText().toString());
                int first[] = new int[edit];
                Log.d("N", String.valueOf(edit));
                for (int i=2; i< edit; i++){
                    first[0] = 0;
                    first[1] = 1;
                    first[i] = first[i-1] + first[i-2];
                }
                for (int i =0; i<edit; i++){
                    string += String.valueOf(first[i]*first[i]) + " ";
                }
                first_Text.setText(string);
            }
        });

        two_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = "";
                int edit = Integer.parseInt(two_Edit.getText().toString());
                int two[] = new int[edit];
                for (int i = 0; i<=edit; i++){
                    if (i%2 != 0){
                        string += String.valueOf(i*i) + " ";
                    }
                }
                two_Text.setText(string);
            }
        });

        third_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = "";
                int edit = Integer.parseInt(third_Edit.getText().toString());
                int third[] = new int[edit];
                for (int i = 0; i<=edit; i++){
                    int rever = 0;
                    int second = i;
                    while (second != 0){
                        rever = rever*10 + second%10;
                        second /= 10;
                    }
                    if (rever == i){
                        string += String.valueOf(rever) + " ";
                    }
                }
                third_Text.setText(string);
            }
        });
    }
}

