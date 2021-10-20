package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //цифры
        bth_one.setOnClickListener { pokaz(stroka = "1", ochistka = true) }
        bth_two.setOnClickListener { pokaz(stroka = "2", ochistka = true) }
        bth_three.setOnClickListener { pokaz(stroka = "3", ochistka = true) }
        bth_four.setOnClickListener { pokaz(stroka = "4", ochistka = true) }
        bth_five.setOnClickListener { pokaz(stroka = "5", ochistka = true) }
        bth_six.setOnClickListener { pokaz(stroka = "6", ochistka = true) }
        bth_seven.setOnClickListener { pokaz(stroka = "7", ochistka = true) }
        bth_eight.setOnClickListener { pokaz(stroka = "8", ochistka = true) }
        bth_nine.setOnClickListener { pokaz(stroka = "9", ochistka = true) }
        bth_zero.setOnClickListener { pokaz(stroka = "0", ochistka = true) }
        bth_point.setOnClickListener { pokaz(stroka = ".", ochistka = true) }
        //умножение плюс и тд
        bth_plus.setOnClickListener { pokaz(stroka = "+", ochistka = false) }
        bth_minus.setOnClickListener { pokaz(stroka = "-", ochistka = false) }
        bth_div.setOnClickListener { pokaz(stroka = "/", ochistka = false) }
        bth_multi.setOnClickListener { pokaz(stroka = "*", ochistka = false) }
        bth_open.setOnClickListener { pokaz(stroka = "(", ochistka = false) }
        bth_Close.setOnClickListener { pokaz(stroka = ")", ochistka = false) }

    fun pokaz(stroka:String,ochistka:Boolean)
    {
        if(bth_Result.text.isNotEmpty())
        {
            bth_Expression.text = ""
        }
        if(ochistka)
        {
            bth_Result.text = ""
            bth_Expression.append(stroka)
        }
        else
        {
            bth_Expression.append(bth_Result.text)
            bth_Expression.append(stroka)
            bth_Result.text = ""
        }
    }
}
/*
public class Calculation {
   
    fun clear(){
        if(main.isNotEmpty())
            main=main.substring(0, main.length - 1)
        res=""
    }
    fun clearall(){
        main=""
        res=""
    }
      
        

    fun computation():String{
        try {
            val expression = ExpressionBuilder(main.toString()).build()
            val result= ex.evaluate()
            val longResult = answer.toLong()
            if(result == longResult.toDouble())
                return longResult.toString()
            else {
                val context = MathContext(5, RoundingMode.HALF_UP)
                val x = BigDecimal(result, context)
                return x.toString()
            }
        } catch (e: Exception) {
            Log.d("Ошибка", "код:" + e.message)
        }
    }


}
*/
