package com.volunteam.mobilebijb.Transaksi.pojo.Id;

public class ProductsItem{
	private String image;
	private String harga;
	private String jumlah;
	private String cartId;
	private String name;
	private String description;
	private String kategori;
	private String id;
	private String stok;

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setHarga(String harga){
		this.harga = harga;
	}

	public String getHarga(){
		return harga;
	}

	public void setJumlah(String jumlah){
		this.jumlah = jumlah;
	}

	public String getJumlah(){
		return jumlah;
	}

	public void setCartId(String cartId){
		this.cartId = cartId;
	}

	public String getCartId(){
		return cartId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setKategori(String kategori){
		this.kategori = kategori;
	}

	public String getKategori(){
		return kategori;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setStok(String stok){
		this.stok = stok;
	}

	public String getStok(){
		return stok;
	}

	@Override
 	public String toString(){
		return 
			"ProductsItem{" + 
			"image = '" + image + '\'' + 
			",harga = '" + harga + '\'' + 
			",jumlah = '" + jumlah + '\'' + 
			",cartId = '" + cartId + '\'' + 
			",name = '" + name + '\'' + 
			",description = '" + description + '\'' + 
			",kategori = '" + kategori + '\'' + 
			",id = '" + id + '\'' + 
			",stok = '" + stok + '\'' + 
			"}";
		}
}
