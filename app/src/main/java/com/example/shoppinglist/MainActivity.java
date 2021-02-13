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
        List<TextView> items = new ArrayList<>();
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

            boolean item1Visibility = savedInstanceState.getBoolean("item1Visibility");
            if (item1Visibility){
                mItem1.setVisibility(View.VISIBLE);
                mItem1.setText(savedInstanceState.getString("item1Text"));
                Log.d(LOG_TAG, "Inside savedInstanceState != null, savedInstanceState.getString(\"item1Text\") = " + savedInstanceState.getString("item1Text"));
            }

            boolean item2Visibility = savedInstanceState.getBoolean("item2Visibility");
            if (item2Visibility){
                mItem2.setVisibility(View.VISIBLE);
                mItem2.setText(savedInstanceState.getString("item2Text"));
            }

            boolean item3Visibility = savedInstanceState.getBoolean("item3Visibility");
            if (item3Visibility){
                mItem3.setVisibility(View.VISIBLE);
                mItem3.setText(savedInstanceState.getString("item3Text"));
            }

            boolean item4Visibility = savedInstanceState.getBoolean("item4Visibility");
            if (item4Visibility){
                mItem4.setVisibility(View.VISIBLE);
                mItem4.setText(savedInstanceState.getString("item4Text"));
            }

            boolean item5Visibility = savedInstanceState.getBoolean("item5Visibility");
            if (item5Visibility){
                mItem5.setVisibility(View.VISIBLE);
                mItem5.setText(savedInstanceState.getString("item5Text"));
            }

            boolean item6Visibility = savedInstanceState.getBoolean("item6Visibility");
            if (item6Visibility){
                mItem6.setVisibility(View.VISIBLE);
                mItem6.setText(savedInstanceState.getString("item6Text"));
            }

            boolean item7Visibility = savedInstanceState.getBoolean("item7Visibility");
            if (item7Visibility){
                mItem7.setVisibility(View.VISIBLE);
                mItem7.setText(savedInstanceState.getString("item7Text"));
            }

            boolean item8Visibility = savedInstanceState.getBoolean("item8Visibility");
            if (item8Visibility){
                mItem8.setVisibility(View.VISIBLE);
                mItem8.setText(savedInstanceState.getString("item8Text"));
            }

            boolean item9Visibility = savedInstanceState.getBoolean("item8Visibility");
            if (item9Visibility){
                mItem9.setVisibility(View.VISIBLE);
                mItem9.setText(savedInstanceState.getString("item9Text"));
            }

            boolean item10Visibility = savedInstanceState.getBoolean("item10Visibility");
            if (item10Visibility){
                mItem10.setVisibility(View.VISIBLE);
                mItem10.setText(savedInstanceState.getString("item10Text"));
            }

            boolean item11Visibility = savedInstanceState.getBoolean("item11Visibility");
            if (item11Visibility){
                mItem11.setVisibility(View.VISIBLE);
                mItem11.setText(savedInstanceState.getString("item11Text"));
            }

            boolean item12Visibility = savedInstanceState.getBoolean("item12Visibility");
            if (item12Visibility){
                mItem12.setVisibility(View.VISIBLE);
                mItem12.setText(savedInstanceState.getString("item12Text"));
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
        if (mItem1.getVisibility() == View.VISIBLE){
            outState.putBoolean("item1Visibility", true);
            outState.putString("item1Text", mItem1.getText().toString());
            Log.d(LOG_TAG, "Inside onSavedInstanceState, Item1 and mItem1.getText() = " + mItem1.getText().toString());
        }
        else outState.putBoolean("item1Visibility", false);

        if (mItem2.getVisibility() == View.VISIBLE){
            outState.putBoolean("item2Visibility", true);
            outState.putString("item2Text", mItem2.getText().toString());
        }
        else outState.putBoolean("item2Visibility", false);

        if (mItem3.getVisibility() == View.VISIBLE){
            outState.putBoolean("item3Visibility", true);
            outState.putString("item3Text", mItem3.getText().toString());
        }
        else outState.putBoolean("item3Visibility", false);

        if (mItem4.getVisibility() == View.VISIBLE){
            outState.putBoolean("item4Visibility", true);
            outState.putString("item4Text", mItem4.getText().toString());
        }
        else outState.putBoolean("item4Visibility", false);

        if (mItem5.getVisibility() == View.VISIBLE){
            outState.putBoolean("item5Visibility", true);
            outState.putString("item5Text", mItem5.getText().toString());
        }
        else outState.putBoolean("item5Visibility", false);

        if (mItem6.getVisibility() == View.VISIBLE){
            outState.putBoolean("item6Visibility", true);
            outState.putString("item6Text", mItem6.getText().toString());
        }
        else outState.putBoolean("item6Visibility", false);

        if (mItem7.getVisibility() == View.VISIBLE){
            outState.putBoolean("item7Visibility", true);
            outState.putString("item7Text", mItem7.getText().toString());
        }
        else outState.putBoolean("item7Visibility", false);

        if (mItem8.getVisibility() == View.VISIBLE){
            outState.putBoolean("item8Visibility", true);
            outState.putString("item8Text", mItem8.getText().toString());
        }
        else outState.putBoolean("item8Visibility", false);

        if (mItem9.getVisibility() == View.VISIBLE){
            outState.putBoolean("item9Visibility", true);
            outState.putString("item9Text", mItem9.getText().toString());
        }
        else outState.putBoolean("item9Visibility", false);

        if (mItem10.getVisibility() == View.VISIBLE){
            outState.putBoolean("item10Visibility", true);
            outState.putString("item10Text", mItem10.getText().toString());
        }
        else outState.putBoolean("item10Visibility", false);

        if (mItem11.getVisibility() == View.VISIBLE){
            outState.putBoolean("item11Visibility", true);
            outState.putString("item11Text", mItem11.getText().toString());
        }
        else outState.putBoolean("item11Visibility", false);

        if (mItem12.getVisibility() == View.VISIBLE){
            outState.putBoolean("item12Visibility", true);
            outState.putString("item12Text", mItem12.getText().toString());
        }
        else outState.putBoolean("item12Visibility", false);

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
}