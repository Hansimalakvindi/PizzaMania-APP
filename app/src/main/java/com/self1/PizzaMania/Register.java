package com.self1.PizzaMania;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

class activity_main3 extends AppCompatActivity {

    private EditText nameInput, emailInput, passwordInput;
    private CheckBox rememberMe;
    private Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // Bind UI elements
        nameInput = findViewById(R.id.editTextText);
        emailInput = findViewById(R.id.editTextTextEmailAddress2);
        passwordInput = findViewById(R.id.editTextTextPassword2);
        rememberMe = findViewById(R.id.checkBox2);
        signInButton = findViewById(R.id.button3);

        // Handle Sign In button click
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = nameInput.getText().toString().trim();
                String email = emailInput.getText().toString().trim();
                String password = passwordInput.getText().toString().trim();
                boolean remember = rememberMe.isChecked();

                // Simple validation
                if (TextUtils.isEmpty(name)) {
                    nameInput.setError("Name is required");
                    return;
                }
                if (TextUtils.isEmpty(email)) {
                    emailInput.setError("Email is required");
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    passwordInput.setError("Password is required");
                    return;
                }

                // For demo: show a toast with info
                String message = "Name: " + name + "\nEmail: " + email +
                        "\nPassword: " + password + "\nRemember me: " + remember;
                Toast.makeText(activity_main3.this, "Registration Successful!\n" + message, Toast.LENGTH_LONG).show();

                // TODO: Add actual signup logic (database or server)
            }
        });
    }
}
