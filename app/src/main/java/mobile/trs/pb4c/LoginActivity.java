package mobile.trs.pb4c;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

    }

    public void callRegistration(View v)
    {
        Intent i=new Intent(LoginActivity.this,Registration.class);
        startActivity(i);
    }
    public void callForgotPwd(View v)
    {
        Intent i=new Intent(LoginActivity.this,ForgotPassword.class);
        startActivity(i);
    }
}
