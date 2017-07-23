package com.ballistic.hospital.dto;

/**
 * Created by Lycus 01 on 7/23/2017.
 */
// this class same like a dto
public class DoctorTokenState {
    //
    private String access_token;
    private Integer expires_in;

    public DoctorTokenState() {
        this.access_token = null;
        this.expires_in = null;
    }

    public DoctorTokenState(String access_token, Integer expires_in) {
        this.access_token = access_token;
        this.expires_in = expires_in;
    }

    public String getAccess_token() { return access_token; }

    public void setAccess_token(String access_token) { this.access_token = access_token; }

    public Integer getExpires_in() { return expires_in; }

    public void setExpires_in(Integer expires_in) { this.expires_in = expires_in; }

    @Override
    public String toString() {
        return "DoctorTokenState{" + "access_token='" + access_token + '\'' + ", expires_in=" + expires_in + '}';
    }
}
