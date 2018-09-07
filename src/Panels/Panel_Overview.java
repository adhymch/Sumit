package Panels;

/**
 *
 * @author User
 */
public class Panel_Overview extends javax.swing.JPanel {

    public Panel_Overview() {
        initComponents();
    }
    
    public void setResult(String Und, String Coh, String Coup, String Inh, String Cl, String Op, String CoupM, String CohM, String InhM){
        lb_AsValue.setText(CoupM);
        lb_AtValue.setText(CohM);
        lb_ClValue.setText(Cl);
        lb_CohValue.setText(Coh);
        lb_CoupValue.setText(Coup);
        lb_GnValue.setText(InhM);
        lb_InhValue.setText(Inh);
        lb_NAValue.setText(CohM);
        lb_NAssocValue.setText(CoupM);
        lb_NOCValue.setText(InhM);
        lb_OpValue.setText(Op);
        lb_UndValue.setText(Und);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        lb_Menu4 = new javax.swing.JLabel();
        Pn_Main = new javax.swing.JPanel();
        lb_UndValue = new javax.swing.JLabel();
        lb_Understandability = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        lb_CoupValue = new javax.swing.JLabel();
        lb_CohValue = new javax.swing.JLabel();
        lb_InhValue = new javax.swing.JLabel();
        lb_Coupling = new javax.swing.JLabel();
        lb_Cohesion = new javax.swing.JLabel();
        lb_Inheritance = new javax.swing.JLabel();
        Pn_Metric1 = new javax.swing.JPanel();
        lb_NAssoc = new javax.swing.JLabel();
        lb_NAssocValue = new javax.swing.JLabel();
        Pn_Metric2 = new javax.swing.JPanel();
        lb_NA = new javax.swing.JLabel();
        lb_NAValue = new javax.swing.JLabel();
        Pn_Metric3 = new javax.swing.JPanel();
        lb_NOC = new javax.swing.JLabel();
        lb_NOCValue = new javax.swing.JLabel();
        Pn_Side = new javax.swing.JPanel();
        lb_Cl = new javax.swing.JLabel();
        lb_At = new javax.swing.JLabel();
        lb_Op = new javax.swing.JLabel();
        lb_As = new javax.swing.JLabel();
        lb_Gn = new javax.swing.JLabel();
        lb_ClValue = new javax.swing.JLabel();
        lb_AtValue = new javax.swing.JLabel();
        lb_OpValue = new javax.swing.JLabel();
        lb_AsValue = new javax.swing.JLabel();
        lb_GnValue = new javax.swing.JLabel();
        lb_SectionTitle1 = new javax.swing.JLabel();
        lb_SectionTitle2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(229, 229, 229));
        setMinimumSize(new java.awt.Dimension(610, 410));
        setPreferredSize(new java.awt.Dimension(610, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 69, 610, 1));

        lb_Menu4.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        lb_Menu4.setText("Overview");
        add(lb_Menu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 22, -1, -1));

        Pn_Main.setBackground(new java.awt.Color(247, 246, 246));

        lb_UndValue.setFont(new java.awt.Font("Verdana", 0, 75)); // NOI18N
        lb_UndValue.setForeground(new java.awt.Color(60, 159, 231));
        lb_UndValue.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lb_UndValue.setText("0,00");
        lb_UndValue.setPreferredSize(new java.awt.Dimension(204, 110));

        lb_Understandability.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lb_Understandability.setText("Understandability");

        lb_CoupValue.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lb_CoupValue.setText("0,00");

        lb_CohValue.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lb_CohValue.setText("0,00");

        lb_InhValue.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lb_InhValue.setText("0,00");

        lb_Coupling.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lb_Coupling.setText("Coupling");

        lb_Cohesion.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lb_Cohesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_Cohesion.setText("Cohesion");

        lb_Inheritance.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lb_Inheritance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_Inheritance.setText("Inheritance");

        javax.swing.GroupLayout Pn_MainLayout = new javax.swing.GroupLayout(Pn_Main);
        Pn_Main.setLayout(Pn_MainLayout);
        Pn_MainLayout.setHorizontalGroup(
            Pn_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_MainLayout.createSequentialGroup()
                .addComponent(lb_UndValue, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pn_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pn_MainLayout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_CoupValue))
                    .addGroup(Pn_MainLayout.createSequentialGroup()
                        .addGroup(Pn_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Pn_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Pn_MainLayout.createSequentialGroup()
                                .addComponent(lb_InhValue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lb_Inheritance, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(Pn_MainLayout.createSequentialGroup()
                                .addComponent(lb_CohValue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Pn_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_Coupling, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_Cohesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
            .addGroup(Pn_MainLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lb_Understandability)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pn_MainLayout.setVerticalGroup(
            Pn_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_MainLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(lb_Understandability)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pn_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pn_MainLayout.createSequentialGroup()
                        .addGroup(Pn_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Pn_MainLayout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(Pn_MainLayout.createSequentialGroup()
                                .addGroup(Pn_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lb_CoupValue, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_Coupling))
                                .addGap(30, 30, 30))
                            .addGroup(Pn_MainLayout.createSequentialGroup()
                                .addGroup(Pn_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lb_CohValue)
                                    .addComponent(lb_Cohesion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addComponent(lb_UndValue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pn_MainLayout.createSequentialGroup()
                        .addGroup(Pn_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_InhValue, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_Inheritance))
                        .addGap(6, 6, 6)))
                .addGap(44, 44, 44))
        );

        add(Pn_Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 380, 170));

        Pn_Metric1.setBackground(new java.awt.Color(247, 246, 246));

        lb_NAssoc.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lb_NAssoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_NAssoc.setText("NAssoc");

        lb_NAssocValue.setFont(new java.awt.Font("Verdana", 0, 60)); // NOI18N
        lb_NAssocValue.setForeground(new java.awt.Color(0, 204, 204));
        lb_NAssocValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_NAssocValue.setText("0");

        javax.swing.GroupLayout Pn_Metric1Layout = new javax.swing.GroupLayout(Pn_Metric1);
        Pn_Metric1.setLayout(Pn_Metric1Layout);
        Pn_Metric1Layout.setHorizontalGroup(
            Pn_Metric1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_NAssoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addComponent(lb_NAssocValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Pn_Metric1Layout.setVerticalGroup(
            Pn_Metric1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_Metric1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_NAssoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_NAssocValue, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        add(Pn_Metric1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 120, 110));

        Pn_Metric2.setBackground(new java.awt.Color(247, 246, 246));

        lb_NA.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lb_NA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_NA.setText("NA");

        lb_NAValue.setFont(new java.awt.Font("Verdana", 0, 60)); // NOI18N
        lb_NAValue.setForeground(new java.awt.Color(0, 204, 204));
        lb_NAValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_NAValue.setText("0");

        javax.swing.GroupLayout Pn_Metric2Layout = new javax.swing.GroupLayout(Pn_Metric2);
        Pn_Metric2.setLayout(Pn_Metric2Layout);
        Pn_Metric2Layout.setHorizontalGroup(
            Pn_Metric2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_Metric2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_NA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(lb_NAValue, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        Pn_Metric2Layout.setVerticalGroup(
            Pn_Metric2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_Metric2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_NA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_NAValue, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        add(Pn_Metric2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 120, 110));

        Pn_Metric3.setBackground(new java.awt.Color(247, 246, 246));

        lb_NOC.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lb_NOC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_NOC.setText("NOC");

        lb_NOCValue.setFont(new java.awt.Font("Verdana", 0, 60)); // NOI18N
        lb_NOCValue.setForeground(new java.awt.Color(0, 204, 204));
        lb_NOCValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_NOCValue.setText("0");

        javax.swing.GroupLayout Pn_Metric3Layout = new javax.swing.GroupLayout(Pn_Metric3);
        Pn_Metric3.setLayout(Pn_Metric3Layout);
        Pn_Metric3Layout.setHorizontalGroup(
            Pn_Metric3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_NOC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lb_NOCValue, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        Pn_Metric3Layout.setVerticalGroup(
            Pn_Metric3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_Metric3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_NOC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_NOCValue, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        add(Pn_Metric3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 120, 110));

        Pn_Side.setBackground(new java.awt.Color(247, 246, 246));

        lb_Cl.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lb_Cl.setText("Total Classes:");

        lb_At.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lb_At.setText("Total Atributes:");

        lb_Op.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lb_Op.setText("Total Methods:");

        lb_As.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lb_As.setText("Total Association:");

        lb_Gn.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lb_Gn.setText("Total Generalization:");

        lb_ClValue.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lb_ClValue.setText("0");

        lb_AtValue.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lb_AtValue.setText("0");

        lb_OpValue.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lb_OpValue.setText("0");

        lb_AsValue.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lb_AsValue.setText("0");

        lb_GnValue.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lb_GnValue.setText("0");

        javax.swing.GroupLayout Pn_SideLayout = new javax.swing.GroupLayout(Pn_Side);
        Pn_Side.setLayout(Pn_SideLayout);
        Pn_SideLayout.setHorizontalGroup(
            Pn_SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_SideLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pn_SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Pn_SideLayout.createSequentialGroup()
                        .addComponent(lb_Gn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_GnValue))
                    .addGroup(Pn_SideLayout.createSequentialGroup()
                        .addGroup(Pn_SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_As, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_Op, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_At, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_Cl, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(41, 41, 41)
                        .addGroup(Pn_SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb_AsValue)
                            .addComponent(lb_OpValue)
                            .addComponent(lb_AtValue)
                            .addComponent(lb_ClValue))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        Pn_SideLayout.setVerticalGroup(
            Pn_SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pn_SideLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(Pn_SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Cl)
                    .addComponent(lb_ClValue))
                .addGap(34, 34, 34)
                .addGroup(Pn_SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_At)
                    .addComponent(lb_AtValue))
                .addGap(36, 36, 36)
                .addGroup(Pn_SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Op)
                    .addComponent(lb_OpValue))
                .addGap(34, 34, 34)
                .addGroup(Pn_SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_As)
                    .addComponent(lb_AsValue))
                .addGap(36, 36, 36)
                .addGroup(Pn_SideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Gn)
                    .addComponent(lb_GnValue))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        add(Pn_Side, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 190, 290));

        lb_SectionTitle1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lb_SectionTitle1.setText("Metric");
        add(lb_SectionTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        lb_SectionTitle2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        lb_SectionTitle2.setText("Design");
        add(lb_SectionTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pn_Main;
    private javax.swing.JPanel Pn_Metric1;
    private javax.swing.JPanel Pn_Metric2;
    private javax.swing.JPanel Pn_Metric3;
    private javax.swing.JPanel Pn_Side;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lb_As;
    private javax.swing.JLabel lb_AsValue;
    private javax.swing.JLabel lb_At;
    private javax.swing.JLabel lb_AtValue;
    private javax.swing.JLabel lb_Cl;
    private javax.swing.JLabel lb_ClValue;
    private javax.swing.JLabel lb_CohValue;
    private javax.swing.JLabel lb_Cohesion;
    private javax.swing.JLabel lb_CoupValue;
    private javax.swing.JLabel lb_Coupling;
    private javax.swing.JLabel lb_Gn;
    private javax.swing.JLabel lb_GnValue;
    private javax.swing.JLabel lb_InhValue;
    private javax.swing.JLabel lb_Inheritance;
    private javax.swing.JLabel lb_Menu4;
    private javax.swing.JLabel lb_NA;
    private javax.swing.JLabel lb_NAValue;
    private javax.swing.JLabel lb_NAssoc;
    private javax.swing.JLabel lb_NAssocValue;
    private javax.swing.JLabel lb_NOC;
    private javax.swing.JLabel lb_NOCValue;
    private javax.swing.JLabel lb_Op;
    private javax.swing.JLabel lb_OpValue;
    private javax.swing.JLabel lb_SectionTitle1;
    private javax.swing.JLabel lb_SectionTitle2;
    private javax.swing.JLabel lb_UndValue;
    private javax.swing.JLabel lb_Understandability;
    // End of variables declaration//GEN-END:variables
}