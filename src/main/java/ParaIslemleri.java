/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.math.BigDecimal;

/**
 *
 * @author Belgelerim
 */
public interface ParaIslemleri {
    public BigDecimal bakiye =BigDecimal.ZERO;
    public static BigDecimal staticBakiye=BigDecimal.ONE;
    public boolean paraGonder(BigDecimal tutar);
    public boolean paraCek(BigDecimal tutar);
    public BigDecimal bakiyeSorgula();
    public BigDecimal returnStaticBakiye();
}
