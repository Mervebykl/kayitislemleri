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
	}}