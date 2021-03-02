package com.example.shoppinglist;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static int itemsCount = 0;
    private static final String LOG_TAG = "ShoppingList_" + MainActivity.class.getSimpleName();

    TextView mItem1;
    TextView mItem2;
    TextView mItem3;
    TextView mItem4;
    TextView mItem5;
    TextView mItem6;
    TextView mItem7;
    TextView mItem8;
    TextView mItem9;
    TextView mItem10;
    TextView mItem11;
    TextView mItem12;

    int smh;

    List<TextView> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mItem1 = findViewById(R.id.item1);
        mItem2 = findViewById(R.id.item2);
        mItem3 = findViewById(R.id.item3);
        mItem4 = findViewById(R.id.item4);
        mItem5 = findViewById(R.id.item5);
        mItem6 = findViewById(R.id.item6);
        mItem7 = findViewById(R.id.item7);
        mItem8 = findViewById(R.id.item8);
        mItem9 = findViewById(R.id.item9);
        mItem10 = findViewById(R.id.item10);
        mItem11 = findViewById(R.id.item11);
        mItem12 = findViewById(R.id.item12);

        //ArrayList for the next version
        items.add(mItem1);
        items.add(mItem2);
        items.add(mItem3);
        items.add(mItem4);
        items.add(mItem5);
        items.add(mItem6);
        items.add(mItem7);
        items.add(mItem8);
        items.add(mItem9);
        items.add(mItem10);
        items.add(mItem11);
        items.add(mItem12);

        if (savedInstanceState != null){
            Log.d(LOG_TAG, "Inside savedInstanceState != null");

            for (int i = 0; i < items.size(); i++){
                TextView tv = items.get(i);
                int numOfItem = i+1;
                String visibilityKey = "item" + numOfItem + "Visibility";
                String textKey = "item" + numOfItem + "Text";
                boolean itemVisibility = savedInstanceState.getBoolean(visibilityKey);
                if (itemVisibility){
                    tv.setVisibility(View.VISIBLE);
                    tv.setText(savedInstanceState.getString(textKey));
                }
            }
        }
    }

    public void addItemButton(View view) {
        if (itemsCount < 12) {
            Intent intent = new Intent(MainActivity.this, ShoppingItems.class);
            startActivityForResult(intent, 1);
        }
        else{
            Toast theListIsFullToast = Toast.makeText(getApplicationContext(), "The List is full", Toast.LENGTH_SHORT);
            theListIsFullToast.show();
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(LOG_TAG, "Inside onSaveInstanceState");

        for (int i = 0; i < items.size(); i++){
            int numOfItem = i + 1;
            TextView tv = items.get(i);
            String visibilityKey = "item" + numOfItem + "Visibility";
            String textKey = "item" + numOfItem + "Text";
            if (tv.getVisibility() == View.VISIBLE){
                outState.putBoolean(visibilityKey, true);
                outState.putString(textKey, tv.getText().toString());
            }
            else outState.putBoolean(visibilityKey, false);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (data != null) {
                String item = data.getStringExtra("item");
                itemsCount++;
                switch (itemsCount) {
                    case 1:
                        mItem1.setText(item);
                        mItem1.setVisibility(View.VISIBLE);
                        break;
                    case 2:
                        mItem2.setText(item);
                        mItem2.setVisibility(View.VISIBLE);
                        break;
                    case 3:
                        mItem3.setText(item);
                        mItem3.setVisibility(View.VISIBLE);
                        break;
                    case 4:
                        mItem4.setText(item);
                        mItem4.setVisibility(View.VISIBLE);
                        break;
                    case 5:
                        mItem5.setText(item);
                        mItem5.setVisibility(View.VISIBLE);
                        break;
                    case 6:
                        mItem6.setText(item);
                        mItem6.setVisibility(View.VISIBLE);
                        break;
                    case 7:
                        mItem7.setText(item);
                        mItem7.setVisibility(View.VISIBLE);
                        break;
                    case 8:
                        mItem8.setText(item);
                        mItem8.setVisibility(View.VISIBLE);
                        break;
                    case 9:
                        mItem9.setText(item);
                        mItem9.setVisibility(View.VISIBLE);
                        break;
                    case 10:
                        mItem10.setText(item);
                        mItem10.setVisibility(View.VISIBLE);
                        break;
                    case 11:
                        mItem11.setText(item);
                        mItem11.setVisibility(View.VISIBLE);
                        break;
                    case 12:
                        mItem12.setText(item);
                        mItem12.setVisibility(View.VISIBLE);
                        break;
                    default:
                        Toast toast = Toast.makeText(getApplicationContext(), "The List is full", Toast.LENGTH_SHORT);
                        toast.show();
                        break;
                }

            }
        }
    }

    public void locateStoreButton(View view) {
        Intent intent = new Intent(MainActivity.this, LocateStoreActivity.class);
        startActivity(intent);
    }
}