package filmoneri;

import java.io.*;   //dosya okumak için bu kütüphaneyi ekledik
import java.util.Random; //random için bu kütüphaneyi ekledik
import java.util.Scanner;



public class Main {
	
	static boolean bulundu = false;
	static int kullanicino=0;
static String[] isimler = {"Ýsmail Türk","Furkan Aydýn","Mert Çiril","Tugrul Uzun","Hami Öz"};
static String[] sifreler = {"Aa12345*","Bb12345*","Cc12345*","Dd12345*","Ee12345*"};
	
static String straks=""; //aksiyon filmlerinin satýrý için bu deðiþkeni belirledik	
static int ssaks=satirSayisiaks();  // yalnýzca aksiyon filmlerinin  satýr sayýsýný belirlemek için fonksiyon açtýk ve bunu ssaks adlý degiskende tuttuk
static String[]	veriaks=new String[ssaks];  //aksiyon filmleri için dizi belirledik ve bunun toplam satýr sayýsý kadar oldugunu belirttik

static String strkom="";   //komedi filmleri için ilk degiskeni yazdýk
static int sskom=satirSayisikom(); //HER BÝR FÝLM KATEGORÝSÝNÝN SATIR SAYISI AYNI OLMADIGI ÝCÝN AYRI AYRI FONKSÝYON BELÝRLEDÝK.
static String[]	verikom=new String[sskom]; //komedi filmlerini dizi icinde tutup kendi kategorisinin satýr sayýsý kadar oldugunu söyledik

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

static String strtop=""; //tüm filmlerin tutuldugu degisken(anýn filmi icin)
static int sstop=satirSayisitop(); //tum filmleri bir dosya icine yazdýk ve bunun da satýr sayýsý farklý olacagý icin farklý fonksiyon tanýmlamak zorunda kaldýk 
static String[]	veritop=new String[sstop]; // toplam veriyi bir dizide tuttuk



static Scanner bekle=new Scanner(System.in);//menuye giris icin entera basýn durumu için yazdýk
	
	
	static Scanner scan=new Scanner(System.in);
	
	
	
	
	public static void main(String[] args) {
		
		login();
		int secenekal =0;
		while( bulundu==true && secenekal!=4 )	{
			MenuGoster();
			SecenekKontrol(secenekal);
		

	}
	}

	
	
public static void MenuGoster() {                           //fonksiyon ile menuyu tanýmladýk
	System.out.println("Menuye gitmek icin enter'a basiniz");	bekle.nextLine();
	System.out.println("\n **MENU**");
	System.out.println("1-Kategorileri Gör");
	System.out.println("2-Film Onerisi Iste");
	System.out.println("3-ÞU ANIN FÝLMÝ!!!");
	System.out.println("4-Cýkýs ");
	
}

public static int SecenekKontrol(int secenekal) {  //maine secenekal fonksiyonunu yolladýk ve kullanýcýdan parametre yollamasýný istedik.çünkü fonksiyon void degil ve deger döndürüyor
	
	System.out.println("Lütfen yapmak istediginiz islemi seciniz..");
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
		System.out.println("Çýkýs yapýldý. iyi gunler dileriz..");
		
	
}
	else {
		System.out.println("Yanlýs secim yaptiniz tekrar deneyiniz.."); //4ten daha farklý bir sayi girilmesi durumunda hata verdik
	}
	return secenekal;
}


public static void login() {
	boolean bulundu1=false;
	
do {   //1 sefer de olsa mutlaka görmek istiyoruz
	bulundu=false;

String kAdi;
String kSifre;


System.out.println("\n ***** Film Oneri Uygulamasýna Hosgeldiniz *****\n");
System.out.print("Lütfen Adinizi ve soyadinizi  giriniz: ");
kAdi = scan.nextLine();

System.out.print("Lütfen Sifrenizi giriniz : ");
kSifre = scan.nextLine();



for(int i = 0 ; i<isimler.length ; i++)  //burdaki for ile isimler adlý dizinin içine gidip toplam eleman sayýsý kadar aradýk
{
	
	
		
		if(kAdi.equals(isimler[i]) )  //eger aradýgýmýz isim ve sifre scan ile okudugumuzla aynýysa giris basarili dedik ve kontrol icin tuttugumuz bulundu booleanýný trueya cevirdik aksi takdirde fasle olsaydý döngü devam ederdi
		{
			if(kSifre.equals(sifreler[i]))
			{
				{
					System.out.println("Giriþ Basarili! hosgeldin"+isimler[i]);
					bulundu = true;
					bulundu1=false;
					kullanicino=i;
					break;
				}
				
	
				
				
			}
			
		
		}
		
		
	}
	



if(bulundu==false ) {  //isim ve sifrenin bulunamamasý durumunda boolean false olacak ve buraya girecek 
	Scanner sc=new Scanner(System.in);
	System.out.println("Giriþ yapýlamadý.Bilgilerinizi kontrol edip tekrar deneyiniz..");
	System.out.println("Tekrar giriþ yapmak ister misiniz? (Evet/Hayýr)");
	String cevap=sc.nextLine();
	
	if(cevap.equalsIgnoreCase("evet")) {  //burda evet diyerek kullanýcýnýn tekrar girmek icin login kýsmýna atmasýný sagladýk ve boolean bulundu1 true dedik
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

	System.out.println("\nÝzlemek istediginiz film kategorisini seciniz\n\n");
	System.out.println("1-Aksiyon");
	System.out.println("2-Korku/Gerilim");
	System.out.println("3-Komedi");
	System.out.println("4-Ask");
	System.out.println("5-Bilim Kurgu");
	System.out.println("6-Çizgi Film");
	
	int kategorial=scan.nextInt();
	if(kategorial==1) {
		aksiyonal(); //FONKSÝYONLARI CAGIRDIK VE SATIR SAYISI KADAR DÖNDÜREREK YAZDIRDIK
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



public static int satirSayisiaks() { // try bloðu içinde hesaplanacak ifade yer alýr. Bu ifadenin hesaplanmasýnda bir hata oluþmamýþsa, catch bloklarý atlanarak calýsýr
	int sayac=0;
	try {
		FileInputStream fStream=new FileInputStream("aksiyonfilmleri.txt");
		DataInputStream dStream=new DataInputStream(fStream);
		BufferedReader bReader= new BufferedReader(new InputStreamReader(dStream));
		int i=0;
		while(bReader.readLine()!= null) { //her bir satýrýn bos olmasý durumunda null deger döner  ve bu while yapýsýnda null olmamasý durumunda satýr sayýsýnýn degeri 1 arttýrýlýr null deger denk geldiginde ise döngü durur.
	
			
		sayac++; //satýr sayýsýný arttýrýrýz 
		}
		dStream.close();
		
	}
	catch(Exception e) { //hata olmasý durumunda  catch icine girer ve programýn durmasýný önler
		System.out.println("HATA");
	} 
	return sayac;
	
	
}
public static void aksiyonal() {
	try {
		FileInputStream fStream=new FileInputStream("aksiyonfilmleri.txt"); 	//FÝLEINPUTSTREAM ile dosyanýn adýný uzantýsý ile belirtiriz.
		DataInputStream dStream=new DataInputStream(fStream);						//datainputstream parametre olarak fstreamdan alýr verileri görmek için
		BufferedReader bReader= new BufferedReader(new InputStreamReader(dStream));		//bufferedreader nesnei ile dosya icindeki verileri okuruz 
		int i=0;
		while((straks=bReader.readLine())!= null) {   				//satýr sayýsý bosluga denk gelirse null degeri döner. bu nedenden olayý null olmadýgý sürece  satýr sayýsý kadar olan degeri okur
	
			
			
			veriaks[i]=straks; 				//okutulan satýr sayýsýný dizi içine gönderdik ve sayý ile satýrda yazýlanlarý iliskilendirmis olduk
			i++; 							//1 arttýrarak diger sayýlarda yazan filmleri okuruz 
		}
		dStream.close(); 					// dosyayý kapattýk 
		
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
	Random randomNum=new Random(); //kategorisine göre random bir sayý atadýk ve bu sayýlarla filmsatýrlarýný iliþkilendirerek random bir film ürettik
	

	
	
	

		System.out.println("\nÖneri istediginiz kategoriyi seciniz..\n\n");
		System.out.println("1-Aksiyon");
		System.out.println("2-Korku/Gerilim");
		System.out.println("3-Komedi");
		System.out.println("4-Ask");
		System.out.println("5-Bilim Kurgu");
		System.out.println("6-Çizgi Film");
		
		int kategorial=scan.nextInt();
		if(kategorial==1) {
			aksiyonal();
			int oneri1=randomNum.nextInt(12); //max 12ye kadar gitmesini istedik
			oneri1+=3;  //ilk üç satýr bos oldugundan +3 ekledik
			
			System.out.println("Sizin için önerimiz:"+veriaks[oneri1]); //TOPLAM VERÝNÝN TUTULDUGU YERE CIKAN RANDOM SAYIYI GÖNDERÝYOR VE ORADAKÝ FÝLMÝ YAZDIRIYORUZ
			}
		
		
		else if(kategorial==2) {
			korkual();
			int oneri1=randomNum.nextInt(9);
			oneri1+=3;//boslugu yazmamasý icin 3 ekliyoruz
			
			System.out.println("Sizin için önerimiz:"+verikor[oneri1]);
		}
		else if(kategorial==3) {
			komedial();
			int oneri1=randomNum.nextInt(7);
			oneri1+=3;
			
			System.out.println("Sizin için önerimiz:"+verikom[oneri1]);

		}
		else if(kategorial==4) {
			
			askal();
			int oneri1=randomNum.nextInt(6);
			oneri1+=3;
			
			System.out.println("Sizin için önerimiz:"+veriask[oneri1]);
		}
		else if(kategorial==5) {
			bilimal();
			int oneri1=randomNum.nextInt(12);
			oneri1+=3;
			
			System.out.println("Sizin için önerimiz:"+veribil[oneri1]);
			
			
		}
		else if(kategorial==6) {
			cizgial();
			int oneri1=randomNum.nextInt(21);
			oneri1+=3;
			
			System.out.println("Sizin için önerimiz:"+vericiz[oneri1]);
		}
		
		else {
			System.out.println("HATALI GIRIS");
		}
		
		
		
	
		
	
		
		

	
	
	
	
	
}



public static int satirSayisitop() { //tum filmlerin oldugu dosaya icin satýr sayýsý bulmak istedik
	
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


public static void toplamal() { //tüm filmleri bir dosyada toplayarak kategori gözetmeksizin bir film aldýk 
try {
	FileInputStream fStream=new FileInputStream("filmlertop.txt");
	DataInputStream dStream=new DataInputStream(fStream);
	BufferedReader bReader= new BufferedReader(new InputStreamReader(dStream));
	int i=0;
	while((strtop=bReader.readLine())!= null) { 

		
		
		veritop[i]=strtop;  //dosya icindeki filmleri top adlý diziye atadýk 
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
	
	int tavsiye=randomNum.nextInt(sstop); //random sayý aldýk, max toplam filmlerin oldugu dosyadaki sayý kadar 
	System.out.println("TAM DA ÞU ANIN FÝLMÝ: "+veritop[tavsiye]); //toplam verisi içine random donen degeri yolladýk ve bunu yazdýrdýk 
	
	
	
	
}



}


