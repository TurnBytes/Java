import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaUI {

    public static void main(String[] args) {

        Frame f = new Frame("LMS");

        f.setSize(300, 400);
        f.setLayout(new FlowLayout());
        // f.setBackground(Color.red);

        Label l1 = new Label("Email:", Label.RIGHT);
        TextField t1 = new TextField(15);

        Label l2 = new Label("UserName:", Label.RIGHT);
        TextField t2 = new TextField(15);

        TextArea ta = new TextArea(5, 25);

        Button btn = new Button("Submit");

        
        f.add(l1);
        f.add(t1);

        f.add(l2);
        f.add(t2);

        f.add(ta);
        f.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String email = t1.getText();
                String username = t2.getText();

                
                System.out.println("Email: " + email);
                System.out.println("Username: " + username);

               
                ta.setText("Email: " + email + "\nUsername: " + username);
            }
        });


        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {  
            public void windowClosing(WindowEvent e){
                // Call dispose method
                f.dispose();
            }
        });
    }
}
