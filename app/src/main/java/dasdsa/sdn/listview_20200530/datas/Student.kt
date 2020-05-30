package dasdsa.sdn.listview_20200530.datas

class Student(inputName: String, iby: Int, gender: Boolean) {

    val name = inputName //이름이 기본적으로 String이 되도록
    val brithYear = iby  //생년은 기본으로 Int 가 되게
    val isMale = gender   //성별을  boolaed

    // 2020년에 1988년생은 몇살?? 2020 - 1988 +1
    fun getKoreanAge(year: Int) : Int {
        return year - this.brithYear + 1
    }
}