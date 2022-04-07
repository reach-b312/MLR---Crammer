//Autor: Ricardo Avalos
package mlr.cramer;
import jade.core.Agent;
import jade.core.behaviours.Behaviour;
import javax.swing.JOptionPane;

public class MLRAgent extends Agent {
  @Override
  protected void setup() {
    System.out.println("Agent "+getLocalName()+" started.");
    addBehaviour(new SLRBehaviour());
  } 

  private class SLRBehaviour extends Behaviour {
    int cont=0;
    @Override
    public void action() {
        double mlrx1 = Double.parseDouble(JOptionPane.showInputDialog("Valor de x1: "));
        double mlrx2 = Double.parseDouble(JOptionPane.showInputDialog("Valor de x2: "));
        double b0,b1,b2;
        System.out.println("Agent's action method is executed");
        DataSet ds = new DataSet();
        HelperArithmetic ha = new HelperArithmetic(ds);
        MultipleLinearRegression mlr = new MultipleLinearRegression(ha);
        b0=mlr.calcularBeta0();
        b1=mlr.calcularBeta1();
        b2=mlr.calcularBeta2();
        System.out.printf("\ny = %f +%fX1 + %fX2 ",b0,b1,b2);
        double y = b0 + b1*mlrx1 + b2*mlrx2;
        System.out.print("\ny = "+y);
        cont+=1;
    } 
    @Override
    public boolean done() {
      if (cont == 1)
        return true;
      else
	return false;
    }
   @Override
    public int onEnd() {
      myAgent.doDelete();
      return super.onEnd();
    } 
  }    // END of inner class ...Behaviour
}