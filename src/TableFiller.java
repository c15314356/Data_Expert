import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TableFiller 
{
	private int numberOfCols;
	private int numberOfRows;
	private int j;
	private DefaultTableModel model;
    private List<String> allRows=new ArrayList<String>();
    private List<String> colNames=new ArrayList<String>();
    
	
    //Constructor
	public TableFiller(int numberOfCols,int numberOfRows,DefaultTableModel model,List<String> allRows,List<String> colNames)
	{
		this.numberOfCols=numberOfCols;
		this.numberOfRows=numberOfRows;
		this.model=model;
		this.allRows=allRows;
		this.colNames=colNames;
		this.j=0;
	}
	
	//Reset Table Completely
	public void reset()
	{
    	model.fireTableDataChanged();
    	model.setRowCount(0);
    	model.setColumnCount(0);
	}
	
	//add Columns to table
	public void cols()
	{
		for(int i=0;i<numberOfCols;i++)
    	{
    		model.addColumn(colNames.get(i));
    	}
	}
	
	//add Rows to Table supports up to 20 columns for readability in this GUI adds rows depending on size of Cols
	public void rows()
	{
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
        	System.out.println("SQL statements are only supported up until 20 columns using this GUI");
        	break;
    	}
	}
}
