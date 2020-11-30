package filmoneri;

import java.io.*;   //dosya okumak i�in bu k�t�phaneyi ekledik
import java.util.Random; //random i�in bu k�t�phaneyi ekledik
import java.util.Scanner;



public class Main {
	
	static boolean bulundu = false;
	static int kullanicino=0;
static String[] isimler = {"�smail T�rk","Furkan Ayd�n","Mert �iril","Tugrul Uzun","Hami �z"};
static String[] sifreler = {"Aa12345*","Bb12345*","Cc12345*","Dd12345*","Ee12345*"};
	
static String straks=""; //aksiyon filmlerinin sat�r� i�in bu de�i�keni belirledik	
static int ssaks=satirSayisiaks();  // yaln�zca aksiyon filmlerinin  sat�r say�s�n� belirlemek i�in fonksiyon a�t�k ve bunu ssaks adl� degiskende tuttuk
static String[]	veriaks=new String[ssaks];  //aksiyon filmleri i�in dizi belirledik ve bunun toplam sat�r say�s� kadar oldugunu belirttik

static String strkom="";   //komedi filmleri i�in ilk degiskeni yazd�k
static int sskom=satirSayisikom(); //HER B�R F�LM KATEGOR�S�N�N SATIR SAYISI AYNI OLMADIGI �C�N AYRI AYRI FONKS�YON BEL�RLED�K.
static String[]	verikom=new String[sskom]; //komedi filmlerini dizi icinde tutup kendi kategorisinin sat�r say�s� kadar oldugunu s�yledik

static String strkor="";
static int sskor=satirSayisikor();
static String[]	verikor=new String[sskor];

static String strbil="";
static int ssbil=satirSayisibil();
static String[]	veribil=new String[ssbil];

static String strask="";
static int ssask=satirSayisiask();
static String[]	veriask=new String[ssask];

static String strciz="";
static int ssciz=satirSayisiciz();
static String[]	vericiz=new String[ssciz];

static String strtop=""; //t�m filmlerin tutuldugu degisken(an�n filmi icin)
static int sstop=satirSayisitop(); //tum filmleri bir dosya icine yazd�k ve bunun da sat�r say�s� farkl� olacag� icin farkl� fonksiyon tan�mlamak zorunda kald�k 
static String[]	veritop=new String[sstop]; // toplam veriyi bir dizide tuttuk



static Scanner bekle=new Scanner(System.in);//menuye giris icin entera bas�n durumu i�in yazd�k
	
	
	static Scanner scan=new Scanner(System.in);
	
	
	
	
	public static void main(String[] args) {
		
		login();
		int secenekal =0;
		while( bulundu==true && secenekal!=4 )	{
			MenuGoster();
			SecenekKontrol(secenekal);
		

	}
	}

	
	
public static void MenuGoster() {                           //fonksiyon ile menuyu tan�mlad�k
	System.out.println("Menuye gitmek icin enter'a basiniz");	bekle.nextLine();
	System.out.println("\n **MENU**");
	System.out.println("1-Kategorileri G�r");
	System.out.println("2-Film Onerisi Iste");
	System.out.println("3-�U ANIN F�LM�!!!");
	System.out.println("4-C�k�s ");
	
}

public static int SecenekKontrol(int secenekal) {  //maine secenekal fonksiyonunu yollad�k ve kullan�c�dan parametre yollamas�n� istedik.��nk� fonksiyon void degil ve deger d�nd�r�yor
	
	System.out.println("L�tfen yapmak istediginiz islemi seciniz..");
	 secenekal=scan.nextInt();
	
	if(secenekal==1) {
		KategoriSec();
		
	
		
	}
	else if(secenekal==2) {
		
		oneri();
		
		
		
	}
	else if(secenekal==3) {
		gununFilmi();
	
}
	else if(secenekal==4)
	{
		bulundu=false;
		System.out.println("��k�s yap�ld�. iyi gunler dileriz..");
		
	
}
	else {
		System.out.println("Yanl�s secim yaptiniz tekrar deneyiniz.."); //4ten daha farkl� bir sayi girilmesi durumunda hata verdik
	}
	return secenekal;
}


public static void login() {
	boolean bulundu1=false;
	
do {   //1 sefer de olsa mutlaka g�rmek istiyoruz
	bulundu=false;

String kAdi;
String kSifre;


System.out.println("\n ***** Film Oneri Uygulamas�na Hosgeldiniz *****\n");
System.out.print("L�tfen Adinizi ve soyadinizi  giriniz: ");
kAdi = scan.nextLine();

System.out.print("L�tfen Sifrenizi giriniz : ");
kSifre = scan.nextLine();



for(int i = 0 ; i<isimler.length ; i++)  //burdaki for ile isimler adl� dizinin i�ine gidip toplam eleman say�s� kadar arad�k
{
	
	
		
		if(kAdi.equals(isimler[i]) )  //eger arad�g�m�z isim ve sifre scan ile okudugumuzla ayn�ysa giris basarili dedik ve kontrol icin tuttugumuz bulundu boolean�n� trueya cevirdik aksi takdirde fasle olsayd� d�ng� devam ederdi
		{
			if(kSifre.equals(sifreler[i]))
			{
				{
					System.out.println("Giri� Basarili! hosgeldin"+isimler[i]);
					bulundu = true;
					bulundu1=false;
					kullanicino=i;
					break;
				}
				
	
				
				
			}
			
		
		}
		
		
	}
	



if(bulundu==false ) {  //isim ve sifrenin bulunamamas� durumunda boolean false olacak ve buraya girecek 
	Scanner sc=new Scanner(System.in);
	System.out.println("Giri� yap�lamad�.Bilgilerinizi kontrol edip tekrar deneyiniz..");
	System.out.println("Tekrar giri� yapmak ister misiniz? (Evet/Hay�r)");
	String cevap=sc.nextLine();
	
	if(cevap.equalsIgnoreCase("evet")) {  //burda evet diyerek kullan�c�n�n tekrar girmek icin login k�sm�na atmas�n� saglad�k ve boolean bulundu1 true dedik
		bulundu1=true;
	}
	else if(cevap.equalsIgnoreCase("hayir")) {
		
	System.out.println("Giris yapma istegi reddedildi!");
		bulundu1=false;
	}
	
}

}while(bulundu1==true);
}

public static int KategoriSec() {

	System.out.println("\n�zlemek istediginiz film kategorisini seciniz\n\n");
	System.out.println("1-Aksiyon");
	System.out.println("2-Korku/Gerilim");
	System.out.println("3-Komedi");
	System.out.println("4-Ask");
	System.out.println("5-Bilim Kurgu");
	System.out.println("6-�izgi Film");
	
	int kategorial=scan.nextInt();
	if(kategorial==1) {
		aksiyonal(); //FONKS�YONLARI CAGIRDIK VE SATIR SAYISI KADAR D�ND�REREK YAZDIRDIK
		for(int i=0;i<ssaks;i++) {   
			System.out.println(veriaks[i]);
		}
	}
	
	else if(kategorial==2) {
		korkual();
		for(int i=0;i<sskor;i++) {
			System.out.println(verikor[i]);
		}
	}
	else if(kategorial==3) {
		komedial();
		for(int i=0;i<sskom;i++) {
			System.out.println(verikom[i]);
		}

	}
	else if(kategorial==4) {
		
		askal();
		for(int i=0;i<ssask;i++) {
			System.out.println(veriask[i]);
		}
	}
	else if(kategorial==5) {
		bilimal();
		for(int i=0;i<ssbil;i++) {
			System.out.println(veribil[i]);
		}
		
		
	}
	else if(kategorial==6) {
		cizgial();
		for(int i=0;i<ssciz;i++) {
			System.out.println(vericiz[i]);
			
		}
	}
	
	else {
		System.out.println("HATALI GIRIS");
	}
	
	
	
	
	
	
	
	
	return kategorial;

	
	
}



public static int satirSayisiaks() { // try blo�u i�inde hesaplanacak ifade yer al�r. Bu ifadenin hesaplanmas�nda bir hata olu�mam��sa, catch bloklar� atlanarak cal�s�r
	int sayac=0;
	try {
		FileInputStream fStream=new FileInputStream("aksiyonfilmleri.txt");
		DataInputStream dStream=new DataInputStream(fStream);
		BufferedReader bReader= new BufferedReader(new InputStreamReader(dStream));
		int i=0;
		while(bReader.readLine()!= null) { //her bir sat�r�n bos olmas� durumunda null deger d�ner  ve bu while yap�s�nda null olmamas� durumunda sat�r say�s�n�n degeri 1 artt�r�l�r null deger denk geldiginde ise d�ng� durur.
	
			
		sayac++; //sat�r say�s�n� artt�r�r�z 
		}
		dStream.close();
		
	}
	catch(Exception e) { //hata olmas� durumunda  catch icine girer ve program�n durmas�n� �nler
		System.out.println("HATA");
	} 
	return sayac;
	
	
}
public static void aksiyonal() {
	try {
		FileInputStream fStream=new FileInputStream("aksiyonfilmleri.txt"); 	//F�LEINPUTSTREAM ile dosyan�n ad�n� uzant�s� ile belirtiriz.
		DataInputStream dStream=new DataInputStream(fStream);						//datainputstream parametre olarak fstreamdan al�r verileri g�rmek i�in
		BufferedReader bReader= new BufferedReader(new InputStreamReader(dStream));		//bufferedreader nesnei ile dosya icindeki verileri okuruz 
		int i=0;
		while((straks=bReader.readLine())!= null) {   				//sat�r say�s� bosluga denk gelirse null degeri d�ner. bu nedenden olay� null olmad�g� s�rece  sat�r say�s� kadar olan degeri okur
	
			
			
			veriaks[i]=straks; 				//okutulan sat�r say�s�n� dizi i�ine g�nderdik ve say� ile sat�rda yaz�lanlar� iliskilendirmis olduk
			i++; 							//1 artt�rarak diger say�larda yazan filmleri okuruz 
		}
		dStream.close(); 					// dosyay� kapatt�k 
		
	}
	catch(Exception e) {
		System.out.println("HATA");
	}
	
	
	
	
	
}

public static int satirSayisikom() {
	int sayac=0;
	try {
		FileInputStream fStream=new FileInputStream("komedifilmleri.txt"); 
		DataInputStream dStream=new DataInputStream(fStream);
		BufferedReader bReader= new BufferedReader(new InputStreamReader(dStream));
		int i=0;
		while(bReader.readLine()!= null) {
	
			
		sayac++;
		}
		dStream.close();
		
	}
	catch(Exception e) {
		System.out.println("HATA");
	} 
	return sayac;
	
	
}
public static void komedial() {
try {
	FileInputStream fStream=new FileInputStream("komedifilmleri.txt");
	DataInputStream dStream=new DataInputStream(fStream);
	BufferedReader bReader= new BufferedReader(new InputStreamReader(dStream));
	int i=0;
	while((strkom=bReader.readLine())!= null) {

		
		
		verikom[i]=strkom;
		i++;
	}
	dStream.close();
	
}
catch(Exception e) {
	System.out.println("HATA");
}




}

public static int satirSayisikor() {
	int sayac=0;
	try {
		FileInputStream fStream=new FileInputStream("korkufilmleri.txt");
		DataInputStream dStream=new DataInputStream(fStream);
		BufferedReader bReader= new BufferedReader(new InputStreamReader(dStream));
		int i=0;
		while(bReader.readLine()!= null) {
	
			
		sayac++;
		}
		dStream.close();
		
	}
	catch(Exception e) {
		System.out.println("HATA");
	} 
	return sayac;
	
	
}
public static void korkual() {
	try {
		FileInputStream fStream=new FileInputStream("korkufilmleri.txt");
		DataInputStream dStream=new DataInputStream(fStream);
		BufferedReader bReader= new BufferedReader(new InputStreamReader(dStream));
		int i=0;
		while((strkor=bReader.readLine())!= null) {
	
			
			
			verikor[i]=strkor;
			i++;
		}
		dStream.close();
		
	}
	catch(Exception e) {
		System.out.println("HATA");
	}
	
	
	
	
	
}

public static int satirSayisibil() {
	int sayac=0;
	try {
		FileInputStream fStream=new FileInputStream("bilimkurgufilmleri.txt");
		DataInputStream dStream=new DataInputStream(fStream);
		BufferedReader bReader= new BufferedReader(new InputStreamReader(dStream));
		int i=0;
		while(bReader.readLine()!= null) {
	
			
		sayac++;
		}
		dStream.close();
		
	}
	catch(Exception e) {
		System.out.println("HATA");
	} 
	return sayac;
	
	
}
public static void bilimal() {
	try {
		FileInputStream fStream=new FileInputStream("bilimkurgufilmleri.txt");
		DataInputStream dStream=new DataInputStream(fStream);
		BufferedReader bReader= new BufferedReader(new InputStreamReader(dStream));
		int i=0;
		while((strbil=bReader.readLine())!= null) {
	
			
			
			veribil[i]=strbil;
			i++;
		}
		dStream.close();
		
	}
	catch(Exception e) {
		System.out.println("HATA");
	}
	
	
	
	
}

public static int satirSayisiask() {
	int sayac=0;
	try {
		FileInputStream fStream=new FileInputStream("askfilmleri.txt");
		DataInputStream dStream=new DataInputStream(fStream);
		BufferedReader bReader= new BufferedReader(new InputStreamReader(dStream));
		int i=0;
		while(bReader.readLine()!= null) {
	
			
		sayac++;
		}
		dStream.close();
		
	}
	catch(Exception e) {
		System.out.println("HATA");
	} 
	return sayac;
	
	
}
public static void askal() {

try {
	FileInputStream fStream=new FileInputStream("askfilmleri.txt");
	DataInputStream dStream=new DataInputStream(fStream);
	BufferedReader bReader= new BufferedReader(new InputStreamReader(dStream));
	int i=0;
	while((strask=bReader.readLine())!= null) {

		
		
		veriask[i]=strask;
		i++;
	}
	dStream.close();
	
}
catch(Exception e) {
	System.out.println("HATA");
}





}

public static int satirSayisiciz() {
	int sayac=0;
	try {
		FileInputStream fStream=new FileInputStream("cizgifilmler.txt");
		DataInputStream dStream=new DataInputStream(fStream);
		BufferedReader bReader= new BufferedReader(new InputStreamReader(dStream));
		int i=0;
		while(bReader.readLine()!= null) {
	
			
		sayac++;
		}
		dStream.close();
		
	}
	catch(Exception e) {
		System.out.println("HATA");
	} 
	return sayac;
	
	
}
public static void cizgial() {
try {
	FileInputStream fStream=new FileInputStream("cizgifilmler.txt");
	DataInputStream dStream=new DataInputStream(fStream);
	BufferedReader bReader= new BufferedReader(new InputStreamReader(dStream));
	int i=0;
	while((strciz=bReader.readLine())!= null) {

		
		
		vericiz[i]=strciz;
		i++;
	}
	dStream.close();
	
}
catch(Exception e) {
	System.out.println("HATA");
}






}


public static void oneri() {
	Random randomNum=new Random(); //kategorisine g�re random bir say� atad�k ve bu say�larla filmsat�rlar�n� ili�kilendirerek random bir film �rettik
	

	
	
	

		System.out.println("\n�neri istediginiz kategoriyi seciniz..\n\n");
		System.out.println("1-Aksiyon");
		System.out.println("2-Korku/Gerilim");
		System.out.println("3-Komedi");
		System.out.println("4-Ask");
		System.out.println("5-Bilim Kurgu");
		System.out.println("6-�izgi Film");
		
		int kategorial=scan.nextInt();
		if(kategorial==1) {
			aksiyonal();
			int oneri1=randomNum.nextInt(12); //max 12ye kadar gitmesini istedik
			oneri1+=3;  //ilk �� sat�r bos oldugundan +3 ekledik
			
			System.out.println("Sizin i�in �nerimiz:"+veriaks[oneri1]); //TOPLAM VER�N�N TUTULDUGU YERE CIKAN RANDOM SAYIYI G�NDER�YOR VE ORADAK� F�LM� YAZDIRIYORUZ
			}
		
		
		else if(kategorial==2) {
			korkual();
			int oneri1=randomNum.nextInt(9);
			oneri1+=3;//boslugu yazmamas� icin 3 ekliyoruz
			
			System.out.println("Sizin i�in �nerimiz:"+verikor[oneri1]);
		}
		else if(kategorial==3) {
			komedial();
			int oneri1=randomNum.nextInt(7);
			oneri1+=3;
			
			System.out.println("Sizin i�in �nerimiz:"+verikom[oneri1]);

		}
		else if(kategorial==4) {
			
			askal();
			int oneri1=randomNum.nextInt(6);
			oneri1+=3;
			
			System.out.println("Sizin i�in �nerimiz:"+veriask[oneri1]);
		}
		else if(kategorial==5) {
			bilimal();
			int oneri1=randomNum.nextInt(12);
			oneri1+=3;
			
			System.out.println("Sizin i�in �nerimiz:"+veribil[oneri1]);
			
			
		}
		else if(kategorial==6) {
			cizgial();
			int oneri1=randomNum.nextInt(21);
			oneri1+=3;
			
			System.out.println("Sizin i�in �nerimiz:"+vericiz[oneri1]);
		}
		
		else {
			System.out.println("HATALI GIRIS");
		}
		
		
		
	
		
	
		
		

	
	
	
	
	
}



public static int satirSayisitop() { //tum filmlerin oldugu dosaya icin sat�r say�s� bulmak istedik
	
	int sayac=0;
	try {
		FileInputStream fStream=new FileInputStream("filmlertop.txt");
		DataInputStream dStream=new DataInputStream(fStream);
		BufferedReader bReader= new BufferedReader(new InputStreamReader(dStream));
		int i=0;
		while(bReader.readLine()!= null) {
	
			
		sayac++;
		}
		dStream.close();
		
	}
	catch(Exception e) {
		System.out.println("HATA");
	} 
	return sayac;
	
	
	
}


public static void toplamal() { //t�m filmleri bir dosyada toplayarak kategori g�zetmeksizin bir film ald�k 
try {
	FileInputStream fStream=new FileInputStream("filmlertop.txt");
	DataInputStream dStream=new DataInputStream(fStream);
	BufferedReader bReader= new BufferedReader(new InputStreamReader(dStream));
	int i=0;
	while((strtop=bReader.readLine())!= null) { 

		
		
		veritop[i]=strtop;  //dosya icindeki filmleri top adl� diziye atad�k 
		i++;
	}
	dStream.close();
	
}
catch(Exception e) {
	System.out.println("HATA");
}



}

public static void gununFilmi() {
	
	Random randomNum=new Random(); 
	
		toplamal();
	
	int tavsiye=randomNum.nextInt(sstop); //random say� ald�k, max toplam filmlerin oldugu dosyadaki say� kadar 
	System.out.println("TAM DA �U ANIN F�LM�: "+veritop[tavsiye]); //toplam verisi i�ine random donen degeri yollad�k ve bunu yazd�rd�k 
	
	
	
	
}



}


