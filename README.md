# INTERFACEDE-DEGISKENLER

Selam,

Bir interface içerisinde 
public BigDecimal bakiye =BigDecimal.ZERO; yazılması ile 

public static BigDecimal bakiye =BigDecimal.ZERO; yazılması aynı iştir. Interface bu değişkeni static olarak dışarı açar.
Default değer vermek zorunludur. Uygulama ayakta olduğu sürece ram de aynı adresi kullanır.
Aynı adresi günceller. Veritipinin ilkel yada nesne kaynaklı olması farketmez.(int /Integer gibi)

Inerface i analist gibi düşünürsek, 

Sadece yapılacak işleri söyleyen ve içeriğe karışmayan özel bir sınıftır. 
İçerisinde global değişkenler tanımlamak süreçlerin birbirine girmesine ,
kod kalitesinin düşmesine ve bakım sürelerinin armasına neden olur. 
loose coupling(Esnek Bağ) prensibine de aykırı olacaktır.

 Bir süreçle ilgili işlerin tek bir interface de toplanıp methodlar aracılığı ile cevap alınması daha doğru olur.

C# tarafında bu tarz kullanımlarda default parametre vermeye gerek olmadığını duymuştum.

  
