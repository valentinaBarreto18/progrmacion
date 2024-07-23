import javax.swing.*;

//EJERCICIO18

public class ComputerState {
    private boolean emitsBeep;
    private boolean hardDriveSpins;


    public boolean isEmitsBeep() {
        return emitsBeep;
    }


    public void setEmitsBeep(boolean emitsBeep) {
        this.emitsBeep = emitsBeep;
    }

    public boolean isHardDriveSpins() {
        return hardDriveSpins;
    }


    public void setHardDriveSpins(boolean hardDriveSpins) {
        this.hardDriveSpins = hardDriveSpins;
    }


    public void determineState() {
        if (emitsBeep) {
            if (hardDriveSpins) {
                JOptionPane.showMessageDialog(null, "Contact technical support.", "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Check the unit contacts.", "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            if (hardDriveSpins) {
                JOptionPane.showMessageDialog(null, "Check speaker connections.", "Result", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Bring the computer in for repair at the center.", "Result", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public void requestDataAndDetermineState() {
        try {
            // Request if it emits a beep
            setEmitsBeep(JOptionPane.showConfirmDialog(null, "Does the computer emit a beep on startup?", "Input", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);

            // Request if the hard drive spins
            setHardDriveSpins(JOptionPane.showConfirmDialog(null, "Does the hard drive spin?", "Input", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);

            // Determine the state of the computer
            determineState();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred while processing the data.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
