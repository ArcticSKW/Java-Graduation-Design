package startup;

import javax.swing.SwingUtilities;

import gui.frame.MainFrame;
import gui.panel.MainPanel;
import gui.panel.RecordPanel;

public class Bootstrap {
    public static void main(String[] args) throws Exception{
        SwingUtilities.invokeAndWait(() -> {
            MainFrame.instance.setVisible(true);
            MainPanel.instance.workingPanel.show(RecordPanel.instance);
        });
    }
}