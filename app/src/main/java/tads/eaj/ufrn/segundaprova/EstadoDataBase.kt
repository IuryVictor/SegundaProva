package tads.eaj.ufrn.segundaprova

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(version = 1, entities = [Estado::class])
abstract class EstadoDataBase : RoomDatabase(){
    abstract fun EstadoDao():EstadoDao
}