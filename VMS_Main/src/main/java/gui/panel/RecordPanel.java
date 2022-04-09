package gui.panel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.jdesktop.swingx.JXDatePicker;

import gui.model.CategoryComboBoxModel;
import util.ColorUtil;
import util.GUIUtil;

public class RecordPanel extends JPanel{
   // static{
  //      GUIUtil.useLNF();
  //  }
    public static RecordPanel instance = new RecordPanel();

    JLabel lIssue = new JLabel("参数");
    JLabel lCategory = new JLabel("类型");
    JLabel lComment = new JLabel("备注");
    JLabel lDate = new JLabel("日期");

    public JTextField tfSpend = new JTextField("0");

    public CategoryComboBoxModel cbModel = new CategoryComboBoxModel();
    public JComboBox<String> cbCategory = new JComboBox<>(cbModel);
    public JTextField tfComment = new JTextField();
    public JXDatePicker datepick = new JXDatePicker(new Date());

    JButton bSubmit = new JButton("上传");
    JButton bIssue = new JButton("开单");

    public RecordPanel() {
        GUIUtil.setColor(ColorUtil.grayColor, lIssue,lCategory,lComment,lDate);
        GUIUtil.setColor(ColorUtil.blueColor, bSubmit);
        GUIUtil.setColor(ColorUtil.warningColor,bIssue);
        JPanel pInput =new JPanel();
        JPanel pSubmit = new JPanel();
        int gap = 40;
        pInput.setLayout(new GridLayout(4,2,gap,gap));

        pInput.add(lIssue);
        pInput.add(tfSpend);
        pInput.add(lCategory);
        pInput.add(cbCategory);
        pInput.add(lComment);
        pInput.add(tfComment);
        pInput.add(lDate);
        pInput.add(datepick);

        pSubmit.add(bSubmit);
        pSubmit.add(bIssue);

        this.setLayout(new BorderLayout());
        this.add(pInput,BorderLayout.NORTH);
        this.add(pSubmit,BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        GUIUtil.showPanel(RecordPanel.instance);
    }

}