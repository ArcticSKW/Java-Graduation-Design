package gui.panel;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import gui.listener.ToolBarListener;

import util.CenterPanel;
import util.GUIUtil;

public class MainPanel extends JPanel {
    //static {
    //    GUIUtil.useLNF();
    //}

    public static MainPanel instance = new MainPanel();
    public JToolBar tb = new JToolBar();
    public JButton bHome = new JButton();
    public JButton bIssue = new JButton();
    public JButton bManager = new JButton();
    public JButton bPending = new JButton();
    public JButton bSetting = new JButton();

    public CenterPanel workingPanel;

    private MainPanel() {

        GUIUtil.setImageIcon(bHome, "home.png", "数据一览");
        GUIUtil.setImageIcon(bIssue, "issue.png", "测量/开具工单");
        GUIUtil.setImageIcon(bManager, "manage.png", "量具管理");
        GUIUtil.setImageIcon(bPending, "pending.png", "工单一览");
        GUIUtil.setImageIcon(bSetting, "setting.png", "设置");

        tb.add(bHome);
        tb.add(bIssue);
        tb.add(bManager);
        tb.add(bPending);
        tb.add(bSetting);
        tb.setFloatable(false);

        workingPanel = new CenterPanel(0.8);

        setLayout(new BorderLayout());
        add(tb, BorderLayout.NORTH);
        add(workingPanel, BorderLayout.CENTER);
        addListener();
    }
    private void addListener() {
        ToolBarListener listener = new ToolBarListener();

        bHome.addActionListener(listener);
        bIssue.addActionListener(listener);
        bManager.addActionListener(listener);
        bPending.addActionListener(listener);
        bSetting.addActionListener(listener);
    }

    public static void main(String[] args) {
        GUIUtil.showPanel(MainPanel.instance, 1);
    }
}