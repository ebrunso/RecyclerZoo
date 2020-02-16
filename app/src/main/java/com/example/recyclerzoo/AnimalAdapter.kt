package com.example.recyclerzoo

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.animal_item.view.*


class AnimalAdapter (val animalList : ArrayList<Animal>) : RecyclerView.Adapter<AnimalAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.animal_item, parent, false)
        val viewHolder = ViewHolder(view)
        return viewHolder
    }

    override fun getItemCount() = animalList.size

    override fun onBindViewHolder(holder: AnimalAdapter.ViewHolder, position: Int) {
        holder.populateItem(animalList[position])
    }

    fun addAnimalToList(animal: Animal){
        animalList.add(animal)
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun populateItem(animal : Animal){
            itemView.tvAnimalName.text = animal.animalName
            itemView.tvPhyla.text = animal.phyla
            itemView.setOnClickListener {
                val intent = Intent(it.context, AnimalDetails::class.java)
                intent.putExtra(KEY_ANIMAL, animal)
                it.context.startActivity(intent)
            }
        }
    }

}