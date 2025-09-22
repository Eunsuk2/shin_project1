package com.example.project5

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.project5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var text1 : TextView
    lateinit var text2 : TextView
    lateinit var switch1 : Switch
    lateinit var radioGroup1 : RadioGroup
    lateinit var radioOreo : RadioButton
    lateinit var radioPi : RadioButton
    lateinit var radioQ : RadioButton
    lateinit var imageAndroid : ImageView
    lateinit var button1 : Button
    lateinit var button2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        title = "SelfProject4_4"

        text1 = findViewById<TextView>(R.id.Text1)
        switch1 = findViewById<Switch>(R.id.switch1)

        text2 = findViewById<TextView>(R.id.Text2)
        radioGroup1 = findViewById<RadioGroup>(R.id.radioGroup1)
        radioOreo = findViewById<RadioButton>(R.id.radioOreo)
        radioPi = findViewById<RadioButton>(R.id.radioPi)
        radioQ = findViewById<RadioButton>(R.id.radioQ)

        imageAndroid = findViewById<ImageView>(R.id.imgAndroid)
        button1 = findViewById<Button>(R.id.button1)
        button2 = findViewById<Button>(R.id.button2)

        switch1.setOnCheckedChangeListener { compoundButton, b ->
            if (switch1.isChecked == true) {
                text2.visibility = android.view.View.VISIBLE
                radioGroup1.visibility = android.view.View.VISIBLE
                imageAndroid.visibility = android.view.View.VISIBLE
                button1.visibility = android.view.View.VISIBLE
                button2.visibility = android.view.View.VISIBLE
            } else {
                text2.visibility = android.view.View.INVISIBLE
                radioGroup1.visibility = android.view.View.INVISIBLE
                imageAndroid.visibility = android.view.View.INVISIBLE
                button1.visibility = android.view.View.INVISIBLE
                button2.visibility = android.view.View.INVISIBLE

            }
        }
        radioGroup1.setOnCheckedChangeListener { group, checkedId ->
            when (checkedId){
                R.id.radioOreo->imageAndroid.setImageResource(R.drawable.oreo)
                R.id.radioPi->imageAndroid.setImageResource(R.drawable.pi)
                R.id.radioQ->imageAndroid.setImageResource(R.drawable.q)
                else->imageAndroid.setImageDrawable(null)
            }
        }

        button1.setOnClickListener {

            finishAffinity()

            System.exit(0)
        }

        button2.setOnClickListener {

            switch1.isChecked = false


            text2.visibility = View.INVISIBLE
            radioGroup1.visibility = View.INVISIBLE
            imageAndroid.visibility = View.INVISIBLE
            button1.visibility = View.INVISIBLE
            button2.visibility = View.INVISIBLE

        }




    }
}