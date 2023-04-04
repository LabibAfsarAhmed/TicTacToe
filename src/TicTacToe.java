import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToe {

    private JFrame frame;
    private JTextField title, txtMadeByLabib;
    private JPanel panel_1, panel_2, panel_3, panel_4, panel_5, panel_6, panel_7, panel_8, panel_9, panel_10, panel_11, panel_12, panel_13, panel_14, panel_15, panel_16, panel_17;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnNewGame, btnGiveUp;
    private JLabel lblNewLabel, lblNewLabel_1;
    private JTextField player1Count, player2Count;
    private int player1Count1 = 0;
    private int player2Count1 = 0;
    private String playerMove = "X";
    private int b1 = 10;
    private int b2 = 10;
    private int b3 = 10;
    private int b4 = 10;
    private int b5 = 10;
    private int b6 = 10;
    private int b7 = 10;
    private int b8 = 10;
    private int b9 = 10;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TicTacToe window = new TicTacToe();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public TicTacToe() {
        initialize();
    }

    private void clearBoard() {
        btn1.setText(null);
        btn2.setText(null);
        btn3.setText(null);
        btn4.setText(null);
        btn5.setText(null);
        btn6.setText(null);
        btn7.setText(null);
        btn8.setText(null);
        btn9.setText(null);
    }

    private void player1Message() {
        JOptionPane.showMessageDialog(frame, "Player 1 WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        player1Count1++;
        player1Count.setText(String.valueOf(player1Count1));
        b1 = 10;
        b2 = 10;
        b3 = 10;
        b4 = 10;
        b5 = 10;
        b6 = 10;
        b7 = 10;
        b8 = 10;
        b9 = 10;
        playerMove = "X";
        clearBoard();
    }

    private void player2Message() {
        JOptionPane.showMessageDialog(frame, "Player 2 WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        player2Count1++;
        player2Count.setText(String.valueOf(player2Count1));
        b1 = 10;
        b2 = 10;
        b3 = 10;
        b4 = 10;
        b5 = 10;
        b6 = 10;
        b7 = 10;
        b8 = 10;
        b9 = 10;
        playerMove = "O";
        clearBoard();
    }

    private void decideWinner() {

        //If player 1 wins
        if(b1 == 1 && b2 == 1 && b3 == 1) {
            player1Message();
        }
        else if(b4 == 1 && b5 == 1 && b6 == 1) {
            player1Message();
        }
        else if(b7 == 1 && b8 == 1 && b9 == 1) {
            player1Message();
        }
        else if(b1 == 1 && b4 == 1 && b7 == 1) {
            player1Message();
        }
        else if(b2 == 1 && b5 == 1 && b8 == 1) {
            player1Message();
        }
        else if(b3 == 1 && b6 == 1 && b9 == 1) {
            player1Message();
        }
        else if(b1 == 1 && b5 == 1 && b9 == 1) {
            player1Message();
        }
        else if(b1 == 1 && b5 == 1 && b9 == 1) {
            player1Message();
        }
        else if(b3 == 1 && b5 == 1 && b7 == 1) {
            player1Message();
        }

        //If player 2 wins
        if(b1 == 0 && b2 == 0 && b3 == 0) {
            player2Message();
        }
        else if(b4 == 0 && b5 == 0 && b6 == 0) {
            player2Message();
        }
        else if(b7 == 0 && b8 == 0 && b9 == 0) {
            player2Message();
        }
        else if(b1 == 0 && b4 == 0 && b7 == 0) {
            player2Message();
        }
        else if(b2 == 0 && b5 == 0 && b8 == 0) {
            player2Message();
        }
        else if(b3 == 0 && b6 == 0 && b9 == 0) {
            player2Message();
        }
        else if(b1 == 0 && b5 == 0 && b9 == 0) {
            player2Message();
        }
        else if(b1 == 0 && b5 == 0 && b9 == 0) {
            player2Message();
        }
        else if(b3 == 0 && b5 == 0 && b7 == 0) {
            player2Message();
        }
    }

    private void choosePlayer() {
        if(playerMove.equalsIgnoreCase("X")) {
            playerMove = "O";
        }
        else {
            playerMove = "X";
        }
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setTitle("Tic Tac Toe");
        frame.setBounds(100, 100, 621, 465);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0));
        frame.getContentPane().add(panel, BorderLayout.NORTH);
        title = new JTextField();
        title.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        title.setFont(new Font("Times New Roman", Font.BOLD, 44));
        title.setBorder(null);
        title.setForeground(new Color(255, 255, 0));
        title.setBackground(new Color(0, 0, 0));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setText("Tic Tac Toe");
        panel.add(title);
        title.setColumns(10);

        panel_1 = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 5));
        panel_1.setBackground(new Color(0, 0, 0));
        frame.getContentPane().add(panel_1, BorderLayout.SOUTH);

        txtMadeByLabib = new JTextField();
        txtMadeByLabib.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        txtMadeByLabib.setHorizontalAlignment(SwingConstants.RIGHT);
        txtMadeByLabib.setForeground(new Color(255, 255, 0));
        txtMadeByLabib.setText("Made by Labib");
        txtMadeByLabib.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        txtMadeByLabib.setBorder(null);
        txtMadeByLabib.setBackground(new Color(0, 0, 0));
        panel_1.add(txtMadeByLabib);
        txtMadeByLabib.setColumns(10);

        panel_2 = new JPanel();
        panel_2.setBackground(new Color(255, 255, 255));
        frame.getContentPane().add(panel_2, BorderLayout.CENTER);
        panel_2.setLayout(new GridLayout(3, 5, 2, 2));

        panel_3 = new JPanel();
        panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_2.add(panel_3);
        panel_3.setLayout(new BorderLayout(0, 0));

        btn1 = new JButton("");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn1.setText(playerMove);
                if(playerMove.equalsIgnoreCase("X")) {
                    btn1.setForeground(Color.RED);
                    b1 = 1;
                }
                else {
                    btn1.setForeground(Color.BLUE);
                    b1 = 0;
                }
                choosePlayer();
                decideWinner();
            }
        });
        btn1.setFont(new Font("Arial", Font.BOLD, 60));
        panel_3.add(btn1, BorderLayout.CENTER);

        panel_4 = new JPanel();
        panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_2.add(panel_4);
        panel_4.setLayout(new BorderLayout(0, 0));

        btn2 = new JButton("");
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn2.setText(playerMove);
                if(playerMove.equalsIgnoreCase("X")) {
                    btn2.setForeground(Color.RED);
                    b2 = 1;
                }
                else {
                    btn2.setForeground(Color.BLUE);
                    b2 = 0;
                }
                choosePlayer();
                decideWinner();
            }
        });
        btn2.setFont(new Font("Arial", Font.BOLD, 60));
        panel_4.add(btn2, BorderLayout.CENTER);

        panel_5 = new JPanel();
        panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_2.add(panel_5);
        panel_5.setLayout(new BorderLayout(0, 0));

        btn3 = new JButton("");
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn3.setText(playerMove);
                if(playerMove.equalsIgnoreCase("X")) {
                    btn3.setForeground(Color.RED);
                    b3 = 1;
                }
                else {
                    btn3.setForeground(Color.BLUE);
                    b3 = 0;
                }
                choosePlayer();
                decideWinner();
            }
        });
        btn3.setFont(new Font("Arial", Font.BOLD, 60));
        panel_5.add(btn3, BorderLayout.CENTER);

        panel_6 = new JPanel();
        panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_2.add(panel_6);
        panel_6.setLayout(new BorderLayout(0, 0));

        lblNewLabel = new JLabel("Player 1");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel_6.add(lblNewLabel, BorderLayout.CENTER);

        panel_7 = new JPanel();
        panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_2.add(panel_7);
        panel_7.setLayout(new BorderLayout(0, 0));

        player1Count = new JTextField();
        player1Count.setFont(new Font("Times New Roman", Font.BOLD, 18));
        player1Count.setHorizontalAlignment(SwingConstants.CENTER);
        player1Count.setText("0");
        panel_7.add(player1Count, BorderLayout.CENTER);
        player1Count.setColumns(10);

        panel_11 = new JPanel();
        panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_2.add(panel_11);
        panel_11.setLayout(new BorderLayout(0, 0));

        btn4 = new JButton("");
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn4.setText(playerMove);
                if(playerMove.equalsIgnoreCase("X")) {
                    btn4.setForeground(Color.RED);
                    b4 = 1;
                }
                else {
                    btn4.setForeground(Color.BLUE);
                    b4 = 0;
                }
                choosePlayer();
                decideWinner();
            }
        });
        btn4.setFont(new Font("Arial", Font.BOLD, 60));
        panel_11.add(btn4, BorderLayout.CENTER);

        panel_8 = new JPanel();
        panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_2.add(panel_8);
        panel_8.setLayout(new BorderLayout(0, 0));

        btn5 = new JButton("");
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn5.setText(playerMove);
                if(playerMove.equalsIgnoreCase("X")) {
                    btn5.setForeground(Color.RED);
                    b5 = 1;
                }
                else {
                    btn5.setForeground(Color.BLUE);
                    b5 = 0;
                }
                choosePlayer();
                decideWinner();
            }
        });
        btn5.setFont(new Font("Arial", Font.BOLD, 60));
        panel_8.add(btn5, BorderLayout.CENTER);

        panel_9 = new JPanel();
        panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_2.add(panel_9);
        panel_9.setLayout(new BorderLayout(0, 0));

        btn6 = new JButton("");
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn6.setText(playerMove);
                if(playerMove.equalsIgnoreCase("X")) {
                    btn6.setForeground(Color.RED);
                    b6 = 1;
                }
                else {
                    btn6.setForeground(Color.BLUE);
                    b6 = 0;
                }
                choosePlayer();
                decideWinner();
            }
        });
        btn6.setFont(new Font("Arial", Font.BOLD, 60));
        panel_9.add(btn6, BorderLayout.CENTER);

        panel_10 = new JPanel();
        panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_2.add(panel_10);
        panel_10.setLayout(new BorderLayout(0, 0));

        lblNewLabel_1 = new JLabel("Player 2");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        panel_10.add(lblNewLabel_1, BorderLayout.CENTER);

        panel_12 = new JPanel();
        panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_2.add(panel_12);
        panel_12.setLayout(new BorderLayout(0, 0));

        player2Count = new JTextField();
        player2Count.setFont(new Font("Times New Roman", Font.BOLD, 18));
        player2Count.setHorizontalAlignment(SwingConstants.CENTER);
        player2Count.setText("0");
        panel_12.add(player2Count, BorderLayout.CENTER);
        player2Count.setColumns(10);

        panel_13 = new JPanel();
        panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_2.add(panel_13);
        panel_13.setLayout(new BorderLayout(0, 0));

        btn7 = new JButton("");
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn7.setText(playerMove);
                if(playerMove.equalsIgnoreCase("X")) {
                    btn7.setForeground(Color.RED);
                    b7 = 1;
                }
                else {
                    btn7.setForeground(Color.BLUE);
                    b7 = 0;
                }
                choosePlayer();
                decideWinner();
            }
        });
        btn7.setFont(new Font("Arial", Font.BOLD, 60));
        panel_13.add(btn7, BorderLayout.CENTER);

        panel_17 = new JPanel();
        panel_17.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_2.add(panel_17);
        panel_17.setLayout(new BorderLayout(0, 0));

        btn8 = new JButton("");
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn8.setText(playerMove);
                if(playerMove.equalsIgnoreCase("X")) {
                    btn8.setForeground(Color.RED);
                    b8 = 1;
                }
                else {
                    btn8.setForeground(Color.BLUE);
                    b8 = 0;
                }
                choosePlayer();
                decideWinner();
            }
        });
        btn8.setFont(new Font("Arial", Font.BOLD, 60));
        panel_17.add(btn8, BorderLayout.CENTER);

        panel_15 = new JPanel();
        panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_2.add(panel_15);
        panel_15.setLayout(new BorderLayout(0, 0));

        btn9 = new JButton("");
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn9.setText(playerMove);
                if(playerMove.equalsIgnoreCase("X")) {
                    btn9.setForeground(Color.RED);
                    b9 = 1;
                }
                else {
                    btn9.setForeground(Color.BLUE);
                    b9 = 0;
                }
                choosePlayer();
                decideWinner();
            }
        });
        btn9.setFont(new Font("Arial", Font.BOLD, 60));
        panel_15.add(btn9, BorderLayout.CENTER);

        panel_14 = new JPanel();
        panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_2.add(panel_14);
        panel_14.setLayout(new BorderLayout(0, 0));

        btnNewGame = new JButton("NEW GAME");
        btnNewGame.setFont(new Font("Times New Roman", Font.BOLD, 13));
        btnNewGame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearBoard();
                player1Count1 = 0;
                player2Count1 = 0;
                player1Count.setText(String.valueOf(player1Count1));
                player2Count.setText(String.valueOf(player2Count1));
            }
        });
        panel_14.add(btnNewGame, BorderLayout.CENTER);

        panel_16 = new JPanel();
        panel_16.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_2.add(panel_16);
        panel_16.setLayout(new BorderLayout(0, 0));

        btnGiveUp = new JButton("GIVE UP!");
        btnGiveUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(playerMove.equalsIgnoreCase("X")) {
                    JOptionPane.showMessageDialog(frame, "Player 2 WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    player2Count1++;
                    player2Count.setText(String.valueOf(player2Count1));
                    playerMove = "O";
                }
                else if(playerMove.equalsIgnoreCase("O")) {
                    JOptionPane.showMessageDialog(frame, "Player 1 WINS", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    player1Count1++;
                    player1Count.setText(String.valueOf(player1Count1));
                    playerMove = "X";
                }
                clearBoard();
            }
        });
        btnGiveUp.setFont(new Font("Times New Roman", Font.BOLD, 13));
        panel_16.add(btnGiveUp, BorderLayout.CENTER);
    }
}
