/**
 * This Java Class is part of the Impro-Visor Application.
 *
 * Copyright (C) 2017 Robert Keller and Harvey Mudd College
 *
 * Impro-Visor is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * Impro-Visor is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of merchantability or fitness
 * for a particular purpose. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Impro-Visor; if not, write to the Free Software Foundation, Inc., 51 Franklin
 * St, Fifth Floor, Boston, MA 02110-1301 USA
 */
package imp.gui;

import polya.Polylist;
import imp.util.Preferences;
import imp.Constants.StaveType;
import imp.com.TransposeAllInPlaceCommand;
import imp.com.TransposeInstrumentsCommand;
import imp.data.Transposition;

/**
 * @author Samantha Long and Robert Keller
 */
public class TranspositionWizardDialog extends javax.swing.JDialog {

    int scoreTransposition = 0;
    
    StaveType clef = StaveType.TREBLE;

    Notate notate;

    public TranspositionWizardDialog(Notate notate)
    {
        initComponents();
        this.notate = notate;
        WindowRegistry.registerWindow(this);
        setVisible(true);
        Transposition transposition = notate.getTransposition();
        bassWizardSpinner.setValue(transposition.getBassTransposition());
        chordWizardSpinner.setValue(transposition.getChordTransposition());
        melodyWizardSpinner.setValue(transposition.getMelodyTransposition());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        transposeTitle = new javax.swing.JLabel();
        instrumentSelectionPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        transpositionWizardJList = new javax.swing.JList<>();
        instrumentLabel = new javax.swing.JLabel();
        transpositionPreviewPanel = new javax.swing.JPanel();
        bassWizardLabel = new javax.swing.JLabel();
        chordWizardLabel = new javax.swing.JLabel();
        melodyWizardLabel = new javax.swing.JLabel();
        bassWizardSpinner = new javax.swing.JSpinner();
        chordWizardSpinner = new javax.swing.JSpinner();
        melodyWizardSpinner = new javax.swing.JSpinner();
        playbackLabel = new javax.swing.JLabel();
        transpositionWizardSaveButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        concertPitchButton = new javax.swing.JButton();
        customLeadsheetTransposeSpinner = new javax.swing.JSpinner();
        clefWizardPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        clefComboBox = new javax.swing.JComboBox<>();

        setTitle("Transposition Wizard");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBounds(new java.awt.Rectangle(400, 300, 570, 450));
        setMinimumSize(new java.awt.Dimension(570, 450));
        setSize(new java.awt.Dimension(570, 450));
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        transposeTitle.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        transposeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        transposeTitle.setText("Transpose Notation and/or Playback");
        transposeTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 30;
        getContentPane().add(transposeTitle, gridBagConstraints);

        instrumentSelectionPanel.setToolTipText("");
        instrumentSelectionPanel.setMaximumSize(new java.awt.Dimension(350, 250));
        instrumentSelectionPanel.setMinimumSize(new java.awt.Dimension(350, 250));
        instrumentSelectionPanel.setPreferredSize(new java.awt.Dimension(180, 200));
        instrumentSelectionPanel.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(160, 175));

        transpositionWizardJList.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "No-Transposition", "Bb-Trumpet", "Bb-TenorSax", "Bb-SopranoSax", "Eb-AltoSax", "Eb-BaritoneSax", "F-Horn", "Trombone", "SopranoRecorder", "BassRecorder" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        transpositionWizardJList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        transpositionWizardJList.setToolTipText("First select an instrument, it's pitch can be transposed in playback and/or in the leadsheet ");
        transpositionWizardJList.setBounds(new java.awt.Rectangle(0, 0, 100, 100));
        transpositionWizardJList.setMaximumSize(new java.awt.Dimension(100, 100));
        transpositionWizardJList.setMinimumSize(new java.awt.Dimension(100, 100));
        transpositionWizardJList.setPreferredSize(new java.awt.Dimension(100, 80));
        transpositionWizardJList.setVisibleRowCount(10);
        transpositionWizardJList.addListSelectionListener(new javax.swing.event.ListSelectionListener()
        {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt)
            {
                transpositionWizardJListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(transpositionWizardJList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        instrumentSelectionPanel.add(jScrollPane1, gridBagConstraints);

        instrumentLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        instrumentLabel.setText("  Instrument  ");
        instrumentLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        instrumentSelectionPanel.add(instrumentLabel, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        getContentPane().add(instrumentSelectionPanel, gridBagConstraints);

        transpositionPreviewPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        transpositionPreviewPanel.setToolTipText("Here is a preview of what the playback will sound like, transposed into the selected instrument's pitch.");
        transpositionPreviewPanel.setMaximumSize(new java.awt.Dimension(250, 200));
        transpositionPreviewPanel.setMinimumSize(new java.awt.Dimension(250, 200));
        transpositionPreviewPanel.setPreferredSize(new java.awt.Dimension(250, 210));
        transpositionPreviewPanel.setLayout(new java.awt.GridBagLayout());

        bassWizardLabel.setText("Bass Transposition:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        transpositionPreviewPanel.add(bassWizardLabel, gridBagConstraints);

        chordWizardLabel.setText("Chord Transposition:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        transpositionPreviewPanel.add(chordWizardLabel, gridBagConstraints);

        melodyWizardLabel.setText("Melody Transposition:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        transpositionPreviewPanel.add(melodyWizardLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 51);
        transpositionPreviewPanel.add(bassWizardSpinner, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 51);
        transpositionPreviewPanel.add(chordWizardSpinner, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 51);
        transpositionPreviewPanel.add(melodyWizardSpinner, gridBagConstraints);

        playbackLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        playbackLabel.setText("Playback");
        playbackLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        transpositionPreviewPanel.add(playbackLabel, gridBagConstraints);
        playbackLabel.getAccessibleContext().setAccessibleName(" Playback ");

        transpositionWizardSaveButton.setText("Transpose Playback ");
        transpositionWizardSaveButton.setToolTipText("Clicking this button will set the transposed playback.");
        transpositionWizardSaveButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        transpositionWizardSaveButton.setMaximumSize(new java.awt.Dimension(176, 20));
        transpositionWizardSaveButton.setMinimumSize(new java.awt.Dimension(176, 40));
        transpositionWizardSaveButton.setPreferredSize(new java.awt.Dimension(176, 40));
        transpositionWizardSaveButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                transpositionWizardSaveButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        transpositionPreviewPanel.add(transpositionWizardSaveButton, gridBagConstraints);

        jPanel3.setMaximumSize(new java.awt.Dimension(200, 32));
        jPanel3.setMinimumSize(new java.awt.Dimension(200, 32));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 32));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("     Select instrument to set");
        jLabel3.setMaximumSize(new java.awt.Dimension(300, 16));
        jLabel3.setMinimumSize(new java.awt.Dimension(300, 16));
        jLabel3.setPreferredSize(new java.awt.Dimension(200, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        jPanel3.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("      playback transpositions.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel3.add(jLabel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 20;
        transpositionPreviewPanel.add(jPanel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(transpositionPreviewPanel, gridBagConstraints);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("");
        jPanel1.setMaximumSize(new java.awt.Dimension(320, 150));
        jPanel1.setMinimumSize(new java.awt.Dimension(320, 150));
        jPanel1.setPreferredSize(new java.awt.Dimension(425, 120));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        concertPitchButton.setToolTipText("Clicking this button will visually transpose the leadsheet");
        concertPitchButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        concertPitchButton.setLabel("Transpose Notation");
        concertPitchButton.setMaximumSize(new java.awt.Dimension(176, 40));
        concertPitchButton.setMinimumSize(new java.awt.Dimension(176, 40));
        concertPitchButton.setPreferredSize(new java.awt.Dimension(176, 40));
        concertPitchButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                concertPitchButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        jPanel1.add(concertPitchButton, gridBagConstraints);

        customLeadsheetTransposeSpinner.setToolTipText("This is the amount of semitones the leadsheet will be transposed.");
        customLeadsheetTransposeSpinner.setBorder(javax.swing.BorderFactory.createTitledBorder("Transpose"));
        customLeadsheetTransposeSpinner.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                customLeadsheetTransposeSpinnerStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 40;
        jPanel1.add(customLeadsheetTransposeSpinner, gridBagConstraints);

        clefWizardPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel1.add(clefWizardPanel, gridBagConstraints);

        jPanel2.setMinimumSize(new java.awt.Dimension(274, 40));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Use this at most once to transpose the");
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 3;
        jPanel2.add(jLabel1, gridBagConstraints);
        jLabel1.getAccessibleContext().setAccessibleName("Use this at most once to transpose the leadsheet");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("leadsheet notation from its current pitch.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(jLabel2, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("(Press z to Undo, y to Redo.)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(jLabel5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        jPanel1.add(jPanel2, gridBagConstraints);
        jPanel1.add(jSeparator1, new java.awt.GridBagConstraints());

        clefComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Auto", "Treble", "Bass", "Grand", "None", " " }));
        clefComboBox.setSelectedItem("Treble");
        clefComboBox.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clef", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        clefComboBox.setMinimumSize(new java.awt.Dimension(150, 50));
        clefComboBox.setPreferredSize(new java.awt.Dimension(150, 50));
        clefComboBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                clefComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        jPanel1.add(clefComboBox, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void transpositionWizardJListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_transpositionWizardJListValueChanged
        //gives preview of what will be transposed in transposition wizard window
        String transpositionInstrument = transpositionWizardJList.getSelectedValue();
        String allValues = Preferences.getPreference("transposing-instruments");
        Polylist ALL_VALUES = Polylist.PolylistFromString(allValues);
        Polylist found = ALL_VALUES.assoc(transpositionInstrument);
        Long mel = (Long) found.second();
        Long chordbass = (Long) found.third();
        String clefString = (String) found.fourth();
        clef = Stave.staveTypeFromString(clefString);
        clefComboBox.setSelectedItem(clefString);
        scoreTransposition = ((Long) found.fifth()).intValue();
        melodyWizardSpinner.setValue(mel);
        chordWizardSpinner.setValue(chordbass);
        bassWizardSpinner.setValue(chordbass);
        //clefWizardTextField.setText(clef);
        customLeadsheetTransposeSpinner.setValue(scoreTransposition);
        notate.setLeadsheetTransValue(-mel.intValue());
    }//GEN-LAST:event_transpositionWizardJListValueChanged

    private void transpositionWizardSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transpositionWizardSaveButtonActionPerformed
        if (transpositionWizardJList.getSelectedValue() != null)
        {
            //deals with changing transposition spinners & radio buttons in preferences windows
            String transpositionInstrument = transpositionWizardJList.getSelectedValue();
            String allValues = Preferences.getPreference("transposing-instruments");
            Polylist ALL_VALUES = Polylist.PolylistFromString(allValues);
            Polylist found = ALL_VALUES.assoc(transpositionInstrument);
            int mel = ((Long)found.second()).intValue();
            int chordbass = ((Long) found.third()).intValue();
            Transposition newTransposition = new Transposition(chordbass, chordbass, mel);
            notate.executeCommand(new TransposeInstrumentsCommand(notate,
                                                                  newTransposition));
        }
        //setVisible(false);
        //notate.getTranspositionWizardMI().setEnabled(true);
    }//GEN-LAST:event_transpositionWizardSaveButtonActionPerformed


    private void concertPitchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concertPitchButtonActionPerformed
        notate.executeCommand(new TransposeAllInPlaceCommand(notate, 
                                                             scoreTransposition,
                                                             clef));
    }//GEN-LAST:event_concertPitchButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        notate.getTranspositionWizardMI().setEnabled(true);
    }//GEN-LAST:event_formWindowClosing

    private void customLeadsheetTransposeSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_customLeadsheetTransposeSpinnerStateChanged
        Object change = customLeadsheetTransposeSpinner.getValue();
        String temp = change.toString();
        scoreTransposition = Integer.valueOf(temp);
    }//GEN-LAST:event_customLeadsheetTransposeSpinnerStateChanged

    private void clefComboBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_clefComboBoxActionPerformed
    {//GEN-HEADEREND:event_clefComboBoxActionPerformed
        clef = Stave.staveTypeFromString((String)clefComboBox.getSelectedItem());
    }//GEN-LAST:event_clefComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bassWizardLabel;
    private javax.swing.JSpinner bassWizardSpinner;
    private javax.swing.JLabel chordWizardLabel;
    private javax.swing.JSpinner chordWizardSpinner;
    private javax.swing.JComboBox<String> clefComboBox;
    private javax.swing.JPanel clefWizardPanel;
    private javax.swing.JButton concertPitchButton;
    private javax.swing.JSpinner customLeadsheetTransposeSpinner;
    private javax.swing.JLabel instrumentLabel;
    private javax.swing.JPanel instrumentSelectionPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel melodyWizardLabel;
    private javax.swing.JSpinner melodyWizardSpinner;
    private javax.swing.JLabel playbackLabel;
    private javax.swing.JLabel transposeTitle;
    private javax.swing.JPanel transpositionPreviewPanel;
    private javax.swing.JList<String> transpositionWizardJList;
    private javax.swing.JButton transpositionWizardSaveButton;
    // End of variables declaration//GEN-END:variables
}
