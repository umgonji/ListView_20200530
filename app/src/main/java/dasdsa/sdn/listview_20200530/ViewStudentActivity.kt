package dasdsa.sdn.listview_20200530

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dasdsa.sdn.listview_20200530.datas.Student
import kotlinx.android.synthetic.main.activity_view_student.*

class ViewStudentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_student)

        val student = intent.getSerializableExtra("student") as Student

        nameTxt.text = student.name
        ageTxt.text = "${student.getKoreanAge(2020)}세(${student.brithYear}"

        if(student.isMale) {
            gendetTxt.text = "남성"
        }
        else {
            gendetTxt.text = "여성"
        }


    }
}
