package tads.eaj.ufrn.segundaprova

import androidx.room.*

@Dao
interface EstadoDao {
    @Insert
    fun insert(estado: Estado)

    @Update
    fun update(estado: Estado)
    
    @Query("SELECT * FROM estado")
    fun listAll(): List<Estado>

    @Query("SELECT * FROM estado WHERE id = :id")
    fun findById(id: Long): Estado

    @Delete
    fun delete(estado: Estado)
}