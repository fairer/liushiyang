package person.liusy.lsyjb.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.ToolBar;

import person.liusy.lsyjb.db.DbOperator;
import person.liusy.lsyjb.db.doman.ColumnDomain;
import person.liusy.lsyjb.db.doman.TableDomain;
import person.liusy.lsyjb.system.EditorPartAdapter;
import person.liusy.lsyjb.system.LsyTableContentProvider;
import person.liusy.lsyjb.system.TableLabelProviderAdapter;

public class ColumnEditor extends EditorPartAdapter{

	
	private TableViewer tv = null;
	private TableDomain tableDomain;
	private ColumnEditorActionGroup actionGroup; 
	public TableDomain getTableDomain() {
		return tableDomain;
	}
	public void setTableDomain(TableDomain tableDomain) {
		this.tableDomain = tableDomain;
		if(actionGroup!=null)
			actionGroup.setTableDomain(tableDomain);
	}
	public void setTheTitle(String title){
		setTitle(title);
	}
	@Override
	public void createPartControl(Composite parent) {
		// TODO Auto-generated method stub
		ViewForm viewForm = new ViewForm(parent,SWT.NONE);
		viewForm.setLayout(new FillLayout());
		createTableViewer(viewForm);
		tv.setLabelProvider(new TableViewerLabelProvider());
		tv.setContentProvider(new LsyTableContentProvider());
		//工具栏
		actionGroup  = new ColumnEditorActionGroup(tv);
		ToolBar toolBar = new ToolBar(viewForm,SWT.FLAT);
		ToolBarManager toolBarManager = new ToolBarManager(toolBar);
		actionGroup.fillActionToolBars(toolBarManager);
		
		ColumnDomain columnDomain = new ColumnDomain();
		columnDomain.setId(new Integer(1));
		columnDomain.setName("aac001");
		columnDomain.setCnname("个人编号");
		columnDomain.setIskey("1");
		columnDomain.setIsnull("0");
		columnDomain.setType("2");
		columnDomain.setLength(new Integer(18));
		List list = new ArrayList();
		list.add(columnDomain);
		tv.setInput(list);
		viewForm.setContent(tv.getControl());
		MenuManager menu = new MenuManager();
		Menu mm = menu.createContextMenu(tv.getTable());
		tv.getTable().setMenu(mm);
		actionGroup.fillContextMenu(menu);
		System.out.println("=====================title:"+getTitle());
	}
	@Override
	protected void setTitleToolTip(String toolTip) {
		// TODO Auto-generated method stub
		super.setTitleToolTip(toolTip);
	}
	private void createTableViewer(Composite parent){
		tv = new TableViewer(parent,SWT.MULTI|SWT.BORDER|SWT.FULL_SELECTION);
		Table table = tv.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		TableLayout tLayout = new TableLayout();
		table.setLayout(tLayout);
		
		
		
		{
			tLayout.addColumnData(new ColumnWeightData(20));
			TableColumn col = new TableColumn(table,SWT.NONE);
			col.setText("字段名");
		}
		{
			tLayout.addColumnData(new ColumnWeightData(20));
			TableColumn col = new TableColumn(table,SWT.NONE);
			col.setText("字段中文名");
		}
		{
			tLayout.addColumnData(new ColumnWeightData(10));
			TableColumn col = new TableColumn(table,SWT.NONE);
			col.setText("是否主键");
		}
		{
			tLayout.addColumnData(new ColumnWeightData(10));
			TableColumn col = new TableColumn(table,SWT.NONE);
			col.setText("是否为空");
		}
		{
			tLayout.addColumnData(new ColumnWeightData(10));
			TableColumn col = new TableColumn(table,SWT.NONE);
			col.setText("是否索引");
		}
		{
			tLayout.addColumnData(new ColumnWeightData(20));
			TableColumn col = new TableColumn(table,SWT.NONE);
			col.setText("字段类型");
		}
		{
			tLayout.addColumnData(new ColumnWeightData(10));
			TableColumn col = new TableColumn(table,SWT.NONE);
			col.setText("字段长度");
		}
		{
			tLayout.addColumnData(new ColumnWeightData(10));
			TableColumn col = new TableColumn(table,SWT.NONE);
			col.setText("字段小数长度");
		}
		
	}
	/**
	 * 标签器
	 */
	private static final class TableViewerLabelProvider extends TableLabelProviderAdapter{

		public String getColumnText(Object element, int columnIndex) {
			
			String result = "";
			ColumnDomain columnDomain = (ColumnDomain)element;
			switch(columnIndex){
				case 0:
					result = columnDomain.getName();
					break;
				case 1:
					result = columnDomain.getCnname();
					break;
				case 2:
					result = columnDomain.getIskey().equals("1")?"是":"否";
					break;
				case 3:
					result = columnDomain.getIsnull().equals("1")?"是":"否";
					break;
				case 4:
					result = columnDomain.getIsindex().equals("1")?"是":"否";
					break;
				case 5:
					result = DbOperator.getAa10Text("type",columnDomain.getType());
					break;
				case 6:
					result = columnDomain.getLength().toString();
					break;
				case 7:
					result = columnDomain.getXslength()!=null?columnDomain.getXslength().toString():"";
					break;	
				default:
					break;
			}
			return result==null?"":result;
			
		}
		
	}
	public TableViewer getTv() {
		return tv;
	}
	
}
