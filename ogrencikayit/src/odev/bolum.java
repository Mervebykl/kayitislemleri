package odev;

public class bolum {
	private int bolNo;
	private String bolAd;
	public ogrenci[] ogrencilistesi;
	public ders[] derslistesi;
	
	public int getBolNo() {
		return bolNo;
	}
	public void setBolNo(int bolNo) {
		this.bolNo = bolNo;
	}
	public String getBolAd() {
		return bolAd;
	}
	public void setBolAd(String bolAd) {
		this.bolAd = bolAd;
	}
	public ogrenci[] getOgrencilistesi() {
		return ogrencilistesi;
	}
	public void setOgrencilistesi(ogrenci[] ogrencilistesi) {
		this.ogrencilistesi = ogrencilistesi;
	}
	public ders[] getDerslistesi() {
		return derslistesi;
	}
	public void setDerslistesi(ders[] derslistesi) {
		this.derslistesi = derslistesi;
	}
	public bolum(int bolNo, String bolAd, ogrenci[] ogrencilistesi, ders[] derslistesi) {
		super();
		this.bolNo = bolNo;
		this.bolAd = bolAd;
		this.ogrencilistesi = ogrencilistesi;
		this.derslistesi = derslistesi;
	}
}
