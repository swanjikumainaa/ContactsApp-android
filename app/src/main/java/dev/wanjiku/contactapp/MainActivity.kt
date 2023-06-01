package dev.wanjiku.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import dev.wanjiku.contactapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        showContacts()

    }
    fun showContacts(){
        var contact1=Contact("Susana","+254768390045","susana@gmail.com","im1")
        var contact2=Contact("Susanb","+354768390045","susanb@gmail.com","im2")
        var contact3=Contact("Susanc","+454768390045","susanc@gmail.com","im3")
        var contact4=Contact("Susand","+554768390045","susand@gmail.com","im4")
        var contact5=Contact("Susane","+654768390045","susane@gmail.com","im5")
        var contact6=Contact("Susanf","+754768390045","susanf@gmail.com","im6")
        var contact7=Contact("Susang","+854768390045","susang@gmail.com","im7")
        var contact8=Contact("Susanh","+954768390045","susanh@gmail.com","im8")
        var contact9=Contact("Susani","+804768390045","susani@gmail.com","im9")
        var contact10=Contact("Susanj","+254898390045","susanj@gmail.com","im10")

        var myContacts = listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10)
        var myContactRvAdapter = ContactsRvAdapter(myContacts)

        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter= myContactRvAdapter
    }
}