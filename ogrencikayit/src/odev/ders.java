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
