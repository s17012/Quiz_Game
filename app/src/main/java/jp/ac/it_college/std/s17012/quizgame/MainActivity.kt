package jp.ac.it_college.std.s17012.quizgame

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val intent = Intent(this, AnswerActivity::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener{
            val intent = Intent(this, Answer2Activity::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener {
            val twice = Intent(this, Answer3Activity::class.java)
            startActivity(twice)
        }
    }
}
