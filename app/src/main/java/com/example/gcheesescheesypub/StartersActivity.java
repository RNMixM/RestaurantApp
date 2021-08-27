package com.example.gcheesescheesypub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);



        Dish [] dishes = {
                new Dish("Mushroom and tofu maki", "A delicious pan fried tofu dish with a variety of mushrooms.", 18 ),
                new Dish("Egg and avocado omlet", "Made with organic eggs and a wedge of avocado", 19 ),
                new Dish("Loaded Nachos", "A classic Cheese favorite! Need I say more?", 11),
                new Dish("Coconut and chocolate mousse", "A creamy mousse made with fresh coconut and milk chocolate", 8),
                new Dish("Spinach and cabbage wontons", "Thin wonton cases stuffed with fresh spinach and chinese cabbage", 7),
                new Dish("Broccoli and cucumber soup", "Fresh broccoli and cucumber combined into creamy soup", 8),
                new Dish("Chilli and aubergine dip", "A dip made from scotch bonnet chilli and fresh aubergine", 9),
                new Dish("Chickpea and chilli gyoza", "Thin pastry cases stuffed with fresh chickpea and green chilli", 6),
                new Dish("Sprout and pineapple soup", "Fresh sprout and pineapple combined into creamy soup", 8),
                new Dish("Egusi and borscht soup", "Egusi and borscht combined into creamy soup", 12)
        };


        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);

        startersList.setAdapter(dishesAdapter);



    }
}