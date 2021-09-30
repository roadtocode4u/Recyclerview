package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myRecyclerView: RecyclerView = findViewById(R.id.myRecyclerView)

        myRecyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        val userList = ArrayList<User>()

        userList.add(User("Aditya", "12349849"))
        userList.add(User("Lalit", "8949849484"))
        userList.add(User("Shyam", "45445454545"))
        userList.add(User("Prajakta", "14147423"))
        userList.add(User("Suraj", "88888888888"))


        val adapter = CustomAdapter(userList)

        myRecyclerView.adapter = adapter
    }
}