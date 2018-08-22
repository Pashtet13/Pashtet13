
package test;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Паша
 */
public class Dialog extends javax.swing.JFrame {
    private int Diameter;
    Colorner name=new Colorner();
    int N;
    int Triangle_area;
    int MinX;
    int P;
    /**
     * Creates new form Dialog
     */
    public Dialog() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Area: ");

        jLabel2.setText("jLabel2");

        jLabel3.setText("Color: ");

        jLabel4.setText("jLabel4");

        jButton1.setText("Turn the diameter");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Circle arc length");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("The area of the sector");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
        );

        setBounds(0, 0, 562, 213);
    }// </editor-fold>//GEN-END:initComponents

    public void areaColor(double S,Color color){
       
             String area = String.valueOf(S);
            jLabel2.setText(area);
         String bcolor = name.getColorNameFromRgb(color.getRGB(),color.getGreen(),color.getBlue());
             jLabel4.setText(bcolor);
        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(N==1){
          String Text= String.valueOf("Perimeter: "+(Diameter*4));
        jTextArea1.setText(Text); 
       }else if(N==2){
       String Text= String.valueOf("Height: "+(Triangle_area*2)/(MinX));
        jTextArea1.setText(Text); 
       }else if(N==3){
        String Text= String.valueOf("Diameter: "+Diameter);
        jTextArea1.setText(Text);
        }else if(N==4){
        String Text= String.valueOf("Turn height: "+Triangle_area);
        jTextArea1.setText(Text); 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(N==1){
          String Text= String.valueOf("Diagonal: "+(Diameter*1.41));
        jTextArea1.setText(Text); 
        }else if(N==2){
        String Text= String.valueOf("The radius of the circle entered: "+(Triangle_area/P));
        jTextArea1.setText(Text);
       }else if(N==3){
        String Text= String.valueOf("Circle arc length: "+(Diameter*3.14));
        jTextArea1.setText(Text);
       }else if(N==4){
         String Text= String.valueOf("length of the middle line: "+(P));
        jTextArea1.setText(Text);  
       }
    }//GEN-LAST:event_jButton2ActionPerformed
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(N==1){
          String Text= String.valueOf("Side length: "+(Diameter));
        jTextArea1.setText(Text); 
       }else if(N==2){
        String Text= String.valueOf("Half Perimeter: "+(P));
        jTextArea1.setText(Text); 
        }else if(N==3){
        String a="";
            a=JOptionPane.showInputDialog("Angular value of the arc");
            System.out.println(a);
            if(true==isDigit(a))
            {
            int gama = Integer.valueOf(a);
             int R= Diameter/2;
             double S= (3.14*(R*R)*gama)/(360);
             String Text= String.valueOf("The area of the sector: "+S);
                jTextArea1.setText(Text);
            }
        }else if(N==4){
           String Text= String.valueOf("Half Perimeter: "+(MinX));
        jTextArea1.setText(Text);  
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed
     static boolean isDigit(String s) throws NumberFormatException {
    try {
        Integer.parseInt(s);
        return true;
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error!!! a number must be entered", "Error", JOptionPane.INFORMATION_MESSAGE); 
        return false;
    }
}
     void bottomert(int n,int diameter,Color color,int minX,int minY){
         N=n;
      if(n==1){
       jButton1.setLabel("Square perimeter");
       jButton2.setLabel("Diagonal of the square");
       jButton3.setLabel("Side length");
        double S= diameter*diameter;
        Diameter=diameter;
        areaColor(S,color);
      }else if(n==2){
      jButton1.setLabel("Turn height");
       jButton2.setLabel("The radius of the circle entered");
       jButton3.setLabel("Half Perimeter");
      double s=Triangle(diameter,minY);
       Triangle_area=(int)s;
       MinX=minX;
        areaColor(s,color);
         
      }else if(n==3){
       jButton1.setLabel("Turn the diameter");
       jButton2.setLabel("Circle arc length");
       jButton3.setLabel("The area of the sector");
       
        Diameter=diameter;
        int R= diameter/2;
        double S=Math.round (3.14*(R*R));
        areaColor(S,color);
        
      }else if(n==4){
        jButton1.setLabel("Turn height");
       jButton2.setLabel("length of the middle line");
       jButton3.setLabel("Half Perimeter");

       double s=Trapeze(diameter,minX,diameter,minY);
       P=(diameter+minX)/2;// middle
       Triangle_area=(int)((2*s)/diameter+minX);//height
        areaColor(s,color);
      
     }
     }
double Triangle(int diameter,int minY){
      int p=(diameter+diameter+minY)/2;
      P=p;
         double s1=(p*(p-diameter)*(p-diameter)*(p-minY));
                 if(s1<0){
         s1=-1*s1;
         }else{}
       double s=Math.round(Math.sqrt(s1));
     return s;
     }
double Trapeze(int x,int y,int z,int d){
      int p=(x+y+z+d)/2;
         double s1=(p*(p-x)*(p-y)*(p-z-x)*(p-d-y));
         if(s1<0){
         s1=-1*s1;
         }else{}
        double s2=(x+y)/(Math.abs(x-y));
       double s=Math.round ((Math.sqrt(s1))*s2);
              MinX=p;//Half Perimeter
     return s;
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
