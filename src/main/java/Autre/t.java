package Autre;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class t {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(600, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setPreferredSize(new Dimension(200,100));
        //以数组构造方法创建
        String[] str = {"aa","bb","cc","dd","ee","ff","gg"};
        final JList jList = new JList(str);
        jList.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!jList.getValueIsAdjusting()){	//设置只有释放鼠标时才触发
                    System.out.println(jList.getSelectedValue());
                }
            }
        });


        scrollPane.setViewportView(jList);
        panel.add(scrollPane);
        f.getContentPane().add(panel);
        f.setVisible(true);
    }
}