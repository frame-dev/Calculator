package de.framedev.calculator.main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * / This Plugin was Created by FrameDev
 * / Package : de.framedev.calculator.main
 * / ClassName Gui
 * / Date: 19.02.22
 * / Project: Calculator
 * / Copyrighted by FrameDev
 */

public class Gui {
    private JTextPane textPane1;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JButton button1;
    private JButton xButton;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a0Button;
    private JPanel panel;
    private JButton clearButton;
    private String numberOne = "";
    private String numberTwo = "";
    private double sum;
    private int role = 0;
    private Operator operator;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Gui");
        frame.setContentPane(new Gui().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Operations
     */
    private enum Operator {
        DIVIDE,
        MULTIPLY,
        SUBTRACT,
        ADDITION;
    }

    public Gui() {
        a1Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if (role == 0) {
                    numberOne += "1";
                    textPane1.setText(numberOne);
                } else if (role == 1) {
                    numberTwo += "1";
                    textPane1.setText(numberTwo);
                }
            }
        });
        a2Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if (role == 0) {
                    numberOne += "2";
                    textPane1.setText(numberOne);
                } else if (role == 1) {
                    numberTwo += "2";
                    textPane1.setText(numberTwo);
                }
            }
        });
        a3Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if (role == 0) {
                    numberOne += "3";
                    textPane1.setText(numberOne);
                } else if (role == 1) {
                    numberTwo += "3";
                    textPane1.setText(numberTwo);
                }
            }
        });
        a4Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if (role == 0) {
                    numberOne += "4";
                    textPane1.setText(numberOne);
                } else if (role == 1) {
                    numberTwo += "4";
                    textPane1.setText(numberTwo);
                }
            }
        });
        a5Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if (role == 0) {
                    numberOne += "5";
                    textPane1.setText(numberOne);
                } else if (role == 1) {
                    numberTwo += "5";
                    textPane1.setText(numberTwo);
                }
            }
        });
        a6Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if (role == 0) {
                    numberOne += "6";
                    textPane1.setText(numberOne);
                } else if (role == 1) {
                    numberTwo += "6";
                    textPane1.setText(numberTwo);
                }
            }
        });
        a7Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if (role == 0) {
                    numberOne += "7";
                    textPane1.setText(numberOne);
                } else if (role == 1) {
                    numberTwo += "7";
                    textPane1.setText(numberTwo);
                }
            }
        });
        a8Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if (role == 0) {
                    numberOne += "8";
                    textPane1.setText(numberOne);
                } else if (role == 1) {
                    numberTwo += "8";
                    textPane1.setText(numberTwo);
                }
            }
        });
        a9Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if (role == 0) {
                    numberOne += "9";
                    textPane1.setText(numberOne);
                } else if (role == 1) {
                    numberTwo += "9";
                    textPane1.setText(numberTwo);
                }
            }
        });
        a0Button.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if (role == 0) {
                    numberOne += "0";
                    textPane1.setText(numberOne);
                } else if (role == 1) {
                    numberTwo += "0";
                    textPane1.setText(numberTwo);
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if (role == 0) {
                    role = 1;
                } else if (role == 1) {
                    role = 0;
                }
                operator = Operator.ADDITION;
            }
        });
        button2.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if (role == 0) {
                    role = 1;
                } else if (role == 1) {
                    role = 0;
                }
                operator = Operator.SUBTRACT;
            }
        });
        xButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if (role == 0) {
                    role = 1;
                } else if (role == 1) {
                    role = 0;
                }
                operator = Operator.MULTIPLY;
            }
        });
        button1.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if (role == 0) {
                    role = 1;
                } else if (role == 1) {
                    role = 0;
                }
                operator = Operator.DIVIDE;
            }
        });
        button4.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numberOne != "" && numberTwo != "") {
                    double oneDouble = Double.parseDouble(numberOne);
                    double twoDouble = Double.parseDouble(numberTwo);
                    switch (operator) {
                        case ADDITION:
                            sum = oneDouble + twoDouble;
                            numberOne = String.valueOf(sum);
                            numberTwo = "";
                            role = 0;
                            textPane1.setText(String.valueOf(sum));
                            break;
                        case SUBTRACT:
                            sum = oneDouble - twoDouble;
                            numberOne = String.valueOf(sum);
                            numberTwo = "";
                            role = 0;
                            textPane1.setText(String.valueOf(sum));
                            break;
                        case MULTIPLY:
                            sum = oneDouble * twoDouble;
                            numberOne = String.valueOf(sum);
                            numberTwo = "";
                            role = 0;
                            textPane1.setText(String.valueOf(sum));
                            break;
                        case DIVIDE:
                            sum = oneDouble / twoDouble;
                            numberOne = String.valueOf(sum);
                            numberTwo = "";
                            role = 0;
                            textPane1.setText(String.valueOf(sum));
                            break;
                    }
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                operator = null;
                numberTwo = "";
                sum = 0.0;
                numberOne = "";
                textPane1.setText("0");
            }
        });
    }
}
