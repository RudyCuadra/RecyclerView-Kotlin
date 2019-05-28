package com.example.superherolist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var mRecyclerView: RecyclerView
    val mAdapter : RecyclerAdapter = RecyclerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpRecyclerView()
        /*val batman:Superhero = Superhero("Batmamn","DC","Bruce Wayne","https://")

        val superheros : MutableList<Superhero> = mutableListOf()*/


        /*val batmanRealName = batman.realName //Recuperamos Bruce Wayne
        batman.realName = "Soy batman"       //Cambiamos Bruce Wayne por Soy batman
        batman.toString()                    //Devolvera todos los atributos con su valor

        batman.component1() //Batman
        batman.component2() //DC
        batman.component3() //Bruce Wayne
        batman.component4() //https://cursokotlin.com/wp-content/uploads/

        //PODEMOS ALMACENAR TODOS LOS PARAMETROS DE UN OBJETO DE GOLPE

        val (superheroFav, publisherFav, realNameFav, photoFav) = batman
        superheroFav //Batman
        publisherFav //DC
        realNameFav //Bruce Wayne
        photoFav //https:lkdncdlnk*/




    }

    fun setUpRecyclerView(){
        mRecyclerView = findViewById(R.id.rvSuperheroList) as RecyclerView
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)
        mAdapter.RecyclerAdapter(getSuperheros(),this)
        mRecyclerView.adapter = mAdapter
    }

    fun getSuperheros(): MutableList<Superhero>{
        val superheros : MutableList<Superhero> = ArrayList()
        superheros.add(Superhero("Spiderman", "Marvel", "Peter Parker", "https://cursokotlin.com/wp-content/uploads/2017/07/spiderman.jpg"))
        superheros.add(Superhero("Daredevil", "Marvel", "Matthew Michael","https://cursokotlin.com/wp-content/uploads/2017/07/daredevil.jpg"))
        superheros.add(Superhero("Wolverine", "Marvel", "James Howlett","https://cursokotlin.com/wp-content/uploads/2017/07/logan.jpeg"))
        superheros.add(Superhero("Batman", "DC", "Bruce Wayne", "https://cursokotlin.com/wp-content/uploads/2017/07/batman.jpg"))
        superheros.add(Superhero("Thor", "Marvel", "Thor Odinson", "https://cursokotlin.com/wp-content/uploads/2017/07/thor.jpg"))
        superheros.add(Superhero("Flash", "DC", "Jay Garrick", "https://cursokotlin.com/wp-content/uploads/2017/07/flash.png"))
        superheros.add(Superhero("Green Lantern", "DC", "Alan Scott", "https://cursokotlin.com/wp-content/uploads/2017/07/green-lantern.jpg"))
        superheros.add(Superhero("Wonder Woman", "DC", "Princess Diana","https://cursokotlin.com/wp-content/uploads/2017/07/wonder_woman.jpg"))
        return superheros
    }







    //SI QUEREMOS QUE LOS DATOS NUNCA SE CAMBIEN DEBEMOS DE CAMBIAR VAR POR VAL



}




