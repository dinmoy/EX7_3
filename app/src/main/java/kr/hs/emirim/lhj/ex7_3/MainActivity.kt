package kr.hs.emirim.lhj.ex7_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var textName: TextView
    lateinit var textEmail: TextView
    lateinit var btnEnter: Button
    lateinit var editName: EditText
    lateinit var editEmail: EditText
    lateinit var textToast: TextView
    lateinit var dialogView: View
    lateinit var toastView: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textName=findViewById(R.id.textName)
        textEmail=findViewById(R.id.textEmail)
        btnEnter=findViewById(R.id.btnEnter)
        dialogView=View.inflate(this@MainActivity,R.layout.dialog1,null)
        var dlg=AlertDialog.Builder(this@MainActivity)
        dlg.setTitle("사용자정보입력")
        dlg.setIcon(R.drawable.usericon)
        dlg.setView(dialogView)
        dlg.setPositiveButton("확인"){ dialog,i->
            editName=dialogView.findViewById(R.id.editName)
            editEmail=dialogView.findViewById(R.id.editEmail)
            textName.text=editName.text.toString()
            textEmail.text=editEmail.text.toString()

        }
        dlg.setNegativeButton("취소"){dialog,i->
            var toat= Toast(this@MainActivity)
            toastView=View.inflate(this@MainActivity,R.layout.toast1,null)
            textToast=toastView.findViewById(R.id.textToast)
            textToast.text="취소되었습니다"
            toast.view=toastView
            toast.show()
        }

        dlg.show()


    }
}