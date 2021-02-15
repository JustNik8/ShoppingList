package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LocateStoreActivity extends AppCompatActivity {

    private Button mLocateStoreButton;
    private EditText mStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locate_store);

        mLocateStoreButton = findViewById(R.id.button_locate);
        mStore = findViewById(R.id.editTextStore);

    }

    public void locateStoreButton(View view) {
        String store = mStore.getText().toString();
        Uri storeUri = Uri.parse("geo:0,0?q=" + store);
        Intent intent = new Intent(Intent.ACTION_VIEW, storeUri);

        if (intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(), "Can't handle this", Toast.LENGTH_SHORT);
            toast.show();
        }

    }
}