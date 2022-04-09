package gui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import gui.panel.ConfigPanel;
import gui.panel.MainPanel;
import gui.panel.QualifiedPanel;
import gui.panel.RecordPanel;


public class ToolBarListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        MainPanel p = MainPanel.instance;
        JButton b = (JButton) e.getSource();
        if (b == p.bIssue)
            p.workingPanel.show(RecordPanel.instance);
        if (b == p.bSetting)
            p.workingPanel.show(ConfigPanel.instance);
        if (b == p.bHome)
            p.workingPanel.show(QualifiedPanel.instance);
    }
}