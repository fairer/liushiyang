package person.liusy.lsyjb.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import person.liusy.lsyjb.db.common.ConnectManager;
import person.liusy.lsyjb.db.doman.Aa10Domain;
import person.liusy.lsyjb.db.doman.ColumnDomain;
import person.liusy.lsyjb.db.doman.DatabaseDomain;
import person.liusy.lsyjb.db.doman.TableDomain;

public class DbOperator {

	public static String getAa10Text(String name, String value) {
		Connection con = null;
		Statement stmt = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		List list = new ArrayList();
		String text = "";
		try {
			con = ConnectManager.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select text from aa10 where name = '"
					+ name + "' and value='" + value + "'");
			if (rs.next()) {
				text = rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (stmt != null)
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			stmt = null;
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			rs = null;
			return text;
		}
	}

	public void addDatabase(String name, String note) {
		Connection con = null;
		Statement stmt = null;
		try {
			con = ConnectManager.getConnection();
			stmt = con.createStatement();
			stmt.execute("insert into database_info (name,note) values ('"
					+ name + "','" + note + "')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(stmt);
		}
	}

	public void addTable(TableDomain domain) {
		Connection con = null;
		Statement stmt = null;
		try {
			con = ConnectManager.getConnection();
			stmt = con.createStatement();
			stmt
					.execute("insert into table_info (database_id,name,note) values ('"
							+ domain.getDatabase_id()
							+ "','"
							+ domain.getName()
							+ "','"
							+ domain.getNote()
							+ "')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(stmt);
		}
	}
	public void deleteTable(TableDomain domain) {
		Connection con = null;
		Statement stmt = null;
		try {
			con = ConnectManager.getConnection();
			stmt = con.createStatement();
			String sql1=" delete from table_info where id="+domain.getId();
			String sql2=" delete from column_info where table_id="+domain.getId();
			
			stmt.execute(sql1);
			stmt.execute(sql2);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(stmt);
		}
	}
	public void addColumn(ColumnDomain domain) {
		Connection con = null;
		Statement stmt = null;
		try {
			con = ConnectManager.getConnection();
			stmt = con.createStatement();
			stmt
					.execute("insert into column_info (table_id,name,cnname,isnull,iskey,isindex,type,length,xslength,pxh,note,isvalid) values ("
							+ domain.getTable_id()
							+ ",'"
							+ domain.getName()
							+ "','"
							+ domain.getCnname()
							+ "','"
							+ domain.getIsnull()
							+ "','"
							+ domain.getIskey()
							+ "','"
							+ domain.getIsindex()
							+ "','"
							+ domain.getType()
							+ "',"
							+ domain.getLength()
							+ ","
							+ domain.getXslength()
							+ ","
							+ domain.getPxh()
							+ ",'"
							+ domain.getNote()
							+ "','"
							+ domain.getIsvalid() + "')");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(stmt);
		}
	}

	public void editColumn(ColumnDomain domain){
		Connection con  = null;
		Statement stmt = null;
		try {
			con = ConnectManager.getConnection();
			stmt = con.createStatement();
			// (table_id,name,cnname,isnull,iskey,isindex,type,length,xslength,pxh,note,isvalid)
			// values (
			String sql = "update column_info "+
			"set table_id="+domain.getTable_id()+"," +
			" name='"+domain.getName()+"'," +
			" cnname='"+domain.getCnname()+"',"+
			" isnull='"+domain.getIsnull()+"',"+
			" iskey='"+domain.getIskey()+"',"+
			" isindex='"+domain.getIsindex()+"',"+
			" type='"+domain.getType()+"',"+
			" length="+domain.getLength()+","+
			" xslength="+domain.getXslength()+","+
			" pxh="+domain.getPxh()+","+
			" note='"+domain.getNote()+"',"+
			" isvalid='"+domain.getIsvalid()+"' where id="+domain.getId();
			stmt.execute(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close(stmt);
		}
	}
	public void deleteColumn(ColumnDomain domain){
		Connection con  = null;
		Statement stmt = null;
		try {
			con = ConnectManager.getConnection();
			stmt = con.createStatement();
			// (table_id,name,cnname,isnull,iskey,isindex,type,length,xslength,pxh,note,isvalid)
			// values (
			String sql = " delete from column_info  where id="+domain.getId();
			stmt.execute(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			close(stmt);
		}
	}
	
	
	public List getDatabaselist() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		List list = new ArrayList();
		try {
			con = ConnectManager.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from database_info");
			while (rs.next()) {
				DatabaseDomain domain = new DatabaseDomain();
				domain.setId(new Integer(rs.getInt(1)));
				domain.setName(rs.getString(2));
				domain.setNote(rs.getString(3));
				list.add(domain);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rs);
			return list;
		}
	}

	public List getAa10list(String name) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		List list = new ArrayList();
		try {
			con = ConnectManager.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from aa10 where name ='" + name
					+ "' order by pxh desc");
			while (rs.next()) {
				Aa10Domain domain = new Aa10Domain();
				domain.setName(rs.getString(1));
				domain.setValue(rs.getString(2));
				domain.setText(rs.getString(3));
				domain.setPxh(new Integer(rs.getInt(4)));
				list.add(domain);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rs);
			return list;
		}
	}

	public List getTablelist(String database_id) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		List list = new ArrayList();
		try {
			con = ConnectManager.getConnection();
			stmt = con.createStatement();
			rs = stmt
					.executeQuery("select * from table_info where database_id = "
							+ database_id);
			while (rs.next()) {
				TableDomain domain = new TableDomain();
				domain.setId(new Integer(rs.getInt(1)));
				domain.setDatabase_id(new Integer(rs.getInt(2)));
				domain.setName(rs.getString(3));
				domain.setNote(rs.getString(4));
				list.add(domain);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rs);
			return list;
		}
	}

	public List getColumnlist(String table_id) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		List list = new ArrayList();
		try {
			con = ConnectManager.getConnection();
			stmt = con.createStatement();
			rs = stmt
					.executeQuery("select * from column_info where table_id = "
							+ table_id + " order by pxh desc");
			while (rs.next()) {
				ColumnDomain domain = new ColumnDomain();
				domain.setId(new Integer(rs.getInt(1)));
				domain.setTable_id(new Integer(rs.getInt(2)));
				domain.setName(rs.getString(3));
				domain.setCnname(rs.getString(4));
				domain.setIsnull(rs.getString(5));
				domain.setIskey(rs.getString(6));
				domain.setIsindex(rs.getString(7));
				domain.setType(rs.getString(8));
				domain.setLength(new Integer(rs.getInt(9)));
				domain.setXslength(new Integer(rs.getInt(10)));
				domain.setPxh(new Integer(rs.getInt(11)));
				domain.setNote(rs.getString(12));
				domain.setIsvalid(rs.getString(13));
				list.add(domain);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(stmt);
			close(rs);
			return list;
		}
	}

	void close(Statement stmt) {
		if (stmt != null)
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		stmt = null;
	}

	void close(ResultSet rs) {
		if (rs != null)
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		rs = null;

	}
}
