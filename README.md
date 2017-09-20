# Adres Defteri

## Ön Yazı

Bu projede;

> Web arayüzü olarak `JSF/CSS`
  
> Nesnelerin veritabanıyla ilişkilendirilmesi için `JPA`

> Kütüphane bağımlılıkları için `Maven`

> Veritabanı olarak `MySQL`

> Uygulama sunucusu olarak `GlassFish`

kullanılmıştır.

  Bu projeyi NetBeans 8.2 IDE kullanılarak tasarlandım. Bunun sebebi kullanıcı dostu bir IDE olduğuna inanmam ve kullanmayı en iyi bildiğim IDE olmasıdır.
  Veritabanı olarak MySQL kullandım. Son derece geniş kaynaklara, kolay kurulum ve kolay kullanıma sahiptir. Bunların yanında özellikle küçük çaplı projeler için yeterince güçlü olduğuna inanıyorum.

### Projenin Kurulumu ve Nasıl Çalışır Hale Geleceği

> Öncelikle gerekli programlar;
* GlassFish v4
    * Adresinden indirin. ( https://javaee.github.io/glassfish/download )
    * Zip'ten çıkarın. Kurulum tamamlanmış oldu.
* WampServer 
    * Adresinden indirin. ( http://www.wampserver.com/en/ )
    * Kurun. ( https://www.youtube.com/watch?v=Tn9DgwRQVRs )
* Ve tabi ki projemiz.
    * https://github.com/sercandorman/AdresDefteri adresinden download zip ile indirip, dizini çıkarın.

1. GlassFish'i başlatın.
    * cmd çalıştırıp glassfish4 klasörünün içindeki bin klasörüne kadar gidin. (Ör: cd ~/glassfish4/bin)
    * `asadmin start-domain` yazıp girin ve sunucunun başlamasını bekleyin. Başladıktan sonra cmd açık kalsın. :hand:
2. WampServer'ı başlatın.
    * Sağ alttaki simgesinden Start All Services yapmanız yeterli olmalıdır.
3. GlassFish ile projeyi deploy edin. ( Türkçe karşılığını bilmiyorum :) )
    * Açık bıraktığımız cmd'den devam edelim. Öncelikle projemizin target klasörünün içindeki war uzantılı dosyayı deploy edeceğimizi 
    bilelim. Bu yüzden `asadmin deploy ~/AdresDefteri/target/myDirectory-1.0.war` yazıp girdikten sonra başarıyla deploy edildiğini 
    görmeliyiz. ( Kaynak : https://www.youtube.com/watch?v=rdft-BpN_t4 )
    
    
> Projemizi indirip sunucularımızı kurduğumuza göre projemiz çalışmaya hazır.
  Tarayıcıyı açıp `localhost:8080/AdresDefteri/index.xhtml` yazdıktan sonra projemizi kullanabiliriz.

**İyi Çalışmalar** :blush:
    `
    
    
    
