# Java'da Mernis Kullanımı (Kimlik Doğrulama Servisi)

### Ufak bir not!
Eclipse IDE'si üzerinde anlatım yaptım. Eğer sizde farklı bir IDE mevcut ise ufak bir araştırma ile ya da kurcalayarak uygulayabilirsiniz.

Öncelikle paketlere erişim vb hatalar almamak için uyumlu bir JDK sürümü ile çalışmamız lazım.

Mernis servisi için java 8 stabil sürümmüş, kullandığınız arama motoruna "Java 8 jdk" yazarak indirebilirsiniz.



Kurulumu yaptıktan sonra **Window -> Preferences -> Java -> Installed JRE's** kısmına gidip kurduğunuz sürümün ekli olduğundan emin olunuz.

![jdkEkleme](https://raw.githubusercontent.com/salihdeg/gitHubImages/master/java-examples-readme/mernis-and-jdk/JdkEklemeVeAtama1.png)

Daha sonra hemen altındaki **Execution Enviroments** kısmından 1.8 için atama yapıp kaydedebilirsiniz.

![jdkEkleme2](https://raw.githubusercontent.com/salihdeg/gitHubImages/master/java-examples-readme/mernis-and-jdk/JdkEklemeVeAtama2.png)

Eğer java 8'i bütün projeler için varsayılan seçmediyseniz eklemek istediğiniz projenin kullandığı JDK'yı değiştirmeniz gerekecek.
Bunun için; Projenize sağ tıklayıp **Properties** 'sine gidin.

![defaultJdkDegistirme](https://raw.githubusercontent.com/salihdeg/gitHubImages/master/java-examples-readme/mernis-and-jdk/DefaultJDKDegistirme1.png)

Burada **Java Compiler** altında proje için özel ayarları açmak için **Enable project specific settings** 'e tik atmanız gerekmekte.
Daha sonra sağdaki açılır kutudan 1.8'i seçebilirsiniz.

![defaultJdkDegistirme2](https://raw.githubusercontent.com/salihdeg/gitHubImages/master/java-examples-readme/mernis-and-jdk/DefaultJDKDegistirme2.png)

### Şimdi Mernis'i projeye ekleyip kullanabiliriz.

Projenize sağ tıklayıp **New -> Other** 'a gidin.

![servisEkleme](https://raw.githubusercontent.com/salihdeg/gitHubImages/master/java-examples-readme/mernis-and-jdk/ServisEkleme1.png)

Açılan pencerede **Web Services** altında **Web Service Client** 'ı seçiniz.

![servisEkleme2](https://raw.githubusercontent.com/salihdeg/gitHubImages/master/java-examples-readme/mernis-and-jdk/ServisEkleme2.png)

Burada girmeniz gereken url şu şekilde " **https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?WSDL** " daha sonra next next ya da direk finish diyebilirsiniz.

![servisEkleme3](https://raw.githubusercontent.com/salihdeg/gitHubImages/master/java-examples-readme/mernis-and-jdk/ServisEkleme3.png)

## Kullanımı

Çağırmak istediğiniz class'ın içinde **KPSPublicSoap** 'tan nesne oluşturmanız gerekiyor, sınıfı **KPSPublicSoapProxy** olacak.
TCKimlikDogrulama metodu sırasıyla **TC-Ad-Soyad-Doğum** Yılı alıyor.
TC'yi **long** veri tipinde göndermeniz gerekmekte!
Metod exception fırlattığı için **try-catch** blokları arasına almanız gerekmekte!

Buyrun bir örnek ->

![servisKullanımı](https://raw.githubusercontent.com/salihdeg/gitHubImages/master/java-examples-readme/mernis-and-jdk/ServisKullanimi.png)
