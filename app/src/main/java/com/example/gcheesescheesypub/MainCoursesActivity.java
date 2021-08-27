package com.example.gcheesescheesypub;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainCoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_courses);

        ListView mainCoursesList = findViewById(R.id.list_view_main_courses);

        Dish[] mainCourses = {
        new Dish("Black pepper and chickpea vindaloo", "Hot vindaloo made with chickpeas and black pepper.", 17),
                new Dish("Warm goat cheese salad with figs and bacon", "Herbed goat cheese with freshly picked figs and plump bacon", 14),
                new Dish("BBQ Baby Back Ribs", "Plump, juicy BBQ style ribs cooked to perfection!", 15),
                new Dish("Onion and apple ciabatta", "Warm ciabatta filled with caramalised onion and fresh apple", 13),
                new Dish("Onion and olive bread", "Crunchy bread made with baby onion and olive", 12),
                new Dish("Onion and mustard soup", "Dried onion and French mustard combined into smooth soup", 13),
                new Dish("Samphire and rocket salad", "Samphire and fresh rocket served on a bed of lettuce", 16),
                new Dish("Cocoa and chicory salad", "Cocoa and chicory served on a bed of lettuce", 17),
                new Dish("Cauliflower and squash curry", "Mild curry made with fresh cauliflower and butternut squash", 15),
                new Dish("Cauliflower and potato madras", "Medium-hot madras made with fresh cauliflower and new potato", 14)
    };
    ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainCourses);

    mainCoursesList.setAdapter(dishesAdapter);
}
}
