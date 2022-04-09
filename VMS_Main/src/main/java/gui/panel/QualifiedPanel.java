package gui.panel;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import util.CircleProgressBar;
import util.ColorUtil;
import util.GUIUtil;

public class QualifiedPanel extends JPanel{
    //static{
   //     GUIUtil.useLNF();
   // }
    public static QualifiedPanel instance = new QualifiedPanel();

    public JLabel lMonthQualified = new JLabel("本月合格");
    public JLabel lTodayQualified = new JLabel("今日合格");
    public JLabel lAvgQualifiedPerDay = new JLabel("合格率");

    public JLabel lMonthLeftDay = new JLabel("本月还有");

    public JLabel vMonthQualified = new JLabel("300");
    public JLabel vTodayQualified = new JLabel("25");
    public JLabel vAvgQualifiedPerDay = new JLabel("80%");
    public JLabel vMonthLeftDay = new JLabel("15天");

    CircleProgressBar bar;

    public QualifiedPanel() {
        this.setLayout(new BorderLayout());
        bar = new CircleProgressBar();
        bar.setBackgroundColor(ColorUtil.warningColor);
        bar.setForegroundColor(ColorUtil.blueColor);
        bar.setProgress(80);

        GUIUtil.setColor(ColorUtil.grayColor, lMonthQualified, lTodayQualified, lAvgQualifiedPerDay,
                lMonthLeftDay, vAvgQualifiedPerDay,  vMonthLeftDay);
        GUIUtil.setColor(ColorUtil.blueColor, vMonthQualified, vTodayQualified);

        vTodayQualified.setFont(new Font("微软雅黑", Font.BOLD, 35));
        vMonthQualified.setFont(new Font("微软雅黑", Font.BOLD, 35));

        this.add(center(), BorderLayout.CENTER);
        this.add(south(), BorderLayout.SOUTH);

    }

    private JPanel center() {
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(west(), BorderLayout.WEST);
        p.add(center2(),BorderLayout.CENTER);

        return p;
    }

    private Component center2() {
        return bar;
    }

    private Component west() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4, 1));
        p.add(lMonthQualified);
        p.add(vMonthQualified);
        p.add(lTodayQualified);
        p.add(vTodayQualified);
        return p;
    }

    private JPanel south() {
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(2, 4));

        p.add(lAvgQualifiedPerDay);

        p.add(lMonthLeftDay);
        p.add(vAvgQualifiedPerDay);

        p.add(vMonthLeftDay);

        return p;
    }

    public static void main(String[] args) {

        GUIUtil.showPanel(QualifiedPanel.instance);
    }

}