package jp.ac.it_college.std.s17012.quizgame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class Answer3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer3)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Answer3Activity"
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId){
            android.R.id.home -> finish()
            else -> return super.onOptionsItemSelected(item)
        }
        return true
    }
}