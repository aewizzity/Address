package com.suchanuch.address.HRService.HRDAO;

import com.google.gson.annotations.SerializedName;

/**
 * Created by suchanuch on 5/9/2017.
 */

public class Address2 {

    @SerializedName("psd_addcur_no")
    public String psd_addcur_no; //ที่อยู่

    @SerializedName("dist_name")
    public String dist_name; // ตำบล

    @SerializedName("amph_name")
    public String amph_name; //อำเภอ

    @SerializedName("pv_name")
    public String pv_name; //จังหวัด

    @SerializedName("psd_addcur_zipcode")
    public String psd_addcur_zipcode; //รหัสไปรษณีย์

}
