package com.dimiwinanda.utsdimi
//untuk mengatasi error pada DisplayMessageActivity kita bisa menggunakan sendMessage.
//pada konstruktor intent kita menggunakan 2 parameter, yaitu Context dan Class
//terdapat import android.content.Intent dan import android.os.Bundle; yang berfungsi untuk 
//membaca Data dengan  tipe String, angka (integer, float, double), ArrayList, boolean, array, character, dan lain sebagainya.
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dimiwinanda.utsdimi.databinding.ActivityLoginBinding

//AppCompat Library biasanya digunakan untuk mengimplementasikan ActionBar/Toolbar dan 
//Material Design pada aplikasi yang kita buat di Android Studio,
//akan tetapi saat ini sudah menjadi bawaan saat kita membuat project. 

class LoginActivity : AppCompatActivity() {
    
    //inisialisasi variable binding terlebih dahulu diluar fungsi onCreate().
    private lateinit var binding: ActivityLoginBinding
    
    //Untuk menginisiasi/membuat activity
    //Method onCreate menerima parameter savedInstanceState, yang merupakan objek Bundle yang berisi status aktivitas yang sebelumnya disimpan
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // ketika button login di klik maka akan menuju ke halaman home
        binding.btnLogin.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
        }

        // ketika teks havent account di klik maka akan menuju ke halaman register
        binding.tvHaventAccount.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}
