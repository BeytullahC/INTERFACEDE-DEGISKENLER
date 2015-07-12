/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.math.BigDecimal;


public class ParaIslemleriImpl implements ParaIslemleri {

    @Override
    public boolean paraGonder(BigDecimal tutar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean paraCek(BigDecimal tutar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BigDecimal bakiyeSorgula() {
        return ParaIslemleri.bakiye;
    }

    @Override
   public BigDecimal returnStaticBakiye(){
       return staticBakiye;
   }
    
    
}
