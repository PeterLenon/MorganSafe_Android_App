package com.example.morgansafe

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView

class projectCard(context: Context)
{
    var view: View = LayoutInflater.from(context).inflate(R.layout.project_card, null, false)
    var id = view.findViewById<TextView>(R.id.projectName)

}