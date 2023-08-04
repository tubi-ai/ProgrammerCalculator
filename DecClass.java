package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DecClass extends Calculator{
    public void decEnable() {
        onRadioButton.setEnabled(false);
        hexRadioButton.setEnabled(true);
        binRadioButton.setEnabled(true);
        decRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        textField.setEnabled(true);
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

    //Overriding actionPerformed() method
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == onRadioButton) {
            enable();//Calling enable() function
        }
        if (source == hexRadioButton)
            new HexClass().hexEnable();
        else if (source == binRadioButton)
            new BinClass().binEnable();
        else if (source == decRadioButton)
            decEnable();
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
        } else if (source == buttonZero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
            }
        } else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
        } else if (source == buttonA) {
            textField.setText(textField.getText() + "A");
        } else if (source == buttonB) {
            textField.setText(textField.getText() + "B");
        } else if (source == buttonC) {
            textField.setText(textField.getText() + "C");
        } else if (source == buttonD) {
            textField.setText(textField.getText() + "D");
        } else if (source == buttonE) {
            textField.setText(textField.getText() + "E");
        } else if (source == buttonF) {
            textField.setText(textField.getText() + "F");
        } else if (source == buttonDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }
        } else if (source == buttonPlus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "+");
            calculation = 1;
        } else if (source == buttonMinus) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "-");
            calculation = 2;
        } else if (source == buttonMul) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "X");
            calculation = 3;
        } else if (source == buttonDiv) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            textField.setText("");
            label.setText(str + "/");
            calculation = 4;
        } else if (source == buttonSqrt) {
            number = Double.parseDouble(textField.getText());
            Double sqrt = Math.sqrt(number);
            textField.setText(Double.toString(sqrt));

        } else if (source == buttonSquare) {
            String str = textField.getText();
            number = Double.parseDouble(textField.getText());
            double square = Math.pow(number, 2);
            String string = Double.toString(square);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
            label.setText("(sqr)" + str);
        } else if (source == buttonReciprocal) {
            number = Double.parseDouble(textField.getText());
            double reciprocal = 1 / number;
            String string = Double.toString(reciprocal);
            if (string.endsWith(".0")) {
                textField.setText(string.replace(".0", ""));
            } else {
                textField.setText(string);
            }
        } else if (source == buttonEqual) {
            //Setting functionality for equal(=) button
            switch (calculation) {
                case 1:
                    answer = number + Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 2:
                    answer = number - Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 3:
                    answer = number * Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
                case 4:
                    answer = number / Double.parseDouble(textField.getText());
                    if (Double.toString(answer).endsWith(".0")) {
                        textField.setText(Double.toString(answer).replace(".0", ""));
                    } else {
                        textField.setText(Double.toString(answer));
                    }
                    label.setText("");
                    break;
            }
        }
    } public static int and(int num1, int num2) {
        // Perform a bitwise AND operation on the two numbers
        return num1 & num2;
    }

    public static int or(int num1, int num2) {
        // Perform a bitwise OR operation on the two numbers
        return num1 | num2;
    }

    public static int xor(int num1, int num2) {
        // Perform a bitwise XOR operation on the two numbers
        return num1 ^ num2;
    }

    public static int not(int num) {
        // Perform a bitwise NOT operation on the number
        return ~num;
    }

    public static int shiftLeft(int num, int shift) {
        // Shift the bits of the number left by the specified number of positions
        return num << shift;
    }

    public static int shiftRight(int num, int shift) {
        // Shift the bits of the number right by the specified number of positions
        return num >> shift;
    }

    public static int parseHex(String hex) {
        // Parse a hexadecimal string and return the corresponding integer value
        return Integer.parseInt(hex, 16);
    }
}
