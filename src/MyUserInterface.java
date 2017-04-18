/*
 * By Deividas Savickas
 * C15314356
 * 18/04/17
 * Java Data Expert Assignment
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class MyUserInterface extends javax.swing.JFrame 
{
 
	// Variables declaration
	private static final long serialVersionUID = 1L;
    private List<String> allRows=new ArrayList<String>();
    private List<String> colNames=new ArrayList<String>();
    private int numberOfCols;
    private int numberOfRows;
    private javax.swing.JButton exitBT;
    private javax.swing.JButton goBT;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField queryTF;
    private javax.swing.JTable resultsTB;
    // End of variables declaration
    
    //Creates initial Object for connection to database/query
    DatabaseReader data=new DatabaseReader();
     
    public MyUserInterface() 
    {
        initComponents();
    }

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
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) .addGap(0, 0, Short.MAX_VALUE) );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 271, Short.MAX_VALUE) );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 102));

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 12)); 
        jLabel2.setForeground(new java.awt.Color(153, 102, 255));
        jLabel2.setText("By Devidas Savickas");

        queryTF.setBackground(new java.awt.Color(255, 255, 204));
        queryTF.setFont(new java.awt.Font("Consolas", 0, 12));
        queryTF.setForeground(new java.awt.Color(102, 51, 255));
        queryTF.setText("Enter in SQL query to run.....");
        queryTF.setBorder(null);
        queryTF.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                queryTFActionPerformed(evt);
            }
        });

        goBT.setBackground(new java.awt.Color(204, 255, 204));
        goBT.setFont(new java.awt.Font("Consolas", 0, 12));
        goBT.setForeground(new java.awt.Color(153, 102, 255));
        goBT.setText("Go");
        goBT.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                goBTActionPerformed(evt);
            }
        });

        exitBT.setBackground(new java.awt.Color(204, 255, 204));
        exitBT.setFont(new java.awt.Font("Consolas", 0, 11));
        exitBT.setText("Exit");
        exitBT.addActionListener(new java.awt.event.ActionListener() 
        {
            public void actionPerformed(java.awt.event.ActionEvent evt) 
            {
                exitBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
    }

    private void tableChange()
    {
    	
    	//clears the array lists of all rows and col names
    	allRows.clear();
    	colNames.clear();
    	
    	//set value entered into text field to temporary variable
        String temp=queryTF.getText();
        
        //send query to DatabaseReader
        data.setStatement(temp);
        
        //connect to database
    	data.Connect();
    	
    	//stores all rows and column names list in two array lists
    	allRows=data.getAllRows();
    	colNames=data.getColNameList();
    	
    	//set default table model
    	DefaultTableModel model =(DefaultTableModel) resultsTB.getModel();
    	
    	//gets the number of cols and rows
    	numberOfCols=colNames.size();
    	numberOfRows=(allRows.size()/numberOfCols);
    	
    	TableFiller fill=new TableFiller(numberOfCols,numberOfRows,model,allRows,colNames);
    	
    	//Reset Table Completely
    	fill.reset();
    	
    	//add Columns to table
    	fill.cols();
    	
    	//add Rows to Table supports up to 20 columns for readability in this GUI
    	fill.rows();
    }
    
    //Action performed on textfield
    private void queryTFActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	//calls the table changed/ table creation method when enter is pressed
        tableChange();
    }
    
    //Action performed on go button
    private void goBTActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	//calls the table changed/ table creation method when button clicked
    	tableChange();
    }

    //Exit program once exit button is clicked
    private void exitBTActionPerformed(java.awt.event.ActionEvent evt) 
    {
        System.exit(0);
    }  
}
