package dasdsa.sdn.listview_20200530

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dasdsa.sdn.listview_20200530.datas.Student

class ViewStudentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_student)

        val student = intent.getSerializableExtra("student") as Student

    }
}
