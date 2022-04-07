package mlr.cramer;
class MultipleLinearRegression {
    double  beta2,beta1,beta0,Ds;
    HelperArithmetic ha;
    MultipleLinearRegression(HelperArithmetic consultar){
        this.ha = consultar;
        calcularDeterminante();
    }

private void calcularDeterminante() {
Ds = (ha.getN()*ha.getSumX1pow2()*ha.getSumX2pow2())+(ha.getSumX1()*ha.getSumX1X2()*ha.getSumX2())+(ha.getSumX2()*ha.getSumX1()*ha.getSumX1X2())-
(ha.getSumX2()*ha.getSumX1pow2()*ha.getSumX2())-(ha.getSumX1X2()*ha.getSumX1X2()*ha.getN())-(ha.getSumX2pow2()*ha.getSumX1()*ha.getSumX1());
}
public double calcularBeta0() {
beta0 = (ha.getSumY()*ha.getSumX1pow2()*ha.getSumX2pow2())+(ha.getSumX1()*ha.getSumX1X2()*ha.getSumX2Y())+(ha.getSumX2()*ha.getSumX1Y()*ha.getSumX1X2())-
(ha.getSumX2Y()*ha.getSumX1pow2()*ha.getSumX2())-(ha.getSumX1X2()*ha.getSumX1X2()*ha.getSumY())-(ha.getSumX2pow2()*ha.getSumX1Y()*ha.getSumX1());
beta0 /= Ds;
return beta0;
}
public double calcularBeta1() {
beta1 = (ha.getN()*ha.getSumX1Y()*ha.getSumX2pow2())+(ha.getSumY()*ha.getSumX1X2()*ha.getSumX2())+(ha.getSumX2()*ha.getSumX1()*ha.getSumX2Y())-
(ha.getSumX2()*ha.getSumX1Y()*ha.getSumX2())-(ha.getSumX2Y()*ha.getSumX1X2()*ha.getN())-(ha.getSumX2pow2()*ha.getSumX1()*ha.getSumY());
beta1 /= Ds;
return beta1;
}
public double calcularBeta2() {
beta2 = (ha.getN()*ha.getSumX1pow2()*ha.getSumX2Y())+(ha.getSumX1()*ha.getSumX1Y()*ha.getSumX2())+(ha.getSumY()*ha.getSumX1()*ha.getSumX1X2())-
(ha.getSumX2()*ha.getSumX1pow2()*ha.getSumY())-(ha.getSumX1X2()*ha.getSumX1Y()*ha.getN())-(ha.getSumX2Y()*ha.getSumX1()*ha.getSumX1());
beta2 /= Ds;
return beta2;
}
}

