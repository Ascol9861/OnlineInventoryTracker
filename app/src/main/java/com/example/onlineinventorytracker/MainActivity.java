package com.example.onlineinventorytracker;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import fragments.LoginFragment;
import fragments.RegisterFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnLogin;
    private TextView txtGoToRegister;
    private Boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        txtGoToRegister = findViewById(R.id.txtGoToRegister);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

//        if(status){
//            LoginFragment loginFragment = new LoginFragment();
//            fragmentTransaction.replace(R.id.fragmentContainer, loginFragment);
//            fragmentTransaction.commit();
//            btnLogin.setText("Load Register Fragment");
//            status = false;
//        }
//        else {
//            RegisterFragment registerFragment = new RegisterFragment();
//            fragmentTransaction.replace(R.id.fragmentContainer, registerFragment);
//            fragmentTransaction.commit();
//            btnLogin.setText("Login Page here");
//            status = true;
//        }
    }
}
