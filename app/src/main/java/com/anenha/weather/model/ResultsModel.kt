package com.anenha.weather.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ResultsModel {

    @SerializedName("channel")
    @Expose
    var channel: ChannelModel? = null

}
