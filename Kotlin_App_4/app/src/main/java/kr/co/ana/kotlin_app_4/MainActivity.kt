package kr.co.ana.kotlin_app_4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_short.setOnClickListener{
            // 다음 코드와 동일한 역할을 함.
            // Toast.makeText(Context, "Hello, Kotlin!", Toast.LENGTH_SHORT).show();
            toast("Hello, Kotlin!")
        }

        // 다음 코드와 동일한 역할을 함.
        // Toast.makeText(Context, R.string.hello, Toast.LENGTH_SHORT).show();
        // toast(R.string.hello)

        btn_long.setOnClickListener{
            // 다음 코드와 동일한 역할을 함.
            // Toast.makeText(Context, "Hello, Kotlin!", Toast.LENGTH_LONG).show();
            longToast("Hello, Kotlin!")
        }

        btn_dia1.setOnClickListener{// 다이얼로그의 제목과 본문을 지정함.
            alert(title = "Message", message = "Let's learn Kotlin!"){
                // AlertDialog.Builder.setPositiveButton()에 대응함.
                positiveButton("Yes"){
                    // 버튼을 클릭했을 때 수행할 동작을 구현함.
                    toast("Yay!")
                }

                // AlertDialog.Builder.setNegativeButton()에 대응함.
                negativeButton("No"){
                    // 버튼을 클릭했을 때 수행할 동작을 구현함.
                    longToast("No way...")
                }
            }.show()
        }

        btn_dia2.setOnClickListener{
            // 다이얼로그에 표시할 목록을 생성함.
            val cities = listOf("Seoul", "Tokyo", "Mountain View", "Singapore")

            // 리스트 다이얼로그를 생성하고 표시함.
            selector(title = "Select City", items = cities){ dlg, selection ->
                // 항목을 선택했을 때 수행할 동작을 구현함.
                toast("You selected ${cities[selection]}!")
            }
        }

        btn_dia3.setOnClickListener{
            // 진행률을 표시하는 다이얼로그를 생성함.
            val pd = progressDialog(title = "File Download", message = "Downloading...")

            // 다이얼로그를 표시함.
            pd.show()

            // 진행률을 50으로 조정함.
            pd.progress = 50

            // 진행률을 표시하지 않는 다이얼로그를 생성하고 표시함.
            indeterminateProgressDialog(message = "Please wait...").show()
        }
    }
}
