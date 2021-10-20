package com.example.hggg.realestate

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hggg.dataClasss.Ads
import com.example.hggg.model.NetworkHelper
import kotlinx.coroutines.launch

class RealestateViewModel : ViewModel() {

    val bodyTypes: MutableLiveData<Ads> = MutableLiveData()

    fun getModels() {
        viewModelScope.launch {
            val response = NetworkHelper.getWeatherService()
                .getAdds("kubadaev48@gmail.com", "bc7684695162842eabd51f366d1e73cf", 25)
            bodyTypes.postValue(response)
        }
    }
}