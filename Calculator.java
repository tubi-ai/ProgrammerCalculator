package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import java.awt.event.ActionListener;

//implementing ActionListener interface
public class Calculator  implements ActionListener {
    //Creating variables for our calculations
    double number;
    double answer;
    int calculation;
    static String hexNum = null, binNum = null, decNum = null;
    JFrame frame;
    JLabel label = new JLabel();
    JTextField textField = new JTextField();
    JRadioButton onRadioButton = new JRadioButton("on");
    JRadioButton offRadioButton = new JRadioButton("off");
    JRadioButton hexRadioButton = new JRadioButton("Hex");
    JRadioButton binRadioButton = new JRadioButton("Bin");
    JRadioButton decRadioButton = new JRadioButton("Dec");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonClear = new JButton("C");
    JButton buttonDelete = new JButton("DEL");
    JButton buttonEqual = new JButton("=");
    JButton buttonMul = new JButton("x");
    JButton buttonDiv = new JButton("/");
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonSquare = new JButton("x\u00B2");
    JButton buttonReciprocal = new JButton("1/x");
    JButton buttonSqrt = new JButton("\u221A");
    JButton buttonA = new JButton("A");
    JButton buttonB = new JButton("B");
    JButton buttonC = new JButton("C");
    JButton buttonD = new JButton("D");
    JButton buttonE = new JButton("E");
    JButton buttonF = new JButton("F");
    JButton buttonOr = new JButton("Or");
    JButton buttonAnd = new JButton("And");
    JButton buttonXor = new JButton("Xor");
    JButton buttonNot = new JButton("Not");
    JButton buttonSLeft = new JButton("S_Left");
    JButton buttonSRight = new JButton("S_Right");

    Calculator() {
        prepareGUI();
        addComponents();
        addActionEvent();
    }

    public void prepareGUI() {
        frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setSize(440, 610);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents() {
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.white);
        frame.add(label);


        textField.setBounds(10, 40, 270, 40);
        textField.setFont(new Font("Arial", Font.BOLD, 20));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onRadioButton.setBounds(10, 95, 60, 40);
        onRadioButton.setSelected(true);
        onRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        onRadioButton.setBackground(Color.black);
        onRadioButton.setForeground(Color.white);
        frame.add(onRadioButton);

        hexRadioButton.setBounds(80, 95, 60, 40);
        hexRadioButton.setSelected(true);
        hexRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        hexRadioButton.setBackground(Color.black);
        hexRadioButton.setForeground(Color.white);
        frame.add(hexRadioButton);

        binRadioButton.setBounds(80, 120, 60, 40);
        binRadioButton.setSelected(false);
        binRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        binRadioButton.setBackground(Color.black);
        binRadioButton.setForeground(Color.white);
        frame.add(binRadioButton);

        decRadioButton.setBounds(150, 95, 60, 40);
        decRadioButton.setSelected(true);
        decRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        decRadioButton.setBackground(Color.black);
        decRadioButton.setForeground(Color.white);
        frame.add(decRadioButton);

        offRadioButton.setBounds(10, 120, 60, 40);
        offRadioButton.setSelected(false);
        offRadioButton.setFont(new Font("Arial", Font.BOLD, 14));
        offRadioButton.setBackground(Color.black);
        offRadioButton.setForeground(Color.white);
        frame.add(offRadioButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(onRadioButton);
        buttonGroup.add(offRadioButton);

        ButtonGroup bdx = new ButtonGroup();
        bdx.add(hexRadioButton);
        bdx.add(binRadioButton);
        bdx.add(decRadioButton);

        buttonSeven.setBounds(10, 230, 60, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSeven);

        buttonEight.setBounds(80, 230, 60, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonEight);

        buttonNine.setBounds(150, 230, 60, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonNine);

        buttonFour.setBounds(10, 290, 60, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFour);

        buttonFive.setBounds(80, 290, 60, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonFive);

        buttonSix.setBounds(150, 290, 60, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSix);

        buttonOne.setBounds(10, 350, 60, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonOne);

        buttonTwo.setBounds(80, 350, 60, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonTwo);

        buttonThree.setBounds(150, 350, 60, 40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonThree);

        buttonA.setBounds(10, 410, 60, 40);
        buttonA.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonA);

        buttonB.setBounds(80, 410, 60, 40);
        buttonB.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonB);

        buttonC.setBounds(150, 410, 60, 40);
        buttonC.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonC);

        buttonD.setBounds(10, 470, 60, 40);
        buttonD.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonD);

        buttonE.setBounds(80, 470, 60, 40);
        buttonE.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonE);

        buttonF.setBounds(150, 470, 60, 40);
        buttonF.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonF);

        buttonDot.setBounds(150, 530, 60, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonDot);

        buttonZero.setBounds(10, 530, 130, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonZero);

        buttonEqual.setBounds(220, 470, 60, 100);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 20));
        buttonEqual.setBackground(new Color(239, 188, 2));
        frame.add(buttonEqual);

        buttonDiv.setBounds(220, 350, 60, 40);
        buttonDiv.setFont(new Font("Arial", Font.BOLD, 20));
        buttonDiv.setBackground(new Color(239, 188, 2));
        frame.add(buttonDiv);

        buttonSqrt.setBounds(10, 170, 60, 40);
        buttonSqrt.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(buttonSqrt);

        buttonMul.setBounds(220, 230, 60, 40);
        buttonMul.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMul.setBackground(new Color(239, 188, 2));
        frame.add(buttonMul);

        buttonMinus.setBounds(220, 170, 60, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonMinus.setBackground(new Color(239, 188, 2));
        frame.add(buttonMinus);

        buttonPlus.setBounds(220, 290, 60, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 20));
        buttonPlus.setBackground(new Color(239, 188, 2));
        frame.add(buttonPlus);

        buttonSquare.setBounds(80, 170, 60, 40);
        buttonSquare.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonSquare);

        buttonReciprocal.setBounds(150, 170, 60, 40);
        buttonReciprocal.setFont(new Font("Arial", Font.BOLD, 15));
        frame.add(buttonReciprocal);

        buttonOr.setBounds(290, 170, 60, 40);
        buttonOr.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonOr);

        buttonAnd.setBounds(290, 230, 60, 40);
        buttonAnd.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonAnd);

        buttonXor.setBounds(290, 290, 60, 40);
        buttonXor.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonXor);

        buttonNot.setBounds(290, 350, 60, 40);
        buttonNot.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(buttonNot);

        buttonSLeft.setBounds(220, 410, 60, 40);
        buttonSLeft.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonSLeft);

        buttonSRight.setBounds(290, 410, 60, 40);
        buttonSRight.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonSRight);

        buttonDelete.setBounds(220, 110, 60, 40);
        buttonDelete.setFont(new Font("Arial", Font.BOLD, 12));
        //buttonDelete.setBackground(Color.red);
        //buttonDelete.setForeground(Color.white);
        frame.add(buttonDelete);

        buttonClear.setBounds(290, 110, 60, 40);
        buttonClear.setFont(new Font("Arial", Font.BOLD, 12));
        //buttonClear.setBackground(Color.red);
        //buttonClear.setForeground(Color.white);
        frame.add(buttonClear);

    }
    public void enable() {
        onRadioButton.setEnabled(false);
        hexRadioButton.setEnabled(true);
        binRadioButton.setEnabled(true);
        decRadioButton.setEnabled(true);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
        buttonA.setEnabled(true);
        buttonB.setEnabled(true);
        buttonC.setEnabled(true);
        buttonD.setEnabled(true);
        buttonE.setEnabled(true);
        buttonF.setEnabled(true);
        buttonSLeft.setEnabled(true);
        buttonSRight.setEnabled(true);
        buttonOr.setEnabled(true);
        buttonXor.setEnabled(true);
        buttonNot.setEnabled(true);
        buttonAnd.setEnabled(true);
        label.setEnabled(true);
        buttonClear.setEnabled(true);
        buttonDelete.setEnabled(true);
        buttonDiv.setEnabled(true);
        buttonSqrt.setEnabled(true);
        buttonSquare.setEnabled(true);
        buttonReciprocal.setEnabled(true);
        buttonMinus.setEnabled(true);
        buttonSeven.setEnabled(true);
        buttonEight.setEnabled(true);
        buttonNine.setEnabled(true);
        buttonMul.setEnabled(true);
        buttonFour.setEnabled(true);
        buttonFive.setEnabled(true);
        buttonSix.setEnabled(true);
        buttonPlus.setEnabled(true);
        buttonOne.setEnabled(true);
        buttonTwo.setEnabled(true);
        buttonThree.setEnabled(true);
        buttonEqual.setEnabled(true);
        buttonZero.setEnabled(true);
        buttonDot.setEnabled(true);

    }

    public void disable() {
        onRadioButton.setEnabled(true);
        hexRadioButton.setEnabled(false);
        binRadioButton.setEnabled(false);
        decRadioButton.setEnabled(false);
        offRadioButton.setEnabled(false);
        textField.setText("");
        label.setText(" ");
        buttonClear.setEnabled(false);
        buttonDelete.setEnabled(false);
        buttonDiv.setEnabled(false);
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(false);
        buttonReciprocal.setEnabled(false);
        buttonMinus.setEnabled(false);
        buttonSeven.setEnabled(false);
        buttonEight.setEnabled(false);
        buttonNine.setEnabled(false);
        buttonMul.setEnabled(false);
        buttonFour.setEnabled(false);
        buttonFive.setEnabled(false);
        buttonSix.setEnabled(false);
        buttonPlus.setEnabled(false);
        buttonOne.setEnabled(false);
        buttonTwo.setEnabled(false);
        buttonThree.setEnabled(false);
        buttonEqual.setEnabled(false);
        buttonZero.setEnabled(false);
        buttonDot.setEnabled(false);
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);
        buttonE.setEnabled(false);
        buttonF.setEnabled(false);
        buttonSLeft.setEnabled(false);
        buttonSRight.setEnabled(false);
        buttonOr.setEnabled(false);
        buttonXor.setEnabled(false);
        buttonNot.setEnabled(false);
        buttonAnd.setEnabled(false);
    }
    public void addActionEvent() {
        //Registering ActionListener to buttons
        onRadioButton.addActionListener(this);
        offRadioButton.addActionListener(this);
        hexRadioButton.addActionListener(this);
        binRadioButton.addActionListener(this);
        decRadioButton.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonDelete.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonPlus.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonZero.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonA.addActionListener(this);
        buttonB.addActionListener(this);
        buttonC.addActionListener(this);
        buttonD.addActionListener(this);
        buttonE.addActionListener(this);
        buttonF.addActionListener(this);
        buttonSLeft.addActionListener(this);
        buttonSRight.addActionListener(this);
        buttonOr.addActionListener(this);
        buttonXor.addActionListener(this);
        buttonNot.addActionListener(this);
        buttonAnd.addActionListener(this);

    }
    //Overriding actionPerformed() method
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == onRadioButton) {
            enable();//Calling enable() function
        }
        if (source == hexRadioButton) {
            new HexClass().hexEnable();

        } else if (source == binRadioButton)
            new BinClass().binEnable();
        else if (source == decRadioButton)
            new DecClass().decEnable();
        else if (source == offRadioButton) {
            disable();//Calling disable function
        } else if (source == buttonClear) {
            //Clearing texts of label and text field
            label.setText("");
            textField.setText("");
        } else if (source == buttonDelete) {
            //Setting functionality for delete button(backspace)
            int length = textField.getText().length();
            int number = length - 1;


            if (length > 0) {
                StringBuilder back = new StringBuilder(textField.getText());
                back.deleteCharAt(number);
                textField.setText(back.toString());

            }
            if (textField.getText().endsWith("")) {
                label.setText("");
            }
        }
    }
}
