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
		
		System.out.println("\nKa� Adet B�l�m Gireceksiniz : ");
		bolAdet=scan.nextInt();
		bolum[]bolumlistesi= new bolum[bolAdet];
		for(int i=0;i<bolAdet;i++) {
			System.out.print("B�l�m�n numaras�n� giriniz : ");
			bolNo = scan.nextInt();scan.nextLine();
			System.out.print("B�l�m�n adini giriniz : ");
			bolAd = scan.nextLine();
			System.out.print("\nBu b�l�mde ka� �grenci var : ");
			ogrenciAdet = scan.nextInt();scan.nextLine();
			ogrencilistesi = new ogrenci[ogrenciAdet];
		
		for(int j=0;j<ogrenciAdet;j++) {
			System.out.print("��rencinin ad�n� giriniz : ");
			ogrAd = scan.nextLine();
			System.out.print( "�grencinin soyadini giriniz : ");
			ogrSoyad = scan.nextLine();
			System.out.print("�grencinin s�n�f�n� giriniz : ");
			ogrSinif = scan.nextInt();scan.nextLine();
			ogrencilistesi[j] = new ogrenci(bolNo, ogrID,  ogrAd,ogrSoyad, ogrSinif);
		}
		System.out.print("\nDers say�s�n� giriniz : ");
		dersAdet = scan.nextInt();scan.nextLine();
		derslistesi=new ders[dersAdet];
		for (int k = 0; k < dersAdet; k++) {
			System.out.println( "Dersin ad�n� giriniz : ");
			dersAd = scan.nextLine();
			System.out.println("Dersin kredisini giriniz : ");
			dersKredi = scan.nextInt();scan.nextLine();
		derslistesi[k] = new ders( bolNo,dersID,dersAd,dersKredi);
		
		}
		bolumlistesi[i] = new bolum(bolNo, bolAd, ogrencilistesi, derslistesi);
		}
		while(deger) {
			System.out.println("\n-------------------MEN�-----------------");
			System.out.println("1- T�m B�l�mlerin Bilgilerini Listele");
			System.out.println("2- B�l�m Ad�na G�re Arama Yap");
			System.out.println("3- ��renci Ad�na G�re Arama Yap");
			System.out.println("4- Ders Ad�na Gore Arama Yap");
			System.out.println("5- S�n�f Bilgisine G�re ��rencileri Bul");
			System.out.println("6- Ders Kredisine G�re Dersleri Bul");
			System.out.println("7- �IKI�	");
			kontrol=scan.nextInt();scan.nextLine();
				switch(kontrol) {
				case 1:
					for(int bolumsayac=0;bolumsayac<bolumlistesi.length;bolumsayac++) {
						System.out.printf("\nB�l�m No : "+bolumlistesi[bolumsayac].getBolNo());
						System.out.printf(" B�l�m Ad� : "+bolumlistesi[bolumsayac].getBolAd());
						System.out.println("\n��renciler : ");
						for(int ogrencisayac=0;ogrencisayac<bolumlistesi[bolumsayac].ogrencilistesi.length;ogrencisayac++) {
							System.out.printf((ogrencisayac+1)+". ��rencinin : "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getOgrID());
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
						System.out.println("Aranacak B�l�m�n Ad�n� Giriniz : ");
						String aranacakbol = scan.nextLine();
						for(int bolumsayac=0;bolumsayac<bolumlistesi.length;bolumsayac++) {
								if(bolumlistesi[bolumsayac].getBolAd().equals(aranacakbol)) {
									sayac++;
									System.out.printf("B�l�m No : "+bolumlistesi[bolumsayac].getBolNo());
									System.out.printf(" B�l�m Ad� : "+bolumlistesi[bolumsayac].getBolAd());
									System.out.println("��renciler : ");
									for(int ogrencisayac=0;ogrencisayac<bolumlistesi[bolumsayac].ogrencilistesi.length;ogrencisayac++) {
										System.out.printf((ogrencisayac+1)+". ��rencinin : "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getOgrID());
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
							System.out.println("\nBu �sime Sahip B�l�m bulunmamaktad�r..");
					break;
				case 3:
						sayac=0;
						System.out.println("Aranacak ��rencinin Ad�n� Giriniz : ");
						String aranacakogr=scan.next();
						for(int bolumsayac=0;bolumsayac<bolumlistesi.length;bolumsayac++) {
							for(int ogrencisayac=0;ogrencisayac<bolumlistesi[bolumsayac].ogrencilistesi.length;ogrencisayac++) {
								if(bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getOgrAd().equals(aranacakogr)) {
								sayac++;
								System.out.println("B�l�m Ad� : "+bolumlistesi[bolumsayac].getBolAd());
								System.out.printf("��rencinin : "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getOgrID());
								System.out.printf("  "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getOgrAd());
								System.out.printf("  "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getOgrSoyad());
								System.out.printf("  "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getogrSinif());
							}
							}}
						if(sayac==0)
							System.out.println("\nBu �simde ��renci Bulunamad�..");
					break;
				case 4:
					sayac=0;
					System.out.println("Aranacak Dersin Ad�n� Giriniz : ");
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
						System.out.println("\nBu �sme Sahip Ders Bulunamad�..");
					break;
				case 5:
						System.out.println("Aranacak S�n�f Bilgisini Giriniz : ");
						aranacaksinif=scan.nextInt();scan.nextLine();
						for(int bolumsayac=0;bolumsayac<bolumlistesi.length;bolumsayac++) {
							for(int ogrencisayac=0;ogrencisayac<bolumlistesi[bolumsayac].ogrencilistesi.length;ogrencisayac++) {
								if(bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getogrSinif()==aranacaksinif) {
									sayac++;
									System.out.println("B�l�m Ad� : "+bolumlistesi[bolumsayac].getBolAd());
									System.out.printf("��rencinin : "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getOgrID());
									System.out.printf("  "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getOgrAd());
									System.out.printf("  "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getOgrSoyad());
									System.out.printf("  "+bolumlistesi[bolumsayac].ogrencilistesi[ogrencisayac].getogrSinif());
								}								
								}
								}
						if(sayac==0)
							System.out.println("\nBu Bilgide Veri Bulunamad�..");
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
							System.out.println("\nBu Kredide Ders Bulunamad�..");
					break;
				case 7:
						System.out.println("---------------------PROGRAM SONLANDIRILDI-------------");
						deger=false;
					break;
					
				}
		}
	}
		
		
	}
	
