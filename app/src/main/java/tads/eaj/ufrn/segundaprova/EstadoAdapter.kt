package tads.eaj.ufrn.segundaprova

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EstadoAdapter : RecyclerView.Adapter<EstadoViewholder>() {
    lateinit var listEstados: List<Estado>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EstadoViewholder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.estado_inflater, parent, false)
        val holder = EstadoViewholder(v)

        return holder
    }

    override fun onBindViewHolder(holder: EstadoViewholder, position: Int) {
        val estado = listEstados.get(position)
        holder.nomeTextView.text = estado.nome
    }

    override fun getItemCount(): Int {
        return listEstados.size
    }

}

class EstadoViewholder(v: View) : RecyclerView.ViewHolder(v){
    val nomeTextView = v.findViewById<TextView>(R.id.nomeTextView)
}