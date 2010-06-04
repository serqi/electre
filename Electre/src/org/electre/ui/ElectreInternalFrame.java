/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ElectreInternalFrame.java
 *
 * Created on Jun 1, 2010, 9:30:28 PM
 */

package org.electre.ui;

import java.util.List;
import java.util.Vector;
import org.electre.core.Atributo;
import org.electre.processors.AggregatedDominanceMatrixProcessor;
import org.electre.processors.ConcordanceMatrixProcessor;
import org.electre.processors.ConcordantDominanceMatrixProcessor;
import org.electre.processors.DecisionMatrixProcessor;
import org.electre.processors.DiscordanceMatrixProcessor;
import org.electre.processors.DiscordantDominanceMatrixProcessor;
import org.electre.utils.ConcordanceComparator;
import org.electre.utils.DiscordanceComparator;
import org.electre.utils.GraphSceneImpl;
import org.electre.utils.MyTableModel;

/**
 *
 * @author william
 */

public class ElectreInternalFrame extends javax.swing.JInternalFrame {
    
    private MyTableModel model;
    private List<Atributo> atributos;
    /** Creates new form ElectreInternalFrame */
    public ElectreInternalFrame() {
        initComponents();
    }

    public void setModel(MyTableModel model) {
        this.model = model;
        this.jTable1.setModel(model);
    }

    public void setAtributos(List<Atributo> atributos) {
        this.atributos = atributos;
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();

        setClosable(true);
        setIconifiable(true);
        setTitle(org.openide.util.NbBundle.getMessage(ElectreInternalFrame.class, "ElectreInternalFrame.title")); // NOI18N
        setOpaque(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText(org.openide.util.NbBundle.getMessage(ElectreInternalFrame.class, "ElectreInternalFrame.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(ElectreInternalFrame.class, "ElectreInternalFrame.jPanel1.TabConstraints.tabTitle"), jPanel1); // NOI18N

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(ElectreInternalFrame.class, "ElectreInternalFrame.jScrollPane2.border.title"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab(org.openide.util.NbBundle.getMessage(ElectreInternalFrame.class, "ElectreInternalFrame.jPanel2.TabConstraints.tabTitle"), jPanel2); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Vector<Vector> dataVector = ((MyTableModel)this.jTable1.getModel()).getDataVector();
        double[][] decisionMatrix = new double[dataVector.size()][dataVector.get(0).size()-1];
        int i = 0;
        for (Vector row : dataVector) {
            for (int j = 1; j < row.size(); j++) {
                decisionMatrix[i][j] = Double.parseDouble((String)row.get(j));
            }
        }
        ConcordanceMatrixProcessor concordanceMatrixProcessor = new ConcordanceMatrixProcessor();
        double[][] concordanceMatrix = concordanceMatrixProcessor.process(decisionMatrix);
        double[][] normalizedDecisionMatrix = DecisionMatrixProcessor.normalize(decisionMatrix);
        double[][] weightedDecisionMatrix = DecisionMatrixProcessor.weigh(normalizedDecisionMatrix, this.atributos);
        DiscordanceMatrixProcessor discordanceMatrixProcessor = new DiscordanceMatrixProcessor();
        double[][] discordanceMatrix = discordanceMatrixProcessor.process(weightedDecisionMatrix);
        ConcordantDominanceMatrixProcessor concordantDominanceMatrixProcessor = new ConcordantDominanceMatrixProcessor(new ConcordanceComparator(),1);
        double[][] concordantDominanceMatrix = concordantDominanceMatrixProcessor.process(concordanceMatrix);
        DiscordantDominanceMatrixProcessor discordantDominanceMatrixProcessor = new DiscordantDominanceMatrixProcessor(new DiscordanceComparator(),1);
        double[][] discordantDominanceMatrix = discordantDominanceMatrixProcessor.process(discordanceMatrix);
        AggregatedDominanceMatrixProcessor aggregatedDominanceMatrixProcessor = new AggregatedDominanceMatrixProcessor();
        double[][] aggregatedDominanceMatrix = aggregatedDominanceMatrixProcessor.process(concordantDominanceMatrix, discordantDominanceMatrix);
        GraphSceneImpl graphScene = new GraphSceneImpl();
        jScrollPane1.setViewportView(graphScene.createView());
        graphScene.paintElectreGraph(aggregatedDominanceMatrix);



    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}