package odev;
import java.util.Scanner;
public class anasayfa {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ogrenci[] ogrencilistesi = null;
		ders[] derslistesi = null;
		 
		int sayac=0,kontrol,bolNo,ogrID = 0,ogrSinif,dersID = 0,dersKredi,bolAdet,ogrenciAdet=0,dersAdet=0;
		boolean deger=true;
		int aranacaksinif;
		String bolAd,ogrAd,ogrSoyad,dersAd,aranacakders;
		
		System.out.println("\nKaç Adet Bölüm Gireceksiniz : ");
		bolAdet=scan.nextInt();
		bolum[]bolumlistesi= new bolum[bolAdet];
		for(int i=0;i<bolAdet;i++) {
			System.out.print("Bölümün numarasýný giriniz : ");
			bolNo = scan.nextInt();scan.nextLine();
			System.out.print("Bölümün adini giriniz : ");
			bolAd = scan.nextLine();
			System.out.print("\nBu bölümde kaç Ögrenci var : ");
			ogrenciAdet = scan.nextInt();scan.nextLine();
			ogrencilistesi = new ogrenci[ogrenciAdet];
		
		for(int j=0;j<ogrenciAdet;j++) {
			System.out.print("Öðrencinin adýný giriniz : ");
			ogrAd = scan.nextLine();
			System.out.print( "Ögrencinin soyadini giriniz : ");
			ogrSoyad = scan.nextLine();
			System.out.print("Ögrencinin sýnýfýný giriniz : ");
			ogrSinif = scan.nextInt();scan.nextLine();
			ogrencilistesi[j] = new ogrenci(bolNo, ogrID,  ogrAd,ogrSoyad, ogrSinif);
		}
		System.out.print("\nDers sayýsýný giriniz : ");
		dersAdet = scan.nextInt();scan.nextLine();
		derslistesi=new ders[dersAdet];
		for (int k = 0; k < dersAdet; k++) {
			System.out.println( "Dersin adýný giriniz : ");
			dersAd = scan.nextLine();
			System.out.println("Dersin kredisini giriniz : ");
			dersKredi = scan.nextInt();scan.nextLine();
		derslistesi[k] = new ders( bolNo,dersID,dersAd,dersKredi);
		
		}
		bolumlistesi[i] = new bolum(bolNo, bolAd, ogrencilistesi, derslistesi);
		}
		while(deger) {
			System.out.println("\n-------------------MENÜ-----------------");
			System.out.println("1- Tüm Bölümlerin Bilgilerini Listele");
			System.out.println("2- Bölüm Adýna Göre Arama Yap");
			System.out.println("3- Öðrenci Adýna Göre Arama Yap");
			System.out.println("4- Ders Adýna Gore Arama Yap");
			System.out.println("5- Sýnýf Bilgisine Göre Öðrencileri Bul");
			System.out.println("6- Ders Kredisine Göre Dersleri Bul");
			System.out.println("7- ÇIKIÞ	");
			kontrol=scan.nextInt();scan.nextLine();
				switch(kontrol) {
				case 1:
					for(int bolumsayac=0;bolumsayac<bolumlistesi.length;bolumsayac++) {
						System.out.printf("\nBölüm No : "+bolumlistesi[bolumsayac].getBolNo());
						System.out.printf(" Bölüm Adý : "+bolumlistesi[bolumsayac].getBolAd());
						System.out.println("\nÖðrenciler : ");
						for(int ogrencisayac=0;ogrencisayac<bolumlistesi[bolumsayac].ogrencilistesi.length;ogrencisayac++) {
							System.out.printf((ogrencisayac+1)+". Öðrencinin : "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getOgrID());
							System.out.printf("  "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getOgrAd());
							System.out.printf("  "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getOgrSoyad());
							System.out.printf("  "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getogrSinif());
						}
						System.out.println("\nDersler ");
							for(int dersayac=0;dersayac<bolumlistesi[bolumsayac].derslistesi.length;dersayac++) {
								System.out.printf((dersayac+1)+" .Ders: "+bolumlistesi[bolumsayac].derslistesi[dersayac].getDersID());
								System.out.printf(" "+bolumlistesi[bolumsayac].derslistesi[dersayac].getDersAd());
								System.out.printf(" "+bolumlistesi[bolumsayac].derslistesi[dersayac].getDersKredi());
							}
					}
					break;
				case 2:
						System.out.println("Aranacak Bölümün Adýný Giriniz : ");
						String aranacakbol = scan.nextLine();
						for(int bolumsayac=0;bolumsayac<bolumlistesi.length;bolumsayac++) {
								if(bolumlistesi[bolumsayac].getBolAd().equals(aranacakbol)) {
									sayac++;
									System.out.printf("Bölüm No : "+bolumlistesi[bolumsayac].getBolNo());
									System.out.printf(" Bölüm Adý : "+bolumlistesi[bolumsayac].getBolAd());
									System.out.println("Öðrenciler : ");
									for(int ogrencisayac=0;ogrencisayac<bolumlistesi[bolumsayac].ogrencilistesi.length;ogrencisayac++) {
										System.out.printf((ogrencisayac+1)+". Öðrencinin : "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getOgrID());
										System.out.printf("  "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getOgrAd());
										System.out.printf("  "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getOgrSoyad());
										System.out.printf("  "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getogrSinif());
									}
									System.out.println("\nDersler ");
										for(int dersayac=0;dersayac<bolumlistesi[bolumsayac].derslistesi.length;dersayac++) {
											System.out.printf((dersayac+1)+" .Ders: "+bolumlistesi[bolumsayac].derslistesi[dersayac].getDersID());
											System.out.printf(" "+bolumlistesi[bolumsayac].derslistesi[dersayac].getDersAd());
											System.out.printf(" "+bolumlistesi[bolumsayac].derslistesi[dersayac].getDersKredi());
										}
								
								}
							}
						if(sayac==0)
							System.out.println("\nBu Ýsime Sahip Bölüm bulunmamaktadýr..");
					break;
				case 3:
						sayac=0;
						System.out.println("Aranacak Öðrencinin Adýný Giriniz : ");
						String aranacakogr=scan.next();
						for(int bolumsayac=0;bolumsayac<bolumlistesi.length;bolumsayac++) {
							for(int ogrencisayac=0;ogrencisayac<bolumlistesi[bolumsayac].ogrencilistesi.length;ogrencisayac++) {
								if(bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getOgrAd().equals(aranacakogr)) {
								sayac++;
								System.out.println("Bölüm Adý : "+bolumlistesi[bolumsayac].getBolAd());
								System.out.printf("Öðrencinin : "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getOgrID());
								System.out.printf("  "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getOgrAd());
								System.out.printf("  "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getOgrSoyad());
								System.out.printf("  "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getogrSinif());
							}
							}}
						if(sayac==0)
							System.out.println("\nBu Ýsimde Öðrenci Bulunamadý..");
					break;
				case 4:
					sayac=0;
					System.out.println("Aranacak Dersin Adýný Giriniz : ");
					aranacakders=scan.next();
					for(int bolumsayac=0;bolumsayac<bolumlistesi.length;bolumsayac++) {
						for(int dersayac=0;dersayac<bolumlistesi[bolumsayac].derslistesi.length;dersayac++) {
							if(bolumlistesi[bolumsayac].derslistesi[dersayac].getDersAd().equals(aranacakders)) {
								sayac++;
								System.out.printf((dersayac+1)+" .Ders: "+bolumlistesi[bolumsayac].derslistesi[dersayac].getDersID());
								System.out.printf(" "+bolumlistesi[bolumsayac].derslistesi[dersayac].getDersAd());
								System.out.printf(" "+bolumlistesi[bolumsayac].derslistesi[dersayac].getDersKredi());
							}
							}
							}
					if(sayac==0)
						System.out.println("\nBu Ýsme Sahip Ders Bulunamadý..");
					break;
				case 5:
						System.out.println("Aranacak Sýnýf Bilgisini Giriniz : ");
						aranacaksinif=scan.nextInt();scan.nextLine();
						for(int bolumsayac=0;bolumsayac<bolumlistesi.length;bolumsayac++) {
							for(int ogrencisayac=0;ogrencisayac<bolumlistesi[bolumsayac].ogrencilistesi.length;ogrencisayac++) {
								if(bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getogrSinif()==aranacaksinif) {
									sayac++;
									System.out.println("Bölüm Adý : "+bolumlistesi[bolumsayac].getBolAd());
									System.out.printf("Öðrencinin : "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getOgrID());
									System.out.printf("  "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getOgrAd());
									System.out.printf("  "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getOgrSoyad());
									System.out.printf("  "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getogrSinif());
								}								
								}
								}
						if(sayac==0)
							System.out.println("\nBu Bilgide Veri Bulunamadý..");
					break;
				case 6:
						System.out.println("Aranacak Dersin Kredi Bilgisi");
						int aranacakkredi=scan.nextInt();scan.nextLine();
						for(int bolumsayac=0;bolumsayac<bolumlistesi.length;bolumsayac++) {
							for(int dersayac=0;dersayac<bolumlistesi[bolumsayac].derslistesi.length;dersayac++) {
								if(bolumlistesi[bolumsayac].derslistesi[dersayac].getDersKredi()==aranacakkredi) {
									sayac++;
									System.out.printf((dersayac+1)+" .Ders: "+bolumlistesi[bolumsayac].derslistesi[dersayac].getDersID());
									System.out.printf(" "+bolumlistesi[bolumsayac].derslistesi[dersayac].getDersAd());
									System.out.printf(" "+bolumlistesi[bolumsayac].derslistesi[dersayac].getDersKredi());
								}}}
						if(sayac==0)
							System.out.println("\nBu Kredide Ders Bulunamadý..");
					break;
				case 7:
						System.out.println("---------------------PROGRAM SONLANDIRILDI-------------");
						deger=false;
					break;
					
				}
		}
	}
		
		
	}
	
