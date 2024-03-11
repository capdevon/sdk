/*
 * Copyright (c) 2009-2010 jMonkeyEngine
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 * * Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 *
 * * Neither the name of 'jMonkeyEngine' nor the names of its contributors
 *   may be used to endorse or promote products derived from this software
 *   without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED
 * TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.jme3.gde.terraineditor.sky;

import com.jme3.gde.core.assets.ProjectAssetManager;
import com.jme3.gde.core.properties.TexturePropertyEditor;
import com.jme3.gde.core.properties.preview.TexturePreview;
import com.jme3.gde.core.scene.SceneApplication;
import com.jme3.util.SkyFactory;
import java.awt.Component;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
@SuppressWarnings({"unchecked", "rawtypes"})
public final class SkyboxVisualPanel2 extends JPanel {

    private TexturePreview texPreview;

    /** Creates new form SkyboxVisualPanel2 */
    public SkyboxVisualPanel2() {
        initComponents();
        
        DefaultComboBoxModel<SkyFactory.EnvMapType> model = new DefaultComboBoxModel<SkyFactory.EnvMapType>();
        for (SkyFactory.EnvMapType value : SkyFactory.EnvMapType.values()) {
            model.addElement(value);
        }
        mapTypeCombo.setModel(model);
    }

    @Override
    public String getName() {
        return "Textures";
    }

    public JPanel getMultipleTexturePanel() {
        return multipleTexturePanel;
    }

    public JPanel getSingleTexturePanel() {
        return singleTexturePanel;
    }
    TexturePropertyEditor editorNorth = new TexturePropertyEditor();
    TexturePropertyEditor editorSouth = new TexturePropertyEditor();
    TexturePropertyEditor editorEast = new TexturePropertyEditor();
    TexturePropertyEditor editorWest = new TexturePropertyEditor();
    TexturePropertyEditor editorTop = new TexturePropertyEditor();
    TexturePropertyEditor editorBottom = new TexturePropertyEditor();
    TexturePropertyEditor editorSingle = new TexturePropertyEditor();

    public TexturePropertyEditor getEditorBottom() {
        return editorBottom;
    }

    public TexturePropertyEditor getEditorEast() {
        return editorEast;
    }

    public TexturePropertyEditor getEditorNorth() {
        return editorNorth;
    }

    public TexturePropertyEditor getEditorSingle() {
        return editorSingle;
    }

    public TexturePropertyEditor getEditorSouth() {
        return editorSouth;
    }

    public TexturePropertyEditor getEditorTop() {
        return editorTop;
    }

    public TexturePropertyEditor getEditorWest() {
        return editorWest;
    }

    
    private TexturePreview getTexturePreview(){
        if (texPreview == null) {
            texPreview = new TexturePreview((ProjectAssetManager) SceneApplication.getApplication().getAssetManager());
        }
        return texPreview;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        multipleTexturePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        multipleTexNorthLoadButton = new javax.swing.JButton();
        multipleTexSouthLoadButton = new javax.swing.JButton();
        multipleTexEastLoadButton = new javax.swing.JButton();
        multipleTexWestLoadButton = new javax.swing.JButton();
        multipleTexTopLoadButton = new javax.swing.JButton();
        multipleTexBottomLoadButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        normal1X = new javax.swing.JTextField();
        normal1Y = new javax.swing.JTextField();
        normal1Z = new javax.swing.JTextField();
        northPic = new javax.swing.JLabel();
        southPic = new javax.swing.JLabel();
        eastPic = new javax.swing.JLabel();
        westPic = new javax.swing.JLabel();
        topPic = new javax.swing.JLabel();
        bottomPic = new javax.swing.JLabel();
        singleTexturePanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        singleTexLoadButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        normal2X = new javax.swing.JTextField();
        normal2Y = new javax.swing.JTextField();
        normal2Z = new javax.swing.JTextField();
        singlePic = new javax.swing.JLabel();
        flipYcheckBox = new javax.swing.JCheckBox();
        mapTypeCombo = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(titleLabel, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.titleLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.jLabel2.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.jLabel3.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.jLabel4.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.jLabel5.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.jLabel6.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(multipleTexNorthLoadButton, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.multipleTexNorthLoadButton.text")); // NOI18N
        multipleTexNorthLoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multipleTexNorthLoadButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(multipleTexSouthLoadButton, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.multipleTexSouthLoadButton.text")); // NOI18N
        multipleTexSouthLoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multipleTexSouthLoadButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(multipleTexEastLoadButton, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.multipleTexEastLoadButton.text")); // NOI18N
        multipleTexEastLoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multipleTexEastLoadButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(multipleTexWestLoadButton, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.multipleTexWestLoadButton.text")); // NOI18N
        multipleTexWestLoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multipleTexWestLoadButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(multipleTexTopLoadButton, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.multipleTexTopLoadButton.text")); // NOI18N
        multipleTexTopLoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multipleTexTopLoadButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(multipleTexBottomLoadButton, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.multipleTexBottomLoadButton.text")); // NOI18N
        multipleTexBottomLoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multipleTexBottomLoadButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.jLabel7.text")); // NOI18N

        normal1X.setText(org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.normal1X.text")); // NOI18N

        normal1Y.setText(org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.normal1Y.text")); // NOI18N

        normal1Z.setText(org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.normal1Z.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(northPic, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.northPic.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(southPic, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.southPic.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(eastPic, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.eastPic.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(westPic, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.westPic.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(topPic, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.topPic.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(bottomPic, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.bottomPic.text")); // NOI18N

        javax.swing.GroupLayout multipleTexturePanelLayout = new javax.swing.GroupLayout(multipleTexturePanel);
        multipleTexturePanel.setLayout(multipleTexturePanelLayout);
        multipleTexturePanelLayout.setHorizontalGroup(
            multipleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(multipleTexturePanelLayout.createSequentialGroup()
                .addGroup(multipleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(multipleTexturePanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(multipleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(multipleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(multipleTexturePanelLayout.createSequentialGroup()
                                .addComponent(multipleTexNorthLoadButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(northPic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(normal1X, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(normal1Y, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(normal1Z, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(multipleTexturePanelLayout.createSequentialGroup()
                                .addComponent(multipleTexSouthLoadButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(southPic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(multipleTexturePanelLayout.createSequentialGroup()
                                .addComponent(multipleTexEastLoadButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eastPic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(multipleTexturePanelLayout.createSequentialGroup()
                        .addGroup(multipleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(multipleTexturePanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(multipleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)))
                            .addGroup(multipleTexturePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(multipleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(multipleTexturePanelLayout.createSequentialGroup()
                                .addComponent(multipleTexBottomLoadButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bottomPic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(multipleTexturePanelLayout.createSequentialGroup()
                                .addComponent(multipleTexWestLoadButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(westPic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(multipleTexturePanelLayout.createSequentialGroup()
                                .addComponent(multipleTexTopLoadButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(topPic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        multipleTexturePanelLayout.setVerticalGroup(
            multipleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(multipleTexturePanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(multipleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(normal1X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(normal1Y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(normal1Z, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multipleTexNorthLoadButton)
                    .addComponent(northPic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(multipleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(multipleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(multipleTexSouthLoadButton))
                    .addComponent(southPic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(multipleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eastPic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(multipleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(multipleTexEastLoadButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(multipleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(multipleTexturePanelLayout.createSequentialGroup()
                        .addGroup(multipleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(multipleTexWestLoadButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(multipleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(multipleTexTopLoadButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(multipleTexturePanelLayout.createSequentialGroup()
                        .addComponent(westPic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(topPic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGroup(multipleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bottomPic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(multipleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(multipleTexBottomLoadButton)
                        .addComponent(jLabel6)))
                .addGap(58, 58, 58))
        );

        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.jLabel8.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(singleTexLoadButton, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.singleTexLoadButton.text")); // NOI18N
        singleTexLoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleTexLoadButtonActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel9, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.jLabel9.text")); // NOI18N

        normal2X.setText(org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.normal2X.text")); // NOI18N

        normal2Y.setText(org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.normal2Y.text")); // NOI18N

        normal2Z.setText(org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.normal2Z.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(singlePic, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.singlePic.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(flipYcheckBox, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.flipYcheckBox.text")); // NOI18N

        mapTypeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        mapTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mapTypeComboActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel10, org.openide.util.NbBundle.getMessage(SkyboxVisualPanel2.class, "SkyboxVisualPanel2.jLabel10.text")); // NOI18N

        javax.swing.GroupLayout singleTexturePanelLayout = new javax.swing.GroupLayout(singleTexturePanel);
        singleTexturePanel.setLayout(singleTexturePanelLayout);
        singleTexturePanelLayout.setHorizontalGroup(
            singleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singleTexturePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(singleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(flipYcheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(singleTexturePanelLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mapTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(singleTexturePanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(21, 21, 21)
                        .addComponent(singleTexLoadButton)
                        .addGap(2, 2, 2)
                        .addComponent(singlePic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(normal2X, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(normal2Y, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(normal2Z, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        singleTexturePanelLayout.setVerticalGroup(
            singleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(singleTexturePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(singleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(singlePic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(singleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(singleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(singleTexLoadButton))
                        .addGroup(singleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(normal2X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(normal2Y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(normal2Z, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(singleTexturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mapTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flipYcheckBox)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(multipleTexturePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titleLabel)
                    .addComponent(singleTexturePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(multipleTexturePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(singleTexturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void multipleTexSouthLoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multipleTexSouthLoadButtonActionPerformed
        Component view = editorSouth.getCustomEditor();
        view.setVisible(true);
        if (editorSouth.getAsText()!= null) {            
            String selected = editorSouth.getAsText();
            getTexturePreview().requestPreview(selected, "", 80, 80, southPic, null);
        }
    }//GEN-LAST:event_multipleTexSouthLoadButtonActionPerformed

    private void multipleTexNorthLoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multipleTexNorthLoadButtonActionPerformed
        Component view = editorNorth.getCustomEditor();
        view.setVisible(true);
        if (editorNorth.getAsText() != null) {            
            String selected =  editorNorth.getAsText();
            getTexturePreview().requestPreview(selected, "", 80, 80, northPic, null);
        }
    }//GEN-LAST:event_multipleTexNorthLoadButtonActionPerformed

    private void multipleTexEastLoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multipleTexEastLoadButtonActionPerformed
        Component view = editorEast.getCustomEditor();
        view.setVisible(true);
        if (editorEast.getAsText() != null) {            
            String selected = editorEast.getAsText();
            getTexturePreview().requestPreview(selected, "", 80, 80, eastPic, null);
        }
    }//GEN-LAST:event_multipleTexEastLoadButtonActionPerformed

    private void multipleTexWestLoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multipleTexWestLoadButtonActionPerformed
        Component view = editorWest.getCustomEditor();
        view.setVisible(true);
        if (editorWest.getAsText() != null) {            
            String selected = editorWest.getAsText();
            getTexturePreview().requestPreview(selected, "", 80, 80, westPic, null);
        }
    }//GEN-LAST:event_multipleTexWestLoadButtonActionPerformed

    private void multipleTexTopLoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multipleTexTopLoadButtonActionPerformed
        Component view = editorTop.getCustomEditor();
        view.setVisible(true);
        if (editorTop.getAsText() != null) {            
            String selected = editorTop.getAsText();
            getTexturePreview().requestPreview(selected, "", 80, 80, topPic, null);
        }
    }//GEN-LAST:event_multipleTexTopLoadButtonActionPerformed

    private void multipleTexBottomLoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multipleTexBottomLoadButtonActionPerformed
        Component view = editorBottom.getCustomEditor();
        view.setVisible(true);
        if (editorBottom.getAsText() != null) {            
            String selected = editorBottom.getAsText();
            getTexturePreview().requestPreview(selected, "", 80, 80, bottomPic, null);
        }
    }//GEN-LAST:event_multipleTexBottomLoadButtonActionPerformed

    private void singleTexLoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleTexLoadButtonActionPerformed
        Component view = editorSingle.getCustomEditor();
        view.setVisible(true);
        if (editorSingle.getAsText()!= null) {                        
            String selected = editorSingle.getAsText();
            getTexturePreview().requestPreview(selected, "", 80, 80, singlePic, null);
        }
    }//GEN-LAST:event_singleTexLoadButtonActionPerformed

    private void mapTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mapTypeComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mapTypeComboActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bottomPic;
    private javax.swing.JLabel eastPic;
    private javax.swing.JCheckBox flipYcheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox mapTypeCombo;
    private javax.swing.JButton multipleTexBottomLoadButton;
    private javax.swing.JButton multipleTexEastLoadButton;
    private javax.swing.JButton multipleTexNorthLoadButton;
    private javax.swing.JButton multipleTexSouthLoadButton;
    private javax.swing.JButton multipleTexTopLoadButton;
    private javax.swing.JButton multipleTexWestLoadButton;
    private javax.swing.JPanel multipleTexturePanel;
    private javax.swing.JTextField normal1X;
    private javax.swing.JTextField normal1Y;
    private javax.swing.JTextField normal1Z;
    private javax.swing.JTextField normal2X;
    private javax.swing.JTextField normal2Y;
    private javax.swing.JTextField normal2Z;
    private javax.swing.JLabel northPic;
    private javax.swing.JLabel singlePic;
    private javax.swing.JButton singleTexLoadButton;
    private javax.swing.JPanel singleTexturePanel;
    private javax.swing.JLabel southPic;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel topPic;
    private javax.swing.JLabel westPic;
    // End of variables declaration//GEN-END:variables

    public JTextField getNormal1X() {
        return normal1X;
    }

    public JTextField getNormal1Y() {
        return normal1Y;
    }

    public JTextField getNormal1Z() {
        return normal1Z;
    }

    public JTextField getNormal2X() {
        return normal2X;
    }

    public JTextField getNormal2Y() {
        return normal2Y;
    }

    public JTextField getNormal2Z() {
        return normal2Z;
    }

    public SkyFactory.EnvMapType getEnvMapType(){
        return (SkyFactory.EnvMapType)mapTypeCombo.getSelectedItem();
    }
    
    
    public JCheckBox getFlipYCheckBox() {
        return flipYcheckBox;
    }
}
