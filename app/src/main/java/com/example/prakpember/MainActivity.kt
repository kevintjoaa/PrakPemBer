package com.example.prakpember

import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //activity main
//        setContentView(R.layout.activity_main)

        //relative layout
//        setContentView(R.layout.relative_layout)

        //GridView
//        setContentView(R.layout.gridview)
//
//        val gridView = findViewById<GridView>(R.id.grid_view)
//        gridView.adapter = ImageAdapter(this)

        //latihan layout
//        setContentView(R.layout.latihan_layout)

        //tugas layout
        setContentView(R.layout.tugas_layout)
    }
}
