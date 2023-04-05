import javax.swing.*;
import java.awt.*;

public class Mywindow extends JFrame {
    //constracter.
    private JLabel heading;
    Font font=new Font("",Font.BOLD,30);
    private JPanel mainpanel;
   private JLabel nameLabel,passwordLabel;
   private  JTextField nameTextfield;
   private  JPasswordField passwordField;
   private JButton button1,button2;

    Mywindow(){
        super.setTitle("My first from...");
        super.setSize(500,500);
        super.setLocation(100,100);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.createGUI();
        super.setVisible(true);
        System.out.println("my constracter...");

    }
    public void createGUI(){
        this.setLayout(new BorderLayout());
        heading= new JLabel("My First Form...");
        heading.setFont(font);
        heading.setHorizontalAlignment(JLabel.CENTER);
        this.add(heading,BorderLayout.NORTH);
        ////working with jpanal........

        mainpanel=new JPanel();
        ////seting layout of main planer
        mainpanel.setLayout(new GridLayout(3,2));
        nameLabel = new JLabel("Enter name ");
        nameLabel.setFont(font);
        passwordLabel = new JLabel("Enter password ");
        passwordLabel.setFont(font);

        nameTextfield = new JTextField();
        nameTextfield.setFont(font);

        passwordField=new JPasswordField();
        passwordField.setFont(font);

button1= new JButton("submit");
button1.setFont(font);

button2=new JButton("reset");
        button2.setFont(font);

        mainpanel.add(nameLabel);
        mainpanel.add(nameTextfield);

        mainpanel.add(passwordLabel);
        mainpanel.add(passwordField);

        mainpanel.add(button1);
        mainpanel.add(button2);
this.add(mainpanel,BorderLayout.CENTER);
    }
}
