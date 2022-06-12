Api Istekleri
=====================

| endpoint           | urun   |
|--------------------|-----------|
| /allGrocery/apple  | apple     |
| /allGrocery/grapes | grapes    |


Tum Urun Bilgilerini Alma
--------------------
* "allGrocery" endpointine istek atılır.
* Status code "200" olduğu kontrol edilir.

Urunun Adını Alın
--------------------
* <endpoint> endpointine istek atılır.
* Status code "200" olduğu kontrol edilir.
* Urun adının <urun> olduğu kontrol edilir.

Urun Ekle
--------------------
* "add" endpoint bir body ile istek atılır.
* Status code "201" olduğu kontrol edilir.
* "allGrocery/grapes" endpointine istek atılır.
* Status code "200" olduğu kontrol edilir.

Urun Mevcut Degil
--------------------
* "/allGrocery/cucumber" endpointine istek atılır.
* Status code "404" olduğu kontrol edilir.
* "Product Is Not Exist" mesajı kontrol edilir.

Kotu Sonuc Donen Istek
--------------------
* "/allGrocery/banan" endpointine istek atılır.
* Status code "400" olduğu kontrol edilir.