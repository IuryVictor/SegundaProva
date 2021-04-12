    package tads.eaj.ufrn.segundaprova

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.Room

class HomeFragmentViewModel(application: Application) : AndroidViewModel(application){
    private var _listEstados = MutableLiveData<List<Estado>>()
    var listEstados: LiveData<List<Estado>> = _listEstados

    init {
        val banco: EstadoDataBase by lazy {
            Room.databaseBuilder(application.applicationContext, EstadoDataBase::class.java, "Estados.sqlite")
                .allowMainThreadQueries()
                .build()
        }

        val estado1 = Estado("RN", "Natal", 100, 3456, "Nordeste", 12)
        val estado2 = Estado("RJ", "RJ", 100, 3456, "Suldeste", 12)
        val estado3 = Estado("SP", "SP", 100, 3456, "Suldeste", 12)
        val estado4 = Estado("MG", "BH", 100, 3456, "Suldeste", 12)
        banco.EstadoDao().insert(estado1)
        banco.EstadoDao().insert(estado2)
        banco.EstadoDao().insert(estado3)
        banco.EstadoDao().insert(estado4)
        _listEstados.value = banco.EstadoDao().listAll()
    }
}