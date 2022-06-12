Feature: Login

Scenario: Basarili Giris Yap
  * Bulunduğumuz url "hepsiburada" değerini içerdiği kontrol edilir.
  * Giriş yap butonu üzerine gelinir.
  * Giriş yap tıklanır.
  * E-posta alanına "beyza.sinemsss@gmail.com" değeri yazılır.
  * Giriş yap butonuna tıklanır.
  * Şifre alanına "Beyza321" değeri yazılır.
  * Şifre alanı giriş yap butonu tıklanır.
  * Hesabım alanı görünene kadar beklenir.
  * "Beyza Sinem Ankara" kullanıcısı ile girildiği kontrol edilir.

Scenario: Yanlis E-posta ile Giris
  * Bulunduğumuz url "hepsiburada" değerini içerdiği kontrol edilir.
  * Giriş yap butonu üzerine gelinir.
  * Giriş yap tıklanır.
  * E-posta alanına "beyza.sinemsss@gmail.com" değeri yazılır.
  * Hata mesajı görünene kadar beklenir.
  * "E-posta adresi eksik veya hatalı." hata mesajı alındığı kontrol edilir.

  Scenario: Yanlis Telefon Numarası ile Giris
    * Bulunduğumuz url "hepsiburada" değerini içerdiği kontrol edilir.
    * Giriş yap butonu üzerine gelinir.
    * Giriş yap tıklanır.
    * E-posta alanına "5336989898" değeri yazılır.
    * Hata mesajı görünene kadar beklenir.
    * "Telefon numarası eksik veya hatalı." hata mesajı alındığı kontrol edilir.

Scenario: Yanlis Sifre ile Giris
  * Bulunduğumuz url "hepsiburada" değerini içerdiği kontrol edilir.
  * Giriş yap butonu üzerine gelinir.
  * Giriş yap tıklanır.
  * E-posta alanına "beyza.sinemsss@gmail.com" değeri yazılır.
  * Giriş yap butonuna tıklanır.
  * Şifre alanına "Beyza321" değeri yazılır.
  * Şifre alanı giriş yap butonu tıklanır.
  * Hata mesajı görünene kadar beklenir.
  * "Girdiğiniz şifre eksik veya hatalı." hata mesajı alındığı kontrol edilir.

Scenario: E-posta Alani Bos Giris Yap
  * Bulunduğumuz url "hepsiburada" değerini içerdiği kontrol edilir.
  * Giriş yap butonu üzerine gelinir.
  * Giriş yap tıklanır.
  * E-posta alanına "beyza.sinemsss@gmail.com" değeri yazılır.
  * Giriş yap butonuna tıklanır.
  * Hata mesajı görünene kadar beklenir.
  * "E-posta adresinizi veya telefon numaranızı girmelisiniz." hata mesajı alındığı kontrol edilir.

Scenario: Sifre Alanı Bos Giris Yap
  * Bulunduğumuz url "hepsiburada" değerini içerdiği kontrol edilir.
  * Giriş yap butonu üzerine gelinir.
  * Giriş yap tıklanır.
  * E-posta alanına "beyza.sinemsss@gmail.com" değeri yazılır.
  * Giriş yap butonuna tıklanır.
  * Şifre alanına tıklanır.
  * Herhangi bir alana tıklanır.
  * Hata mesajı görünene kadar beklenir.
  * "Şifrenizi girmelisiniz." hata mesajı alındığı kontrol edilir.

