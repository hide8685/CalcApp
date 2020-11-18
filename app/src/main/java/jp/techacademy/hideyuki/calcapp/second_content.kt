package jp.techacademy.hideyuki.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second_content.*

class second_content : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_content)

        val value1 = intent.getDoubleExtra("VALUE1",0.0)
        val value2 = intent.getDoubleExtra("VALUE2",0.0)
        val result = intent.getDoubleExtra("RESULT",0.0)
        val fugo = intent.getStringExtra("FUGO")


        textView.text = "$value1 $fugo $value2 = $result"
    }
}