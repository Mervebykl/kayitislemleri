package odev;

public class ders {
private int bolNo;
private int dersID;
private String dersAd;
private int dersKredi;
public static int sayac=0;
public int getBolNo() {
	return bolNo;
}
public void setBolNo(int bolNo) {
	this.bolNo = bolNo;
}
public int getDersID() {
	return dersID;
}
public void setDersID(int dersID) {
	this.dersID = dersID;
}
public String getDersAd() {
	return dersAd;
}
public void setDersAd(String dersAd) {
	this.dersAd = dersAd;
}
public int getDersKredi() {
	return dersKredi;
}
public void setDersKredi(int dersKredi) {
	this.dersKredi = dersKredi;
}
public ders(int bolNo, int dersID, String dersAd, int dersKredi) {
	super();
	this.bolNo = bolNo;
	this.dersID = sayac++;
	this.dersAd = dersAd;
	this.dersKredi = dersKredi;
}

}
package odev;

public class ogrenci {
	private int bolNo;
	private int ogrID;
	private String ogrAd;
	private String ogrSoyad;
	private int ogrSinif;
	public static int sayac=0;
	
	public int getBolNo() {
		return bolNo;
	}
	public void setBolNo(int bolNo) {
		this.bolNo = bolNo;
	}
	public int getOgrID() {
		return ogrID;
	}
	public void setOgrID(int ogrID) {
		this.ogrID = ogrID;
	}
	public String getOgrAd() {
		return ogrAd;
	}
	public void setOgrAd(String ogrAd) {
		this.ogrAd = ogrAd;
	}
	public String getOgrSoyad() {
		return ogrSoyad;
	}
	public void setOgrSoyad(String ogrSoyad) {
		this.ogrSoyad = ogrSoyad;
	}
	public int getogrSinif() {
		return ogrSinif;
	}
	public void setSinif(int ogrSinif) {
		ogrSinif = ogrSinif;
	}

public ogrenci(int bolNo, int ogrID, String ogrAd, String ogrSoyad, int ogrSinif) {
		super();
		this.bolNo = bolNo;
		this.ogrID = sayac++;
		this.ogrAd = ogrAd;
		this.ogrSoyad = ogrSoyad;
		this.ogrSinif=ogrSinif;
	}}package odev;

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
