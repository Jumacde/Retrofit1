package com.example.retrofit1;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private TextView titleTextView, bodyTextView;
    private Button getDataButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titleTextView = findViewById(R.id.title_textView);
        bodyTextView = findViewById(R.id.body_textView);
        getDataButton = findViewById(R.id.getData_button);
        getDataButton.setOnClickListener(view -> getData());
    }

    private void getData() {
        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Please wait");
        progressDialog.show();
        RetrofitInstance.getApiInterface().getData().enqueue(new Callback<ResponseData>() {
            @Override
            public void onResponse(Call<ResponseData> call, Response<ResponseData> response) {
                ResponseData responseData = response.body();
                if (responseData != null) {
                    titleTextView.setText(responseData.getTitle());
                    bodyTextView.setText(responseData.getBody());
                }
                progressDialog.dismiss();
            }

            @Override
            public void onFailure(Call<ResponseData> call, Throwable throwable) {
                Toast.makeText(MainActivity.this, throwable.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                progressDialog.dismiss();
            }
        });
    }
}