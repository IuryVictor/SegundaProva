package tads.eaj.ufrn.segundaprova

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Estado(var nome:String, var capital:String, var populacao:Int, var area:Int, var regiao:String, var numCidades:Int){
    @PrimaryKey(autoGenerate = true)
    var id:Long = 0
}
