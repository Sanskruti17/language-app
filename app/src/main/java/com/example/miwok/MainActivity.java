/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        //find the view that shows numbers activity
        TextView Numbers =(TextView)this.findViewById(R.id.numbers);
        //set click listener on the view
        Numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //create new intent to open the {@link NumbersActivity}
                Intent NumbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                //start new Activity
                startActivity(NumbersIntent);
            }
        });

        //find the view that shows family activity
        TextView Family =(TextView)this.findViewById(R.id.family);

        //set click listener on the view
        Family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //create new intent to open the {@link FamilyActivity}
                Intent FamilyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                //start new Activity
                startActivity(FamilyIntent); }
        });

        //find the view that shows Colors activity
        TextView Colors =(TextView)this.findViewById(R.id.colors);

        //set click listener on the view
        Colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //create new intent to open the {@link ColorsActivity}
                Intent ColorsIntent = new Intent(MainActivity.this, ColorsActivity.class);

                //start new Activity
                startActivity(ColorsIntent); }
        });

        //find the view that shows Phrases activity
        TextView Phrases =(TextView)this.findViewById(R.id.phrases);

        //set click listener on the view
        Phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //create new intent to open the {@link PharasesActivity}
                Intent PhrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                //start new Activity
                startActivity(PhrasesIntent); }
        });

    }
}
