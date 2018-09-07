package Panels;

import Class.Cohesion;
import Class.Coupling;
import java.io.File;
import Class.CustomSelect;
import Class.Inheritance;
import Class.SpecialXMLParser;
import Class.Understandability;
import java.text.DecimalFormat;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Panel_Compare extends javax.swing.JPanel {

    private SpecialXMLParser parser = new SpecialXMLParser();

    public Panel_Compare() {
        initComponents();
    }

    public void CurrentValue(String Und) {
        lb_Current.setText(Und);
    }

    public void NewValue(String Und) {
        lb_New.setText(Und);
    }

    public String getCurrentValue() {
        return lb_Current.getText();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FileChooser = new javax.swing.JFileChooser();
        jSeparator1 = new javax.swing.JSeparator();
        lb_Menu3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lb_SectionTitle2 = new javax.swing.JLabel();
        lb_Title2 = new javax.swing.JLabel();
        lb_Current = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lb_Title1 = new javax.swing.JLabel();
        lb_New = new javax.swing.JLabel();
        lb_SectionTitle1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lb_Title = new javax.swing.JLabel();
        txt_File = new javax.swing.JTextField();
        btn_Browse = new javax.swing.JButton();
        btn_Compare = new javax.swing.JButton();
        pb_Compare = new javax.swing.JProgressBar();

        FileChooser.setFileFilter(new CustomSelect());

        setBackground(new java.awt.Color(229, 229, 229));
        setMinimumSize(new java.awt.Dimension(610, 410));
        setPreferredSize(new java.awt.Dimension(610, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 610, 1));

        lb_Menu3.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        lb_Menu3.setText("Compare");
        add(lb_Menu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 70, 20));

        jPanel1.setBackground(new java.awt.Color(247, 246, 246));

        lb_SectionTitle2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lb_SectionTitle2.setText("Current Design");

        lb_Title2.setFont(new java.awt.Font("Verdana", 0, 22)); // NOI18N
        lb_Title2.setText("Understandability");

        lb_Current.setFont(new java.awt.Font("Verdana", 0, 70)); // NOI18N
        lb_Current.setForeground(new java.awt.Color(0, 204, 204));
        lb_Current.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Current.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_SectionTitle2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 24, Short.MAX_VALUE)
                        .addComponent(lb_Title2)
                        .addGap(32, 32, 32))))
            .addComponent(lb_Current, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_SectionTitle2)
                .addGap(10, 10, 10)
                .addComponent(lb_Current, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_Title2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 260, 150));

        jPanel2.setBackground(new java.awt.Color(247, 246, 246));

        lb_Title1.setFont(new java.awt.Font("Verdana", 0, 22)); // NOI18N
        lb_Title1.setText("Understandability");

        lb_New.setFont(new java.awt.Font("Verdana", 0, 70)); // NOI18N
        lb_New.setForeground(new java.awt.Color(102, 102, 102));
        lb_New.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_New.setText("0");

        lb_SectionTitle1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lb_SectionTitle1.setText("New Design");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_SectionTitle1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(lb_Title1)
                .addGap(25, 25, 25))
            .addComponent(lb_New, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_SectionTitle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_New, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_Title1)
                .addGap(19, 19, 19))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 260, 150));

        jPanel3.setBackground(new java.awt.Color(247, 246, 246));

        lb_Title.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        lb_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Title.setText("Select New File");

        btn_Browse.setText("Browse");
        btn_Browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseActionPerformed(evt);
            }
        });

        btn_Compare.setText("Compare");
        btn_Compare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompareActionPerformed(evt);
            }
        });

        pb_Compare.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pb_Compare.setPreferredSize(new java.awt.Dimension(146, 8));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lb_Title)
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btn_Browse)
                .addGap(28, 28, 28)
                .addComponent(btn_Compare)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_File, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pb_Compare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(lb_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_File, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Browse)
                    .addComponent(btn_Compare))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(pb_Compare, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 310, 320));
    }// </editor-fold>//GEN-END:initComponents

    private void BrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseActionPerformed
        pb_Compare.setValue(0); 
        if (!"0".equals(getCurrentValue())) {
            int returnVal = FileChooser.showOpenDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = FileChooser.getSelectedFile();
                txt_File.setText(file.getAbsolutePath());
            } else {
                txt_File.setText(null);
                FileChooser.setSelectedFile(null);
            }
        } else {
            JFrame dialog = new JFrame();
            JOptionPane.showMessageDialog(dialog, "Make sure you already have a current result", "No Comparator", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_BrowseActionPerformed

    private void CompareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompareActionPerformed
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
                    while (counter <= pb_Compare.getMaximum()) {
                        counter++;
                    }
                    NewValue(Understandability());
                } else {
                    counter = 0;
                    JOptionPane.showMessageDialog(dialog, "Make sure your XML file is using Visual Paradigm's simple structure", "Wrong XML Structure!", JOptionPane.INFORMATION_MESSAGE);
                }
                pb_Compare.setValue(counter);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_CompareActionPerformed

    public String Understandability() {
        Understandability UAbility = new Understandability();
        Cohesion Coh = new Cohesion();
        Coupling Coup = new Coupling();
        Inheritance Inherit = new Inheritance();
        DecimalFormat f = new DecimalFormat("#.##");
        String result = f.format(UAbility.getResult(Coup.getResult(parser.getCountAs()), Coh.getResult(parser.getCountAt()),
                Inherit.getResult(parser.getCountCh()))).trim();
        return result;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser FileChooser;
    private javax.swing.JButton btn_Browse;
    private javax.swing.JButton btn_Compare;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_Current;
    private javax.swing.JLabel lb_Menu3;
    private javax.swing.JLabel lb_New;
    private javax.swing.JLabel lb_SectionTitle1;
    private javax.swing.JLabel lb_SectionTitle2;
    private javax.swing.JLabel lb_Title;
    private javax.swing.JLabel lb_Title1;
    private javax.swing.JLabel lb_Title2;
    private javax.swing.JProgressBar pb_Compare;
    private javax.swing.JTextField txt_File;
    // End of variables declaration//GEN-END:variables
}