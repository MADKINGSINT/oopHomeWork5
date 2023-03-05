package homeWork5_2;

import javax.swing.JOptionPane;

public class graphic {
    java.util.logging.Logger log = java.util.logging.Logger.getLogger("Logger");
    public String ask(String message) {
        log.info("User is entering answer");
        String answer = JOptionPane.showInputDialog(message);
        return answer;
    }
    public static void print(Object message) {
        
        JOptionPane.showMessageDialog(null, message);
    }
}
