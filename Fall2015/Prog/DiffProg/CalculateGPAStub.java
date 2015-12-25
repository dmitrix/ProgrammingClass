/**
 * CalculateGPAStub.java
 *
 * Marcel Baarsch
 * marcelbaarsch@gmail.com
 *
 * Stub methods required for Prog 4
 */

 /* Import Stuff Here */

public class CalculateGPAStub extends JFrame
{
  public static final int WIDTH;
  public static final int HEIGHT;

  private CalculateButtonHandler calculateButtonHandler;

  /* initialize necessary variables here */

  public CalculateGPAStub()
  {
    /**
     * Window and Element Properties
     * Go Here
     */
  }

  private class CalculateButtonHandler implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
      /**
       * Calculation takes place here
       * Upon clicking the calculate button
       */
    }
  }

  public static void main(String[] args)
  {
    CalculateGPAStub gpa = new CalculateGPAStub();
  }

}
