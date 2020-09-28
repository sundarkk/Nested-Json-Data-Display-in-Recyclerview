package com.sundar.demo.Retrofit;

import com.google.gson.annotations.SerializedName;
import com.sundar.demo.Model.Banner;
import com.sundar.demo.Model.Categroy;
import com.sundar.demo.Model.Data;
import com.sundar.demo.Model.DtaClass;
import com.sundar.demo.Model.TopItem;
import com.sundar.demo.Model.TopSelling;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("api/gethomeData")
    Call<DtaClass> getData();


    /*Call<List<Banner>> geImgData();

    Call<List<Categroy>> getBannerData();

    Call<List<TopItem>>getTopItem();

    Call<List<TopSelling>>getTopSelling();
*/

}
