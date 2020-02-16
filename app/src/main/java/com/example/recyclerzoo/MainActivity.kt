package com.example.recyclerzoo

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_main.*

//Create an app which is a directory for all the animals in a zoo.
//1. Activity one: Make a homepage for zoo information
//2. Activity two: ListView with list of all the categories.
//3. Activity three: RecyclerView with a list of all the animals in that category
//4. Activity four: Detail of that animal selected from the list.
//     It should have the detail of that animal and play a sound of that animal.

class MainActivity : AppCompatActivity() {

    //val drawable: Drawable? = ResourcesCompat.getDrawable(resources, R.drawable.zoostockimage, null)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onClick(view: View){
        when (view.id){
            R.id.btnZooEntry -> {
                intent = Intent(this, Species::class.java)
                startActivity(intent)
            }
        }

    }

}
