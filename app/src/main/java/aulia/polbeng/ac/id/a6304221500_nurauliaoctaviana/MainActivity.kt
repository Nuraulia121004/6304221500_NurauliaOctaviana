package aulia.polbeng.ac.id.a6304221500_nurauliaoctaviana

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Mengambil view dari layout
        val etSideLength: EditText = findViewById(R.id.etSideLength)
        val btnCalculateVolume: Button = findViewById(R.id.btnCalculateVolume)
        val btnCalculateArea: Button = findViewById(R.id.btnCalculateArea)
        val tvResult: TextView = findViewById(R.id.tvResult)

        // Kalkulasi Volume
        btnCalculateVolume.setOnClickListener {
            val sideLength = etSideLength.text.toString().toDoubleOrNull()

            if (sideLength != null) {
                val volume = sideLength * sideLength * sideLength
                tvResult.text = "Volume Kubus: $volume"
            } else {
                Toast.makeText(this, "Masukkan nilai yang valid", Toast.LENGTH_SHORT).show()
            }
        }

        // Kalkulasi Luas Permukaan
        btnCalculateArea.setOnClickListener {
            val sideLength = etSideLength.text.toString().toDoubleOrNull()

            if (sideLength != null) {
                val surfaceArea = 6 * sideLength * sideLength
                tvResult.text = "Luas Permukaan Kubus: $surfaceArea"
            } else {
                Toast.makeText(this, "Masukkan nilai yang valid", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
