package com.example.assignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//Connect UI elements
       val etTimeInput=findViewById<EditText>(R.id.etTimeInput)
        val btnGetDayToday=findViewById<Button>(R.id.btnGetDayToday)
        val tvResult=findViewById<TextView>(R.id.tvResult)
         val btnReset=findViewById<Button>(R.id.btnReset)
        //GetDayToday reset button
    btnGetDayToday.setOnClickListener {
        val input=etTimeInput.text.toString().trim().lowercase()

        if (input == "morning") {
            tvResult.text = "Send good morning text to a relative."
        } else if (input == "mid morning") {
            tvResult.text = "Reach out to a colleague - check in or share an idea."
        } else if (input == "afternoon") {
            tvResult.text = "Share a funny meme or interesting link with a friend."
     } else if (input == "night") {
            tvResult.text = "Call a relative for a 5 minute catch up."
        } else if (input == "evening") {
            tvResult.text = "Leave a thoughtful comment on a friend's post."
        } else {
            tvResult.text = "Please enter: Morning, Mid Morning, Afternoon, Evening, or Night."
        }
}
//suggestion logic
btnReset.setOnClickListener {
    etTimeInput.text.clear()
    tvResult.text = ""
}
}
}