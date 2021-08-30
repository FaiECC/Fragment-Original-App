package sk3a_2190180.fragmentwork06

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private var layoutManager : RecyclerView.LayoutManager? = null
    private var adapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        layoutManager = LinearLayoutManager(this)

        recyclerView.layoutManager = layoutManager

        adapter = RecyclerAdapter()
        recyclerView.adapter = adapter
    }

//     fun onItemClick(item: Coffee, position: Int) {
////        Toast.makeText(this, item.name , Toast.LENGTH_SHORT).show()
//        val intent = Intent(this, DetailsActivity::class.java)
//        intent.putExtra("NAME", item.name)
//        intent.putExtra("DESC", item.description)
//        intent.putExtra("LOGO", item.logo.toString())
//        startActivity(intent)
//    }
}