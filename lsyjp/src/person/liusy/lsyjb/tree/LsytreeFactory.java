package person.liusy.lsyjb.tree;

import java.util.ArrayList;
import java.util.List;

import person.liusy.lsyjb.db.DbOperator;
import person.liusy.lsyjb.db.doman.DatabaseDomain;
import person.liusy.lsyjb.db.doman.TableDomain;
import person.liusy.lsyjb.editor.ColumnEditor;
import person.liusy.lsyjb.editor.ColumnEditorInput;
import person.liusy.lsyjb.system.LsyImages;
import person.liusy.lsyjb.tree.impl.NavigatorEntry;

public class LsytreeFactory {

	public static List createNavigatorEntryTree(){
		NavigatorEntry t1 = new NavigatorEntry("���ݿ����");
		t1.setImage(LsyImages.getImage(LsyImages.DATABASE));
		NavigatorEntry t2 = new NavigatorEntry("CRDT");
		t2.setImage(LsyImages.getImage(LsyImages.DATABASE));
		t1.addChild(t2);
		NavigatorEntry t3 = new NavigatorEntry("GGCZY��������Ա��");
		t3.setImage(LsyImages.getImage(LsyImages.TABLE));
		NavigatorEntry t4 = new NavigatorEntry("GGDKLL�������ʱ�");
		t4.setImage(LsyImages.getImage(LsyImages.TABLE));
		NavigatorEntry t5 = new NavigatorEntry("IFKHXXXXGR���˿ͻ���ϸ��Ϣ��");
		t5.setImage(LsyImages.getImage(LsyImages.TABLE));
		NavigatorEntry t6 = new NavigatorEntry("IFKHXXXXDW��λ�ͻ���ϸ��Ϣ��");
		t6.setImage(LsyImages.getImage(LsyImages.TABLE));
		t2.addChild(t3);
		t2.addChild(t4);
		t2.addChild(t5);
		t2.addChild(t6);
		List list = new ArrayList();
		list.add(t1);
		return list;
	}
	public static List createLatestEntryTree(){
		NavigatorEntry t1 = new NavigatorEntry("���ݿ����");
		t1.setImage(LsyImages.getImage(LsyImages.DATABASE));
		DbOperator dbop = new DbOperator();
		List databaselist = dbop.getDatabaselist();
		for(int i = 0; i <databaselist.size();i++){
			DatabaseDomain dbdomain = (DatabaseDomain)databaselist.get(i);
			NavigatorEntry t2 = new NavigatorEntry(dbdomain.getName()+dbdomain.getNote());
			t2.setImage(LsyImages.getImage(LsyImages.DATABASE));
			t2.setData(dbdomain);
			t1.addChild(t2);
			List tablelist = dbop.getTablelist(String.valueOf(dbdomain.getId()));
			for(int j = 0; j <tablelist.size();j++){
				TableDomain tdomain = (TableDomain)tablelist.get(j);
				NavigatorEntry t3 = new NavigatorEntry(tdomain.getName()+tdomain.getNote());
				t3.setImage(LsyImages.getImage(LsyImages.TABLE));
				t3.setEditorInput(ColumnEditorInput.getColumnEditorInput());
				t3.setEditorId(ColumnEditor.class.getName());
				t3.setData(tdomain);
				t2.addChild(t3);
			}
		}
		List list = new ArrayList();
		list.add(t1);
		return list;
	}
}
