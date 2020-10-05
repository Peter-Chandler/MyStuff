package tabs;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.Scanner;

import resources.mandelbrot.MandelbrotVariables;

public class Mandelbrot extends javax.swing.JPanel {
    
    public Mandelbrot() {
        initComponents();
        
        loadSavedVariables();
        zoom = 10;
        coloured = true;
        smooth = true;
        createColourArray();
        
        setStartX(-2);
        setEndX(0.5);
        setStartY(-1.25);
        setEndY(1.25);
        //cannot set the step here as the display has no size yet, this is done when the display is resized
        imageList = new ArrayList<>();
        variableList = new ArrayList<>();
        listPosition = -1;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        controls = new javax.swing.JPanel();
        resetButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        zoomLabel = new javax.swing.JLabel();
        zoomTextField = new javax.swing.JTextField();
        startXTextField = new javax.swing.JTextField();
        endXTextField = new javax.swing.JTextField();
        startYTextField = new javax.swing.JTextField();
        endYTextField = new javax.swing.JTextField();
        stepTextField = new javax.swing.JTextField();
        saveVariablesButton = new javax.swing.JButton();
        loadVariablesComboBox = new javax.swing.JComboBox<>();
        saveImageButton = new javax.swing.JButton();
        saveVariablesTextField = new javax.swing.JTextField();
        saveImageTextField = new javax.swing.JTextField();
        mousePosXTextField = new javax.swing.JTextField();
        mousePosYTextField = new javax.swing.JTextField();
        loadVariablesButton = new javax.swing.JButton();
        colouredRadioButton = new javax.swing.JRadioButton();
        smoothedRadioButton = new javax.swing.JRadioButton();
        display = new resources.ImageJPanel();

        controls.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        controls.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        controls.setPreferredSize(new java.awt.Dimension(480, 480));

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        refreshButton.setText("Refresh");
        refreshButton.setMaximumSize(new java.awt.Dimension(61, 23));
        refreshButton.setMinimumSize(new java.awt.Dimension(61, 23));
        refreshButton.setPreferredSize(new java.awt.Dimension(61, 23));
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        zoomLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zoomLabel.setText("zoom level:");

        zoomTextField.setText("10");
        zoomTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomTextFieldActionPerformed(evt);
            }
        });

        startXTextField.setText("startX: ");

        endXTextField.setText("endX: ");

        startYTextField.setText("startY: ");

        endYTextField.setText("endY: ");

        stepTextField.setText("step: ");

        saveVariablesButton.setText("Save variables as:");
        saveVariablesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveVariablesButtonActionPerformed(evt);
            }
        });

        saveImageButton.setText("Save image as:");
        saveImageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveImageButtonActionPerformed(evt);
            }
        });

        mousePosXTextField.setText("mouse position x: ");

        mousePosYTextField.setText("mouse position y: ");

        loadVariablesButton.setText("Load variables as:");
        loadVariablesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadVariablesButtonActionPerformed(evt);
            }
        });

        colouredRadioButton.setSelected(true);
        colouredRadioButton.setText("coloured");
        colouredRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colouredRadioButtonActionPerformed(evt);
            }
        });

        smoothedRadioButton.setSelected(true);
        smoothedRadioButton.setText("smoothed");
        smoothedRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smoothedRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlsLayout = new javax.swing.GroupLayout(controls);
        controls.setLayout(controlsLayout);
        controlsLayout.setHorizontalGroup(
            controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startXTextField)
                    .addComponent(endXTextField)
                    .addComponent(startYTextField)
                    .addComponent(endYTextField)
                    .addComponent(stepTextField)
                    .addGroup(controlsLayout.createSequentialGroup()
                        .addComponent(zoomLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zoomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mousePosXTextField)
                    .addComponent(mousePosYTextField)
                    .addGroup(controlsLayout.createSequentialGroup()
                        .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(controlsLayout.createSequentialGroup()
                                .addComponent(colouredRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(smoothedRadioButton))
                            .addGroup(controlsLayout.createSequentialGroup()
                                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(saveImageButton)
                                    .addComponent(saveVariablesButton)
                                    .addComponent(loadVariablesButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(saveImageTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(saveVariablesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loadVariablesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        controlsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {refreshButton, resetButton});

        controlsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {loadVariablesButton, saveImageButton, saveVariablesButton});

        controlsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {loadVariablesComboBox, saveImageTextField, saveVariablesTextField});

        controlsLayout.setVerticalGroup(
            controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zoomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zoomLabel)
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton))
                .addGap(18, 18, 18)
                .addComponent(startXTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endXTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveVariablesButton)
                    .addComponent(saveVariablesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadVariablesButton)
                    .addComponent(loadVariablesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveImageButton)
                    .addComponent(saveImageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(mousePosXTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mousePosYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colouredRadioButton)
                    .addComponent(smoothedRadioButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controlsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {zoomLabel, zoomTextField});

        controlsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {endXTextField, endYTextField, startXTextField, startYTextField, stepTextField});

        controlsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {loadVariablesButton, loadVariablesComboBox, refreshButton, resetButton, saveImageButton, saveImageTextField, saveVariablesButton, saveVariablesTextField});

        display.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                displayMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                displayMouseMoved(evt);
            }
        });
        display.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                displayMouseWheelMoved(evt);
            }
        });
        display.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                displayMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                displayMouseReleased(evt);
            }
        });
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
            .addGap(0, 564, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(controls, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(controls, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                    .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        generate();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void displayComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_displayComponentResized
        panelWidth = display.getWidth();
        panelHeight = display.getHeight();
        
        if (panelHeight < panelWidth) {
            iDimension = panelHeight;
            offsetX = (panelWidth-panelHeight)/2;
            offsetY = 0;
            
        } else {
            iDimension = panelWidth;
            offsetX = 0;
            offsetY = (panelHeight-panelWidth)/2;
        }
        
        setStep(Math.abs(((startX-endX)*1.0)) / (iDimension-1));
        
        generate();
        if (listPosition == -1) {
            pushList();
        } else {
            imageList.set(listPosition, image);
            variableList.set(listPosition, new MandelbrotVariables(startX, endX, startY, endY, step));
        }

    }//GEN-LAST:event_displayComponentResized

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        setStartX(-2);
        setEndX(0.5);
        setStartY(-1.25);
        setEndY(1.25);
        setStep(Math.abs(((startX-endX)*1.0)) / (iDimension-1));
        imageList = new ArrayList<>();
        variableList = new ArrayList<>();
        listPosition = -1;
        generate();
        pushList();
        display();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void zoomTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomTextFieldActionPerformed
        JTextField tf = (JTextField) evt.getSource();
        try {
            zoom = Double.parseDouble(tf.getText());
        } catch (NumberFormatException e) {
            tf.setText(""+zoom);
        }
    }//GEN-LAST:event_zoomTextFieldActionPerformed

    private void displayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseClicked
        if (evt.getButton()==1) { //left click to zoom
            int x = (evt.getX()-offsetX);
            int y = (evt.getY()-offsetY);
            if (x >= 0 && x < iDimension && y >= 0 && y < iDimension) {
                double tx = startX+(evt.getX()-offsetX)*step;
                double ty = startY+(evt.getY()-offsetY)*step;
                double offset = ((iDimension/zoom)/2)*step;
                setStartX(tx - offset);
                setEndX(tx + offset);
                setStartY(ty - offset);
                setEndY(ty + offset);
                setStep(Math.abs(((startX-endX)*1.0)) / (iDimension-1));
                generate();
                pushList();
            }
        } else if (evt.getButton()==2) { //middle click
            
        } else if (evt.getButton()==3) { // right click
            
        } else if (evt.getButton()==4) { // mouse button 4 (bottom)

        } else if (evt.getButton()==5) { // mouse button 5 (top)

        }
    }//GEN-LAST:event_displayMouseClicked

    private void displayMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseDragged
        if (dragging) {
            currX = evt.getX();
            currY = evt.getY();
            BufferedImage newImage = new BufferedImage(iDimension, iDimension, BufferedImage.TYPE_INT_ARGB);
            newImage.createGraphics().drawImage(image, currX-prevX, currY-prevY, null);
            image = newImage;
            
            if ((prevX-currX) > 0 && (prevY-currY) > 0) { // left and up drag
                setStartX(startX + step*(prevX-currX));
                setEndX(endX + step*(prevX-currX));
                setStartY(startY + step*(prevY-currY));
                setEndY(endY + step*(prevY-currY));
                generateBetween(0, iDimension, iDimension-(prevY-currY), iDimension);
                generateBetween(iDimension-(prevX-currX), iDimension, 0, iDimension);
            } else if ((prevX-currX) < 0 && (prevY-currY) > 0) { // right and up drag
                setStartX(startX - step*-(prevX-currX));
                setEndX(endX - step*-(prevX-currX));
                setStartY(startY + step*(prevY-currY));
                setEndY(endY + step*(prevY-currY));
                generateBetween(0, iDimension, iDimension-(prevY-currY), iDimension);
                generateBetween(0, -(prevX-currX), 0, iDimension);
            } else if ((prevX-currX) > 0 && (prevY-currY) < 0) { // left and down drag
                setStartX(startX + step*(prevX-currX));
                setEndX(endX + step*(prevX-currX));
                setStartY(startY - step*-(prevY-currY));
                setEndY(endY - step*-(prevY-currY));
                generateBetween(0, iDimension, 0, -(prevY-currY));
                generateBetween(iDimension-(prevX-currX), iDimension, 0, iDimension);
            } else if ((prevX-currX) < 0 && (prevY-currY) < 0) { // right and down drag
                setStartX(startX - step*-(prevX-currX));
                setEndX(endX - step*-(prevX-currX));
                setStartY(startY - step*-(prevY-currY));
                setEndY(endY - step*-(prevY-currY));
                generateBetween(0, iDimension, 0, -(prevY-currY));
                generateBetween(0, -(prevX-currX), 0, iDimension);
            } else if ((prevX-currX) > 0) { // just left drag
                setStartX(startX + step*(prevX-currX));
                setEndX(endX + step*(prevX-currX));
                generateBetween(iDimension-(prevX-currX), iDimension, 0, iDimension);
            } else if ((prevX-currX) < 0) { // just right drag
                setStartX(startX - step*-(prevX-currX));
                setEndX(endX - step*-(prevX-currX));
                generateBetween(0, -(prevX-currX), 0, iDimension);
            } else if ((prevY-currY) > 0) { // just up drag
                setStartY(startY + step*(prevY-currY));
                setEndY(endY + step*(prevY-currY));
                generateBetween(0, iDimension, iDimension-(prevY-currY), iDimension);
            } else if ((prevY-currY) < 0) { // just down drag
                setStartY(startY - step*-(prevY-currY));
                setEndY(endY - step*-(prevY-currY));
                generateBetween(0, iDimension, 0, -(prevY-currY));
            }

            prevX = currX;
            prevY = currY;
            display();
        }
    }//GEN-LAST:event_displayMouseDragged

    private void displayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMousePressed
        if (evt.getButton() == 2) {
            dragging = true;
            prevX = evt.getX();
            prevY = evt.getY();
        }
    }//GEN-LAST:event_displayMousePressed

    private void displayMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseReleased
        if (evt.getButton() == 2) {
            dragging = false;
            generate();
            pushList();
        }
    }//GEN-LAST:event_displayMouseReleased

    private void displayMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_displayMouseWheelMoved
        boolean check = false;
        if (evt.getWheelRotation() < 0) { // mouse wheel up, get next image
            if (!(listPosition+1==imageList.size())) {
                listPosition++;
                check = true;
            }
        } else { // mouse wheel down, get prev image
            if (!(listPosition==0)) {
                listPosition--;
                check = true;
            }
        }
        if (check) {
            MandelbrotVariables newVar = variableList.get(listPosition);
            setStartX(newVar.getStartX());
            setEndX(newVar.getEndX());
            setStartY(newVar.getStartY());
            setEndY(newVar.getEndY());

            //check that the image can still fit to the current dimensions
            BufferedImage newImage = imageList.get(listPosition);
            if (newImage.getWidth()==image.getWidth()&&newImage.getHeight()==image.getWidth()) {
                setStep(newVar.getStep());
                image = newImage;
                display();
            } else {
                //if the window has been resized then the step is recalculated, image is recreated and reset in the lists.
                setStep(Math.abs(((startX-endX)*1.0)) / (iDimension-1));
                generate();
                imageList.set(listPosition, image);
                variableList.set(listPosition, new MandelbrotVariables(startX, endX, startY, endY, step));
            }
        }
    }//GEN-LAST:event_displayMouseWheelMoved

    private void displayMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseMoved
        int x = evt.getX()-offsetX;
        int y = evt.getY()-offsetY;
        if (x >= 0 && x < iDimension && y >= 0 && y < iDimension) {
        mousePosXTextField.setText("mouse position X: "+(startX+x*step));
        mousePosYTextField.setText("mouse position Y: "+(startY+y*step));
        } else {
            mousePosXTextField.setText("mouse position X: ");
            mousePosYTextField.setText("mouse position Y: ");
        }
    }//GEN-LAST:event_displayMouseMoved

    private void saveVariablesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveVariablesButtonActionPerformed
        String fileName = saveVariablesTextField.getText();
        if (!fileName.equals("")) {
            File outputfile = new File("src\\main\\java\\resources\\mandelbrot\\variables\\"+fileName+".txt");
            try (FileWriter fw = new FileWriter(outputfile)) {
                fw.write(""+startX+"\n");
                fw.write(""+endX+"\n");
                fw.write(""+startY+"\n");
                fw.write(""+endY);
                fw.close();
                loadSavedVariables();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_saveVariablesButtonActionPerformed

    private void loadVariablesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadVariablesButtonActionPerformed
        try {
            Scanner sc = new Scanner(new File("src\\main\\java\\resources\\mandelbrot\\variables\\"+((String) loadVariablesComboBox.getSelectedItem())+".txt"));
            //reset to new values from file
            setStartX(Double.parseDouble(sc.nextLine()));
            setEndX(Double.parseDouble(sc.nextLine()));
            setStartY(Double.parseDouble(sc.nextLine()));
            setEndY(Double.parseDouble(sc.nextLine()));
            setStep(Math.abs(((startX-endX)*1.0)) / (iDimension-1));
            imageList = new ArrayList<>();
            variableList = new ArrayList<>();
            listPosition = -1;
            generate();
            pushList();
            display();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }//GEN-LAST:event_loadVariablesButtonActionPerformed

    private void saveImageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveImageButtonActionPerformed
        String fileName = saveImageTextField.getText();
        if (!fileName.equals("")) {
            File outputfile = new File("src\\main\\java\\resources\\mandelbrot\\images\\"+fileName+".png");
            try {
                ImageIO.write(image, "png", outputfile);
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }
    }//GEN-LAST:event_saveImageButtonActionPerformed

    private void colouredRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colouredRadioButtonActionPerformed
        if (((JRadioButton) evt.getSource()).isSelected()) {
            coloured = true;
            smoothedRadioButton.setText("Smoothed");
        } else {
            coloured = false;
            smoothedRadioButton.setText("Swap black and white");
        }
        generate();
    }//GEN-LAST:event_colouredRadioButtonActionPerformed

    private void smoothedRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smoothedRadioButtonActionPerformed
        smooth = ((JRadioButton) evt.getSource()).isSelected();
        generate();
    }//GEN-LAST:event_smoothedRadioButtonActionPerformed

    //<editor-fold defaultstate="collapsed" desc="Generated Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton colouredRadioButton;
    private javax.swing.JPanel controls;
    private resources.ImageJPanel display;
    private javax.swing.JTextField endXTextField;
    private javax.swing.JTextField endYTextField;
    private javax.swing.JButton loadVariablesButton;
    private javax.swing.JComboBox<String> loadVariablesComboBox;
    private javax.swing.JTextField mousePosXTextField;
    private javax.swing.JTextField mousePosYTextField;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveImageButton;
    private javax.swing.JTextField saveImageTextField;
    private javax.swing.JButton saveVariablesButton;
    private javax.swing.JTextField saveVariablesTextField;
    private javax.swing.JRadioButton smoothedRadioButton;
    private javax.swing.JTextField startXTextField;
    private javax.swing.JTextField startYTextField;
    private javax.swing.JTextField stepTextField;
    private javax.swing.JLabel zoomLabel;
    private javax.swing.JTextField zoomTextField;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="My Variables">
    private BufferedImage image;
    private boolean coloured;
    private boolean smooth;
    private Color[] colours;
    private int panelWidth;
    private int panelHeight;
    private int iDimension;
    private int offsetX;
    private int offsetY;
    private double startX;
    private double startY;
    private double endX;
    private double endY;
    private double zoom;
    private double step;
    private boolean dragging;
    private int currX;
    private int currY;
    private int prevX;
    private int prevY;
    private ArrayList<BufferedImage> imageList;
    private ArrayList<MandelbrotVariables> variableList;
    private int listPosition;
    //</editor-fold>
    
    private void generate() {
        image = new BufferedImage(iDimension, iDimension, BufferedImage.TYPE_INT_ARGB);
        display();
        int maxIterations = 255;
        for (int posy = 0; posy < iDimension; posy++) {
            for (int posx = 0; posx < iDimension; posx++) {
                
                int iterations = 0;
                double x = startX+posx*step;
                double y = startY+posy*step;
                double x2 = x;
                double y2 = y;
                
                while (x2*x2 + y2*y2 <= 4 && iterations < maxIterations) {
                    double xtemp = x2*x2 - y2*y2 + x;
                    y2 = 2*x2*y2 + y;
                    x2 = xtemp;
                    iterations++;
                }
                setColour(posx, posy, iterations, x2, y2);
            }
        }
        
        display();
    }
    
    private void generateBetween(int startPosX, int endPosX, int startPosY, int endPosY) {
        
        int maxIterations = 255;
        for (int posy = startPosY; posy < endPosY; posy++) {
            for (int posx = startPosX; posx < endPosX; posx++) {

                int iterations = 0;
                double x = startX+posx*step;
                double y = startY+posy*step;
                double x2 = x;
                double y2 = y;

                while (x2*x2 + y2*y2 <= 4 && iterations < maxIterations) {
                    double xtemp = x2*x2 - y2*y2 + x;
                    y2 = 2*x2*y2 + y;
                    x2 = xtemp;
                    iterations++;
                }
                setColour(posx, posy, iterations, x2, y2);
            }
        }
    }

    private void display() {
        display.displayImage(image, offsetX, offsetY);
    }
    
    private void pushList() {
        if (!(listPosition+1==imageList.size())) {
            while (imageList.size() > listPosition+1) {
                imageList.remove(imageList.size()-1);
                variableList.remove(variableList.size()-1);
            }
        }
        imageList.add(image);
        variableList.add(new MandelbrotVariables(startX, endX, startY, endY, step));
        listPosition++;
    }
  
    private void setStartX(double startX){
        this.startX = startX;
        startXTextField.setText("startX: "+startX);
    }
    
    private void setStartY(double startY){
        this.startY = startY;
        startYTextField.setText("startY: "+startY);
    }
    
    private void setEndX(double endX){
        this.endX = endX;
        endXTextField.setText("endX: "+endX);
    }
    
    private void setEndY(double endY){
        this.endY = endY;
        endYTextField.setText("endY: "+endY);
    }
    
    private void setStep(double step){
        this.step = step;
        stepTextField.setText("step: "+step);
    }
    
    private void loadSavedVariables() {
        loadVariablesComboBox.removeAllItems();
        for (File file : new File("src\\main\\java\\resources\\mandelbrot\\variables").listFiles()) {
            loadVariablesComboBox.addItem(file.getName().replace(".txt", ""));
        }
    }
    
    private void setColour(int posx, int posy, int iterations, double re, double im) {
        if (coloured) {
            if (smooth) {
                double smoothed = (iterations + 1 - Math.log(Math.log(re*re + im*im))/Math.log(2))/256;
                image.setRGB(posx, posy, Color.HSBtoRGB(0.95f + 10 * (float) smoothed ,1.0f,1.0f));
            } else {
                image.setRGB(posx, posy, colours[iterations % colours.length].getRGB());
            }
            
        } else {
            if (smooth) {
                image.setRGB(posx, posy, new Color(iterations, iterations, iterations).getRGB());
            } else {
                image.setRGB(posx, posy, new Color(255-iterations, 255-iterations, 255-iterations).getRGB());
            }
            
        }

    }
    
    private void createColourArray() {
        colours = new Color[16];
        colours[0] = new Color(66, 30, 15);
        colours[1] = new Color(25, 7, 26);
        colours[2] = new Color(9, 1, 47);
        colours[3] = new Color(4, 4, 73);
        colours[4] = new Color(0, 7, 100);
        colours[5] = new Color(12, 44, 138);
        colours[6] = new Color(24, 82, 177);
        colours[7] = new Color(57, 125, 209);
        colours[8] = new Color(134, 181, 229);
        colours[9] = new Color(211, 236, 248);
        colours[10] = new Color(241, 233, 191);
        colours[11] = new Color(248, 201, 95);
        colours[12] = new Color(255, 170, 0);
        colours[13] = new Color(204, 128, 0);
        colours[14] = new Color(153, 87, 0);
        colours[15] = new Color(106, 52, 3);
    }
    
}