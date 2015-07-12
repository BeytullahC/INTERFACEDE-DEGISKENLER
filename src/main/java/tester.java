/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Belgelerim
 */

public class tester {

    public static void main(String[] args) throws Exception {
        System.out.println(Addresser.addressOf(ParaIslemleri.bakiye));
        System.out.println(Addresser.addressOf(ParaIslemleri.staticBakiye));
        ParaIslemleri paraIslemleri = new ParaIslemleriImpl();
        ParaIslemleri paraIslemleri2 = new ParaIslemleriImpl();
        ParaIslemleri paraIslemleri3 = new ParaIslemleriImpl();
        System.out.println("PARA ISLEMLERI INSTINCE 1");
        System.out.println("BAKIYE");
        System.out.println(paraIslemleri.bakiyeSorgula());
        System.out.println("STATIC BAKIYE");
        System.out.println(paraIslemleri.returnStaticBakiye());
        System.out.println("BAKIYE ADRESI");
        
        System.out.println(Addresser.addressOf(paraIslemleri.bakiyeSorgula()));
        System.out.println("STATIC BAKIYE ADRESI");
        System.out.println(Addresser.addressOf(paraIslemleri.returnStaticBakiye()));
        
        System.out.println("PARA ISLEMLERI INSTINCE 2");
        System.out.println("BAKIYE");
        System.out.println(paraIslemleri2.bakiyeSorgula());
        System.out.println("STATIC BAKIYE");
        System.out.println(paraIslemleri2.returnStaticBakiye());
        System.out.println("BAKIYE ADRESI");
        System.out.println(Addresser.addressOf(paraIslemleri2.bakiyeSorgula()));
        System.out.println("STATIC BAKIYE ADRESI");
        System.out.println(Addresser.addressOf(paraIslemleri2.returnStaticBakiye()));
        
        System.out.println("PARA ISLEMLERI INSTINCE 3");
        System.out.println("BAKIYE");
        System.out.println(paraIslemleri3.bakiyeSorgula());
        System.out.println("STATIC BAKIYE");
        System.out.println(paraIslemleri3.returnStaticBakiye());
        System.out.println("BAKIYE ADRESI");
        System.out.println(Addresser.addressOf(paraIslemleri3.bakiyeSorgula()));
        System.out.println("STATIC BAKIYE ADRESI");
        System.out.println(Addresser.addressOf(paraIslemleri3.returnStaticBakiye()));


    }

}
