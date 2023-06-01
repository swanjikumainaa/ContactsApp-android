package dev.wanjiku.contactapp

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import dev.wanjiku.contactapp.databinding.ContactListBinding

class ContactsRvAdapter (var mycontacts:List<Contact>):RecyclerView.Adapter<ContactViewHolder>(){
    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
      var binding = ContactListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var displayContact = mycontacts.get(position)
        var binding =holder.binding
        binding.tvName.text = displayContact.name
        binding.tvPhoneNumber.text = displayContact.phoneNumber
        binding.tvEmail.text = displayContact.email



    }

    override fun getItemCount(): Int {
        return mycontacts.size
    }

}

class ContactViewHolder(var binding:dev.wanjiku.contactapp.databinding.ContactListBinding):ViewHolder(binding.root)