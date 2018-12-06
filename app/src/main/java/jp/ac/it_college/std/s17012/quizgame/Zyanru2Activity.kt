package jp.ac.it_college.std.s17012.quizgame

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_zyanru2.*

class Zyanru2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zyanru2)

        button20.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }
        button21.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }
        button22.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }
        button23.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }
        button24.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }
        button25.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }
        button26.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }
        button27.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }
        button28.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }
        button29.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }
        button30.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }
        button31.setOnClickListener {
            val intent = Intent(this, Answer3Activity::class.java)
            startActivity(intent)
        }

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Zyanru2Activity"
    }
}
