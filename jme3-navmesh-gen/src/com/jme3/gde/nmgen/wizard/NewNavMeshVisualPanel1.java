/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jme3.gde.nmgen.wizard;

import com.jme3.gde.nmgen.NavMeshGenerator;
import javax.swing.JPanel;
import org.openide.WizardDescriptor;
import org.openide.explorer.propertysheet.PropertySheet;
import org.openide.nodes.Node;

public final class NewNavMeshVisualPanel1 extends JPanel {

    private PropertySheet ps;

    /** Creates new form NewNavMeshVisualPanel1 */
    public NewNavMeshVisualPanel1() {
        initComponents();
        ps = new PropertySheet();
        ps.setNodes(new Node[]{});
        jPanel1.add(ps);
    }

    @Override
    public String getName() {
        return "Step #1";
    }
    
    public void loadSettings(WizardDescriptor wiz){
        NavMeshGenerator gen = (NavMeshGenerator)wiz.getProperty("generator");
        ps.setNodes(new Node[]{new NavMeshGeneratorNode(gen)});
    }

    public void saveSettings(WizardDescriptor wiz){
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}