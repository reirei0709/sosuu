package app.itakura.reirei.sosuu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_first_page.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    companion object {
        //val number = intent.getStringExtra("number")

         var  QUESION_COUNT: Int = 10
    }

    var Random:Random = kotlin.random.Random
    val numbers: IntArray = IntArray(QUESION_COUNT)
    var maruCount:Int = 0
    var answerCount:Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val number =0

        val number = intent.getIntExtra("number",0)

        // var QUESION_COUNT: Int = number


        //val three = intent.getIntExtra("three",3)
        //val five = intent.getIntExtra("five",5)
        //val ten = intent.getIntExtra("ten",10)



        //val Random:Random = kotlin.random.Random
        //val numbers: IntArray = IntArray(QUESION_COUNT)
        //var maruCount:Int = 0
        //var answerCount:Int = 0



        for (i in 0 until number) {


            val randomNumber = Random.nextInt(100)

            numbers[i] = randomNumber

        }

        //for(question in 1..10) {


        maruCount = 0
        answerCount = 0
        numberText.text = numbers[answerCount].toString()


    }




        fun maru(v:View) {

            val number = intent.getIntExtra("number",0)

            //val number = intent.getStringExtra("number")

            //var QUESION_COUNT: Int = number.toInt()

            //var Random:Random = kotlin.random.Random
            //val numbers: IntArray = IntArray(QUESION_COUNT)




            var answer = true

            for (i in 2 until numbers[answerCount]) {
                if (numbers[answerCount] % i == 0) {
                    answer = false

                    //answerCount += 1

                    //maruCountText.text = maruCount.toString()

                    //val randomNumber = Random.nextInt(100)

                    //numberText.text = numbers[answerCount].toString()

                    //Toast.makeText(this, "不正解", Toast.LENGTH_SHORT).show()

                    break


                }
            }

            if(answer){
                Toast.makeText(this, "正解", Toast.LENGTH_SHORT).show()
                maruCount++
            }else{
                Toast.makeText(this, "不正解", Toast.LENGTH_SHORT).show()
            }
            //numberText.text = numbers[answerCount].toString()
            answerCount += 1

            if (answerCount == number){

                numberText.text = maruCount.toString() + "点"
                numberText.setTextColor(Color.RED)


                maruCount= 0
                answerCount = 0
            }else{

                numberText.text =numbers[answerCount].toString()
                numberText.setTextColor(Color.BLACK)
            }


            maruCountText.text = maruCount.toString()

            //numberText.text = numbers[answerCount].toString()

            //val randomNumber = Random.nextInt(100)

            //numberText.text = randomNumber.toString()

            //Toast.makeText(this, "正解", Toast.LENGTH_SHORT).show()


        }

        fun batu(v:View) {

            val number = intent.getIntExtra("number",0)


           // val number = intent.getStringExtra("number")

            //var QUESION_COUNT: Int = number.toInt()

            //var Random:Random = kotlin.random.Random
            //val numbers: IntArray = IntArray(QUESION_COUNT)



            var answer = true
            for (i in 2 until numbers[answerCount]) {
                if (numbers[answerCount] % i == 0) {
                    answer = false
                    break
                }
            }
            if(answer){
                Toast.makeText(this, "不正解", Toast.LENGTH_SHORT).show()

            }else{
                Toast.makeText(this, "正解", Toast.LENGTH_SHORT).show()
                maruCount++
            }
            //numberText.text = numbers[answerCount].toString()
            answerCount += 1

            if (answerCount == number){
                numberText.text = maruCount.toString() + "点"
                numberText.setTextColor(Color.RED)


                maruCount= 0
                answerCount = 0
            }else{
                numberText.text =numbers[answerCount].toString()
                numberText.setTextColor(Color.BLACK)
            }


            maruCountText.text = maruCount.toString()


        }

}











        //}





