import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class Main{

    static JFrame frame = new JFrame("TicTacToe");
    static int syc=1;

    static JButton button1 = new JButton(" ");
    static JButton button2 = new JButton(" ");
    static JButton button3 = new JButton(" ");
    static JButton button12 = new JButton(" ");
    static JButton button22 = new JButton(" ");
    static JButton button32 = new JButton(" ");
    static JButton button13 = new JButton(" ");
    static JButton button23 = new JButton(" ");
    static JButton button33 = new JButton(" ");

    public static void main(String[] args) {
    gameGUI();


    }


    public static void gameGUI(){
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);

       // syc=1;

        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);
        panel.setSize(500,500);
        panel.setBackground(Color.lightGray);
        panel.setVisible(true);
        JOptionPane.showMessageDialog(frame, "O starting first GOOD LUCK !");

//1 LINE

        panel.add(button1);
        button1.setEnabled(true);
        button1.setText("");
        button1.setBounds(50,50,100,100);
        button1.setCursor(cursor);



        panel.add(button2);
        button2.setEnabled(true);
        button2.setText("");
        button2.setBounds(200,50,100,100);
        button2.setCursor(cursor);


        panel.add(button3);
        button3.setEnabled(true);
        button3.setText("");
        button3.setBounds(350,50,100,100);
        button3.setCursor(cursor);


//2 LINE

        panel.add(button12);
        button12.setEnabled(true);
        button12.setText("");
        button12.setBounds(50,170,100,100);
        button12.setCursor(cursor);


        panel.add(button22);
        button22.setEnabled(true);
        button22.setText("");
        button22.setBounds(200,170,100,100);
        button22.setCursor(cursor);


        panel.add(button32);
        button32.setEnabled(true);
        button32.setText("");
        button32.setBounds(350,170,100,100);
        button32.setCursor(cursor);
//3 LINE


        panel.add(button13);
        button13.setEnabled(true);
        button13.setText("");
        button13.setBounds(50,290,100,100);
        button13.setCursor(cursor);


        panel.add(button23);
        button23.setEnabled(true);
        button23.setText("");
        button23.setBounds(200,290,100,100);
        button23.setCursor(cursor);


        panel.add(button33);
        button33.setEnabled(true);
        button33.setText("");
        button33.setBounds(350,290,100,100);
        button33.setCursor(cursor);
        //********************************************
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (syc % 2 == 0){
                    button1.setText("X");
                }else{button1.setText("O");}
                syc++;
                button1.setEnabled(false);
                control();

            }

        });
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                if (syc % 2 == 0){
                    button2.setText("X");
                }else{button2.setText("O");}
                syc++;
                button2.setEnabled(false);
                control();

            }

        });
        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (syc % 2 == 0){
                    button3.setText("X");
                }else{button3.setText("O");}
                syc++;
                button3.setEnabled(false);
                control();

            }

        });
        //*************************************************
        button12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (syc % 2 == 0){
                    button12.setText("X");;
                }else{button12.setText("O");}
                syc++;
                button12.setEnabled(false);
                control();

            }

        });
        button22.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (syc % 2 == 0){
                    button22.setText("X");
                }else{button22.setText("O");}
                syc++;
                button22.setEnabled(false);
                control();

            }

        });
        button32.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (syc % 2 == 0){
                    button32.setText("X");
                }else{button32.setText("O");}
               syc++;
                button32.setEnabled(false);
                control();

            }

        });
        //**************************************************
        button13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (syc % 2 == 0){
                    button13.setText("X");
                }else{button13.setText("O");}
                syc++;
                button13.setEnabled(false);
                control();

            }

        });
        button23.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (syc % 2 == 0){
                    button23.setText("X");
                }else{button23.setText("O");}
                syc++;
                button23.setEnabled(false);
                control();

            }

        });
        button33.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (syc %2 == 0){
                    button33.setText("X");;
                }else{button33.setText("O");}
                syc++;
                button33.setEnabled(false);
                control();



            }

        });
    }
public static void control(){
       if (syc >= 3 ) {
           //hortizonal
           if (button1.getText().equals("O")) {

               if (button2.getText().equals("O")) {
                   if (button3.getText().equals("O")) {
                       JOptionPane.showMessageDialog(frame, "O WIN !");
                       System.exit(1);


                   }
               }
           }
           if (button1.getText().equals("X")){
               if(button2.getText().equals("X")){
                   if(button3.getText().equals("X")){
                       JOptionPane.showMessageDialog(frame, "X WIN !");
                       System.exit(1);

                   }
               }
           }
         /*************************************************************************************/
           if (button12.getText().equals("O")) {
               if (button22.getText().equals("O")) {
                   if (button32.getText().equals("O")) {
                       JOptionPane.showMessageDialog(frame, "O WIN !");
                       System.exit(1);

                   }
               }
           }
           if (button12.getText().equals("X")){
               if(button22.getText().equals("X")){
                   if(button32.getText().equals("X")){
                       JOptionPane.showMessageDialog(frame, "X WIN !");
                       System.exit(1);

                   }
               }
           }
           /*************************************************************************************/

           if (button13.getText().equals("O")) {
               if (button23.getText().equals("O")) {
                   if (button33.getText().equals("O")) {
                       JOptionPane.showMessageDialog(frame, "O WIN !");
                       System.exit(1);
                   }
               }
           }
           if (button13.getText().equals("X")){
               if(button23.getText().equals("X")){
                   if(button33.getText().equals("X")){
                       JOptionPane.showMessageDialog(frame, "X WIN !");
                       System.exit(1);

                   }
               }
           }
           /*************************************************************************************/
           //vertical
           if (button1.getText().equals("O")) {
               if (button12.getText().equals("O")) {
                   if (button13.getText().equals("O")) {
                       JOptionPane.showMessageDialog(frame, "O WIN !");
                       System.exit(1);

                   }
               }
           }
           if (button1.getText().equals("X")){
               if(button12.getText().equals("X")){
                   if(button13.getText().equals("X")){
                       JOptionPane.showMessageDialog(frame, "X WIN !");
                       System.exit(1);

                   }
               }
           }
           /***************************************************************************************/
           if (button2.getText().equals("O")) {
               if (button22.getText().equals("O")) {
                   if (button23.getText().equals("O")) {
                       JOptionPane.showMessageDialog(frame, "O WIN !");
                       System.exit(1);

                   }
               }
           }
           if (button2.getText().equals("X")){
               if(button22.getText().equals("X")){
                   if(button23.getText().equals("X")){
                       JOptionPane.showMessageDialog(frame, "X WIN !");
                       System.exit(1);


                   }
               }
           }
           /****************************************************************************************/
           if (button3.getText().equals("O")) {
               if (button32.getText().equals("O")) {
                   if (button33.getText().equals("O")) {
                       JOptionPane.showMessageDialog(frame, "O WIN !");
                       System.exit(1);


                   }
               }
           }
           if (button3.getText().equals("X")){
               if(button32.getText().equals("X")){
                   if(button33.getText().equals("X")){
                       JOptionPane.showMessageDialog(frame, "X WIN !");
                       System.exit(1);

                   }
               }
           }
           /**************************************************************************************/
           //cross
           if (button1.getText().equals("O")) {
               if (button22.getText().equals("O")) {
                   if (button33.getText().equals("O")) {
                       JOptionPane.showMessageDialog(frame, "O WIN !");
                       System.exit(1);

                   }
               }
           }
           if (button1.getText().equals("X")){
               if(button22.getText().equals("X")){
                   if(button33.getText().equals("X")){
                       JOptionPane.showMessageDialog(frame, "X WIN !");

                       System.exit(1);
                   }
               }
           }
           /*****************************************************************************************/
           if (button3.getText().equals("O")) {
               if (button22.getText().equals("O")) {
                   if (button13.getText().equals("O")) {
                       JOptionPane.showMessageDialog(frame, "O WIN !");

                       System.exit(1);
                   }
               }
           }
           if (button3.getText().equals("X")){
               if(button22.getText().equals("X")){
                   if(button13.getText().equals("X")){
                       JOptionPane.showMessageDialog(frame, "X WIN !");

                        System.exit(1);
                   }
               }
           }

       }
       /***********************************************************************************************/

}
}

