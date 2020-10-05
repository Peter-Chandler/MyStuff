package tabs;

import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.Timer;

public class Turmites extends javax.swing.JPanel {
    
    public Turmites() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        controls = new javax.swing.JPanel();
        runPanel = new javax.swing.JPanel();
        timerSlider = new javax.swing.JSlider();
        timerInput = new javax.swing.JTextField();
        pauseButton = new javax.swing.JButton();
        runButton = new javax.swing.JButton();
        dataPanel = new javax.swing.JPanel();
        WC00box = new javax.swing.JTextField();
        T00box = new javax.swing.JTextField();
        NS00box = new javax.swing.JTextField();
        WC10box = new javax.swing.JTextField();
        T10box = new javax.swing.JTextField();
        NS10box = new javax.swing.JTextField();
        NS01box = new javax.swing.JTextField();
        T01box = new javax.swing.JTextField();
        WC01box = new javax.swing.JTextField();
        NS11box = new javax.swing.JTextField();
        T11box = new javax.swing.JTextField();
        WC11box = new javax.swing.JTextField();
        CurrentColourLabel = new javax.swing.JLabel();
        CurrentColour0Label = new javax.swing.JLabel();
        CurrentColour1Label = new javax.swing.JLabel();
        WC0label = new javax.swing.JLabel();
        T0label = new javax.swing.JLabel();
        NS0label = new javax.swing.JLabel();
        WC1label = new javax.swing.JLabel();
        T1label = new javax.swing.JLabel();
        NS1label = new javax.swing.JLabel();
        CurrentStateLabel = new javax.swing.JLabel();
        CurrentState0Label = new javax.swing.JLabel();
        CurrentState1Label = new javax.swing.JLabel();
        displayTimerSlider = new javax.swing.JSlider();
        displayTimerInput = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        display = new resources.ImageJPanel();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        controls.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        controls.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        controls.setPreferredSize(new java.awt.Dimension(480, 480));

        timerSlider.setMajorTickSpacing(250);
        timerSlider.setMaximum(1000);
        timerSlider.setMinorTickSpacing(25);
        timerSlider.setPaintLabels(true);
        timerSlider.setPaintTicks(true);
        timerSlider.setValue(0);
        timerSlider.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        timerSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                timerSliderStateChanged(evt);
            }
        });

        timerInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        timerInput.setText("0");
        timerInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                timerInputFocusLost(evt);
            }
        });
        timerInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerInputActionPerformed(evt);
            }
        });

        pauseButton.setText("Pause");
        pauseButton.setEnabled(false);
        pauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseButtonActionPerformed(evt);
            }
        });

        runButton.setText("Run");
        runButton.setMaximumSize(new java.awt.Dimension(61, 23));
        runButton.setMinimumSize(new java.awt.Dimension(61, 23));
        runButton.setPreferredSize(new java.awt.Dimension(61, 23));
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout runPanelLayout = new javax.swing.GroupLayout(runPanel);
        runPanel.setLayout(runPanelLayout);
        runPanelLayout.setHorizontalGroup(
            runPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(runPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(runPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, runPanelLayout.createSequentialGroup()
                        .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pauseButton))
                    .addGroup(runPanelLayout.createSequentialGroup()
                        .addComponent(timerSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timerInput, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)))
                .addContainerGap())
        );
        runPanelLayout.setVerticalGroup(
            runPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(runPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(runPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pauseButton)
                    .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(runPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timerInput)
                    .addComponent(timerSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        WC00box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        WC00box.setText("1");
        WC00box.setName("WC00"); // NOI18N
        WC00box.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                numBoxFocusLost(evt);
            }
        });

        T00box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T00box.setText("r");
        T00box.setName("T00"); // NOI18N
        T00box.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                turnBoxFocusLost(evt);
            }
        });

        NS00box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NS00box.setText("0");
        NS00box.setName("NS00"); // NOI18N
        NS00box.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                numBoxFocusLost(evt);
            }
        });

        WC10box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        WC10box.setText("1");
        WC10box.setName("WC10"); // NOI18N
        WC10box.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                numBoxFocusLost(evt);
            }
        });

        T10box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T10box.setText("r");
        T10box.setName("T10"); // NOI18N
        T10box.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                turnBoxFocusLost(evt);
            }
        });

        NS10box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NS10box.setText("1");
        NS10box.setName("NS10"); // NOI18N
        NS10box.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                numBoxFocusLost(evt);
            }
        });

        NS01box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NS01box.setText("0");
        NS01box.setName("NS01"); // NOI18N
        NS01box.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                numBoxFocusLost(evt);
            }
        });

        T01box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T01box.setText("n");
        T01box.setName("T01"); // NOI18N
        T01box.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                turnBoxFocusLost(evt);
            }
        });

        WC01box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        WC01box.setText("0");
        WC01box.setName("WC01"); // NOI18N
        WC01box.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                numBoxFocusLost(evt);
            }
        });

        NS11box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NS11box.setText("1");
        NS11box.setName("NS11"); // NOI18N
        NS11box.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                numBoxFocusLost(evt);
            }
        });

        T11box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T11box.setText("n");
        T11box.setName("T11"); // NOI18N
        T11box.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                turnBoxFocusLost(evt);
            }
        });

        WC11box.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        WC11box.setText("0");
        WC11box.setName("WC11"); // NOI18N
        WC11box.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                numBoxFocusLost(evt);
            }
        });

        CurrentColourLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrentColourLabel.setText("Current Colour");
        CurrentColourLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CurrentColour0Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrentColour0Label.setText("0");
        CurrentColour0Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CurrentColour1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrentColour1Label.setText("1");
        CurrentColour1Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        WC0label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WC0label.setText("WC");
        WC0label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        T0label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T0label.setText("T");
        T0label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NS0label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NS0label.setText("NS");
        NS0label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        WC1label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WC1label.setText("WC");
        WC1label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        T1label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T1label.setText("T");
        T1label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        NS1label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NS1label.setText("NS");
        NS1label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CurrentStateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrentStateLabel.setText("<html>Current State</html>");
        CurrentStateLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CurrentState0Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrentState0Label.setText("0");
        CurrentState0Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CurrentState1Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CurrentState1Label.setText("1");
        CurrentState1Label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        displayTimerSlider.setMajorTickSpacing(250);
        displayTimerSlider.setMaximum(1000);
        displayTimerSlider.setMinorTickSpacing(25);
        displayTimerSlider.setPaintLabels(true);
        displayTimerSlider.setPaintTicks(true);
        displayTimerSlider.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        displayTimerSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                displayTimerSliderStateChanged(evt);
            }
        });

        displayTimerInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        displayTimerInput.setText("50");
        displayTimerInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                displayTimerInputFocusLost(evt);
            }
        });
        displayTimerInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayTimerInputActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.setMaximumSize(new java.awt.Dimension(61, 23));
        clearButton.setMinimumSize(new java.awt.Dimension(61, 23));
        clearButton.setPreferredSize(new java.awt.Dimension(61, 23));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dataPanelLayout = new javax.swing.GroupLayout(dataPanel);
        dataPanel.setLayout(dataPanelLayout);
        dataPanelLayout.setHorizontalGroup(
            dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataPanelLayout.createSequentialGroup()
                        .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dataPanelLayout.createSequentialGroup()
                                .addComponent(CurrentStateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CurrentState0Label, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CurrentState1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(dataPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dataPanelLayout.createSequentialGroup()
                                .addComponent(WC0label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(T0label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NS0label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(WC1label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(T1label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NS1label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(dataPanelLayout.createSequentialGroup()
                                    .addComponent(CurrentColour0Label, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(CurrentColour1Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(CurrentColourLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dataPanelLayout.createSequentialGroup()
                                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dataPanelLayout.createSequentialGroup()
                                        .addComponent(WC00box, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(T00box, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NS00box, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(dataPanelLayout.createSequentialGroup()
                                        .addComponent(WC01box, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(T01box, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NS01box, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dataPanelLayout.createSequentialGroup()
                                        .addComponent(WC11box, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(T11box, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NS11box, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(dataPanelLayout.createSequentialGroup()
                                        .addComponent(WC10box, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(T10box, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NS10box, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(dataPanelLayout.createSequentialGroup()
                        .addComponent(displayTimerSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(displayTimerInput, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)))
                .addContainerGap())
        );

        dataPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {NS00box, NS01box, NS0label, NS10box, NS11box, NS1label, T00box, T01box, T0label, T10box, T11box, T1label, WC00box, WC01box, WC0label, WC10box, WC11box, WC1label});

        dataPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CurrentState0Label, CurrentState1Label});

        dataPanelLayout.setVerticalGroup(
            dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CurrentColourLabel)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CurrentColour0Label)
                    .addComponent(CurrentColour1Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WC0label)
                    .addComponent(T0label)
                    .addComponent(NS0label)
                    .addComponent(WC1label)
                    .addComponent(T1label)
                    .addComponent(NS1label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataPanelLayout.createSequentialGroup()
                        .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WC00box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T00box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NS00box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WC01box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T01box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NS01box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dataPanelLayout.createSequentialGroup()
                        .addComponent(CurrentState0Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CurrentState1Label))
                    .addComponent(CurrentStateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dataPanelLayout.createSequentialGroup()
                        .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WC10box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T10box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NS10box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(WC11box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T11box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NS11box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(displayTimerInput)
                    .addComponent(displayTimerSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        dataPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {CurrentColour0Label, CurrentColour1Label, CurrentColourLabel, CurrentState0Label, CurrentState1Label, NS00box, NS01box, NS0label, NS10box, NS11box, NS1label, T00box, T01box, T0label, T10box, T11box, T1label, WC00box, WC01box, WC0label, WC10box, WC11box, WC1label});

        javax.swing.GroupLayout controlsLayout = new javax.swing.GroupLayout(controls);
        controls.setLayout(controlsLayout);
        controlsLayout.setHorizontalGroup(
            controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(runPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        controlsLayout.setVerticalGroup(
            controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(runPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        display.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                displayComponentResized(evt);
            }
        });

        javax.swing.GroupLayout displayLayout = new javax.swing.GroupLayout(display);
        display.setLayout(displayLayout);
        displayLayout.setHorizontalGroup(
            displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 626, Short.MAX_VALUE)
        );
        displayLayout.setVerticalGroup(
            displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(controls, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(controls, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        pause();
    }//GEN-LAST:event_formComponentHidden

    private void timerInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerInputActionPerformed
        JTextField tf = (JTextField) evt.getSource();
        timerInputCheck(tf);
    }//GEN-LAST:event_timerInputActionPerformed

    private void timerInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_timerInputFocusLost
        JTextField tf = (JTextField) evt.getSource();
        timerInputCheck(tf);
    }//GEN-LAST:event_timerInputFocusLost

    private void timerSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_timerSliderStateChanged
        //pause();
        int time = ((JSlider) evt.getSource()).getValue();
        timer.setDelay(time);
        timerInput.setText(""+time);
    }//GEN-LAST:event_timerSliderStateChanged

    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        run();
    }//GEN-LAST:event_runButtonActionPerformed

    private void pauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseButtonActionPerformed
        pause();
    }//GEN-LAST:event_pauseButtonActionPerformed

    private void displayTimerSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_displayTimerSliderStateChanged
        int time = ((JSlider) evt.getSource()).getValue();
        displayTimer.setDelay(time);
        displayTimerInput.setText(""+time);
    }//GEN-LAST:event_displayTimerSliderStateChanged

    private void displayTimerInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_displayTimerInputFocusLost
        JTextField tf = (JTextField) evt.getSource();
        displayTimerInputCheck(tf);
    }//GEN-LAST:event_displayTimerInputFocusLost

    private void displayTimerInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayTimerInputActionPerformed
        JTextField tf = (JTextField) evt.getSource();
        displayTimerInputCheck(tf);
    }//GEN-LAST:event_displayTimerInputActionPerformed

    private void displayComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_displayComponentResized
        imageHeight = display.getHeight();
        imageWidth = display.getWidth();
        image = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_ARGB);
        x = imageWidth/2;
        y = imageHeight/2;
        cells = new int[imageWidth][imageHeight];
        state = 0;
        direction = 0;
        display(); 
    }//GEN-LAST:event_displayComponentResized

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        pause();
        image = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_ARGB);
        x = imageWidth/2;
        y = imageHeight/2;
        cells = new int[imageWidth][imageHeight];
        state = 0;
        direction = 0;
        display(); 
    }//GEN-LAST:event_clearButtonActionPerformed

    private void numBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numBoxFocusLost
        JTextField tf = (JTextField) evt.getSource();
        switch (tf.getName()) {
            case "WC00":
                WC00 = numberInputCheck(tf);
                break;
            case "WC01":
                WC01 = numberInputCheck(tf);
                break;
            case "WC10":
                WC10 = numberInputCheck(tf);
                break;
            case "WC11":
                WC11 = numberInputCheck(tf);
                break;
            case "NS00":
                NS00 = numberInputCheck(tf);
                break;
            case "NS01":
                NS01 = numberInputCheck(tf);
                break;
            case "NS10":
                NS10 = numberInputCheck(tf);
                break;
            case "NS11":
                NS11 = numberInputCheck(tf);
                break;
        }
    }//GEN-LAST:event_numBoxFocusLost

    private void turnBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_turnBoxFocusLost
        JTextField tf = (JTextField) evt.getSource();
        switch (tf.getName()) {
            case "T00":
                T00 = turnInputCheck(tf);
                break;
            case "T01":
                T01 = turnInputCheck(tf);
                break;
            case "T10":
                T10 = turnInputCheck(tf);
                break;
            case "T11":
                T11 = turnInputCheck(tf);
                break;
        }
    }//GEN-LAST:event_turnBoxFocusLost

    //<editor-fold defaultstate="collapsed" desc="Generated Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CurrentColour0Label;
    private javax.swing.JLabel CurrentColour1Label;
    private javax.swing.JLabel CurrentColourLabel;
    private javax.swing.JLabel CurrentState0Label;
    private javax.swing.JLabel CurrentState1Label;
    private javax.swing.JLabel CurrentStateLabel;
    private javax.swing.JTextField NS00box;
    private javax.swing.JTextField NS01box;
    private javax.swing.JLabel NS0label;
    private javax.swing.JTextField NS10box;
    private javax.swing.JTextField NS11box;
    private javax.swing.JLabel NS1label;
    private javax.swing.JTextField T00box;
    private javax.swing.JTextField T01box;
    private javax.swing.JLabel T0label;
    private javax.swing.JTextField T10box;
    private javax.swing.JTextField T11box;
    private javax.swing.JLabel T1label;
    private javax.swing.JTextField WC00box;
    private javax.swing.JTextField WC01box;
    private javax.swing.JLabel WC0label;
    private javax.swing.JTextField WC10box;
    private javax.swing.JTextField WC11box;
    private javax.swing.JLabel WC1label;
    private javax.swing.JButton clearButton;
    private javax.swing.JPanel controls;
    private javax.swing.JPanel dataPanel;
    private resources.ImageJPanel display;
    private javax.swing.JTextField displayTimerInput;
    private javax.swing.JSlider displayTimerSlider;
    private javax.swing.JButton pauseButton;
    private javax.swing.JButton runButton;
    private javax.swing.JPanel runPanel;
    private javax.swing.JTextField timerInput;
    private javax.swing.JSlider timerSlider;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="My Variables">
    private BufferedImage image;
    private int imageHeight;
    private int imageWidth;
    private final int black = Color.black.getRGB();
    private final int white = Color.white.getRGB();
    private int[][] cells;
    private int state = 0;
    private int direction = 0;
    private int x;
    private int y;
    private int WC00 = 1;
    private int WC01 = 0;
    private int WC10 = 1;
    private int WC11 = 0;
    private String T00 = "r";
    private String T01 = "n";
    private String T10 = "r";
    private String T11 = "n";
    private int NS00 = 0;
    private int NS01 = 0;
    private int NS10 = 1;
    private int NS11 = 1;
    //</editor-fold>
    
    private final Timer timer = new Timer(0, new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (cells[x][y] == 0) {
                if (state == 0) {
                    if (WC00 == 1) {
                        cells[x][y] = 1;
                        image.setRGB(x, y, black);
                    }
                    turn(T00);
                    state = NS00;
                } else {
                    if (WC01 == 1) {
                        cells[x][y] = 1;
                        image.setRGB(x, y, black);
                    }
                    turn(T01);
                    state = NS01;
                }
            } else {
                if (state == 0) {
                    if (WC10 == 0) {
                        cells[x][y] = 0;
                        image.setRGB(x, y, white);
                    }
                    turn(T10);
                    state = NS10;
                } else {
                    if (WC11 == 0) {
                        cells[x][y] = 0;
                        image.setRGB(x, y, white);
                    }
                    turn(T11);
                    state = NS11;
                }
            }
        }
    });
    
    private final Timer displayTimer = new Timer(50, new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            display();
        }
    });
    
    private void turn(String t) {
        if (t.equals("l")) {
            direction = (direction + 3) % 4;
        } else if (t.equals("r")) {
            direction = (direction + 1) % 4;
        } else if (t.equals("u")) {
            direction = (direction + 2) % 4;
        }
        if (direction == 0) {
            if (y == 0) {
                pause();
            } else {
                y--;
            }
        } else if (direction == 1) {
            if (x == imageWidth - 1) {
                pause();
            } else {
                x++;
            }
        } else if (direction == 2) {
            if (y == imageWidth - 1) {
                pause();
            } else {
                y++;
            }
        } else {
            if (x == 0) {
                pause();
            } else {
                x--;
            }
        }
        //display.displayImage(image);
    }
    
    private void pause() {
        timer.stop();
        displayTimer.stop();
        pauseButton.setEnabled(false);
        runButton.setEnabled(true);
        runButton.requestFocusInWindow();
        display();
    }
    
    private void run() {
        timer.start();
        displayTimer.start();
        pauseButton.setEnabled(true);
        runButton.setEnabled(false);
    }
   
    private int numberInputCheck(JTextField tf) {
        String input = tf.getText();
        try {
            int num = Integer.parseInt(input);
            if (num >= 0 && num < 2) {
                return num;
            } else {
                tf.setText("0");
                return 0;
            }
        } catch (NumberFormatException e) {
            tf.setText("0");
            return 0;
        }
    }
    
    private String turnInputCheck(JTextField tf) {
        String input = tf.getText();
        if (input.equals("l") || input.equals("r") || input.equals("n") || input.equals("u")) {
            return input;
        } else {
            tf.setText("l");
            return "l";
        }
    }
    
    private void timerInputCheck(JTextField tf) {
        String text = tf.getText();
        try {
            int num = Integer.parseInt(text);
            if (num >= 0 && num <= 1000) {
                timer.setDelay(num);
                timerSlider.setValue(num);
            } else {
                num = 500;
                timer.setDelay(num);
                timerInput.setText(""+num);
                timerSlider.setValue(num);
            }
        } catch (NumberFormatException e) {
            int num = 500;
            timer.setDelay(num);
            timerInput.setText(""+num);
            timerSlider.setValue(num);
        }
    }
    
    private void displayTimerInputCheck(JTextField tf) {
        String text = tf.getText();
        try {
            int num = Integer.parseInt(text);
            if (num >= 0 && num <= 1000) {
                displayTimer.setDelay(num);
                displayTimerSlider.setValue(num);
            } else {
                num = 500;
                displayTimer.setDelay(num);
                displayTimerInput.setText(""+num);
                displayTimerSlider.setValue(num);
            }
        } catch (NumberFormatException e) {
            int num = 500;
            displayTimer.setDelay(num);
            displayTimerInput.setText(""+num);
            displayTimerSlider.setValue(num);
        }
    }
    
    public void display() {
        display.displayImage(image ,0, 0);
    }
    
}