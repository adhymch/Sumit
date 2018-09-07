package Main;

import Panels.Panel_Compare;
import Panels.Panel_Result;
import Panels.Panel_Select;
import Panels.Panel_Overview;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 *
 * @author User
 */
public class SUMIT_Main extends javax.swing.JFrame {

    GridBagLayout Layout = new GridBagLayout();
    Panel_Select Panel_Select = new Panel_Select();
    Panel_Result Panel_Result = new Panel_Result();
    Panel_Compare Panel_Compare = new Panel_Compare();
    Panel_Overview Panel_Overview = new Panel_Overview();

    public SUMIT_Main() {
        initComponents();

        Pn_Current.setVisible(false);
        Pn_Current.setLayout(Layout);

        GridBagConstraints constraint = new GridBagConstraints();
        constraint.gridx = 0;
        constraint.gridy = 0;

        Pn_Current.add(Panel_Select, constraint);
        Pn_Current.add(Panel_Result, constraint);
        Pn_Current.add(Panel_Compare, constraint);
        Pn_Current.add(Panel_Overview, constraint);

        Panel_Select.setVisible(false);
        Panel_Result.setVisible(false);
        Panel_Compare.setVisible(false);
        Panel_Overview.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pn_Base = new javax.swing.JPanel();
        Pn_Current = new javax.swing.JPanel();
        Pn_Tittle = new javax.swing.JPanel();
        lb_Title = new javax.swing.JLabel();
        Pn_Foot = new javax.swing.JPanel();
        Pn_Menu1 = new javax.swing.JPanel();
        lb_SelectFile = new javax.swing.JLabel();
        btn_SelectFile = new javax.swing.JButton();
        Pn_Menu2 = new javax.swing.JPanel();
        lb_ViewResult = new javax.swing.JLabel();
        btn_ViewResult = new javax.swing.JButton();
        Pn_Menu3 = new javax.swing.JPanel();
        lb_Compare = new javax.swing.JLabel();
        btn_Compare = new javax.swing.JButton();
        Pn_Menu4 = new javax.swing.JPanel();
        lb_Summary = new javax.swing.JLabel();
        btn_Summary = new javax.swing.JButton();
        lb_WelcomeMsg = new javax.swing.JLabel();
        lb_Tag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pn_Base.setBackground(new java.awt.Color(240, 237, 237));
        Pn_Base.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pn_Current.setBackground(new java.awt.Color(0, 204, 204));
        Pn_Current.setLayout(new java.awt.CardLayout());
        Pn_Base.add(Pn_Current, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 610, 410));

        Pn_Tittle.setBackground(new java.awt.Color(0, 204, 204));

        lb_Title.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        lb_Title.setForeground(new java.awt.Color(255, 255, 255));
        lb_Title.setText("SUMIT");

        javax.swing.GroupLayout Pn_TittleLayout = new javax.swing.GroupLayout(Pn_Tittle);
        Pn_Tittle.setLayout(Pn_TittleLayout);
        Pn_TittleLayout.setHorizontalGroup(
            Pn_TittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_TittleLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lb_Title)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        Pn_TittleLayout.setVerticalGroup(
            Pn_TittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_TittleLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lb_Title)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Pn_Base.add(Pn_Tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 70));

        Pn_Foot.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout Pn_FootLayout = new javax.swing.GroupLayout(Pn_Foot);
        Pn_Foot.setLayout(Pn_FootLayout);
        Pn_FootLayout.setHorizontalGroup(
            Pn_FootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        Pn_FootLayout.setVerticalGroup(
            Pn_FootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Pn_Base.add(Pn_Foot, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 140, 100));

        Pn_Menu1.setBackground(new java.awt.Color(102, 102, 102));

        lb_SelectFile.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lb_SelectFile.setForeground(new java.awt.Color(255, 255, 255));
        lb_SelectFile.setText("Select File");

        btn_SelectFile.setBackground(new java.awt.Color(102, 102, 102));
        btn_SelectFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/next_button.png"))); // NOI18N
        btn_SelectFile.setBorder(null);
        btn_SelectFile.setMaximumSize(new java.awt.Dimension(17, 18));
        btn_SelectFile.setPreferredSize(new java.awt.Dimension(17, 18));
        btn_SelectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pn_Menu1Layout = new javax.swing.GroupLayout(Pn_Menu1);
        Pn_Menu1.setLayout(Pn_Menu1Layout);
        Pn_Menu1Layout.setHorizontalGroup(
            Pn_Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_Menu1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_SelectFile, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_SelectFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        Pn_Menu1Layout.setVerticalGroup(
            Pn_Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_Menu1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Pn_Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_SelectFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_SelectFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Pn_Base.add(Pn_Menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 140, 60));

        Pn_Menu2.setBackground(new java.awt.Color(102, 102, 102));

        lb_ViewResult.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lb_ViewResult.setForeground(new java.awt.Color(255, 255, 255));
        lb_ViewResult.setText("View Result");

        btn_ViewResult.setBackground(new java.awt.Color(102, 102, 102));
        btn_ViewResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/next_button.png"))); // NOI18N
        btn_ViewResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pn_Menu2Layout = new javax.swing.GroupLayout(Pn_Menu2);
        Pn_Menu2.setLayout(Pn_Menu2Layout);
        Pn_Menu2Layout.setHorizontalGroup(
            Pn_Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_Menu2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_ViewResult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ViewResult, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        Pn_Menu2Layout.setVerticalGroup(
            Pn_Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_Menu2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(Pn_Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_ViewResult, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lb_ViewResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Pn_Base.add(Pn_Menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 140, 60));

        Pn_Menu3.setBackground(new java.awt.Color(102, 102, 102));

        lb_Compare.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lb_Compare.setForeground(new java.awt.Color(255, 255, 255));
        lb_Compare.setText("Compare");

        btn_Compare.setBackground(new java.awt.Color(102, 102, 102));
        btn_Compare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/next_button.png"))); // NOI18N
        btn_Compare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pn_Menu3Layout = new javax.swing.GroupLayout(Pn_Menu3);
        Pn_Menu3.setLayout(Pn_Menu3Layout);
        Pn_Menu3Layout.setHorizontalGroup(
            Pn_Menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_Menu3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_Compare)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btn_Compare, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        Pn_Menu3Layout.setVerticalGroup(
            Pn_Menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_Menu3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(Pn_Menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_Compare)
                    .addComponent(btn_Compare, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Pn_Base.add(Pn_Menu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 140, 60));

        Pn_Menu4.setBackground(new java.awt.Color(102, 102, 102));

        lb_Summary.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lb_Summary.setForeground(new java.awt.Color(255, 255, 255));
        lb_Summary.setText("Overview");

        btn_Summary.setBackground(new java.awt.Color(102, 102, 102));
        btn_Summary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/next_button.png"))); // NOI18N
        btn_Summary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OverviewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Pn_Menu4Layout = new javax.swing.GroupLayout(Pn_Menu4);
        Pn_Menu4.setLayout(Pn_Menu4Layout);
        Pn_Menu4Layout.setHorizontalGroup(
            Pn_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_Menu4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_Summary)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btn_Summary, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        Pn_Menu4Layout.setVerticalGroup(
            Pn_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_Menu4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Pn_Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_Summary)
                    .addComponent(btn_Summary, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Pn_Base.add(Pn_Menu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 140, 60));

        lb_WelcomeMsg.setBackground(new java.awt.Color(0, 204, 205));
        lb_WelcomeMsg.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        lb_WelcomeMsg.setForeground(new java.awt.Color(255, 255, 255));
        lb_WelcomeMsg.setText("Welcome to SUMIT");
        lb_WelcomeMsg.setOpaque(true);
        Pn_Base.add(lb_WelcomeMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 390, -1));

        lb_Tag.setFont(new java.awt.Font("Verdana", 2, 13)); // NOI18N
        lb_Tag.setText("Your Best Way to Calculate Design Understandability");
        Pn_Base.add(lb_Tag, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pn_Base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pn_Base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SelectFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectFileActionPerformed
        Pn_Current.setVisible(true);
        Panel_Select.setVisible(true);
        Panel_Result.setVisible(false);
        Panel_Compare.setVisible(false);
        Panel_Overview.setVisible(false);
    }//GEN-LAST:event_SelectFileActionPerformed

    private void ViewResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewResultActionPerformed
        Pn_Current.setVisible(true);
        Panel_Result.setVisible(true);
        Panel_Result.setResult(Panel_Select.Understandability(), Panel_Select.Coupling(), Panel_Select.Cohesion(),
                Panel_Select.Inheritance(), Panel_Select.CoupMetric(), Panel_Select.CohMetric(),
                Panel_Select.InheritMetric());
        Panel_Select.setVisible(false);
        Panel_Compare.setVisible(false);
        Panel_Overview.setVisible(false);
    }//GEN-LAST:event_ViewResultActionPerformed

    private void OverviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OverviewActionPerformed
        Pn_Current.setVisible(true);
        Panel_Overview.setVisible(true);
        Panel_Overview.setResult(Panel_Select.Understandability(), Panel_Select.Cohesion(), Panel_Select.Coupling(),
                Panel_Select.Inheritance(), Panel_Select.Classes(), Panel_Select.Methods(), Panel_Select.CoupMetric(),
                Panel_Select.CohMetric(), Panel_Select.InheritMetric());
        Panel_Select.setVisible(false);
        Panel_Result.setVisible(false);
        Panel_Compare.setVisible(false);
    }//GEN-LAST:event_OverviewActionPerformed

    private void CompareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompareActionPerformed
        Pn_Current.setVisible(true);
        Panel_Compare.setVisible(true);
        Panel_Compare.getCurrentValue();
        Panel_Compare.CurrentValue(Panel_Select.Understandability());
        Panel_Overview.setVisible(false);
        Panel_Select.setVisible(false);
        Panel_Result.setVisible(false);
    }//GEN-LAST:event_CompareActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SUMIT_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SUMIT_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SUMIT_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SUMIT_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SUMIT_Main sumit = new SUMIT_Main();
                sumit.setVisible(true);
                sumit.setLocation(300, 125);
                sumit.setSize(750, 439);
                sumit.setTitle("SUMIT");
                sumit.setResizable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pn_Base;
    private javax.swing.JPanel Pn_Current;
    private javax.swing.JPanel Pn_Foot;
    private javax.swing.JPanel Pn_Menu1;
    private javax.swing.JPanel Pn_Menu2;
    private javax.swing.JPanel Pn_Menu3;
    private javax.swing.JPanel Pn_Menu4;
    private javax.swing.JPanel Pn_Tittle;
    private javax.swing.JButton btn_Compare;
    private javax.swing.JButton btn_SelectFile;
    private javax.swing.JButton btn_Summary;
    private javax.swing.JButton btn_ViewResult;
    private javax.swing.JLabel lb_Compare;
    private javax.swing.JLabel lb_SelectFile;
    private javax.swing.JLabel lb_Summary;
    private javax.swing.JLabel lb_Tag;
    private javax.swing.JLabel lb_Title;
    private javax.swing.JLabel lb_ViewResult;
    private javax.swing.JLabel lb_WelcomeMsg;
    // End of variables declaration//GEN-END:variables
}
