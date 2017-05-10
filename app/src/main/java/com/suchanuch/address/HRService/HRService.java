package com.suchanuch.address.HRService;

import com.suchanuch.address.HRService.HRDAO.HRDAO;
import com.suchanuch.address.HRService.HRDAO.HRDAO2;
import com.suchanuch.address.HRService.HRDAO.HRDAO3;

import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by suchanuch on 5/9/2017.
 */

public interface HRService {

    @POST("/TSP57/PCK/application/views/hr/moblie_service/v_address.php")
    Call<HRDAO> getvalue();
    @POST("/TSP57/PCK/application/views/hr/moblie_service/v_address2.php")
    Call<HRDAO2> getvalue2();
    @POST("/TSP57/PCK/application/views/hr/moblie_service/v_phone.php")
    Call<HRDAO3> getvalue3();


}
