package com.example.lab2.data;

import com.example.lab2.data.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class DataSource {
    public static final List<Category> categories = new ArrayList<>();

    static {
        Category sedans = new Category("Sedans", null, Set.of(
                new Car("Volkswagen Passat 2020", "https://cdn1.riastatic.com/photosnew/auto/photo/volkswagen_passat__487732011f.webp",
                        "Volkswagen", "Passat", 2020, 87000, 33000),
                new Car("Mercedes-Benz S-Class 2017", "https://cdn2.riastatic.com/photosnew/auto/photo/mercedes-benz_s-class__487764352f.webp",
                        "Mercedes-Benz", "S-Class", 2017, 58000, 74500),
                new Car("Genesis G80 prestige 2019", "https://cdn3.riastatic.com/photosnew/auto/photo/genesis_g80__490057943f.webp",
                        "Genesis", "G80", 2019, 4000,37000)
        ));

        Category suvs = new Category("SUVs", null, Set.of(
                new Car("Lincoln Navigator Reserve 2019", "https://cdn0.riastatic.com/photosnew/auto/photo/lincoln_navigator__490060065f.webp",
                        "Lincoln", "Navigator", 2019, 34000, 67000),
                new Car("Mercedes-Benz GLS-Class 2017", "https://cdn0.riastatic.com/photosnew/auto/photo/mercedes-benz_gls-class__478941000f.webp",
                        "Mercedes-Benz", "GLS-Class", 2017, 45000, 59000),
                new Car("Volkswagen Touareg 2018", "https://cdn4.riastatic.com/photosnew/auto/photo/volkswagen_touareg__476334709f.webp",
                        "Volkswagen", "Touareg ", 2018, 87000, 100000),
                new Car("Bentley Bentayga W12 2017", "https://cdn4.riastatic.com/photosnew/auto/photo/bentley_bentayga__483943874f.webp",
                        "Bentley", "Bentayga", 2017, 34000, 189000)
        ));

        Category cars = new Category("Cars", Set.of(sedans, suvs), null);
        sedans.setParentCategory(cars);
        suvs.setParentCategory(cars);

        categories.add(cars); // adding to the main categories list

        Category monitors = new Category("Monitors", null, Set.of(
                new Monitor("Monitor 27\" Asus TUF Gaming VG27AQ (90LM0500-B01370 / B03370) -- IPS 2K / 165 Гц / 8-Bit / 99% sRGB / G-Sync Сompatible / Adaptive-Sync / HDR10",
                        "https://content1.rozetka.com.ua/goods/images/big/18307182.jpg", "Asus", "TUF Gaming", 27),
                new Monitor("Monitor 34\" Dell Alienware AW3423DWF Curved -- QD OLED 10-Bit / 165 Hz / 0.1 ms (GtG) / DisplayHDR True Black 400 / DСI-P3 99.3% / sRGB 149% / G-SYNC Compatible / FreeSync Premium Pro",
                        "https://content.rozetka.com.ua/goods/images/big/322261453.png", "Dell", "Alienware Curved", 34),
                new Monitor("Monitor 28\" Samsung Odyssey G7 S28AG702 (LS28AG702NIXCI) 4K HDR400 / IPS 8-Bit / 144Гц / sRGB 99% / G-SYNC Compatible",
                        "https://content1.rozetka.com.ua/goods/images/big/250044076.jpg", "Samsung", "Odyssey G7", 28),
                new Monitor("Monitor 27\" Philips 272E1GAJ/00 -- VA 8-Bit / 144 Гц / 1 мс MPRT / sRGB 121.9% / FreeSync Premium / G-SYNC Compatible",
                        "https://content2.rozetka.com.ua/goods/images/big/8726112.jpg", "Philips", "272E1GAJ", 27),
                new Monitor("Monitor 27\" Iiyama G-Master G2770QSU-B1 -- Fast IPS 2К / 165Гц / 8-bit / MPRT 0.5ms / AMD FreeSync Premium Pro / G-SYNC Compatible",
                        "https://content2.rozetka.com.ua/goods/images/big/308335215.jpg", "Iiyama", "G-Master", 27)
        ));

        Category smartphones = new Category("Smartphones", null, Set.of(
                new Smartphone("Apple iPhone 14 128GB Starlight (MPUR3RX/A)",
                        "https://content2.rozetka.com.ua/goods/images/big/284913536.jpg", "Apple", "iPhone 14", 12, 128, 200),
                new Smartphone("Samsung Galaxy S23 Ultra 12/256GB Phantom Black (SM-S918BZKGSEK)",
                        "https://content2.rozetka.com.ua/goods/images/big/310649565.jpg", "Samsung", "Galaxy S23", 12, 256, 200),
                new Smartphone("Infinix Note 12 (X663D) 6/128GB Jewel Blue (4895180783692)",
                        "https://content1.rozetka.com.ua/goods/images/big/286089499.jpg", "Infinix", "Note 12", 6, 128, 50),
                new Smartphone("Xiaomi 13 Lite 8/256GB Blue (976164)",
                        "https://content.rozetka.com.ua/goods/images/big/315965135.jpg", "Xiaomi", "13 Lite", 8, 256, 32),
                new Smartphone("Tecno Camon 19 Pro (CI8n) 8/128GB NFC 2SIM Eco Black (4895180784484)",
                        "https://content2.rozetka.com.ua/goods/images/big/282531737.jpg", "Tecno", "Camon 19 Pro", 8, 128, 32)
        ));

        Category pcs = new Category("PCs", null, Set.of(
                new Pc("Asus S500MC-5114000460 (90PF02H1-M00LP0) Intel Core i5-11400/RAM 16ГБ/SSD 512ГБ/GeForce RTX 3060 12ГБ",
                        "https://content1.rozetka.com.ua/goods/images/big/244326268.png", "Asus", "S500MC-5114000460", 16, 512, 12),
                new Pc("Acer Aspire C24-420 (DQ.BFXME.001) Black/Silver",
                        "https://content2.rozetka.com.ua/goods/images/big/115421363.jpg", "Acer", "Aspire", 8, 256 , 2),
                new Pc("COBRA Advanced (I11F.8.H1S2.15T.13356) Core i3-10100F(4 ядра/8 потоків)/RAM 8ГБ/HDD 1ТБ + SSD 240ГБ/GeForce GTX 1050 Ti 4 ГБ",
                        "https://content.rozetka.com.ua/goods/images/big/322496825.jpg", "COBRA", "Advanced", 8, 240 , 4),
                new Pc("Lenovo IdeaCentre G5 Gaming 14IMB05 (90RE00BDUL)",
                        "https://content1.rozetka.com.ua/goods/images/big/323894501.png", "Lenovo", "IdeaCentre G5 Gaming", 16, 256 , 6),
                new Pc("ARTLINE Gaming X47 (X47v45) AMD Ryzen 5 5500 / 16ГБ DDR4 / HDD 1ТБ + SSD 480ГБ / nVidia GeForce RTX 3060 12 ГБ",
                        "https://content.rozetka.com.ua/goods/images/big/320078659.jpg", "ARTLINE", "Gaming X47", 16, 1504, 12)
        ));

        Category laptops = new Category("Laptops", null, Set.of(
                new Laptop("ASUS TUF Gaming A15 FA506ICB-HN119 (90NR0667-M00KT0) Graphite Black / AMD Ryzen 5 4600H / RAM 16 ГБ / SSD 512 ГБ / nVidia GeForce RTX 3050",
                        "https://content1.rozetka.com.ua/goods/images/big/302686477.jpg", "Asus" , "TUF Gaming A15", 16, 512),
                new Laptop("Apple MacBook Air 13\" M1 256GB 2020 (MGN63) Space Gray",
                        "https://content1.rozetka.com.ua/goods/images/big/144249716.jpg", "Apple" , "MacBook Air 13\"", 8, 256),
                new Laptop("Lenovo IdeaPad 3 15IAU7 (82RK00FHRA) Arctic Grey / Intel Core i5-1235U / RAM 16 ГБ / SSD 512 ГБ",
                        "https://content1.rozetka.com.ua/goods/images/big/320929253.jpg", "Lenovo" , "IdeaPad 3", 16, 512),
                new Laptop("Acer Aspire 3 A315-58G-548E (NX.ADUEU.01N) Pure Silver / Intel Core i5-1135G7 / RAM 8 ГБ / SSD 512 ГБ / nVidia GeForce MX350",
                        "https://content1.rozetka.com.ua/goods/images/big/286638013.jpg", "Acer" , "Aspire 3", 8, 512),
                new Laptop("HP Pavilion 15-eh2234nw (715A9EA_V1) Silver",
                        "https://content2.rozetka.com.ua/goods/images/big/318248429.jpg", "HP" , "Pavilion", 16, 1024)
        ));

        categories.add(new Category("Electronics", Set.of(monitors, smartphones, pcs, laptops), null));
    }
}
