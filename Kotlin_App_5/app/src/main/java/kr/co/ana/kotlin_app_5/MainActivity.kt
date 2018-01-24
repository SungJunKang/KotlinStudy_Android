package kr.co.ana.kotlin_app_5

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_1.setOnClickListener{
            // DetailActivity 액티비티를 대상 컴포넌트로 지정하는 인텐트
            val intent = Intent(this, DetailActivity::class.java)

            // DetailActivity 를 실행함.
            startActivity(intent)
        }

        btn_2.setOnClickListener{
            val intent = intentFor<DetailActivity>(
                    // 부가 정보를 Pair 형태로 추가함.
                    "id" to 150L, "title" to "Awesome item")

                    // 인텐트 플래그를 설정함.
                    .noHistory()
        }

        btn_call.setOnClickListener{
            // 전화를 거는 인텐트를 실행함.
            makeCall(number = "01012345678")
        }

        btn_SMS.setOnClickListener{
            // 문자메시지를 발송하는 인텐트를 실행함.
            sendSMS(number = "01012345678", text = "Hello, Kotlin!")
        }

        btn_web.setOnClickListener{
            // 웹페이지를 여는 인텐트를 실행함.
            browse(url = "https://google.com")
        }

        btn_email.setOnClickListener{
            // 이메일을 발송하는 인텐트를 실행함.
            email(email = "std07209@naver.com", subject = "Hello, SungJun Kang", text = "asdasfdsadasd")
        }
    }
}
