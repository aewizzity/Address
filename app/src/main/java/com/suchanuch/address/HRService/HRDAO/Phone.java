package com.suchanuch.address.HRService.HRDAO;

import com.google.gson.annotations.SerializedName;

/**
 * Created by suchanuch on 5/9/2017.
 */

public class Phone {
    @SerializedName("psd_phone")
    public String psd_phone;

    @SerializedName("psd_cellphone")
    public String psd_cellphone;

    @SerializedName("psd_work_phone")
    public String psd_work_phone;
}
