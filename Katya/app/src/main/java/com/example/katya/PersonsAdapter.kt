package com.example.katya

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.katya.databinding.RecyclerItemBinding

class PersonsAdapter: RecyclerView.Adapter<PersonsAdapter.PersonsViewHolder>() {

    private var personsList: MutableList<Data> = DataHolder.getAll()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonsViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val binding = RecyclerItemBinding.inflate(inflater, parent, false)
        return PersonsViewHolder(binding)

    }

    override fun onBindViewHolder(holder: PersonsViewHolder, position: Int) {
        val person = personsList[position]

        with(holder.binding){
            Glide.with(userIcon.context)
                .load(person.pictureRes)
                .centerCrop()
                .into(userIcon)
            userName.text = person.name + " " + person.surname
            userDescription.text = person.minimalInfo
        }

    }

    override fun getItemCount(): Int {
        return personsList.size
    }

    class PersonsViewHolder (var binding: RecyclerItemBinding): RecyclerView.ViewHolder(binding.root)


}