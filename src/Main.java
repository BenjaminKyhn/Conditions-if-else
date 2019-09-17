public class Main {
    public static void main(String[] args) {

        Telefon samsungS10e = new Telefon();
        samsungS10e.navn = "Samsung S10E";
        samsungS10e.størrelse = 5.8;
        samsungS10e.batteri = 3400;
        samsungS10e.pris = 3999;
        samsungS10e.androidOne = false;

        Telefon iPhone11MaxPro = new Telefon();
        iPhone11MaxPro.navn = "iPhone 11 Max Pro";
        iPhone11MaxPro.størrelse = 6.5;
        iPhone11MaxPro.batteri = 3500;
        iPhone11MaxPro.pris = 9799;
        iPhone11MaxPro.androidOne = false;

        Telefon googlePixel3a = new Telefon();
        googlePixel3a.navn = "Google Pixel 3a";
        googlePixel3a.størrelse = 5.6;
        googlePixel3a.batteri = 3000;
        googlePixel3a.pris = 3299;
        googlePixel3a.androidOne = true;

        if (samsungS10e.størrelse <= 6 && samsungS10e.batteri >= 3000 & samsungS10e.pris <= 4500 && samsungS10e.androidOne == true)
            System.out.println("Rasmus køber " + samsungS10e.navn);
        else
            System.out.println("Rasmus køber ikke " + samsungS10e.navn);

        if (iPhone11MaxPro.størrelse <= 6 && iPhone11MaxPro.batteri >= 3000 & iPhone11MaxPro.pris <= 4500 && iPhone11MaxPro.androidOne == true)
            System.out.println("Rasmus køber " + iPhone11MaxPro.navn);
        else
            System.out.println("Rasmus køber ikke " + iPhone11MaxPro.navn);

        if (googlePixel3a.størrelse <= 6 && googlePixel3a.batteri >= 3000 & googlePixel3a.pris <= 4500 && googlePixel3a.androidOne == true)
            System.out.println("Rasmus køber " + googlePixel3a.navn);
        else
            System.out.println("Rasmus køber ikke " + googlePixel3a.navn);

    }

}
