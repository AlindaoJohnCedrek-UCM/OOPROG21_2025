import javax.swing.JOptionPane;

class UsingJOptionPaneDialogs {
    public static void main(String[] a) {
        String nameDialog;
        int confirmationDialog;

        while (true) {

            nameDialog = JOptionPane.showInputDialog(null, "What is your name? ");


            if (nameDialog == null) {
                JOptionPane.showMessageDialog(null, "Thank you for using the program!", "Exit", JOptionPane.INFORMATION_MESSAGE);
                return; 
            }


            if (nameDialog.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Invalid entry. Please enter a valid name.", "Error", JOptionPane.ERROR_MESSAGE);
                continue; 
            }

            
            confirmationDialog = JOptionPane.showConfirmDialog(null, "Do you want to display your name? ", "Name Confirmation", JOptionPane.YES_NO_OPTION);

            
            if (confirmationDialog == JOptionPane.YES_OPTION) {
               
                JOptionPane.showMessageDialog(null, "Hello, " + nameDialog + "!", "Name Display", JOptionPane.PLAIN_MESSAGE);
                break; 
            } else if (confirmationDialog == JOptionPane.NO_OPTION) {

                continue;
            } else {

                JOptionPane.showMessageDialog(null, "Thank you!", "Exit", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
    }
}