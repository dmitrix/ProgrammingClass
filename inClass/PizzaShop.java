
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PizzaShop extends JApplet
{
    private int intBold = Font.PLAIN;
    private int intItalic = Font.PLAIN;

    private JCheckBox tomatoCB, greenPepperCB,
                      blackOliveCB, mushroomCB,
                      extraCheeseCB, pepproniCB,
                      sausageCB;

    private JRadioButton smallRB, mediumRB, largeRB;

    private JRadioButton thinCrustRB, mediumCrustRB,
                         panPizzaRB;

    private ButtonGroup pizzaSizeBGroup,
                        pizzaTypeBGroup;

    private JTextArea selectionTextArea;

    private JButton processOrderB;
    private JLabel orderL;

    private EventHandler eHandler;

    public void init()
    {
        Container c = getContentPane();
        c.setLayout(null);

        eHandler = new EventHandler();

        tomatoCB = new JCheckBox("Tomato");
        greenPepperCB = new JCheckBox("Green Peppper");
        blackOliveCB = new JCheckBox("Black Olives");
        mushroomCB = new JCheckBox("Mushrooms");

		extraCheeseCB = new JCheckBox("Extra Cheese");

        pepproniCB = new JCheckBox("Pepproni");
        sausageCB = new JCheckBox("Sausage");

        tomatoCB.setSize(120, 30);
        greenPepperCB.setSize(120,30);
        blackOliveCB.setSize(120, 30);
        mushroomCB.setSize(120, 30);
        extraCheeseCB.setSize(120,30);
        pepproniCB.setSize(120, 30);
        sausageCB.setSize(120,30);

        tomatoCB.setLocation(40, 85);
        greenPepperCB.setLocation(40,110);
        blackOliveCB.setLocation(40, 135);
        mushroomCB.setLocation(40, 160);
        extraCheeseCB.setLocation(40,185);
        pepproniCB.setLocation(40, 210);
        sausageCB.setLocation(40,235);

        c.add(tomatoCB);
        c.add(greenPepperCB);
        c.add(blackOliveCB);
        c.add(mushroomCB);
        c.add(extraCheeseCB);
        c.add(pepproniCB);
        c.add(sausageCB);

        smallRB = new JRadioButton("Small: $6.50", true);
        mediumRB = new JRadioButton("Medium: $8.50");
        largeRB = new JRadioButton("Large: $10.00");

        smallRB.setSize(120, 30);
        mediumRB.setSize(120, 30);
        largeRB.setSize(120, 30);

        smallRB.setLocation(220, 90);
        mediumRB.setLocation(220, 130);
        largeRB.setLocation(220, 170);

        pizzaSizeBGroup = new ButtonGroup();
        pizzaSizeBGroup.add(smallRB);
        pizzaSizeBGroup.add(mediumRB);
        pizzaSizeBGroup.add(largeRB);

        c.add(smallRB);
        c.add(mediumRB);
        c.add(largeRB);

        thinCrustRB = new JRadioButton("Thin Crust", true);
        mediumCrustRB = new JRadioButton("Medium Crust");
        panPizzaRB = new JRadioButton("Pan");

        thinCrustRB.setSize(120, 30);
        mediumCrustRB.setSize(120, 30);
        panPizzaRB.setSize(120, 30);

        thinCrustRB.setLocation(370, 90);
        mediumCrustRB.setLocation(370, 130);
        panPizzaRB.setLocation(370, 170);

        pizzaTypeBGroup = new ButtonGroup();
        pizzaTypeBGroup.add(thinCrustRB);
        pizzaTypeBGroup.add(mediumCrustRB);
        pizzaTypeBGroup.add(panPizzaRB);

        c.add(thinCrustRB);
        c.add(mediumCrustRB);
        c.add(panPizzaRB);

        processOrderB = new JButton("Process Selection");
        processOrderB.setSize(200, 30);
        processOrderB.setLocation(210, 220);
        c.add(processOrderB);
        processOrderB.addActionListener(eHandler);

        orderL = new JLabel("Your order:");
        orderL.setSize(100, 30);
        orderL.setLocation(40, 270);
        c.add(orderL);

        selectionTextArea = new JTextArea();
        selectionTextArea.setVisible(true);
        selectionTextArea.setSize(450, 100);
        selectionTextArea.setLocation(40, 300);

        c.add(selectionTextArea);


    } //end init

    public void paint( Graphics g)
    {
        super.paint(g);
        g.setColor(Color.red);
        g.setFont(new Font("Ariel", intBold + intItalic, 24));
        g.drawString("Welcome to Home Style Pizza Shop", 30, 30);

        g.setFont(new Font("Ariel", intBold + intItalic, 12));
        g.drawString("Each Topping: $1.50", 40, 80);
        g.drawRect(30,60, 150, 210);

        g.drawString("Pizza Size", 220, 80);
        g.drawRect(210, 60, 130, 150);

        g.drawString("Pizza Type", 370, 80);
        g.drawRect(360, 60, 130, 150);

    } //end paint

    private class EventHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            double amountDue = 0.0;
            String str = "";

            if (e.getSource() == processOrderB)
            {
                str = str + "Pizza type: ";

                if (thinCrustRB.isSelected())
                    str = str + "thin crust \n";
                else if (mediumCrustRB.isSelected())
                    str = str + "medium crust \n";
                else if (panPizzaRB.isSelected())
                    str = str + "pan \n";

                str = str + "Pizza size: ";

                if (smallRB.isSelected())
                {
                    str = str + "small \n";
                    amountDue = amountDue + 6.50;
				}
                else if (mediumRB.isSelected())
                {
                    str = str + "medium \n";
                    amountDue = amountDue + 8.50;
				}
                else if (largeRB.isSelected())
                {
                    str = str + "large \n";
                    amountDue = amountDue + 10.00;
				}

                str = str + "Toppings: ";

                if (tomatoCB.isSelected())
                {
                    str = str + "tomato, ";
                    amountDue = amountDue + 1.50;
                }

                if (greenPepperCB.isSelected())
                {
                    str = str + "green pepper, ";
                    amountDue = amountDue + 1.50;
                }

                if (blackOliveCB.isSelected())
                {
                    str = str + "black olives, ";
                    amountDue = amountDue + 1.50;
                }

                if (mushroomCB.isSelected())
                {
                    str = str + "mushrooms, ";
                    amountDue = amountDue + 1.50;
                }

                if (extraCheeseCB.isSelected())
                {
                    str = str + "extra chese, ";
                    amountDue = amountDue + 1.50;
                }

                if (pepproniCB.isSelected())
                {
                    str = str + "pepproni, ";
                    amountDue = amountDue + 1.50;
                }

                if (sausageCB.isSelected())
                {
                    str = str + "sausage ";
                    amountDue = amountDue + 1.50;
                }

                str = str + "\nAmount Due: $" + amountDue;

                selectionTextArea.setText(str);
            }

            repaint();
        } //end itemStateChanged
    } //end EventHandler
}
