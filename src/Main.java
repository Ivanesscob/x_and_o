import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class Main {

    static Integer[][] table = {
            { null,null,null},
            { null,null,null},
            { null,null,null}
    };
    static final boolean[] x_or_o = {true};
    static boolean win = false;

    public static void main(String[] args) {
        JFrame frame = new JFrame("X and O");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(270, 300);

        frame.setLayout(null);

        JButton button = new JButton("");
        JButton button1 = new JButton("");
        JButton button2 = new JButton("");
        JButton button3 = new JButton("");
        JButton button4 = new JButton("");
        JButton button5 = new JButton("");
        JButton button6 = new JButton("");
        JButton button7 = new JButton("");
        JButton button8 = new JButton("");

        JButton button_retry = new JButton("Retry");



        JLabel label = new JLabel();
        JLabel label1 = new JLabel("Никто не выйграл");
        JLabel welcome = new JLabel("X and O");

        button.setBounds(50, 50, 50, 50);
        button1.setBounds(50, 100, 50, 50);
        button2.setBounds(50, 150, 50, 50);
        button3.setBounds(100, 50, 50, 50);
        button4.setBounds(100, 100, 50, 50);
        button5.setBounds(100, 150, 50, 50);
        button6.setBounds(150, 50, 50, 50);
        button7.setBounds(150, 100, 50, 50);
        button8.setBounds(150, 150, 50, 50);

        button_retry.setBounds(50, 215, 75, 35);

        label.setBounds(130, 215, 200, 35);
        label1.setBounds(130, 215, 200, 35);

        welcome.setBounds(100, 20, 200, 30);

        frame.add(button);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button_retry);

        frame.add(label);
        frame.add(label1);
        frame.add(welcome);

        button_retry.setVisible(false);

        label.setVisible(false);
        label1.setVisible(false);

        welcome.setVisible(true);

        button_retry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                table = new Integer[][]{
                        {null, null, null},
                        {null, null, null},
                        {null, null, null}
                };
                button_retry.setVisible(false);

                label.setVisible(false);
                label1.setVisible(false);

                obnylenie(button);
                obnylenie(button1);
                obnylenie(button2);
                obnylenie(button3);
                obnylenie(button4);
                obnylenie(button5);
                obnylenie(button6);
                obnylenie(button7);
                obnylenie(button8);
                win = false;
            }
        });


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                set(button,0,0);

                if (proverka(0,0)){
                    if ((!x_or_o[0])) {
                        label.setText("Победили крестики");
                    } else {
                        label.setText("Победили Нолики");
                    }
                    label.setVisible(true);
                    button_retry.setVisible(true);
                    win = true;
                }
                else {
                    if (lose() == 9){
                        label1.setVisible(true);

                        button_retry.setVisible(true);
                    }
                };
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                set(button1,0,1);
                if (proverka(0,1)){
                    if ((!x_or_o[0])) {
                        label.setText("Победили крестики");
                    } else {
                        label.setText("Победили Нолики");
                    }win = true;
                    label.setVisible(true);
                    button_retry.setVisible(true);
                }
                else {
                    if (lose() == 9){
                        label1.setVisible(true);

                        button_retry.setVisible(true);
                    }
                };
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                set(button2,0,2);
                if (proverka(0,2)){
                    if ((!x_or_o[0])) {
                        label.setText("Победили крестики");
                    } else {
                        label.setText("Победили Нолики");
                    }win = true;
                    label.setVisible(true);
                    button_retry.setVisible(true);
                }
                else {
                    if (lose() == 9){
                        label1.setVisible(true);

                        button_retry.setVisible(true);
                    }
                };
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                set(button3,1,0);
                if (proverka(1,0)){
                    if ((!x_or_o[0])) {
                        label.setText("Победили крестики");
                    } else {
                        label.setText("Победили Нолики");
                    }win = true;
                    label.setVisible(true);
                    button_retry.setVisible(true);
                }else {
                    if (lose() == 9){
                        label1.setVisible(true);

                        button_retry.setVisible(true);
                    }
                };
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                set(button4,1,1);
                if (proverka(1,1)){
                    if ((!x_or_o[0])) {
                        label.setText("Победили крестики");
                    } else {
                        label.setText("Победили Нолики");
                    }win = true;
                    label.setVisible(true);
                    button_retry.setVisible(true);
                }else {
                    if (lose() == 9){
                        label1.setVisible(true);

                        button_retry.setVisible(true);
                    }
                };
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                set(button5,1,2);
                if (proverka(1,2)){
                    if ((!x_or_o[0])) {
                        label.setText("Победили крестики");
                    } else {
                        label.setText("Победили Нолики");
                    }win = true;
                    label.setVisible(true);
                    button_retry.setVisible(true);
                }else {
                    if (lose() == 9){
                        label1.setVisible(true);

                        button_retry.setVisible(true);
                    }
                };
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                set(button6,2,0);
                if (proverka(2,0)){
                    if ((!x_or_o[0])) {
                        label.setText("Победили крестики");
                    } else {
                        label.setText("Победили Нолики");
                    }win = true;
                    label.setVisible(true);
                    button_retry.setVisible(true);
                }else {
                    if (lose() == 9){
                        label1.setVisible(true);

                        button_retry.setVisible(true);
                    }
                };
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                set(button7,2,1);
                if (proverka(2,1)){
                    if ((!x_or_o[0])) {
                        label.setText("Победили крестики");
                    } else {
                        label.setText("Победили Нолики");
                    }win = true;
                    label.setVisible(true);
                    button_retry.setVisible(true);
                }else {
                    if (lose() == 9){
                        label1.setVisible(true);

                        button_retry.setVisible(true);
                    }
                };
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                set(button8,2,2);
                if (proverka(2,2)){
                    if ((!x_or_o[0])) {
                        label.setText("Победили крестики");
                    } else {
                        label.setText("Победили Нолики");
                    }win = true;
                    label.setVisible(true);
                    button_retry.setVisible(true);
                }else {
                    if (lose() == 9){
                        label1.setVisible(true);

                        button_retry.setVisible(true);
                    }
                };
            }
        });


        frame.setVisible(true);


    }
    // Отрисовка X and O
    public static void set(JButton button, int x,int y){
        if (!button.getText().equals("O") && x_or_o[0] && !win){
            button.setText("X");
            table[x][y]= 2;
            x_or_o[0] = false;
        }
        else {
            if (!button.getText().equals("X") &&!win ){
                button.setText("O");
                table[x][y]= 1;
                x_or_o[0] = true;
            }
        }
    }

    public static int counter_1(int st){
        int count =0;
        for (int i = 0; i < 3; i++){
            if (table[i][st] == null){
                return 0;
            }
            count += table[i][st];
        }
        return count;
    }

    public static int counter_2(int stol){
        int count =0;
        for (int i = 0; i < 3; i++){
            if (table[stol][i] == null){
                return 0;
            }
            count += table[stol][i];
        }
        return count;
    }
    public static int counter_3(){
        int count =0;
        int j =0;
        for (int i = 0; i < 3; i++){
            if (table[j][i] == null){
                return 0;
            }

            count += table[j][i];

            j++;
        }
        return count;
    }
    public static int counter_4() {
        int count = 0;
        int j = 2;
        for (int i = 0; i < 3; i++) {
            if (table[j][i] == null) {
                return 0;
            }

            count += table[j][i];

            j--;
        }
        return count;
    }
    public static boolean proverka(int st, int stol) {
        int a = counter_1(stol);
        int b = counter_2(st);
        int c = counter_3();
int d = counter_4();
        return a == 3 || a == 6 || b == 3 || b == 6 || c == 3 || c == 6
        || d == 3 || d == 6;
    }

    public static void obnylenie(JButton button){
        button.setText("");
    }

    public static int lose(){
        int count = 0;
        for (int i =0;i<3;i++){
            for (int j = 0; j < 3; j++){
                count+= !(table[i][j] == null)? 1 : 0;

            }
        }
        return count;
    }

}