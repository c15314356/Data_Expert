import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

public class MyUserInterface extends javax.swing.JFrame 
{
    List<String> allRows=new ArrayList<String>();
    List<String> colNames=new ArrayList<String>();
    int numberOfCols;
    int numberOfRows;
    int j=0;
     
    public MyUserInterface() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() 
    {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        queryTF = new javax.swing.JTextField();
        goBT = new javax.swing.JButton();
        exitBT = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultsTB = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 271, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 102));

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 102, 255));
        jLabel2.setText("By Devidas Savickas");

        queryTF.setBackground(new java.awt.Color(255, 255, 204));
        queryTF.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        queryTF.setForeground(new java.awt.Color(102, 51, 255));
        queryTF.setText("Enter in SQL query to run.....");
        queryTF.setBorder(null);
        queryTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryTFActionPerformed(evt);
            }
        });

        goBT.setBackground(new java.awt.Color(204, 255, 204));
        goBT.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        goBT.setForeground(new java.awt.Color(153, 102, 255));
        goBT.setText("Go");
        goBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBTActionPerformed(evt);
            }
        });

        exitBT.setBackground(new java.awt.Color(204, 255, 204));
        exitBT.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        exitBT.setText("Exit");
        exitBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(queryTF, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(goBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitBT)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(queryTF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goBT)
                    .addComponent(exitBT))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        resultsTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] 
            {
            	
            },
            new String [] 
            {
            
            }
        ));
        jScrollPane1.setViewportView(resultsTB);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Action performed
    private void queryTFActionPerformed(java.awt.event.ActionEvent evt) 
    {
        queryTF.setText("");
    }

    //action performed
    private void goBTActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	//set value entered into text field to temporary variable
        String temp=queryTF.getText();
        //Create a new object of DatabaseReader
        DatabaseReader data=new DatabaseReader(temp);
        //connect to database
    	data.Connect();
        
    	allRows.clear();
    	colNames.clear();
    	
		System.out.println(allRows+"---------------------------------------------------------------------");
		System.out.println(colNames+"-------------------------------------------------------------------------");
    	
    	allRows=data.getAllRows();
    	colNames=data.getColNameList();
    	
    	DefaultTableModel model =(DefaultTableModel) resultsTB.getModel();
    	
    	//gets the number of cols and rows
    	numberOfCols=colNames.size();
    	numberOfRows=(allRows.size()/numberOfCols);
    	int CurRowNumber=model.getRowCount();
    	
    	//removes all rows from table
    	for(int i=CurRowNumber;i>0;i--)
    	{
        	model.removeRow(i);
    	}
    	
    	//model.setColumnCount(numberOfCols);
    	
    	//add Columns to table
    	for(int i=0;i<numberOfCols;i++)
    	{
    		model.addColumn(colNames.get(i));
    	}
    	
    	switch(numberOfCols)
    	{
    	case 1:
        	for (int i=0;i<numberOfRows;i++)
    		{
        		model.addRow(new Object[] {allRows.get(0+j)});
        		j+=numberOfCols;
    		}
    		break;
    	case 2:
        	for (int i=0;i<numberOfRows;i++)
    		{
        		model.addRow(new Object[] {allRows.get(0+j),allRows.get(1+j)});
        		j+=numberOfCols;
    		}
    		break;
    	case 3:
        	for (int i=0;i<numberOfRows;i++)
    		{
        		model.addRow(new Object[] {allRows.get(0+j),allRows.get(1+j),allRows.get(2+j)});
        		j+=numberOfCols;
    		}
    		break;
    	case 4:
        	for (int i=0;i<numberOfRows;i++)
    		{
        		model.addRow(new Object[] {allRows.get(0+j),allRows.get(1+j),allRows.get(2+j),allRows.get(3+j)});
        		j+=numberOfCols;
    		}
    		break;
    	case 5:
        	for (int i=0;i<numberOfRows;i++)
    		{
        		model.addRow(new Object[] {allRows.get(0+j),allRows.get(1+j),allRows.get(2+j),allRows.get(3+j),
        				allRows.get(4+j)});
        		j+=numberOfCols;
    		}
    		break;
    	case 6:
        	for (int i=0;i<numberOfRows;i++)
    		{
        		model.addRow(new Object[] {allRows.get(0+j),allRows.get(1+j),allRows.get(2+j),allRows.get(3+j),
        				allRows.get(4+j),allRows.get(5+j)});
        		j+=numberOfCols;
    		}
    		break;
    	case 7:
        	for (int i=0;i<numberOfRows;i++)
    		{
        		model.addRow(new Object[] {allRows.get(0+j),allRows.get(1+j),allRows.get(2+j),allRows.get(3+j),
        				allRows.get(4+j),allRows.get(5+j),allRows.get(6+j)});
        		j+=numberOfCols;
    		}
    		break;
    	case 8:
        	for (int i=0;i<numberOfRows;i++)
    		{
        		model.addRow(new Object[] {allRows.get(0+j),allRows.get(1+j),allRows.get(2+j),allRows.get(3+j),
        				allRows.get(4+j),allRows.get(5+j),allRows.get(6+j),allRows.get(7+j)});
        		j+=numberOfCols;
    		}
    		break;
    	case 9:
        	for (int i=0;i<numberOfRows;i++)
    		{
        		model.addRow(new Object[] {allRows.get(0+j),allRows.get(1+j),allRows.get(2+j),allRows.get(3+j),
        				allRows.get(4+j),allRows.get(5+j),allRows.get(6+j),allRows.get(7+j),allRows.get(8+j)});
        		j+=numberOfCols;
    		}
    		break;
    	case 10:
        	for (int i=0;i<numberOfRows;i++)
    		{
        		model.addRow(new Object[] {allRows.get(0+j),allRows.get(1+j),allRows.get(2+j),allRows.get(3+j),
        				allRows.get(4+j),allRows.get(5+j),allRows.get(6+j),allRows.get(7+j),allRows.get(8+j),
        				allRows.get(9+j)});
        		j+=numberOfCols;
    		}
    		break;
    	case 11:
        	for (int i=0;i<numberOfRows;i++)
    		{
        		model.addRow(new Object[] {allRows.get(0+j),allRows.get(1+j),allRows.get(2+j),allRows.get(3+j),
        				allRows.get(4+j),allRows.get(5+j),allRows.get(6+j),allRows.get(7+j),allRows.get(8+j),
        				allRows.get(9+j),allRows.get(10+j)});
        		j+=numberOfCols;
    		}
    		break;
    	case 12:
        	for (int i=0;i<numberOfRows;i++)
    		{
        		model.addRow(new Object[] {allRows.get(0+j),allRows.get(1+j),allRows.get(2+j),allRows.get(3+j),
        				allRows.get(4+j),allRows.get(5+j),allRows.get(6+j),allRows.get(7+j),allRows.get(8+j),
        				allRows.get(9+j),allRows.get(10+j),allRows.get(11+j)});
        		j+=numberOfCols;
    		}
    		break;
    	case 13:
        	for (int i=0;i<numberOfRows;i++)
    		{
        		model.addRow(new Object[] {allRows.get(0+j),allRows.get(1+j),allRows.get(2+j),allRows.get(3+j),
        				allRows.get(4+j),allRows.get(5+j),allRows.get(6+j),allRows.get(7+j),allRows.get(8+j),
        				allRows.get(9+j),allRows.get(10+j),allRows.get(11+j),allRows.get(12+j)});
        		j+=numberOfCols;
    		}
    		break;
    	case 14:
        	for (int i=0;i<numberOfRows;i++)
    		{
        		model.addRow(new Object[] {allRows.get(0+j),allRows.get(1+j),allRows.get(2+j),allRows.get(3+j),
        				allRows.get(4+j),allRows.get(5+j),allRows.get(6+j),allRows.get(7+j),allRows.get(8+j),
        				allRows.get(9+j),allRows.get(10+j),allRows.get(11+j),allRows.get(12+j),allRows.get(13+j)});
        		j+=numberOfCols;
    		}
    		break;
    	case 15:
        	for (int i=0;i<numberOfRows;i++)
    		{
        		model.addRow(new Object[] {allRows.get(0+j),allRows.get(1+j),allRows.get(2+j),allRows.get(3+j),
        				allRows.get(4+j),allRows.get(5+j),allRows.get(6+j),allRows.get(7+j),allRows.get(8+j),
        				allRows.get(9+j),allRows.get(10+j),allRows.get(11+j),allRows.get(12+j),allRows.get(13+j),
        				allRows.get(14+j)});
        		j+=numberOfCols;
    		}
    		break;
    	case 16:
        	for (int i=0;i<numberOfRows;i++)
    		{
        		model.addRow(new Object[] {allRows.get(0+j),allRows.get(1+j),allRows.get(2+j),allRows.get(3+j),
        				allRows.get(4+j),allRows.get(5+j),allRows.get(6+j),allRows.get(7+j),allRows.get(8+j),
        				allRows.get(9+j),allRows.get(10+j),allRows.get(11+j),allRows.get(12+j),allRows.get(13+j),
        				allRows.get(14+j),allRows.get(15+j)});
        		j+=numberOfCols;
    		}
    		break;
    	case 17:
        	for (int i=0;i<numberOfRows;i++)
    		{
        		model.addRow(new Object[] {allRows.get(0+j),allRows.get(1+j),allRows.get(2+j),allRows.get(3+j),
        				allRows.get(4+j),allRows.get(5+j),allRows.get(6+j),allRows.get(7+j),allRows.get(8+j),
        				allRows.get(9+j),allRows.get(10+j),allRows.get(11+j),allRows.get(12+j),allRows.get(13+j),
        				allRows.get(14+j),allRows.get(15+j),allRows.get(16+j)});
        		j+=numberOfCols;
    		}
    		break;
    	case 18:
        	for (int i=0;i<numberOfRows;i++)
    		{
        		model.addRow(new Object[] {allRows.get(0+j),allRows.get(1+j),allRows.get(2+j),allRows.get(3+j),
        				allRows.get(4+j),allRows.get(5+j),allRows.get(6+j),allRows.get(7+j),allRows.get(8+j),
        				allRows.get(9+j),allRows.get(10+j),allRows.get(11+j),allRows.get(12+j),allRows.get(13+j),
        				allRows.get(14+j),allRows.get(15+j),allRows.get(16+j),allRows.get(17+j)});
        		j+=numberOfCols;
    		}
    		break;
    	case 19:
        	for (int i=0;i<numberOfRows;i++)
    		{
        		model.addRow(new Object[] {allRows.get(0+j),allRows.get(1+j),allRows.get(2+j),allRows.get(3+j),
        				allRows.get(4+j),allRows.get(5+j),allRows.get(6+j),allRows.get(7+j),allRows.get(8+j),
        				allRows.get(9+j),allRows.get(10+j),allRows.get(11+j),allRows.get(12+j),allRows.get(13+j),
        				allRows.get(14+j),allRows.get(15+j),allRows.get(16+j),allRows.get(17+j),allRows.get(18+j)});
        		j+=numberOfCols;
    		}
    		break;
    	case 20:
        	for (int i=0;i<numberOfRows;i++)
    		{
        		model.addRow(new Object[] {allRows.get(0+j),allRows.get(1+j),allRows.get(2+j),allRows.get(3+j),
        				allRows.get(4+j),allRows.get(5+j),allRows.get(6+j),allRows.get(7+j),allRows.get(8+j),
        				allRows.get(9+j),allRows.get(10+j),allRows.get(11+j),allRows.get(12+j),allRows.get(13+j),
        				allRows.get(14+j),allRows.get(15+j),allRows.get(16+j),allRows.get(17+j),allRows.get(18+j),
        				allRows.get(19+j)});
        		j+=numberOfCols;
    		}
        default:
        	System.out.println("SQL statements are only supported up until 20 cols");
        	break;
    	}
        
    }//GEN-LAST:event_goBTActionPerformed

    private void exitBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
                if ("Nimbus".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (ClassNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(MyUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (InstantiationException ex) 
        {
            java.util.logging.Logger.getLogger(MyUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (IllegalAccessException ex) 
        {
            java.util.logging.Logger.getLogger(MyUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(MyUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new MyUserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitBT;
    private javax.swing.JButton goBT;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField queryTF;
    private javax.swing.JTable resultsTB;
    // End of variables declaration//GEN-END:variables
    
}
