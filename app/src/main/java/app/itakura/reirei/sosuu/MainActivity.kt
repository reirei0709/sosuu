package app.itakura.reirei.sosuu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        for(question in 1..10) {

            val randomNumber = Random.nextInt(100)

            numberText.text = randomNumber.toString()


            for (i in 2 until randomNumber) {


                var maruCount = 0



                if (randomNumber % i == 0) {


                    maruButton.setOnClickListener {


                        maruCountText.text = maruCount.toString()

                        val randomNumber = Random.nextInt(100)

                        numberText.text = randomNumber.toString()

                        Toast.makeText(this,"不正解",Toast.LENGTH_SHORT).show()


                    }

                    batuButton.setOnClickListener {
                        maruCount += 1

                        maruCountText.text = maruCount.toString()

                        val randomNumber = Random.nextInt(100)

                        numberText.text = randomNumber.toString()

                        Toast.makeText(this,"正解",Toast.LENGTH_SHORT).show()

                    }

                } else if (randomNumber == 2){

                    maruButton.setOnClickListener {

                        maruCount += 1

                        maruCountText.text = maruCount.toString()

                        val randomNumber = Random.nextInt(100)

                       numberText.text = randomNumber.toString()

                        Toast.makeText(this,"正解",Toast.LENGTH_SHORT).show()


                    }

                    batuButton.setOnClickListener {

                        maruCountText.text = maruCount.toString()

                       val randomNumber = Random.nextInt(100)

                        numberText.text = randomNumber.toString()

                        Toast.makeText(this,"不正解",Toast.LENGTH_SHORT).show()

                    }




                } else {
                    maruButton.setOnClickListener {

                        maruCount += 1

                        maruCountText.text = maruCount.toString()

                        val randomNumber = Random.nextInt(100)

                        numberText.text = randomNumber.toString()

                        Toast.makeText(this,"正解",Toast.LENGTH_SHORT).show()


                    }

                    batuButton.setOnClickListener {

                        maruCountText.text = maruCount.toString()

                        val randomNumber = Random.nextInt(100)

                        numberText.text = randomNumber.toString()

                        Toast.makeText(this,"不正解",Toast.LENGTH_SHORT).show()

                    }

                }

            }

        }
    }
}