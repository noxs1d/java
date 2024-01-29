import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator implements ActionListener{
    JFrame frame;
    JTextField txtf;
    JButton[] jButton=new JButton[10];
    JButton[] funcButtons=new JButton[8];
    JButton addButton,subButton,mulButton,divButton,decButton,equalButton,delButton,clrButton;
    JPanel jPanel;
    Font myFont=new Font("Intro",Font.BOLD,30);
    double num1=0,num2=0,resl=0;
    char operator;
    Calculator(){
    frame=new JFrame("Calculator");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(420,550);
    frame.setLayout(null);

    txtf =new JTextField();
    txtf.setBounds(1,1,404,70);
    txtf.setFont(myFont);
    txtf.setEditable(false);

    addButton=new JButton("+");
    divButton=new JButton(":");
    subButton=new JButton("-");
    mulButton=new JButton("x");
    decButton=new JButton(".");
    equalButton=new JButton("=");
    delButton=new JButton("DEL");
    clrButton=new JButton("CLR");
    funcButtons[0]=addButton;
    funcButtons[1]=subButton;
    funcButtons[2]=mulButton;
    funcButtons[3]=divButton;
    funcButtons[4]=decButton;
    funcButtons[6]=delButton;
    funcButtons[5]=equalButton;
    funcButtons[7]=clrButton;
    for (int i=0;i<8;i++){
        funcButtons[i].addActionListener(this);
        funcButtons[i].setFont(myFont);
        funcButtons[i].setFocusable(false);
    }
    for (int i=0;i<10;i++){
        jButton[i]=new JButton(String.valueOf(i));
        jButton[i].addActionListener(this);
        jButton[i].setFont(myFont);
        jButton[i].setFocusable(false);
    }

    delButton.setBounds(1,455,200,50);
    clrButton.setBounds(205,455,200,50);

    jPanel=new JPanel();
    jPanel.setBounds(1,72,404,381);
    jPanel.setLayout(new GridLayout(4,4,1,1));
    jPanel.setBackground(Color.GRAY);

    jPanel.add(jButton[1]);
    jPanel.add(jButton[2]);
    jPanel.add(jButton[3]);
    jPanel.add(addButton);
    jPanel.add(jButton[4]);
    jPanel.add(jButton[5]);
    jPanel.add(jButton[6]);
    jPanel.add(subButton);
    jPanel.add(jButton[7]);
    jPanel.add(jButton[8]);
    jPanel.add(jButton[9]);
    jPanel.add(mulButton);
    jPanel.add(decButton);
    jPanel.add(jButton[0]);
    jPanel.add(equalButton);
    jPanel.add(divButton);
    frame.add(jPanel);
    frame.add(delButton);
    frame.add(clrButton);
    frame.add(txtf);
    frame.setVisible(true);
    }
    public static void main(String[] ars){

        Calculator cal=new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0; i<10;i++){
            if(e.getSource()==jButton[i]){
                txtf.setText(txtf.getText().concat(String.valueOf(i)));
            }

        }
        if (e.getSource()==decButton){
            txtf.setText(txtf.getText().concat("."));
        }
        if(e.getSource()==addButton){
            num1=Double.parseDouble(txtf.getText());
            operator='+';
            txtf.setText("");
        }
        if(e.getSource()==subButton){
            num1=Double.parseDouble(txtf.getText());
            operator='-';
            txtf.setText("");
        }if(e.getSource()==mulButton){
            num1=Double.parseDouble(txtf.getText());
            operator='x';
            txtf.setText("");
        }if(e.getSource()==divButton){
            num1=Double.parseDouble(txtf.getText());
            operator=':';
            txtf.setText("");
        }
        if(e.getSource()==equalButton){
            num2=Double.parseDouble(txtf.getText());
            switch (operator){
                case'+':
                    resl=num1+num2;
                    break;
                case'-':
                    resl=num1-num2;
                    break;
                case'x':
                    resl=num1*num2;
                    break;
                case':':
                    resl=num1/num2;
                    break;
            }
            txtf.setText(String.valueOf(resl));
            num1=resl;
        }
        if(e.getSource()==clrButton){
            txtf.setText("");
        }
        if (e.getSource()==delButton){
            String str=txtf.getText();
            txtf.setText("");
            for(int i=0;i<str.length()-1;i++){
                txtf.setText(txtf.getText()+str.charAt(i));
            }
        }

    }
}
