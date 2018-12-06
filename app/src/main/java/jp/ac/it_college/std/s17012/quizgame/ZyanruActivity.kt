package jp.ac.it_college.std.s17012.quizgame

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_zyanru.*

class ZyanruActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zyanru)

        button8.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }
        button9.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }
        button10.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }
        button11.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }
        button12.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }
        button13.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }
        button14.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }
        button15.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }
        button16.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }
        button17.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }
        button18.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }
        button19.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "ZyanruActivity"
    }
}
