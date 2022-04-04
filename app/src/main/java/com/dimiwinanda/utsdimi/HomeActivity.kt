package com.dimiwinanda.utsdimi
//untuk mengatasi error pada DisplayMessageActivity kita bisa menggunakan sendMessage.
//pada sendMessage konstruktor intent kita menggunakan 2 parameter, yaitu Context dan Class
//terdapat import android.content.Intent dan import android.os.Bundle; yang berfungsi untuk 
//membaca Data dengan  tipe berbentuk String, angka (integer, float, double), ArrayList, boolean, array, character, dan lain sebagainya, 
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dimiwinanda.utsdimi.databinding.ActivityHomeBinding

//AppCompat Library biasanya digunakan untuk mengimplementasikan ActionBar/Toolbar dan 
//Material Design pada aplikasi yang kita buat di Android Studio. 
//akan tetapi saat ini sudah menjadi bawaan saat kita membuat project. 
class HomeActivity : AppCompatActivity() {
    
    //inisialisasi variable binding terlebih dahulu diluar fungsi onCreate().
    private lateinit var binding: ActivityHomeBinding
    
    //Untuk menginisiasi/membuat activity
    //Method onCreate menerima parameter savedInstanceState, yang merupakan objek Bundle yang berisi status aktivitas yang sebelumnya disimpan
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // ketika button logout di klik maka akan menuju ke halaman login
        binding.btnLogout.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}
