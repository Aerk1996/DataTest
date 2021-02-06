package com.example.datatest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.datatest.entities.User;

public class InsertActivity extends AppCompatActivity {
    private EditText userName, userSurname, userPassword;

   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        
        userName = findViewById(R.id.user_name_edit_text);
        userSurname = findViewById(R.id.user_surname_edit_text);
        userPassword = findViewById(R.id.user_password_edit_text);
    }
    private void insertRecords(){
        User users = new User();

        String name = userName.getText().toString();
        String surname = userSurname.getText().toString();
        String pass = userPassword.getText().toString();

        users.setUserName(name);
        users.setUserSurname(surname);
        users.setUserPassword(pass);

        users.save();

        setResult(RESULT_OK);
        Toast.makeText(InsertActivity.this, "Record Insert Success", Toast.LENGTH_LONG).show();
        userName.setText("");
        userSurname.setText("");
        userPassword.setText("");


    }
    public void addRecords(View view)
    {
        insertRecords();
    }
}