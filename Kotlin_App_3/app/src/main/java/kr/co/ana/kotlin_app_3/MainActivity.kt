package kr.co.ana.kotlin_app_3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

// activity_main 레이아웃에 있는 뷰를 사용하기 위한 import 문
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_submit.setOnClickListener{
            tv_message.text = "Hello, " + et_name.text.toString()
        }
    }
}
