package com.mad.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.mad.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var aPerson: Person = Person("ali","123456","ali@gmail.com","123 jalan abc")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.personData= aPerson

        binding.btnUpdate.setOnClickListener(){
            aPerson.email="xxx@gmail.com"
            aPerson.address="123 Jalan xyz"
            binding.apply { invalidateAll() }
        }
        /*
        binding.tvName.text = aPerson.name
        binding.tvNRICNo.text = aPerson.nric
        binding.tvemail.text = aPerson.email
        binding.tvaddress.text = aPerson.address

        var tvName: TextView = findViewById<TextView>(R.id.tvName)
        var tvIC: TextView = findViewById<TextView>(R.id.tvNRIC)
        var tvEmail: TextView = findViewById<TextView>(R.id.tvEmail)
        var tvAddress: TextView = findViewById<TextView>(R.id.tvAddress)
        */

    }
}