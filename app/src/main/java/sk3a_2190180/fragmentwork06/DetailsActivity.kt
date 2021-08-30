package sk3a_2190180.fragmentwork06

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    lateinit var binding : ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_details)

        car_name.text = getIntent().getStringExtra("CARNAME")
        car_description.text = getIntent().getStringExtra("CARDESC")
        image_car.setImageResource(getIntent().getStringExtra("CARLOGO").toInt())

    }
}