package com.example.morgansafe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.ScrollView
import androidx.cardview.widget.CardView
import com.google.android.material.floatingactionbutton.FloatingActionButton



class projectsActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_projects)
        val addProjectButton = findViewById<FloatingActionButton>(R.id.addProject)
        val layout = findViewById<LinearLayout>(R.id.container)

        addProjectButton.setOnClickListener()
        {
            val project = projectCard(this)
            layout.addView(project.view)
        }

    }
}