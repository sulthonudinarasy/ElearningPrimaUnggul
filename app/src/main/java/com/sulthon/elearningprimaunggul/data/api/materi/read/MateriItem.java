package com.sulthon.elearningprimaunggul.data.api.materi.read;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class MateriItem implements Serializable {

	@SerializedName("nama")
	private String nama;

	@SerializedName("url_file")
	private String urlFile;

	@SerializedName("id")
	private String id;

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return nama;
	}

	public void setUrlFile(String urlFile){
		this.urlFile = urlFile;
	}

	public String getUrlFile(){
		return urlFile;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	@NonNull
	@Override
 	public String toString(){
		return 
			"MateriItem{" + 
			"nama = '" + nama + '\'' + 
			",url_file = '" + urlFile + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}