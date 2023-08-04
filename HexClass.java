package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HexClass extends Calculator {
    public void hexEnable() {
        onRadioButton.setEnabled(false);
        hexRadioButton.setEnabled(false);
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
        buttonSqrt.setEnabled(false);
        buttonSquare.setEnabled(true);
        buttonReciprocal.setEnabled(false);
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
        // new HexClass.addActionEvent();
    }

    public void addActionEvent() {
        //Registering ActionListener to buttons
        onRadioButton.addActionListener((ActionListener) this);
        offRadioButton.addActionListener((ActionListener) this);
        hexRadioButton.addActionListener((ActionListener) this);
        binRadioButton.addActionListener((ActionListener) this);
        decRadioButton.addActionListener((ActionListener) this);
        buttonClear.addActionListener((ActionListener) this);
        buttonDelete.addActionListener((ActionListener) this);
        buttonDiv.addActionListener((ActionListener) this);
        buttonSqrt.addActionListener((ActionListener) this);
        buttonSquare.addActionListener((ActionListener) this);
        buttonReciprocal.addActionListener((ActionListener) this);
        buttonMinus.addActionListener((ActionListener) this);
        buttonSeven.addActionListener((ActionListener) this);
        buttonEight.addActionListener((ActionListener) this);
        buttonNine.addActionListener((ActionListener) this);
        buttonMul.addActionListener((ActionListener) this);
        buttonFour.addActionListener((ActionListener) this);
        buttonFive.addActionListener((ActionListener) this);
        buttonSix.addActionListener((ActionListener) this);
        buttonPlus.addActionListener((ActionListener) this);
        buttonOne.addActionListener((ActionListener) this);
        buttonTwo.addActionListener((ActionListener) this);
        buttonThree.addActionListener((ActionListener) this);
        buttonEqual.addActionListener((ActionListener) this);
        buttonZero.addActionListener((ActionListener) this);
        buttonDot.addActionListener((ActionListener) this);
        buttonA.addActionListener((ActionListener) this);
        buttonB.addActionListener((ActionListener) this);
        buttonC.addActionListener((ActionListener) this);
        buttonD.addActionListener((ActionListener) this);
        buttonE.addActionListener((ActionListener) this);
        buttonF.addActionListener((ActionListener) this);
        buttonSLeft.addActionListener((ActionListener) this);
        buttonSRight.addActionListener((ActionListener) this);
        buttonOr.addActionListener((ActionListener) this);
        buttonXor.addActionListener((ActionListener) this);
        buttonNot.addActionListener((ActionListener) this);
        buttonAnd.addActionListener((ActionListener) this);

    }

    public static int hexToDec(String hex) {
        // Parse a hexadecimal string and return the corresponding integer value
        return Integer.parseInt(hex, 16);

    }

    public static String decToHex(String dec) {
        int decimal = Integer.parseInt(dec);
        String hex = Integer.toHexString(decimal);
        return hex;
    }

    public static String binToHex(String bin) {
        // Convert the binary number to a hexadecimal number
        String hex = Integer.toHexString(Integer.parseInt(bin, 2));
        return hex;
    }

    public static String hexNumber(int num) {

        String[] numbers = new String[8];

        int k = 0;
        while (num / 16 == 0) {
            int a = num % 16;
            if (num % 16 > 9) {
                switch (a) {
                    case 10:
                        numbers[k] = "A";
                        break;
                    case 11:
                        numbers[k] = "B";
                        break;
                    case 12:
                        numbers[k] = "C";
                        break;
                    case 13:
                        numbers[k] = "D";
                        break;
                    case 14:
                        numbers[k] = "E";
                        break;
                    case 15:
                        numbers[k] = "F";
                        break;
                }

            } else
                numbers[k] = Integer.toString(a);
            num /= 16;
            k++;
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            hexNum += numbers[i];
        }
        return hexNum;
    } //Overriding actionPerformed() method

    //@Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == onRadioButton) {
            enable();//Calling enable() function
        }
        if (source == hexRadioButton)
            new HexClass();
            //hexEnable();
        else if (source == binRadioButton) {
            if (hexNum != null) {
                String bin = Integer.toBinaryString(Integer.parseInt(hexNum, 16));
                textField.setText(bin);
                //textField.setText(BinClass.parseBin((int)answer));
            }  new BinClass().binEnable();
        }
        else if(source == decRadioButton)
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
        } else if (source == buttonZero) {
            if (textField.getText().equals("0")) {
                return;
            } else {
                textField.setText(textField.getText() + "0");
                hexNum+="0";
            }
        } else if (source == buttonOne) {
            textField.setText(textField.getText() + "1");
            hexNum+="1";
        } else if (source == buttonTwo) {
            textField.setText(textField.getText() + "2");
            hexNum+="2";
        } else if (source == buttonThree) {
            textField.setText(textField.getText() + "3");
            hexNum+="3";
        } else if (source == buttonFour) {
            textField.setText(textField.getText() + "4");
            hexNum+="4";
        } else if (source == buttonFive) {
            textField.setText(textField.getText() + "5");
            hexNum+="5";
        } else if (source == buttonSix) {
            textField.setText(textField.getText() + "6");
            hexNum+="6";
        } else if (source == buttonSeven) {
            textField.setText(textField.getText() + "7");
            hexNum+="7";
        } else if (source == buttonEight) {
            textField.setText(textField.getText() + "8");
            hexNum+="8";
        } else if (source == buttonNine) {
            textField.setText(textField.getText() + "9");
            hexNum+="9";
        } else if (source == buttonA) {
            textField.setText(textField.getText() + "A");
            hexNum+="A";
        } else if (source == buttonB) {
            textField.setText(textField.getText() + "B");
            hexNum+="B";
        } else if (source == buttonC) {
            textField.setText(textField.getText() + "C");
            hexNum+="C";
        }else if (source == buttonD) {
            textField.setText(textField.getText() + "D");
            hexNum+="D";
        }else if (source == buttonE) {
            textField.setText(textField.getText() + "E");
            hexNum+="E";
        }else if (source == buttonF) {
            textField.setText(textField.getText() + "F");
            hexNum+="F";
        }else if (source == buttonDot) {
            if (textField.getText().contains(".")) {
                return;

            } else {
                textField.setText(textField.getText() + ".");
                hexNum+=".";
            }
        } else if (source == buttonPlus) {
            String str = textField.getText();
            number = hexToDec(textField.getText());
            textField.setText("");
            label.setText(str + "+");
            calculation = 1;

        } else if (source == buttonMinus) {
            String str = textField.getText();
            number = hexToDec(textField.getText());
            textField.setText("");
            label.setText(str + "-");
            calculation = 2;

        } else if (source == buttonMul) {
            String str = textField.getText();
            number = hexToDec(textField.getText());
            textField.setText("");
            label.setText(str + "X");
            calculation = 3;

        } else if (source == buttonDiv) {
            String str = textField.getText();
            number = hexToDec(textField.getText());
            textField.setText("");
            label.setText(str + "/");
            calculation = 4;

        } else if (source == buttonSqrt) {
            number = hexToDec(textField.getText());
            double sqrt = Math.sqrt(number);
            hexNum = Double.toHexString(sqrt);
            textField.setText(hexNum);

        } else if (source == buttonAnd) {
            String str = textField.getText();
            number = hexToDec(textField.getText());
            textField.setText("");
            label.setText(str + "&");
            calculation = 5;

        } else if (source == buttonOr) {
            String str = textField.getText();
            number = hexToDec(textField.getText());
            textField.setText("");
            label.setText(str + "|");
            calculation = 6;

        } else if (source == buttonXor) {
            String str = textField.getText();
            number = hexToDec(textField.getText());
            textField.setText("");
            label.setText(str + "^");
            calculation = 7;

        } else if (source == buttonNot) {
            String str = textField.getText();
            number = hexToDec (textField.getText());
            int not = ~(int) (number);
            hexNum = Integer.toHexString(not);
            textField.setText(hexNum);

        } else if (source == buttonSLeft) {
            String str = textField.getText();
            number = hexToDec(textField.getText());
            textField.setText("");
            label.setText(str + "<<");
            calculation = 8;

        } else if (source == buttonSRight) {
            String str = textField.getText();
            number = hexToDec(textField.getText());
            textField.setText("");
            label.setText(str + ">>");
            calculation = 9;
        }



        else if (source == buttonEqual) {
            //Setting functionality for equal(=) button
            switch (calculation) {
                case 1:
                    answer = number + hexToDec(textField.getText());
                    // Convert the decimal number to a hexadecimal number
                    hexNum = Double.toHexString(answer);
                    textField.setText(hexNum);
                    label.setText("");
                    break;
                case 2:
                    answer = number - hexToDec(textField.getText());
                    hexNum = Double.toHexString(answer);
                    textField.setText(hexNum);
                    label.setText("");
                    break;
                case 3:
                    answer = number * hexToDec(textField.getText());
                    hexNum = Double.toHexString(answer);
                    textField.setText(hexNum);
                    label.setText("");
                    break;
                case 4:
                    answer = number / hexToDec(textField.getText());
                    hexNum = Double.toHexString(answer);
                    textField.setText(hexNum);
                    label.setText("");
                    break;
                case 5:
                    answer = (int)number & (int)hexToDec(textField.getText());
                    hexNum = Double.toHexString(answer);
                    textField.setText(hexNum);
                    label.setText("");
                    break;
                case 6:
                    answer = (int)number | (int)hexToDec(textField.getText());
                    hexNum = Double.toHexString(answer);
                    textField.setText(hexNum);
                    label.setText("");
                    break;
                case 7:
                    answer = (int)number ^ (int)hexToDec(textField.getText());
                    hexNum = Double.toHexString(answer);
                    textField.setText(hexNum);
                    label.setText("");
                    break;
                case 8:
                    answer = (int)number << (int)hexToDec(textField.getText());
                    hexNum = Double.toHexString(answer);
                    textField.setText(hexNum);
                    label.setText("");
                    break;
                case 9:
                    answer = (int)number >> (int)hexToDec(textField.getText());
                    hexNum = Double.toHexString(answer);
                    textField.setText(hexNum);
                    label.setText("");
                    break;
            }
        }
    }
}