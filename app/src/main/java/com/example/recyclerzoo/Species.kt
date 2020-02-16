package com.example.recyclerzoo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_species.*

//2. Activity two: ListView with list of all the categories.

class Species : AppCompatActivity() {

    val list by lazy {initList()}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_species)

        initListView()
    }

    fun initListView(){
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list)
        lvZooView.adapter = adapter
        lvZooView.setOnItemClickListener{ _, _, i, _ ->
            val selectedString = list[i]
            val intent = Intent(this, AnimalRecycle::class.java) //Not a real intent
            intent.putExtra("KEY", selectedString)
            startActivity(intent)
        }
    }

    fun initList() : ArrayList<String>{
        val stringList = ArrayList<String>()

        stringList.add("Amphibian")
        stringList.add("Fish")
        stringList.add("Reptile")
        stringList.add("Mammal")
        stringList.add("Bird")

        return stringList
    }


}
