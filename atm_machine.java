import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class atm_machine {

    public static void main(String args[]) {
        firstscreen();

    }

    static void firstscreen() {
        JFrame f = new JFrame("MY ATM");
        JLabel l1;
        l1 = new JLabel("Welcome Apna Bank");
        l1.setVerticalAlignment(SwingConstants.BOTTOM);
        JTextField tf1 = new JTextField();
        tf1.setBounds(50, 240, 320, 100);
        l1.setBounds(90, 100, 300, 90);
        JButton c1 = new JButton("Confirm");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");

        b1.setBounds(50, 350, 100, 50);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = tf1.getText();
                tf1.setText(txt + "1");
            }
        });


        b2.setBounds(160, 350, 100, 50);

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = tf1.getText();
                tf1.setText(txt + "2");
            }
        });


        b3.setBounds(270, 350, 100, 50);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = tf1.getText();
                tf1.setText(txt + "3");
            }
        });


        b4.setBounds(50, 410, 100, 50);
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = tf1.getText();
                tf1.setText(txt + "4");
            }
        });


        b5.setBounds(160, 410, 100, 50);
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = tf1.getText();
                tf1.setText(txt + "5");
            }
        });

        b6.setBounds(270, 410, 100, 50);
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = tf1.getText();
                tf1.setText(txt + "6");
            }
        });
        b7.setBounds(50, 470, 100, 50);
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = tf1.getText();
                tf1.setText(txt + "7");
            }
        });
        b8.setBounds(160, 470, 100, 50);
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = tf1.getText();
                tf1.setText(txt + "8");
            }
        });
        b9.setBounds(270, 470, 100, 50);
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = tf1.getText();
                tf1.setText(txt + "9");
            }
        });
        b0.setBounds(160, 530, 100, 50);
        b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = tf1.getText();
                tf1.setText(txt + "0");
            }
        });

        c1.setBounds(420, 276, 100, 50);
        c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String atm_number = tf1.getText();

                boolean flag = false;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");
                    PreparedStatement ps = con.prepareStatement("SELECT id from atm_cards where atm_number=?");
                    ps.setString(1, atm_number);
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                        flag = true;
                    }
                    if (flag) {

//                        JOptionPane.showMessageDialog(c1,"Account Found");
                        secondscreen(atm_number);
                        f.dispose();

                    } else {
                        JOptionPane.showMessageDialog(c1, "Account Not Found");
                    }
                    con.close();
                } catch (Exception exception) {
                    exception.printStackTrace();

                }
            }
        });


        f.add(l1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b0);
        f.add(tf1);
        f.add(c1);


        f.setSize(1366, 768);
        f.setLayout(null);
        f.setVisible(true);
    }

    static void secondscreen(String atm_num) {
        JFrame f = new JFrame("MY ATM");
        JLabel l1;
        l1 = new JLabel("Enter Your Pin");
        l1.setVerticalAlignment(SwingConstants.BOTTOM);
        JTextField tf1 = new JTextField();
        tf1.setBounds(50, 240, 320, 100);
        l1.setBounds(90, 100, 300, 90);
        JButton c1 = new JButton("Confirm");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton b0 = new JButton("0");

        b1.setBounds(50, 350, 100, 50);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = tf1.getText();
                tf1.setText(txt + "1");
            }
        });


        b2.setBounds(160, 350, 100, 50);

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = tf1.getText();
                tf1.setText(txt + "2");
            }
        });


        b3.setBounds(270, 350, 100, 50);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = tf1.getText();
                tf1.setText(txt + "3");
            }
        });


        b4.setBounds(50, 410, 100, 50);
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = tf1.getText();
                tf1.setText(txt + "4");
            }
        });


        b5.setBounds(160, 410, 100, 50);
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = tf1.getText();
                tf1.setText(txt + "5");
            }
        });

        b6.setBounds(270, 410, 100, 50);
        b6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = tf1.getText();
                tf1.setText(txt + "6");
            }
        });
        b7.setBounds(50, 470, 100, 50);
        b7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = tf1.getText();
                tf1.setText(txt + "7");
            }
        });
        b8.setBounds(160, 470, 100, 50);
        b8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = tf1.getText();
                tf1.setText(txt + "8");
            }
        });
        b9.setBounds(270, 470, 100, 50);
        b9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = tf1.getText();
                tf1.setText(txt + "9");
            }
        });
        b0.setBounds(160, 530, 100, 50);
        b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String txt = tf1.getText();
                tf1.setText(txt + "0");
            }
        });

        c1.setBounds(420, 276, 100, 50);
        c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String atm_pin = tf1.getText();

                boolean flag = false;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");
                    PreparedStatement ps = con.prepareStatement("SELECT id from atm_cards where atm_number=? and atm_pin=?");
                    ps.setString(1, atm_num);
                    ps.setString(2, atm_pin);
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                        flag = true;
                    }
                    if (flag) {

                        thirdscreen(atm_num, atm_pin);
                        f.dispose();


                    } else {
                        JOptionPane.showMessageDialog(c1, "Account Not Found");
                    }
                    con.close();
                } catch (Exception exception) {
                    exception.printStackTrace();

                }
            }
        });


        f.add(l1);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b0);
        f.add(tf1);
        f.add(c1);


        f.setSize(1366, 768);
        f.setLayout(null);
        f.setVisible(true);
    }

    static void thirdscreen(String atm_number, String atm_pin) {
        JFrame f = new JFrame("MY ATM");
        JLabel l3 = new JLabel("Bank Balance");
        l3.setBounds(50, 240, 320, 100);

        JTextField tf4 = new JTextField();
        tf4.setBounds(200, 270, 200, 40);



        JButton d = new JButton("Deposit");
        d.setBounds(265, 340, 100, 50);


        d.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String deposit_money = tf4.getText();
                double current_balance = 0;

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");
                    PreparedStatement ps = con.prepareStatement("SELECT balance from atm_cards where atm_number=? and atm_pin=?");
                    ps.setString(1, atm_number);
                    ps.setString(2, String.valueOf(atm_pin));
                    ResultSet gs = ps.executeQuery();
                    while (gs.next()) {
                        current_balance = gs.getDouble("balance");
                    }
                    double temp = current_balance;
                    current_balance = current_balance + Double.parseDouble(deposit_money);
                    if (temp - (current_balance) == Double.parseDouble(deposit_money)) {
                        JOptionPane.showMessageDialog(d, "Desposit Successful");
                    }
                    current_balance = current_balance + Double.parseDouble(deposit_money);
                    PreparedStatement ps2 = con.prepareStatement("update atm_cards set balance=? where atm_number=? and atm_pin=?");
                    ps2.setString(1, String.valueOf(current_balance));
                    ps2.setString(2, atm_number);
                    ps2.setString(3, String.valueOf(atm_pin));
                    ps2.executeUpdate();
//                    ps3.executeUpdate();
                    tf4.setText("₹ " + current_balance);
                    con.close();
                } catch (
                        Exception exception) {
                    exception.printStackTrace();
                }

            }

        });
        JButton w = new JButton("Withdraw ");
        w.setBounds(58, 430, 100, 50);

        w.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String withdraw_money = tf4.getText();
                double current_balance = 0;

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");
                    PreparedStatement ps = con.prepareStatement("SELECT balance from atm_cards where atm_number=? and atm_pin=?");
                    ps.setString(1, atm_number);
                    ps.setString(2, String.valueOf(atm_pin));
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                        current_balance = rs.getDouble("balance");
                    }
                    double temp = current_balance;
                    current_balance = current_balance - Double.parseDouble(withdraw_money);
                    if (temp - (current_balance) == Double.parseDouble(withdraw_money)) {
                        JOptionPane.showMessageDialog(w, "Withdraw Successful");
                    }
                    PreparedStatement ps1 = con.prepareStatement("update atm_cards set balance=? where atm_number=? and atm_pin=?");

                    ps1.setString(1, String.valueOf(current_balance));
                    ps1.setString(2, atm_number);
                    ps1.setString(3, String.valueOf(atm_pin));
                    ps1.executeUpdate();
                    tf4.setText("₹ " + current_balance);

                    con.close();
                } catch (
                        Exception exception) {
                    exception.printStackTrace();
                }

            }
        });

        JButton t = new JButton("Transfer");
        t.setBounds(58, 350, 100, 50);
        t.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                transfer_screen(atm_number,atm_pin);
                f.dispose();
            }
        });


        JButton q = new JButton("Quit");
        q.setBounds(270, 433, 100, 50);
        q.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (actionEvent.getSource() == q) {
                    JOptionPane.showMessageDialog(q, "are you sure");
                    f.dispose();
                    firstscreen();
                }
            }
        });


        f.add(tf4);
        f.add(l3);
        f.add(d);
        f.add(w);
        f.add(t);
        f.add(q);
        f.setSize(1366, 768);
        f.setLayout(null);
        f.setVisible(true);


    }

    static void transfer_screen(String atm_number,String atm_pin) {
        JFrame tf4 = new JFrame("");

        //money
        JLabel l7 = new JLabel("Bank Balance");
        l7.setBounds(100, 20, 320, 100);

        JTextField tf5 = new JTextField();
        tf5.setBounds(100, 100, 200, 50);

        //account number
        JLabel l8 = new JLabel("Enter Account Number");
        l8.setBounds(90, 150,200,50);


        JTextField tf6 = new JTextField();
        tf6.setBounds(100, 200, 200, 50);

        JButton h = new JButton("History");
        h.setBounds(200,350,100,50);
        h.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                history(atm_number,atm_pin);
            }
        });




        JButton t = new JButton("Transfer");
        t.setBounds(58, 350, 100, 50);
        t.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int in_amount = Integer.parseInt(tf5.getText());
                String in_account = tf6.getText();
                System.out.println(in_account);
                int self_balance = 0;
                int current_rec_balance = 0;
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");
                    PreparedStatement ps=con.prepareStatement("select balance from atm_cards where atm_number=? and atm_pin=?");
                    ps.setString(1,atm_number);
                    ps.setString(2,atm_pin);
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()){
                        self_balance = Integer.parseInt(rs.getString("balance"));
                    }
                    if (in_amount > self_balance) {
                        JOptionPane.showMessageDialog(t,"Due to Insfficent Balance");
                    }else {
                        self_balance = self_balance - in_amount;
                        PreparedStatement ps1=con.prepareStatement("update atm_cards set balance=? where atm_number=? and atm_pin=?");
                        ps1.setInt(1,self_balance);
                        ps1.setString(2,atm_number);
                        ps1.setString(3,atm_pin);
                        ps1.executeUpdate();
                        PreparedStatement ps2=con.prepareStatement("select balance from atm_cards where account_number=?");
                        ps2.setString(1,in_account);
                        ResultSet rs1 = ps2.executeQuery();
                        while (rs1.next()){
                            current_rec_balance = Integer.parseInt(rs1.getString("balance"));
                        }
                        current_rec_balance = current_rec_balance + in_amount;
                        PreparedStatement ps3=con.prepareStatement("update atm_cards set balance=? where account_number=?");
                        ps3.setInt(1,current_rec_balance);
                        ps3.setString(2,in_account);
                        ps3.executeUpdate();
                    }


                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        tf4.add(tf5);
        tf4.add(l8);
        tf4.add(l7);
        tf4.add(tf6);
        tf4.add(h);
        tf4.add(t);
        tf4.setSize(1366, 768);
        tf4.setLayout(null);
        tf4.setVisible(true);



    }

    static void history(String atm_number, String atm_pin){
        JFrame jf=new JFrame();
        String data[][]=new String[100][5];
        String cols[] = {"ID","DATE","CREDIT","DEBIT","BALANCE"};

        JTable jt = new JTable(data,cols);
        JScrollPane js = new JScrollPane(jt);
        js.setBounds(10,10,380,280);
        jf.add(js);

        jf.setSize(400,300);
        jf.setLayout(null);
        jf.setVisible(true);

        int id = 0;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root", "");
            PreparedStatement ps = con.prepareStatement("select id from atm_cards where atm_number=? and atm_pin=?");
            ps.setString(1,atm_number);
            ps.setString(2,atm_pin);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                id = rs.getInt("id");
            }
            PreparedStatement ps1=con.prepareStatement("select * from id?;");
            ps1.setInt(1,id);
            ResultSet rs1=ps1.executeQuery();
            int i=0;
            while (rs1.next()){
                for (int j=0; j<5; j++){
                    data[i][j] = rs1.getString(j+1);
                }
                i++;
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


}