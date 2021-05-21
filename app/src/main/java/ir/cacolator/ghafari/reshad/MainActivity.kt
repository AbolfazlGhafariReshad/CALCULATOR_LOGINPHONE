package ir.cacolator.ghafari.reshad

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt_num1 = findViewById<EditText>(R.id.txt_num1)
        val edt_num2 = findViewById<EditText>(R.id.txt_num2)
        val btn_sum = findViewById<Button>(R.id.btn_sum)
        val btn_sub = findViewById<Button>(R.id.btn_subtraction)
        val btn_mult = findViewById<Button>(R.id.btn_multiplication)
        val btn_Divide = findViewById<Button>(R.id.btn_Divide)
        val txt_res = findViewById<TextView>(R.id.txt_res)

        btn_sum.setBackgroundColor(Color.parseColor("#ffc400"))
        btn_sub.setBackgroundColor(Color.parseColor("#63f542"))
        btn_mult.setBackgroundColor(Color.parseColor("#0015ff"))
        btn_Divide.setBackgroundColor(Color.parseColor("#d37aff"))



//کد مربوط به جمع
        btn_sum.setOnClickListener {
            if(edt_num1.getText().toString().equals("") || edt_num2.getText().toString().equals("")){
                Toast.makeText(getApplicationContext(),"مقداری وارد نشده است!" , Toast.LENGTH_LONG).show();
            }else {
                var num1: Int = edt_num1.text.toString().toInt()
                var num2: Int = edt_num2.text.toString().toInt()
                var sum: Int = num1 + num2
                txt_res.text = sum.toString()
                txt_res.setTextColor(Color.parseColor("#ffc400"))
            }
        }


//کد مربوط به تفریق
        btn_sub.setOnClickListener {
            if(edt_num1.getText().toString().equals("") || edt_num2.getText().toString().equals("")){
                Toast.makeText(getApplicationContext(),"مقداری وارد نشده است!" , Toast.LENGTH_LONG).show();
            }else {
                var num1: Int = edt_num1.text.toString().toInt()
                var num2: Int = edt_num2.text.toString().toInt()
                var sum: Int = num1 - num2
                txt_res.text = sum.toString()
                txt_res.setTextColor(Color.parseColor("#63f542"))
            }
        }


//کد مربوط به ضرب
        btn_mult.setOnClickListener {
            if(edt_num1.getText().toString().equals("") || edt_num2.getText().toString().equals("")){
                Toast.makeText(getApplicationContext(),"مقداری وارد نشده است!" , Toast.LENGTH_LONG).show();
            }else {
                var num1: Int = edt_num1.text.toString().toInt()
                var num2: Int = edt_num2.text.toString().toInt()
                var sum: Int = num1 * num2
                txt_res.text = sum.toString()
                txt_res.setTextColor(Color.parseColor("#0015ff"))
            }
        }


//کد مربوط به تقسیم
        btn_Divide.setOnClickListener {
            if(edt_num1.getText().toString().equals("") || edt_num2.getText().toString().equals("")){
                Toast.makeText(getApplicationContext(),"مقداری وارد نشده است!" , Toast.LENGTH_LONG).show();
            }else {
                var num1: Int = edt_num1.text.toString().toInt()
                var num2: Int = edt_num2.text.toString().toInt()
                var sum: Int = num1 / num2
                txt_res.text = sum.toString()
                txt_res.setTextColor(Color.parseColor("#d37aff"))
            }
        }
    }
}