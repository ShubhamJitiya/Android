package com.example.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    int quantity = 0;


    //When we click order button
    public void submitOrder(View view) {

//        display(quantity);
        String priceMessage = "Total: $" + (quantity * 5) ;
        String greetMessage = "\n\nThanks for ordering coffee! \nHope to see you back soon";
        displayMessage(priceMessage, greetMessage);
    }

    private void displayMessage(String message, String greet) {
        String msg = message + greet;
        TextView priceTextView = findViewById(R.id.checkout);
        priceTextView.setText(msg);
    }


    public void increase(View view)
    {
        increaseQuantity();
    }
    public void decrease(View view)
    {
        decreaseQuantity();
    }


//    private void display(int numbers) {
//        //Finding the quantity initial value
//        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
//
//        //Setting new value to the quantity text view
//        quantityTextView.setText(" " + numbers);
//    }

    private void displayPrice(int number) {
        TextView priceTextView = findViewById(R.id.priceTextView);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));


    }

    private void increaseQuantity()
    {
        Button btnIncrease = findViewById(R.id.increaseQuantity);
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantity = quantity+1;

        //Setting new value to the quantity text view
        quantityTextView.setText(" " + quantity);
        displayPrice(quantity * 5);

    }

    private void decreaseQuantity()
    {
        Button btnIncrease = findViewById(R.id.decreaseQuantity);
        TextView quantityTextView = findViewById(R.id.quantity_text_view);

        if (quantity>0){
            --quantity;
        }
        quantityTextView.setText(" "+quantity);
        displayPrice(quantity * 5);


    }

}