
package test;

import java.awt.Color;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

public class Generation extends javax.swing.JFrame {
    String[] Type={"Square","Triangle","Circle","Trapeze"};
    Colorner name=new Colorner();
    double area=0;
    public Generation() {
        initComponents();
    }

    
    public void Date(){
        int random_Type = 0 + (int) (Math.random() * 3);
        Random r = new Random();
        Color color= new Color(r.nextInt(128), r.nextInt(128), r.nextInt(128), r.nextInt(128)+100);
        String bcolor = name.getColorNameFromRgb(color.getRGB(),color.getGreen(),color.getBlue());
        double length=metod(random_Type);
        Object[] data = {Type[random_Type],area,length,bcolor};
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(data);
        repaint();
    }
    public double metod(int n){
     double length=0;
        if(n==0){
        int random = 50 + (int) (Math.random() * 200);
        area=random*random;
        length=random;
     } else if(n==1){
         int random = 100 + (int) (Math.random() * 250);
         int random1 = 100 + (int) (Math.random() * 300);
         int random2 = 100 + (int) (Math.random() * 200);
         area=Triangle(random,random1,random2);
         if(random>random1&&random>random2){
         }else{length=random;}
          if(random1>random&&random1>random2){
         }else{length=random1;}
           if(random2>random1&&random2>random){
         }else{length=random2;}
     } else if(n==2){
        int random = 80 + (int) (Math.random() * 300);
        int r=random/2;
         area=Math.round (3.14*(r*r));
         length=random;
     }else if(n==3){
         int random = 50 + (int) (Math.random() * 200);
         int random1 = 50 + (int) (Math.random() * 200);
         int random2 = 50 + (int) (Math.random() * 200);
         int random3 = 50 + (int) (Math.random() * 200);
         area=Trapeze(random,random1,random2,random3);
         length=((2*area)/random+random1);
     }
    
    return length;
    }
    
    double Triangle(int x,int y,int z){
       int p=(x+y+z)/2;
       double s1=(p*(p-x)*(p-y)*(p-z));
        if(s1<0){
         s1=-1*s1;
         }else{}
       double s=Math.round (Math.sqrt(s1));
     return s;
     }
    double Trapeze(int x,int y,int z,int d){
      int p=(x+y+z+d)/2;
         double s1=(p*(p-x)*(p-y)*(p-z-x)*(p-d-y));
        double s2=(x+y)/(Math.abs(x-y));
       double s=Math.round ((Math.sqrt(s1))*s2);
     return s;
     }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jTabbedPane2.setToolTipText("Square");

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "Area", "Side / radius / hypotenuse length", "Color"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        jTable1.setDoubleBuffered(true);
        jScrollPane1.setViewportView(jTable1);

        jTabbedPane2.addTab("tab1", jScrollPane1);

        jMenu1.setText("Generate");

        jMenuItem1.setText("Generate");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("Square");

        setBounds(400, 100, 598, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       int random = 10 + (int) (Math.random() * 100);
      for(int i=0;i<random;i++){ 
       Date();
      }
    }//GEN-LAST:event_jMenuItem1ActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
