package com.example.recyclerzoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.DividerItemDecoration
import kotlinx.android.synthetic.main.activity_animal_recycle.*


class AnimalRecycle : AppCompatActivity() {

    val animalList by lazy {populateList()}
    val adapter by lazy {AnimalAdapter(animalList)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_recycle)
        initRecyclerView()
    }
    private fun initRecyclerView(){
        val adapter = AnimalAdapter(animalList)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val itemDecoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        //val gridLayoutManager = GridLayoutManager(this, 3)
        rvAnimalList.layoutManager = layoutManager
        rvAnimalList.addItemDecoration(itemDecoration)
        rvAnimalList.adapter = adapter
    }

    private fun populateList() : ArrayList<Animal>{
        val returnList = ArrayList<Animal>()
        returnList.add(Animal("Rhino", "Mammal", "Africa"))
        returnList.add(Animal("Elephant", "Mammal", "Africa"))
        returnList.add(Animal("Bald Eagle", "Bird", "North America"))
        returnList.add(Animal("Emu", "Bird", "Australia"))
        returnList.add(Animal("Tuna", "Fish", "Ocean"))
        returnList.add(Animal("Clownfish", "Fish", "Ocean"))
        returnList.add(Animal("Alligator", "Reptile", "North America, China"))
        returnList.add(Animal("Crocodile", "Reptile", "Africa"))
        returnList.add(Animal("Poison Dart Frog", "Amphibian", "South America"))
        returnList.add(Animal("American Bullfrog", "Amphibian", "North America, Canada"))


        return returnList

    }



}
