package mlr.cramer;

class DataSet {
//Atributos de clase
    private double X1[] = new double[]{41.9, 43.4, 43.9, 44.5, 47.3, 47.5, 47.9, 50.2, 52.8, 53.2, 56.7, 57, 63.5, 65.3, 71.1, 77, 77.8};
    private double X2[] = new double[]{29.1, 29.3, 29.5, 29.7, 29.9, 30.3, 30.5, 30.7, 30.8, 30.9, 31.5, 31.7, 31.9, 32, 32.1, 32.5, 32.9};
    private double Y[] = new double[]{251.3, 251.3, 248.3, 267.5, 273, 276.5,  270.3,  274.9, 285, 290, 297, 302.5, 304.5, 309.3, 321.7, 330.7, 349};
//Metodos
public double [] getX1 (){return X1;}
public double [] getX2 (){return X2;}
public double [] getY (){return Y;}
}
