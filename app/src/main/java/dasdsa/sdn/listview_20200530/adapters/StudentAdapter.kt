package dasdsa.sdn.listview_20200530.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import dasdsa.sdn.listview_20200530.R
import dasdsa.sdn.listview_20200530.datas.Student

class StudentAdapter(context: Context, resId: Int, list: List<Student>) : ArrayAdapter<Student>(context, resId, list){

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        // getView는 한줄한줄의 모양 /데이터를 설정 함수.
        // 어떤 모양일지만 먼저 결정(뼈대 작업)
        // 그모양에 어떤값을 적어줄지 결정(실제 데이터 출력 작업)

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.student_list_item, null)
        }

        val row = tempRow!!

        // 리턴 해주기 전에 필요 데이터 셋팅 하고 리턴 하도록
        // 자리에 맞는 데이터 불러오기.
        val data = mList.get(position) //data 가 한명의 학생이 되는것이다.

        //XML에서 데이터가 뿌려질 뷰를 가져오자.
        val nameAndAgeTxt = row.findViewById<TextView>(R.id.nameAndAgeTxt)
        val genderTxt = row.findViewById<TextView>(R.id.genderTxt)

        // 상황에 맞는 데이터 셋팅
        nameAndAgeTxt.text = data.name

        if (data.isMale) {
            genderTxt.text = "남성 수강생"
        }
        else {
            genderTxt.text = "여성 수강생"
        }

        return row
    }
}

