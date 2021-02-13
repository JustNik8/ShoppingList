package com.example.shoppinglist;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.LogPrinter;
import android.view.View;
import android.widget.Button;

public class ShoppingItems extends AppCompatActivity {

    private static final String LOG_TAG = "ShoppingList_" + ShoppingItems.class.getSimpleName();

    Intent replyIntent = new Intent();

    Button mPotatoButton;
    Button mCarrotButton;
    Button mPepperButton;
    Button mMeatButton;
    Button mFishButton;
    Button mSausageButton;
    Button mMilkButton;
    Button mYogurtButton;
    Button mCheeseButton;
    Button mAppleButton;
    Button mBananaButton;
    Button mOrangeButton;

    protected boolean isPotatoButtonUsed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_items);

        mPotatoButton = findViewById(R.id.button_potato);
        mCarrotButton = findViewById(R.id.button_carrot);
        mPepperButton = findViewById(R.id.button_pepper);
        mMeatButton = findViewById(R.id.button_meat);
        mFishButton = findViewById(R.id.button_fish);
        mSausageButton = findViewById(R.id.button_sausage);
        mMilkButton = findViewById(R.id.button_milk);
        mYogurtButton = findViewById(R.id.button_yogurt);
        mCheeseButton = findViewById(R.id.button_cheese);
        mAppleButton = findViewById(R.id.button_apple);
        mBananaButton = findViewById(R.id.button_banana);
        mOrangeButton = findViewById(R.id.button_orange);

        if (SaveButtonInstance.isPotatoButtonUsed){
            mPotatoButton.setVisibility(View.INVISIBLE);
            mPotatoButton.setEnabled(false);
        }
        if (SaveButtonInstance.isCarrotButtonUsed){
            mCarrotButton.setVisibility(View.INVISIBLE);
            mCarrotButton.setEnabled(false);
        }
        if (SaveButtonInstance.isPepperButtonUsed){
            mPepperButton.setVisibility(View.INVISIBLE);
            mPepperButton.setEnabled(false);
        }
        if (SaveButtonInstance.isMeatButtonUsed){
            mMeatButton.setVisibility(View.INVISIBLE);
            mMeatButton.setEnabled(false);
        }
        if (SaveButtonInstance.isFishButtonUsed){
            mFishButton.setVisibility(View.INVISIBLE);
            mFishButton.setEnabled(false);
        }
        if (SaveButtonInstance.isSausageButtonUsed){
            mSausageButton.setVisibility(View.INVISIBLE);
            mSausageButton.setEnabled(false);
        }
        if (SaveButtonInstance.isMilkButtonUsed){
            mMilkButton.setVisibility(View.INVISIBLE);
            mMilkButton.setEnabled(false);
        }
        if (SaveButtonInstance.isYogurtButtonUsed){
            mYogurtButton.setVisibility(View.INVISIBLE);
            mYogurtButton.setEnabled(false);
        }
        if (SaveButtonInstance.isCheeseButtonUsed){
            mCheeseButton.setVisibility(View.INVISIBLE);
            mCheeseButton.setEnabled(false);
        }
        if (SaveButtonInstance.isAppleButtonUsed){
            mAppleButton.setVisibility(View.INVISIBLE);
            mAppleButton.setEnabled(false);
        }
        if (SaveButtonInstance.isBananaButtonUsed){
            mBananaButton.setVisibility(View.INVISIBLE);
            mBananaButton.setEnabled(false);
        }
        if (SaveButtonInstance.isOrangeButtonUsed){
            mOrangeButton.setVisibility(View.INVISIBLE);
            mOrangeButton.setEnabled(false);
        }

    }


    public void potatoButton(View view) {
        replyIntent.putExtra("item", "Potato");
        setResult(RESULT_OK, replyIntent);
        SaveButtonInstance.isPotatoButtonUsed = true;
        finish();
    }

    public void carrotButton(View view) {
        replyIntent.putExtra("item", "Carrot");
        setResult(RESULT_OK, replyIntent);
        SaveButtonInstance.isCarrotButtonUsed = true;
        finish();
    }

    public void pepperButton(View view) {
        replyIntent.putExtra("item", "Pepper");
        setResult(RESULT_OK, replyIntent);
        SaveButtonInstance.isPepperButtonUsed = true;
        finish();
    }

    public void meatButton(View view) {
        replyIntent.putExtra("item", "Meat");
        setResult(RESULT_OK, replyIntent);
        SaveButtonInstance.isMeatButtonUsed = true;
        finish();
    }

    public void fishButton(View view) {
        replyIntent.putExtra("item", "Fish");
        setResult(RESULT_OK, replyIntent);
        SaveButtonInstance.isFishButtonUsed = true;
        finish();
    }

    public void sausageButton(View view) {
        replyIntent.putExtra("item", "Sausage");
        setResult(RESULT_OK, replyIntent);
        SaveButtonInstance.isSausageButtonUsed = true;
        finish();
    }

    public void milkButton(View view) {
        replyIntent.putExtra("item", "Milk");
        setResult(RESULT_OK, replyIntent);
        SaveButtonInstance.isMilkButtonUsed = true;
        finish();
    }

    public void yogurtButton(View view) {
        replyIntent.putExtra("item", "Yogurt");
        setResult(RESULT_OK, replyIntent);
        SaveButtonInstance.isYogurtButtonUsed = true;
        finish();
    }

    public void cheeseButton(View view) {
        replyIntent.putExtra("item", "Cheese");
        setResult(RESULT_OK, replyIntent);
        SaveButtonInstance.isCheeseButtonUsed = true;
        finish();
    }

    public void appleButton(View view) {
        replyIntent.putExtra("item", "Apple");
        setResult(RESULT_OK, replyIntent);
        SaveButtonInstance.isAppleButtonUsed = true;
        finish();
    }

    public void bananaButton(View view) {
        replyIntent.putExtra("item", "Banana");
        setResult(RESULT_OK, replyIntent);
        SaveButtonInstance.isBananaButtonUsed = true;
        finish();
    }

    public void orangeButton(View view) {
        replyIntent.putExtra("item", "Orange");
        setResult(RESULT_OK, replyIntent);
        SaveButtonInstance.isOrangeButtonUsed = true;
        finish();
    }
}