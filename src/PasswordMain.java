import org.apache.commons.lang3.RandomStringUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PasswordMain extends JFrame {

    JPanel MainPanel;
    private JTextField textField1;
    private JButton generatingButton;
    private JComboBox<String> longPassword;
    private JComboBox<String> strongPassword;

    private String[] data = {
            "123456",
            "1234",
            "Password",
            "00000",
            "Password1",
    };
    private int passLong = 8;
    private final char[] passPotato = (new String("123456789ABCDEFGHILMNOPUKJQWYXVR")).toCharArray();
    private final char[] passMedium = (new String("123456789ABCDEFGHILMNOPUKJQWYXVRqwertzuiopasdfghjklyxcvbnm")).toCharArray();
    private final char[] passStrong = (new String("123456789ABCDEFGHILMNOPUKJQWYXVRqwertzuiopasdfghjklyxcvbnm#>&@ĐäđÄ[]í€ÍŁł}<;>Ł$÷×÷¤")).toCharArray();
    public PasswordMain() {

        // Add long password items
        longPassword.addItem("8");
        longPassword.addItem("16");
        longPassword.addItem("32");

        // Add strong password items
        strongPassword.addItem("Nothing");
        strongPassword.addItem("Potato");
        strongPassword.addItem("Medium");
        strongPassword.addItem("Strong");

        Random random = new Random();

        longPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (longPassword.getSelectedItem() == "8") passLong = 8;
                if (longPassword.getSelectedItem() == "16") passLong = 16;
                if (longPassword.getSelectedItem() == "32") passLong = 32;
            }
        });

        generatingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (strongPassword.getSelectedItem() == "Nothing") {
                    textField1.setText(data[random.nextInt(4)]);
                }
                switch (passLong) {
                    case 8:
                        if (strongPassword.getSelectedItem() == "Potato") {
                            textField1.setText(RandomStringUtils.random(8,passPotato));
                        }
                        if (strongPassword.getSelectedItem() == "Medium") {
                            textField1.setText(RandomStringUtils.random(8,passMedium));
                        }
                        if (strongPassword.getSelectedItem() == "Strong") {
                            textField1.setText(RandomStringUtils.random(8,passStrong));
                        }
                        break;
                    case 16:
                        if (strongPassword.getSelectedItem() == "Potato") {
                            textField1.setText(RandomStringUtils.random(16,passPotato));
                        }
                        if (strongPassword.getSelectedItem() == "Medium") {
                            textField1.setText(RandomStringUtils.random(16,passMedium));
                        }
                        if (strongPassword.getSelectedItem() == "Strong") {
                            textField1.setText(RandomStringUtils.random(16,passStrong));
                        }
                        break;
                    case 32:
                        if (strongPassword.getSelectedItem() == "Potato") {
                            textField1.setText(RandomStringUtils.random(32,passPotato));
                        }
                        if (strongPassword.getSelectedItem() == "Medium") {
                            textField1.setText(RandomStringUtils.random(32,passMedium));
                        }
                        if (strongPassword.getSelectedItem() == "Strong") {
                            textField1.setText(RandomStringUtils.random(32,passStrong));
                        }
                        break;
                }
            }
        });
    }
}
