package com.example.eric.password;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

import org.w3c.dom.Text;

//public class MainActivity extends AppCompatActivity implements OnClickListener{
public class MainActivity extends AppCompatActivity{

    private TextView textID, usernameTextViewID, resetButtonString;
    private Button submitID, resetButtonID;
    private EditText username, password;
    String editTextUser, editTextPass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textID = (TextView) findViewById(R.id.submitID);
        usernameTextViewID = (TextView) findViewById(R.id.usernameTextViewID);
        submitID = (Button) findViewById(R.id.submitID);
        //submitID.setOnClickListener(this);
        submitID.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                editTextUser = username.getText().toString();
                editTextPass = password.getText().toString();
                if (v.getId() == R.id.submitID) //textID.setText("Submitted");
                {


                    if (editTextUser.equals("test") && editTextPass.equals("password"))
                    {
                        textID.setText("Correct login");
                    }
                    else
                    {
                        textID.setText("Incorrect login");
                    }
                }
            }
        });
        /*
        resetButtonID.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {

            }
        }
        );*/
        username = (EditText) findViewById(R.id.userEditID);
        password = (EditText) findViewById(R.id.passEditID);
        //editTextString = username.getText().toString();
    }
    /*
    @Override
    public void onClick(View v){
        editTextUser = username.getText().toString();
        editTextPass = password.getText().toString();
        if (v.getId() == R.id.submitID) //textID.setText("Submitted");
        {


            if (editTextUser.equals("test") && editTextPass.equals("password"))
            {
                textID.setText("Correct login");
            }
            else
            {
                textID.setText("Incorrect login");
            }
        }
    }
    */
}
