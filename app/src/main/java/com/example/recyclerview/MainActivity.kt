package com.example.recyclerview


import NamesRecyclerViewAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

data class Names(val name: String, val age: Int, val hobby: String, val dob:String)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvNames.layoutManager = LinearLayoutManager(baseContext)
        val namesAdapter = NamesRecyclerViewAdapter(namesList = listOf(
            Names("Micheal",12,"Football","6/8/2008"),
            Names("Jayson",23,"Coding","6/5/1997"),
            Names("Joseph",20,"Drawing","14/4/2000"),
            Names("Birabwa",30,"Reading","11/2/1990"),
            Names("Gloria",25,"Singing","10/6/1995"),
            Names("Loreen",13,"Watching","12/7/2007"),
            Names("Andrew",21,"Farming","11/12/1999"),
            Names("Derick",19,"Swimming","12/10/2001"),
            Names("James",18,"Exercising","11/1/2002"),
            Names("Mary",21,"Cycling","10/4/1999")

        )
                rvNames.adapter = namesAdapter
    }
}





