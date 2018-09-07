package Panels;

import Class.Cohesion;
import Class.Coupling;
import java.io.File;
import javax.swing.JFileChooser;
import Class.CustomSelect;
import Class.Inheritance;
import Class.Understandability;
import Class.SpecialXMLParser;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Panel_Select extends javax.swing.JPanel {

    SpecialXMLParser parser = new SpecialXMLParser();
    Understandability UAbility = new Understandability();
    Cohesion Coh = new Cohesion();
    Coupling Coup = new Coupling();
    Inheritance Inherit = new Inheritance();
    DecimalFormat f = new DecimalFormat("#.##");

    public Panel_Select() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FileChooser = new javax.swing.JFileChooser();
        txt_File = new javax.swing.JTextField();
        btn_Browse = new javax.swing.JButton();
        btn_Process = new javax.swing.JButton();
        lb_Title = new javax.swing.JLabel();
        lb_Menu1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pb_Process = new javax.swing.JProgressBar();

        FileChooser.setFileFilter(new CustomSelect());

        setBackground(new java.awt.Color(229, 229, 229));
        setPreferredSize(new java.awt.Dimension(610, 410));

        txt_File.setDragEnabled(true);

        btn_Browse.setText("Browse");
        btn_Browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectActionPerformed(evt);
            }
        });

        btn_Process.setText("Process");
        btn_Process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessActionPerformed(evt);
            }
        });

        lb_Title.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lb_Title.setText("Select Your File Here");

        lb_Menu1.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        lb_Menu1.setText("Select File");

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pb_Process.setForeground(new java.awt.Color(0, 0, 0));
        pb_Process.setName(""); // NOI18N
        pb_Process.setPreferredSize(new java.awt.Dimension(146, 8));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(btn_Browse)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Process))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(txt_File, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(lb_Title)))
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lb_Menu1)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addComponent(pb_Process, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lb_Menu1)
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(lb_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_File, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Process)
                    .addComponent(btn_Browse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(pb_Process, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectActionPerformed
        pb_Process.setValue(0);
        int returnVal = FileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = FileChooser.getSelectedFile();
            txt_File.setText(file.getAbsolutePath());
        } else {
            txt_File.setText(null);
            FileChooser.setSelectedFile(null);
        }
    }//GEN-LAST:event_SelectActionPerformed

    private void ProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessActionPerformed
        File file = FileChooser.getSelectedFile();
        JFrame dialog = new JFrame();
        if (file == null) {
            JOptionPane.showMessageDialog(dialog, "Please Select a XML File", "No File Chosen", JOptionPane.INFORMATION_MESSAGE);
        } else if (!file.getAbsolutePath().endsWith(".xml")) {
            JOptionPane.showMessageDialog(dialog, "Please Select a XML File", "Wrong File!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int counter = 0;
            try {
                if (parser.ValidateStructure(file) == true) {
                    parser.Executor(file);
                    while (counter <= pb_Process.getMaximum()) {
                        counter++;
                    }
                } else {
                    counter = 0;
                    JOptionPane.showMessageDialog(dialog, "Make sure your XML file is using Visual Paradigm's simple structure", "Wrong XML Structure!", JOptionPane.INFORMATION_MESSAGE);
                }
                pb_Process.setValue(counter);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_ProcessActionPerformed

    public String Understandability() {
        String result = f.format(UAbility.getResult(Coup.getResult(parser.getCountAs()), Coh.getResult(parser.getCountAt()),
                Inherit.getResult(parser.getCountCh()))).trim();
        return result;
    }

    public String Cohesion() {
        String result = f.format(Coh.getResult(parser.getCountAt()));
        return result;
    }

    public String Coupling() {
        String result = f.format(Coup.getResult(parser.getCountAs()));
        return result;
    }

    public String Inheritance() {
        String result = f.format(Inherit.getResult(parser.getCountCh()));
        return result;
    }

    public String CoupMetric() {
        String result = Integer.toString(parser.getCountAs());
        return result;
    }

    public String CohMetric() {
        String result = Integer.toString(parser.getCountAt());
        return result;
    }

    public String InheritMetric() {
        String result = Integer.toString(parser.getCountCh());
        return result;
    }

    public String Classes() {
        String result = Integer.toString(parser.getCountCl());
        return result;
    }

    public String Methods() {
        String result = Integer.toString(parser.getCountOp());
        return result;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JButton btn_Browse;
    private javax.swing.JButton btn_Process;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_Menu1;
    private javax.swing.JLabel lb_Title;
    private javax.swing.JProgressBar pb_Process;
    private javax.swing.JTextField txt_File;
    // End of variables declaration//GEN-END:variables
}
