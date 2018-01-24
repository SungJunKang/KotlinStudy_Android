package kr.co.ana.kotlin_app_6

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // AnkoComponent 에 정의된 뷰를 액티비티 화면으로 설정함.
        MainActivityUI().setContentView(this)
    }
}

class MainActivityUI : AnkoComponent<MainActivity>{
    override fun createView(ui: AnkoContext<MainActivity>) = ui.apply{
        verticalLayout{
            // LinearLayout 의 padding 을 12dp로 설정
            padding = dip(12)

            // TextView 추가
            textView("Enter Login Credentials")

            // EditText 를 추가하고, 힌트 문자열을 설정
            editText{
                hint = "E-mail"
            }

            editText{
                hint = "Password"
            }

            // 버튼을 추가
            button("Submit")
        }
    }.view
}
