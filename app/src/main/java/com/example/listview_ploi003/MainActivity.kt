package com.example.listview_ploi003

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val titleArr = arrayOf("Irene","Seulgi","Wendy","Joy","Yeri","Taeyeon","Jessica","Sunny","Hyoyeon","Tiffany"
                            ,"Sooyoung","Yuri","YoonA","Seohyun")
    val infoArr = arrayListOf("เบจูฮยอน","คังซึลกิ","ซนซึงวาน","พักซูยอง","คิมเยริม","คิมแทยอน","จองเจสสิก้า","อีซุนกยู","คิมฮโยยอน","ฮวีงมิยอง","ชเวซูยอง","ควอนยูริ","อิมยุนอา","ซอจูฮยอน")

    val context = this

    public final val KEY_TITLE ="INFORMATION"
    public final val KEY_INFO ="INFO"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("Girl Groups")

        val mAdp = ArrayAdapter(context,android.R.layout.simple_list_item_1,titleArr)
        lv_result.adapter = mAdp
        lv_result.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(context, "ชื่ออังกฤษ = ${titleArr[position]} ชื่อไทย = ${infoArr[position]}",Toast.LENGTH_LONG).show()
            val goPageResult = Intent(context,MainInfo::class.java)
            goPageResult.putExtra(KEY_TITLE,titleArr[position])
            goPageResult.putExtra(KEY_INFO,infoArr[position])

            startActivity(goPageResult)
        }
    }
}
