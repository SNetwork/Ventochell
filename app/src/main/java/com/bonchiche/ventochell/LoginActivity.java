package com.bonchiche.ventochell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {


    private EditText email;
    private EditText password;
    private Button signIn;
    private Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        email = (EditText)findViewById(R.id.emailInput);
        password = (EditText)findViewById(R.id.passwordInput);
        signIn = (Button)findViewById(R.id.signInButton);
        signUp = (Button)findViewById(R.id.signUpButton);
    }

    private void validate(String userEmail, String userPassword){
        if(userEmail.equals("test@test.com") && userPassword.equals("12345678")){
            Intent intent = new Intent(this, ProfileActivity.class);
            intent.putExtra("useremail", userEmail);
        }
    }
}
