package com.example.recyclerzoo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_animal_details.*
import kotlinx.android.synthetic.main.animal_item.*
import kotlinx.android.synthetic.main.animal_item.tvAnimalName
import kotlinx.android.synthetic.main.animal_item.tvPhyla

class AnimalDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_details)

        val passedAnimal = intent?.getParcelableExtra<Animal>(KEY_ANIMAL)
        tvAnimalName.text = passedAnimal?.animalName ?: "No Animal Name"
        tvPhyla.text = passedAnimal?.phyla ?: "No Phyla"
        tvGlobalOrigin.text = passedAnimal?.globalOrigin ?: "No Country of Origin"
    }
}
