package tabs;

import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.swing.Timer;

public class LangtonsAnt extends javax.swing.JPanel {
    
    public LangtonsAnt() {
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
        displayTimerSlider = new javax.swing.JSlider();
        displayTimerInput = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        inputTextField = new javax.swing.JTextField();
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

        inputTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputTextFieldFocusLost(evt);
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
                        .addComponent(displayTimerSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(displayTimerInput, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                    .addGroup(dataPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputTextField))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dataPanelLayout.setVerticalGroup(
            dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addGroup(dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(displayTimerInput)
                    .addComponent(displayTimerSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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
                .addContainerGap(187, Short.MAX_VALUE))
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
            .addGap(0, 628, Short.MAX_VALUE)
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
        direction = 0;
        display.displayImage(image, 0 ,0); 
    }//GEN-LAST:event_displayComponentResized

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        pause();
        image = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_ARGB);
        x = imageWidth/2;
        y = imageHeight/2;
        cells = new int[imageWidth][imageHeight];
        direction = 0;
        display(); 
    }//GEN-LAST:event_clearButtonActionPerformed

    private void inputTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputTextFieldFocusLost
        JTextField tf = (JTextField) evt.getSource();
        String input = tf.getText();
        amount = input.length();
        moves = new char[amount];
        boolean contin = true;
        for (int i = 0; i < amount; i++){
            char c = input.charAt(i);
            if (c == 'l' || c == 'r' || c == 'n' || c == 'u') {
                moves[i] = c;
            } else {
                tf.setText("");
                contin = false;
                moves = null;
            }
        }
        if (contin) {
            colours = new int[amount];
            colours[0] = Color.white.getRGB();
            for (int i = 1; i < amount; i++) {
                colours[i] = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)).getRGB();
            }
        }
    }//GEN-LAST:event_inputTextFieldFocusLost

    //<editor-fold defaultstate="collapsed" desc="Generated Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearButton;
    private javax.swing.JPanel controls;
    private javax.swing.JPanel dataPanel;
    private resources.ImageJPanel display;
    private javax.swing.JTextField displayTimerInput;
    private javax.swing.JSlider displayTimerSlider;
    private javax.swing.JTextField inputTextField;
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
    private int[][] cells;
    private int direction = 0;
    private int x;
    private int y;
    private char[] moves;
    private int amount;
    private int[] colours;
    //</editor-fold>
    
    private final Timer timer = new Timer(0, new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            char move = moves[cells[x][y]];
            cells[x][y] = (cells[x][y] + 1) % amount;
            image.setRGB(x, y, colours[cells[x][y]]);
            turn(move);
        }
    });
    
    private final Timer displayTimer = new Timer(50, new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            display();
        }
    });
    
    private void turn(char t) {
        switch (t) {
            case 'l': direction = (direction + 3) % 4; break;       
            case 'r': direction = (direction + 1) % 4; break;   
            case 'u': direction = (direction + 2) % 4; break;           
        }
        switch (direction) {
            case 0: if (y == 0) {pause();} else {y--;} break;
            case 1: if (x == imageWidth - 1) {pause();} else {x++;} break;
            case 2: if (y == imageWidth - 1) {pause();} else {y++;} break;
            default: if (x == 0) {pause();} else {x--;}   break;
        }
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
        if (moves != null) {
            timer.start();
            displayTimer.start();
            pauseButton.setEnabled(true);
            runButton.setEnabled(false);
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