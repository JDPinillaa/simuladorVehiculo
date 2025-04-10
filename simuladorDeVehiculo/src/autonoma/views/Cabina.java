/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autonoma.views;
import autonoma.exceptions.*;
import autonoma.models.Carro;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

/**
 *
 * @author juand
 */
public class Cabina extends javax.swing.JFrame {
    
    private Carro carro;

    /**
     * Creates new form Cabina
     */
    public Cabina(Carro carro) {
        this.carro = carro;
        initComponents();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        steeringWheelLabel = new javax.swing.JLabel();
        brakeButton = new javax.swing.JLabel();
        startButton = new javax.swing.JLabel();
        stopButton = new javax.swing.JLabel();
        gasButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        steeringWheelLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/images/volante1.png"))); // NOI18N

        brakeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/images/pedal.png"))); // NOI18N
        brakeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brakeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                brakeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                brakeButtonMouseExited(evt);
            }
        });

        startButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/images/startEngine-removebg-preview.png"))); // NOI18N
        startButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startButtonMouseExited(evt);
            }
        });

        stopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/images/stopEngine-removebg-preview.png"))); // NOI18N
        stopButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stopButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stopButtonMouseExited(evt);
            }
        });

        gasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/images/pedal.png"))); // NOI18N
        gasButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gasButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gasButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gasButtonMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/images/informacion-removebg-preview.png"))); // NOI18N
        jLabel1.setText("Info de conduccion");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(steeringWheelLabel)
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(startButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(stopButton))
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(brakeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gasButton)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(steeringWheelLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(stopButton)
                            .addComponent(startButton))
                        .addGap(26, 26, 26)))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gasButton)
                    .addComponent(brakeButton))
                .addGap(124, 124, 124))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButtonMouseClicked
        try {
            carro.encender();
        } catch (CarroYaEncendidoException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Cabina.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Cabina.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Cabina.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_startButtonMouseClicked

    private void stopButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopButtonMouseClicked
        try {
            carro.apagar();
        } catch (CarroYaApagadoException | CarroAccidentadoException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Cabina.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Cabina.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Cabina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_stopButtonMouseClicked

    private void gasButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gasButtonMouseClicked
        try {
            int aAcelerar = Integer.parseInt(JOptionPane.showInputDialog("Cuanto desea acelerar? : "));
            carro.acelerar(aAcelerar);
        } catch (CarroApagadoException | CarroAccidentadoException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            JOptionPane.showMessageDialog(this, "Error al reproducir el sonido: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_gasButtonMouseClicked

    private void brakeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brakeButtonMouseClicked
    try {
        int aFrenar = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto desea frenar? : "));
        carro.frenar(aFrenar); 
    } catch (CarroApagadoException | CarroDetenidoException | CarroHaPatinadoException | CarroAccidentadoException e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
        JOptionPane.showMessageDialog(this, "Error al reproducir el sonido: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_brakeButtonMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        carro.mostrarEstado();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void startButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButtonMouseEntered
        // TODO add your handling code here:
        startButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/images/startEntered.png"))); // Cambia a un ícono más oscuro
    }//GEN-LAST:event_startButtonMouseEntered

    private void startButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButtonMouseExited
        // TODO add your handling code here:
        startButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/images/startEngine-removebg-preview.png"))); // Restaura el ícono original
    }//GEN-LAST:event_startButtonMouseExited

    private void stopButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopButtonMouseEntered
        // TODO add your handling code here:
        stopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/images/stopEntered.png"))); // Cambia a un ícono más oscuro
    }//GEN-LAST:event_stopButtonMouseEntered

    private void stopButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopButtonMouseExited
        // TODO add your handling code here:
        stopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/images/stopEngine-removebg-preview.png"))); // Restaura el ícono original
    }//GEN-LAST:event_stopButtonMouseExited

    private void gasButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gasButtonMouseEntered
        // TODO add your handling code here:
        gasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/images/pedalEntered.png"))); // Cambia a un ícono más oscuro
    }//GEN-LAST:event_gasButtonMouseEntered

    private void gasButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gasButtonMouseExited
        // TODO add your handling code here:
        gasButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/images/pedal.png"))); // Restaura el ícono original
    }//GEN-LAST:event_gasButtonMouseExited

    private void brakeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brakeButtonMouseEntered
        // TODO add your handling code here:
        brakeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/images/pedalEntered.png"))); // Cambia a un ícono más oscuro
    }//GEN-LAST:event_brakeButtonMouseEntered

    private void brakeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brakeButtonMouseExited
        // TODO add your handling code here:
        brakeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/images/pedal.png"))); // Restaura el ícono original
    }//GEN-LAST:event_brakeButtonMouseExited

    /**
     * @param args the command line arguments
     */
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brakeButton;
    private javax.swing.JLabel gasButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel startButton;
    private javax.swing.JLabel steeringWheelLabel;
    private javax.swing.JLabel stopButton;
    // End of variables declaration//GEN-END:variables
    
}
