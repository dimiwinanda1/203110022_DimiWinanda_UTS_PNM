package com.dimiwinanda.utsdimi

//untuk mengatasi error pada DisplayMessageActivity kita bisa menggunakan sendMessage.
//pada konstruktor intent kita menggunakan 2 parameter, yaitu Context dan Class
//terdapat import android.content.Intent dan import android.os.Bundle; yang berfungsi untuk 
//membaca Data dengan  tipe String, angka (integer, float, double), ArrayList, boolean, array, character, dan lain sebagainya.
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dimiwinanda.utsdimi.databinding.ActivityRegisterBinding

//AppCompat Library biasanya digunakan untuk mengimplementasikan ActionBar/Toolbar dan 
//Material Design pada aplikasi yang kita buat di Android Studio,
//akan tetapi saat ini sudah menjadi bawaan saat kita membuat project. 
class RegisterActivity : AppCompatActivity() {

    //inisialisasi variable binding terlebih dahulu diluar fungsi onCreate().
    private lateinit var binding: ActivityRegisterBinding

    //Untuk menginisiasi/membuat activity
    //Method onCreate menerima parameter savedInstanceState, yang merupakan objek Bundle yang berisi status aktivitas yang sebelumnya disimpan
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // setelah kita selesai mengisikan data di form kemudian klik register
        // maka kita akan langsung di arahkan ke halaman login
        binding.btnRegister.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        // ketika teks havent account di klik maka kita akan langsung diarahkan ke halaman login
        binding.tvHaveAccount.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
