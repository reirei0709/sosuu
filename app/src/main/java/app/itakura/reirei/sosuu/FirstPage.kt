package app.itakura.reirei.sosuu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first_page.*

class FirstPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_page)

        var number = 0



        threeButton.setOnClickListener {
            //number = 3
            val MainPage = Intent(this,MainActivity::class.java)
            MainPage.putExtra("number",number)
            startActivity(MainPage)
            finish()
        }

        fiveButton.setOnClickListener {
            //number = 5
            val MainPage = Intent(this,MainActivity::class.java)
            MainPage.putExtra("number",number)
            startActivity(MainPage)
            finish()
        }

        tenButton.setOnClickListener {
            number = 10
            val MainPage = Intent(this,MainActivity::class.java)
            MainPage.putExtra("number",number)
            startActivity(MainPage)
            finish()
        }




    }
}