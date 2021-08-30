package sk3a_2190180.fragmentwork06

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_layout.view.*

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    //Coffee List
    private val name = arrayOf("Americano", "Cappuccino", "Latte", "Mocha", "Macchiato" , "Red Eye", "Irish")
    //Details
    private val detail = arrayOf("This is random description", "This is random description", "This is random description",
            "This is random description", "This is random description", "This is random description", "This is random description")
    //Coffee Images
    private val images = listOf(
            R.drawable.americano,R.drawable.cappuccino400x400,R.drawable.latte,R.drawable.mochac,
            R.drawable.macchiato,R.drawable.redeye,R.drawable.irishcoffee)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return name.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTile.text = name[position]
        holder.itemDetail.text = detail[position]
        holder.itemImage.setImageResource(images[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var itemImage = itemView.itemImage
        var itemTile = itemView.itemTitle
        var itemDetail = itemView.itemDetail

        init{
            var itemImage = itemView.findViewById(R.id.itemImage)
            var itemTile = itemView.findViewById(R.id.itemTitle)
            var itemDetail = itemView.findViewById(R.id.itemDetail)

//            itemImage.setImageResource(item.logo)
//            itemTile.text = item.name
//            itemDetail.text = item.description

            itemView.setOnClickListener {
                val position : Int = adapterPosition
                Toast.makeText(itemView.context,"you clicked on ${name[position]}",Toast.LENGTH_SHORT).show()
//                action.onItemClick(item,adapterPosition)
            }
        }
    }
//
//    interface OnCoffeeItemClickListner{
//        fun onItemClick(item: Coffee, position: Int)
//    }
}