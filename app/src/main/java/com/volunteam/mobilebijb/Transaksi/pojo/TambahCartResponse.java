package com.volunteam.mobilebijb.Transaksi.pojo;

public class TambahCartResponse{
	private int statusCode;
	private String status;

	public void setStatusCode(int statusCode){
		this.statusCode = statusCode;
	}

	public int getStatusCode(){
		return statusCode;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"TambahCartResponse{" + 
			"statusCode = '" + statusCode + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}
